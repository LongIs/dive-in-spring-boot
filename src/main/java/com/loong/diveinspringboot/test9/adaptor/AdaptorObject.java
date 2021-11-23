package com.loong.diveinspringboot.test9.adaptor;

public class AdaptorObject implements ITargetObject{

    private AdapteeObject adapteeObject;

    public AdaptorObject (AdapteeObject adapteeObject) {
        this.adapteeObject = adapteeObject;
    }

    @Override
    public void f1() {
        adapteeObject.fa();
    }

    @Override
    public void f2() {
        adapteeObject.fb();
    }

    @Override
    public void f3() {
        adapteeObject.fc();
    }
}
