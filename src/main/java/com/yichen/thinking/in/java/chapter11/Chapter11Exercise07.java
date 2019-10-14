package com.yichen.thinking.in.java.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Dog {
	private static int counter = 0;
	private int id = counter++;
	@Override
	public String toString() {
		return "Dog(" + id + ")";
	}
}

public class Chapter11Exercise07 {

	public static void main(String[] args) {
		Dog[] dogs = new Dog[10];
		for (int i = 0; i < 10; i++) {
			dogs[i] = new Dog();
		}
		
		List<Dog> dogList = new ArrayList<Dog>(Arrays.asList(dogs));
		System.out.println(dogList);

		List<Dog> sub = dogList.subList(2, 5);
		System.out.println(sub);

		dogList.removeAll(sub);
		System.out.println(dogList);
	}
	
	public static void showDogList(List<Dog> dogList) {
		for (Dog dog : dogList) {
			System.out.print(dog);
		}
		System.out.println();
	}

}
