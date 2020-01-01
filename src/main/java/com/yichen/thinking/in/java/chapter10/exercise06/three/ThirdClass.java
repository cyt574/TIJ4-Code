package com.yichen.thinking.in.java.chapter10.exercise06.three;

import com.yichen.thinking.in.java.chapter10.exercise06.first.FirstInterface;
import com.yichen.thinking.in.java.chapter10.exercise06.second.SecondClass;

public class ThirdClass extends SecondClass {

    public static FirstInterface three() {
        return new SecondClass().secondInnerClass();
    }

}
