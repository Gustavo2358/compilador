package br.edu.ufabc.compiler.expression;

public class IdentifierExpression implements Expression {
    private String value;

    public IdentifierExpression(String value) {
        this.value = value;
    }

    @Override
    public String eval() {
        return value;
    }

    public String toString(){
        return value;
    }
}
