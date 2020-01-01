package com.yichen.thinking.in.java.chapter10.exercise11;

import com.yichen.thinking.in.java.chapter10.exercise09.Outer;

public class Ch10ex11 {
    private class Inner implements Outer {

        @Override
        public void test() {
            System.out.println("Test");
        }
    }

    public Outer get1() {
        return new Inner();
    }

    public Inner get2() {
        return new Inner();
    }

    public static void main(String[] args) {
        Ch10ex11 ch10ex11 = new Ch10ex11();
        Outer outer1 = ch10ex11.get1();
        Outer outer2 = ch10ex11.get2();

//        隐藏
//        Inner inner1 = ch10ex11.get1();
        Inner inner2 = ch10ex11.get2();
    }
}
