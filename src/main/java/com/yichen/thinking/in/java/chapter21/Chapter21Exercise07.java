package com.yichen.thinking.in.java.chapter21;

import java.util.concurrent.TimeUnit;

class DaemonSpawn implements Runnable {
	@Override
	public void run() {
		while (true) {
			Thread.yield();
			;
		}
	}
}

class Daemon2 implements Runnable {
	private Thread[] t = new Thread[10];

	public void run() {
		for (int i = 0; i < t.length; i++) {
			t[i] = new Thread(new DaemonSpawn());
			t[i].start();
			System.out.print("DaemonSpawn " + i + " started, ");
		}
		try {
// To better see the effect of altering main
// application thread's sleep time.
			TimeUnit.MILLISECONDS.sleep(100);
		} catch (InterruptedException e) {
			/* Ignore */ }
		for (int i = 0; i < t.length; i++)
			System.out.print("t[" + i + "].isDaemon() = " + t[i].isDaemon() + ", ");
		while (true)
			Thread.yield();
	}
}

public class Chapter21Exercise07 {

	public static void main(String[] args) throws InterruptedException {
		args = new String[] {"1000"};
		if (args.length != 1) {
			System.err.println("Sleep time needs to be provided in msecs");
			return;
		}
		int sleep_time = Integer.parseInt(args[0]);
		Thread d = new Thread(new Daemon2());
		d.setDaemon(true);
		d.start();
		System.out.print("d.isDaemon() = " + d.isDaemon() + ", ");
		TimeUnit.MILLISECONDS.sleep(sleep_time);
	}
}