package com.sp.main;

public class MainClass extends Thread {

	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Deamon Thread");
		}

		else {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		System.out.println("Main Thread");
		MainClass mainClass = new MainClass();
		mainClass.setDaemon(true); // For true
//		mainClass.setDaemon(false); // For false
		mainClass.start();
	}

}
