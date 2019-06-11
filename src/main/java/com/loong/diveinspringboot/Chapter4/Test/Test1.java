package com.loong.diveinspringboot.Chapter4.Test;

/**
 * @author xiongtaolong
 * @date 2019-06-10 19:29
 */
public abstract class Test1 {

    public Test1(){
        System.out.println("========");
    }

    abstract void t1();

    void t2(){
        t1();
    }

}
class Test2 extends Test1 {

    @Override
    void t1() {
        System.out.println("11111");
    }
}
class Test3 extends Test1 {

    @Override
    void t1() {
        System.out.println("22222");
    }
}
class Test4 extends Test1 {

    @Override
    void t1() {
        System.out.println("33333");
    }
}
class Test5 extends Test2{
}
class Test6 extends Test3{
}
class Test7 extends Test4{
}
class A{
    public static void main(String[] args) {
        Test5 test5 = new Test5();
        test5.t2();

        Test6 test6 = new Test6();
        test6.t2();

        Test7 test7 = new Test7();
        test7.t2();
    }
}