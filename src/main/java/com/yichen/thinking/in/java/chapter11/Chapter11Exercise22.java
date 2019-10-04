package com.yichen.thinking.in.java.chapter11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import net.mindview.util.TextFile;

class WordCounter {
	String word;
	int counter;
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}	
	@Override
	public int hashCode() {
		return word.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof WordCounter)) {
			return false;
		}
		return word.equals(((WordCounter)obj).getWord());
	}
	@Override
	public String toString() {
		return "{word: " + word + " count: " + counter + "}\n";
	}
}

public class Chapter11Exercise22 {

	public static void main(String[] args) {
		Set<WordCounter> words = new HashSet<WordCounter>();
		TextFile textFile = new TextFile("UniqueWords.java", "\\W+");
		for (String string : textFile) {
			WordCounter wordCounter = new WordCounter();
			wordCounter.setWord(string);
			wordCounter.setCounter(1);
			if(words.contains(wordCounter)) {
				updateStats(words, wordCounter);
			} else {
				words.add(wordCounter);
			}
		}
		
		System.out.println("Set : " + words);
	}

	private static void updateStats(Set<WordCounter> words, WordCounter wordCounter) {
		for (Iterator<WordCounter> iterator = words.iterator(); iterator.hasNext();) {
			WordCounter wCounter = (WordCounter) iterator.next();
			if(wCounter.equals(wordCounter)) {
				int count = wCounter.getCounter();
				wCounter.setCounter(count + wordCounter.getCounter());
			}
		}
	}

}
