grammar Grammar;

@header{
	import java.util.ArrayList;
	import br.edu.ufabc.compiler.symbols.*;
	import br.edu.ufabc.compiler.expression.*;

}

@members{
	private ArrayList<String> listaDeTokens = new ArrayList<String>();
	private SymbolTable symbolTable = new SymbolTable();
    private DataType currentType;
    private DataType leftDT;
    private DataType rightDT;
    private Expression expression;
    private String idAtribuido;
    private String text;

	public void exibirTodosTokens(){
		for(String s: listaDeTokens){
			System.out.println("Token: " + s);
		}
	}

	public void exibirSimbolos(){
	    System.out.println(symbolTable);
	}
}

prog     : 'programa' declara? bloco? 'fimprog.'
         ;

declara  : (declaravar)+
         ;

declaravar : tipo ID { symbolTable.declareVariable(_input.LT(-1).getText(), currentType); }
            (COMMA
                  ID { symbolTable.declareVariable(_input.LT(-1).getText(), currentType); }
            )*SC
           ;

tipo     : 'real' { currentType = DataType.REAL; }
         | 'inteiro' { currentType = DataType.INTEIRO; }
         | 'texto' { currentType = DataType.TEXTO; }
         ;

bloco    : (cmd)+
         ;

cmd      : cmdLeitura SC
         | cmdEscrita SC
         | cmdAttr SC
         | cmdIf
         | cmdWhile
         | cmdDoWhile
         | expr SC
         ;

cmdLeitura : 'leia'
            AP
            ID { symbolTable.checkDeclaration(_input.LT(-1).getText()); }
            FP
           ;

cmdEscrita : 'escreva'
            AP (
                    TEXTO
                    | ID { symbolTable.checkUsage(_input.LT(-1).getText()); }
            ) FP
           ;

cmdAttr  : ID{
                symbolTable.checkDeclaration(_input.LT(-1).getText());
                idAtribuido = _input.LT(-1).getText();
                leftDT = symbolTable.get(_input.LT(-1).getText()).getType();
             }
           ':='
           (expr
           |
           TEXTO { expression = new TextExpression(_input.LT(-1).getText()); })
            {
                symbolTable.setVariableValue(idAtribuido, expression);
                expression = null;
            }
         ;

cmdIf    : 'se' AP exprBool FP '{' bloco '}' ('senao' '{' bloco '}')?
         ;

cmdWhile : 'enquanto' AP exprBool FP '{' bloco '}'
         ;

cmdDoWhile : 'faca' '{' bloco '}' 'enquanto' AP exprBool FP
           ;

exprBool : exprBooll (OP_BOOL exprBooll)*
         ;

exprBooll : AP exprBool FP
          | exprRel
          ;

exprRel  : expr OP_REL expr
         ;

expr	 : termo
         | termo exprl+
         ;

exprl	 : OP_ADD {
            String operator = _input.LT(-1).getText().split(" ")[0];
            BinaryExpression _exprADD = new BinaryExpression(operator);
            _exprADD.setLeftSide(expression);
        }
          termo
        {
            _exprADD.setRightSide(expression);
            expression = _exprADD;
        }
        ;

termo    : fator
         | fator termol+
         ;

termol   : OP_MULT {
              String operator = _input.LT(-1).getText().split(" ")[0];
              BinaryExpression _exprMult = new BinaryExpression(operator);
              _exprMult.setLeftSide(expression);
          }
          fator
          {
              _exprMult.setRightSide(expression);
              expression = _exprMult;
          }
          ;

fator    : ID   {listaDeTokens.add(_input.LT(-1).getText());}
         | num
         | AP expr FP
         ;

OP_ADD   : '+' | '-'
         ;

OP_MULT  :  '*'
         | '/'
         | '//'  //divisao inteira
         ;

OP_REL   : '>' | '<' | '>=' | '<=' | '==' | '!='
         ;

OP_BOOL  : '&&' | '||'
         ;

ID		 : [a-zA-Z] ([a-zA-Z0-9])*
		 ;

TEXTO    : ["] .*? ["]
         ;

num      : INTEGER { expression = new IntegerNumberExpression(Integer.parseInt(_input.LT(-1).getText())); }
         | REAL { expression = new DoubleNumberExpression(Double.parseDouble(_input.LT(-1).getText())); }
         ;

INTEGER  : [0-9]+
         ;

REAL     : [0-9]+ ('.' [0-9]+)?
		 ;

SC      : ';'
         ;

COMMA    : ','
		 ;

WS       : (' ' | '\t' | '\n' | '\r') -> skip
         ;

AP       : '('
         ;

FP       : ')'
         ;
