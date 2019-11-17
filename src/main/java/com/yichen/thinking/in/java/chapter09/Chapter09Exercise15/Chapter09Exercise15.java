package com.yichen.thinking.in.java.chapter09.Chapter09Exercise15;

interface Interface1 {
    void f1();

    void g1();
}

interface Interface2 {
    void f2();

    void g2();
}

interface Interface3 {
    void f3();

    void g3();
}

interface Interface4 extends Interface1, Interface2, Interface3 {
    void h();
}

abstract class AbstractClass {
    String s;

    public AbstractClass(String s) {
        this.s = s;
    }

    abstract void af();
}

class All extends AbstractClass implements Interface4 {

    public All() {
        super("All");
    }

    @Override
    public void f1() {
        System.out.println("All.f1");
    }

    @Override
    public void g1() {
        System.out.println("All.g1");
    }

    @Override
    public void f2() {
        System.out.println("All.f2");
    }

    @Override
    public void g2() {
        System.out.println("All.g2");
    }

    @Override
    public void f3() {
        System.out.println("All.f3");
    }

    @Override
    public void g3() {
        System.out.println("All.g3");
    }

    @Override
    public void h() {
        System.out.println("All.h");
    }

    @Override
    void af() {
        System.out.println("All.af");
    }
}

public class Chapter09Exercise15 {
    static void take1(Interface1 i) {
        i.f1();
        i.g1();
    }

    static void take2(Interface2 i) {
        i.f2();
        i.g2();
    }

    static void take3(Interface3 i) {
        i.f3();
        i.g3();
    }

    static void take4(Interface4 i) {
        i.h();
        i.f1();
        i.f2();
        i.f3();
        i.g1();
        i.g2();
        i.g3();
    }

    static void takeAC(All i) {
        i.h();
        i.f1();
        i.f2();
        i.f3();
        i.g1();
        i.g2();
        i.g3();
        i.af();
    }
    public static void main(String[] args) {
        All a = new All();
        take1(a);
        take2(a);
        take3(a);
        take4(a);
        takeAC(a);
    }
}
