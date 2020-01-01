package com.yichen.thinking.in.java.chapter10.exercise10;

import com.yichen.thinking.in.java.chapter10.exercise09.Outer;

public class Ch10ex10 {
    private Outer test() {
        {
            class Inner implements Outer {
                @Override
                public void test() {
                    System.out.println("Test!!!!");
                }
            }
            return new Inner();
        }
    }

    public static void main(String[] args) {
        Outer outer = new Ch10ex10().test();
        outer.test();
    }
}
