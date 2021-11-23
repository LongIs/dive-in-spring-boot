package com.loong.diveinspringboot.test9.decorator;

public class ADecorator implements IA{

    private IA ia;

    public ADecorator(IA ia) {
        this.ia = ia;
    }

    @Override
    public void f() {
        ia.f();
    }
}
