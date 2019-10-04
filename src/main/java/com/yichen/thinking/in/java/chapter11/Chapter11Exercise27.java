package com.yichen.thinking.in.java.chapter11;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Command {
	String command;

	public Command(String command) {
		super();
		this.command = command;
	}

	public String operation() {
		return command;
	}
}

class QueueProductor {
	public static <T> Queue<T> product(T[] t) {
		Queue<T> queue = new LinkedList<T>();
		queue.addAll(Arrays.asList(t));
		return queue;
	}
	public static <T> Queue<T> product(T t) {
		Queue<T> queue = new LinkedList<T>();
		queue.add(t);
		return queue;
	}
}

class QueueConsumer {
	public static <T> T consume(Queue<T> queue) {
		T t = queue.poll();
		if (t instanceof Command) {
			return t == null ? null : t;
		}
		return null;
	}
}

public class Chapter11Exercise27 {

	public static void main(String[] args) {
		Command command = new Command("That's Gooooood");
		Queue<Command> commandQueue = QueueProductor.product(command);
		Command c = QueueConsumer.consume(commandQueue);
		if ( c != null ) {
			System.out.println(c.operation());
		}
	}

}
