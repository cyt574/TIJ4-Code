package com.yichen.thinking.in.java.chapter04;

import java.util.Random;

public class Chapter04Exercise02 {

	public static void main(String[] args) {
		int number = 0;
		for (int i = 0; i < 25; i++) {
			Random random = new Random();
			int temp = random.nextInt();
			System.out.println("a = " + number);
			System.out.println("b = " + temp);
			if(number < temp) {
				System.out.println(temp + " Greater than previous " + number);
			} else if (number == temp) {
				System.out.println(temp + " Equal to previous " + number);
			} else {
				System.out.println(temp + " Less than previous " + number);
			}
			number = temp;
		}
	}

}
