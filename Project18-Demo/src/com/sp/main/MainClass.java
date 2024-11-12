package com.sp.main;

public class MainClass {

	public int sum(int x, int y) {
		return x + y;
	}

	public float sum(float x, float y) {
		return x + y;
	}

	public static void main(String[] args) {

		MainClass mainClass = new MainClass();
		float x = mainClass.sum(1.2f, 2.2f);
		System.out.println(x);

	}
}