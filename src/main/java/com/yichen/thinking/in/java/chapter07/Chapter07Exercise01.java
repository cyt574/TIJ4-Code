package com.yichen.thinking.in.java.chapter07;

class Simple {
	private String simple;
	
	public Simple(String simple) {
		this.simple = simple;
	}
	
	public String getSimple() {
		return simple;
	}
	@Override
	public String toString() {
		return simple;
	}
	public void setSimple(String simple) {
		this.simple = simple;
	}
}

class Second {
	private String second;
	private Simple simple;
	
	public Second(String second) {
		this.second = second;
	}
	 
	public Simple lazyLoad() {
		if(simple == null) {
			System.out.println("Create simple!");
			simple = new Simple(second);
		}
		return simple;
	}
	
	public void check() {
		if(simple == null) {
			System.out.println("Not Initialized!");
		} else {
			System.out.println("Initialized!");
		}
	}
	@Override
	public String toString() {
		return lazyLoad().toString();
	}
	
	public void setSimple(String str) {
		lazyLoad().setSimple(str);
	}
	
	public Simple getSimple() {
		return simple;
	}
}

public class Chapter07Exercise01 {

	public static void main(String[] args) {
		Second second = new Second("Init second");
		second.check();
		System.out.println(second.getSimple());
		second.check();
		System.out.println(second);
		second.setSimple("simple");
		second.check();
	}

}
