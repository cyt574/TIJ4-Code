package com.yichen.thinking.in.java.chapter10.exercise06.second;

import com.yichen.thinking.in.java.chapter10.exercise06.first.FirstInterface;

public class SecondClass {
    protected class SecondInnerClass implements FirstInterface {

        @Override
        public void first() {
            System.out.println("First Method");
        }
    }

    public SecondInnerClass secondInnerClass() {
        return new SecondInnerClass();
    }
}
