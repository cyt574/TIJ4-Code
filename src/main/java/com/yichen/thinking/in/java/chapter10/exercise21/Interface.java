package com.yichen.thinking.in.java.chapter10.exercise21;

public interface Interface {
    void foo();
    void bar();
    static class InnerClass {
        public static void foo(Interface i) {
            System.out.println("i.foo()");
            i.foo();
        }
    }
}
