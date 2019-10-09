package com.yichen.thinking.in.java.chapter21;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class SleepingTask extends Thread{
	static Random random = new Random(47);
	@Override
	public void run() {
		try {
			int timeout = random.nextInt(10);
			TimeUnit.SECONDS.sleep(timeout);
			System.out.println(timeout);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Chapter21Exercise06 {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			executorService.execute(new SleepingTask());
		}
	}

}
