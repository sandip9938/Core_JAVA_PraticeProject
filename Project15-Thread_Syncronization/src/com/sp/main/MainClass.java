package com.sp.main;

class Counter {
	private int count = 0;

	public void increment() {
		synchronized (this) {
			count++;
		}
	}

	public int getCount() {
		return count;
	}
}

public class MainClass {
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();

		Runnable task = () -> {
			for (int i = 0; i < 1000; i++) {
				counter.increment();
			}
		};

		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);

		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();

		System.out.println("Count: " + counter.getCount()); // Expected to be 2000
	}
}
