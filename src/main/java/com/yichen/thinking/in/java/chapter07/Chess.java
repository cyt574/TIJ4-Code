package com.yichen.thinking.in.java.chapter07;

//: reusing/Chess.java
// Inheritance, constructors and arguments.
import static net.mindview.util.Print.*;

class Game {
	Game(int i) {
		print("Game constructor");
	}
	
//	public Game() {
//		// TODO Auto-generated constructor stub
//	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		print("BoardGame constructor");
	}
	
}

public class Chess extends BoardGame {
	Chess() {
		super(11);
		print("Chess constructor");
	}

	public static void main(String[] args) {
		Chess x = new Chess();
	}
} /*
	 * Output: Game constructor BoardGame constructor Chess constructor
	 */// :~
