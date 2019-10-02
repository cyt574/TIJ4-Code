package com.yichen.thinking.in.java.chapter04;

public class Chapter04Exercise10 {

	public static void main(String[] args) {
		int[] a = new int[4];
		int[] b = new int[4];
		for (int i = 10; i < 100; i++) {
			for (int j = 10; j < 100; j++) {
				a[0] = i / 10;
				a[1] = i % 10;
				a[2] = j / 10;
				a[3] = j % 10;
				int number = i * j;

				b[0] = number / 1000;
				b[1] = number % 1000 / 100;
				b[2] = number % 1000 % 100 / 10;
				b[3] = number % 1000 % 100 % 10;
				
				int count = 0;
				
				for (int x = 0; x < a.length; x++) {
					for (int y = 0; y < b.length; y++) {
						if( a[x] == b[y]) {
							count ++;
							a[x] = -1;
							b[y] = -2;
							if (count == 4) {								
								System.out.println(i + "*" + j + " = " + number);
							}
						}
					}
				}
				

			}
		}
	}

}
