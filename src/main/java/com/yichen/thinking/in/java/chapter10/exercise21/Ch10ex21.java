package com.yichen.thinking.in.java.chapter10.exercise21;

public class Ch10ex21 {
    public static void main(String[] args) {
        Interface impl = new Interface() {
            @Override
            public void foo() {
                System.out.println("~~~~~~~~~~");
            }

            @Override
            public void bar() {

            }
        };

        Interface.InnerClass.foo(impl);
    }
}
