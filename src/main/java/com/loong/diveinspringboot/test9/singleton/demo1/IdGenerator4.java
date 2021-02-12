package com.loong.diveinspringboot.test9.singleton.demo1;

public class IdGenerator4 {

    private IdGenerator4() {

    }

    public static class SingletonIdGenerator4 {

        public static final IdGenerator4 idGenerator4 = new IdGenerator4();

    }

    public IdGenerator4 getIdGenerator4() {
        return SingletonIdGenerator4.idGenerator4;
    }
}
