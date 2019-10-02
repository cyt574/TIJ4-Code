package com.yichen.thinking.in.java.chapter02;

public class Chapter02Exercise06 {
    int storage(String s) {
    	return s.length()*2;
    }
    
    public static void main(String[] args) {
    	Chapter02Exercise06 chapter02Exercise06 = new Chapter02Exercise06();
    	String string = "abcdefg";
		int length = chapter02Exercise06.storage(string);
		System.out.println("The storage of \"" + string + "\" is " + length );
	}
}
