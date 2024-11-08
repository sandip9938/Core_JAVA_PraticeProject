package com.sp.others;

public class Child {

	public static int a = 200;

	public static Parent p1() {
		Parent parent = (int x, int y) -> {
			System.out.println("****Lambda Expression call(x,y)*****");
			System.out.println("The value of x: " + x);
			System.out.println("The value of y: " + y);
		};
		return parent;
	}

}
