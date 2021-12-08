package com.loong.diveinspringboot.test9.visitor.demo2;

public class SingleDispatchClass {

    public void polymorphismFunction(ParentClass p) {
        p.f();
    }

    public void overloadFunction(ParentClass p) {
        p.f();
    }

    public void overloadFunction(ChildClass c) {
        c.f();
    }

}
