package com.loong.diveinspringboot.test9.adaptor;

public class AdaptorClass extends AdapteeClass implements ITargetClass {
    @Override
    public void f1() {
        super.fa();
    }

    @Override
    public void f2() {

    }
}
