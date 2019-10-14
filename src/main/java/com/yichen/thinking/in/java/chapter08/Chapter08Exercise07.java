package com.yichen.thinking.in.java.chapter08;

import com.yichen.thinking.in.java.chapter08.music.Note;

import net.mindview.util.Print;

class Electronic extends Instrument {
	void play(Note n) {
		Print.print("Electronic.play() " + n);
	}

	public String toString() {
		return "Electronic";
	}
}

public class Chapter08Exercise07 {

	static Instrument[] orchestra = { new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind(),
			new Electronic() };

	public static void main(String args[]) {
		for (Instrument i : orchestra) {
			i.play(Note.MIDDLE_C);
			i.adjust();
			Print.print(i);
		}
	}
}
