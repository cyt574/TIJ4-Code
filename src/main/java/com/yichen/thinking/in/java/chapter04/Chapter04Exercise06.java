package com.yichen.thinking.in.java.chapter04;

public class Chapter04Exercise06 {

	static boolean test(int testval, int begin, int end) {
		if ( begin > end ) {
			int temp = end;
			end = begin;
			begin = temp;
		}
		
		if(testval <= end && testval >= begin) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(test(2,1,3));;
		System.out.println(test(2,3,1));;
		System.out.println(test(2,2,4));;
	}

}
