package com.loong.diveinspringboot.test9.interpreter.demo2;

public class SubStractionExpression implements Expression{

    private Expression e1;

    private Expression e2;

    public SubStractionExpression(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    @Override
    public long interpret() {
        return 0;
    }
}
