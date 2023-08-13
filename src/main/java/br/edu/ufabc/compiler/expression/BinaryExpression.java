package br.edu.ufabc.compiler.expression;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BinaryExpression implements Expression {

    private String operator;
    private Expression leftSide;
    private Expression rightSide;

    public String eval() {

        //Usando operações com BigDecimal para que a String resultante fique corretamente formatada, alem
        //de melhorar a precisão do calculo.
        switch(operator) {
            case "+":
                return new BigDecimal(leftSide.eval()).add( new BigDecimal(rightSide.eval())).toString();
            case "-":
                return new BigDecimal(leftSide.eval()).subtract( new BigDecimal(rightSide.eval())).toString();
            case "*":
                return new BigDecimal(leftSide.eval()).multiply( new BigDecimal(rightSide.eval())).toString();
            case "/":
                return new BigDecimal(leftSide.eval()).setScale(16).divide( new BigDecimal(rightSide.eval()), RoundingMode.HALF_UP).toString();
            case "//":
                return new BigDecimal(leftSide.eval())
                        .setScale(16)
                        .divide( new BigDecimal(rightSide.eval()), RoundingMode.HALF_UP)
                        .toString()
                        .split("\\.")[0];
            default:
                throw new IllegalArgumentException("Operador inválido.");
        }
    }

    public BinaryExpression(String operator, Expression leftSide, Expression rightSide) {
        this.operator = operator;
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    public BinaryExpression(String operator) {
        this.operator = operator;
    }

    public String toString() {
        return leftSide.toString() + operator + rightSide.toString();
    }
    public void setLeftSide(Expression leftSide) {
        this.leftSide = leftSide;
    }
    public void setRightSide(Expression rightSide) {
        this.rightSide = rightSide;
    }
}
