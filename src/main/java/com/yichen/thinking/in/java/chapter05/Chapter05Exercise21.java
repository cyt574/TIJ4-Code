package com.yichen.thinking.in.java.chapter05;

enum RMB{
	ONE,TWO,FIVE,TEN,TWENTY,FIFTY;
}

public class Chapter05Exercise21 {

	public static void main(String[] args) {
		for(RMB rmb: RMB.values()) {
			System.out.println(rmb + ", ordinal " + rmb.ordinal());
		}
	}

}
