package com.yichen.thinking.in.java.chapter05;

public class Chapter05Exercise22 {

	public static void main(String[] args) {
		for(RMB rmb: RMB.values()) {
			desciption(rmb);
		}
	}

	public static void desciption(RMB value) {
		switch (value) {
		case ONE:
			System.out.println("ONE");
			break;
		case TWO:
			System.out.println("TWO");
			break;
		case FIVE:
			System.out.println("FIVE");
			break;
		case TEN:
			System.out.println("TEN");
			break;
		case TWENTY:
			System.out.println("TWENTY");
			break;
		case FIFTY:
			System.out.println("FIFTY");
			break;
		default:
			System.out.println("OTHERS");
			break;
		}
	}
}
