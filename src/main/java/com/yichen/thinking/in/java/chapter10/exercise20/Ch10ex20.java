package com.yichen.thinking.in.java.chapter10.exercise20;

class Clazz implements Interface {

}

public class Ch10ex20 {
    public static void main(String[] args) {
        Clazz clazz = new Clazz();
        Interface.InnerClass innerClass = new Interface.InnerClass();
        innerClass.foo();
    }
}
