package com.sp.main;

import java.util.Stack;

public class MainClass {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();

		// 1. Push elements onto the stack
		stack.push("Element1");
		stack.push("Element2");
		stack.push("Element3");
		System.out.println("Stack after pushes: " + stack);

		// 2. Peek at the top element
		System.out.println("Top element: " + stack.peek()); // Should print "Element3"

		// 3. Pop elements from the stack
		stack.pop(); // Removes "Element3"
		System.out.println("Stack after one pop: " + stack);

		// 4. Check if the stack is empty
		System.out.println("Is the stack empty? " + stack.isEmpty());

		// 5. Search for an element in the stack
		System.out.println("Position of 'Element1': " + stack.search("Element1")); // Returns position from the top
	}
}
