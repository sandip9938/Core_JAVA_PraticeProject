package com.sp.others;

public interface Parent {
	public final static int k = 100;

	public abstract void call(int x, int y);

	public default void dis1(int z) {
		System.out.println("****Default dis1()****");
		System.out.println("The value of z: " + z);
		System.out.println("The Interface value k: " + k);
	}
}
