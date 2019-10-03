package com.yichen.thinking.in.java.chapter11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import net.mindview.util.TextFile;

public class Chapter11Exercise16 {

	static int totalCounter = 0;
	
	public static void main(String[] args) {
		Set<Character> vowelCharacters = new HashSet<Character>(Arrays.asList('a', 'e', 'o', 'u',
				'i', 'A', 'E', 'O', 'U', 'I'));
		Set<String> words = new HashSet<String>(new TextFile("UniqueWords.java", "\\W+"));
		int singleCounter;
		for (String string : words) {
			singleCounter = 0;
			char[] characters = string.toCharArray();
			for(Character c : characters) {
				if(vowelCharacters.contains(c)) {
					singleCounter++;
				}
			}
			totalCounter += singleCounter;
			System.out.println("word [" + string + "] contains " + singleCounter + " vowels" );
		}
		
		System.out.println("Totaly vowels counts is " + totalCounter);
	}

}
