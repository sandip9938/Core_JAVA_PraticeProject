package com.sp.main;

class MyTask implements Runnable {
	public void run() {
		System.out.println("Playing Video");
	}
}

class MyTask2 implements Runnable {
	public void run() {
		System.out.println("Playing Music");
	}
}

class MyTask3 implements Runnable {
	public void run() {
		System.out.println("Playing Caption");
	}
}

public class MainClass {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyTask(), "Thread 1");
		Thread thread2 = new Thread(new MyTask2(), "Thread 2");
		Thread thread3 = new Thread(new MyTask3(), "Thread 3");

		thread1.start(); // Start thread1
		thread2.start(); // Start thread2
		thread3.start();// Start thread3
	}
}
