package br.edu.ufabc.compiler.ast;

import br.edu.ufabc.compiler.expression.Expression;
import br.edu.ufabc.compiler.symbols.DataType;
import br.edu.ufabc.compiler.symbols.Identifier;

public class CmdAttrib implements Command{
    private Identifier id;
    private Expression expr;

    @Override
    public String generateCode() {
//        return switch (id.getType()) {
//            case INTEIRO -> "int ";
//            case REAL -> "double ";
//            case TEXTO -> "String ";
//            case LOGICO -> "boolean ";
//        }
        return id.getName() + " = " + expr.toString() + " ;\n";
    }

    public CmdAttrib(Identifier id, Expression expr) {
        super();
        this.id = id;
        this.expr = expr;
    }

    public CmdAttrib(Identifier id) {
        this.id = id;
    }

    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
    }

    public Expression getExpr() {
        return expr;
    }

    public void setExpr(Expression expr) {
        this.expr = expr;
    }

    @Override
    public void run() {
//        id.setValue(expr.eval());
    }

}
