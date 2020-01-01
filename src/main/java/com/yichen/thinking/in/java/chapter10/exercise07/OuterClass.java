package com.yichen.thinking.in.java.chapter10.exercise07;

public class OuterClass {
    private String str;

    private void hello() {
        System.out.println("Hello OuterClass");
    }

    protected class InnerClass {
        public void innerMethod() {
            str = "string1";
            hello();
        }
    }

    public void world() {
        new InnerClass().innerMethod();
    }
}
