grammar Grammar;

@header{
	import java.util.ArrayList;
	import br.edu.ufabc.compiler.symbols.*;

}

@members{
	private ArrayList<String> listaDeTokens = new ArrayList<String>();
	private SymbolTable symbolTable = new SymbolTable();
    private DataType currentType;
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

cmdAttr  : ID ':=' (expr | TEXTO)
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
         | termo exprl
         ;

exprl	 : (OP_ADD termo)*
		 ;

termo    : fator
         | fator (OP_MULT fator)+
         ;

fator    : ID   {listaDeTokens.add(_input.LT(-1).getText());}
         | num
         | AP expr FP
         ;

OP_ADD   : '+' | '-'
         ;

OP_MULT  :  '*' | '/'
         ;

OP_REL   : '>' | '<' | '>=' | '<=' | '==' | '!='
         ;

OP_BOOL  : '&&' | '||'
         ;

ID		 : [a-zA-Z] ([a-zA-Z0-9])*
		 ;

TEXTO    : ["] .*? ["]
         ;

num      : INTEGER | REAL
         ;

INTEGER  : [0-9]+
         ;

REAL     : [0-9]+ (',' [0-9]+)?
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
