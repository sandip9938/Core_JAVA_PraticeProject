package com.sp.main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainClass {
	public static void main(String[] args) {
		// 1. Simple Lambda Expression with Runnable
		Runnable runnable = () -> System.out.println("Running in a separate thread!");
		new Thread(runnable).start();

		// 2. Lambda with Predicate (takes one argument and returns boolean)
		Predicate<String> isLongerThanThree = (s) -> s.length() > 3;
		System.out.println("Is 'Java' longer than three characters? " + isLongerThanThree.test("Java"));

		// 3. Lambda with Consumer (accepts one argument and returns nothing)
		Consumer<String> greeter = name -> System.out.println("Hello, " + name + "!");
		greeter.accept("Alice");

		// 4. Lambda with Function (accepts one argument and produces a result)
		Function<Integer, String> intToString = number -> "The number is " + number;
		System.out.println(intToString.apply(5));

		// 5. Lambda with Supplier (produces a result with no input)
		Supplier<Double> randomValue = () -> Math.random();
		System.out.println("Random value: " + randomValue.get());

		// 6. Lambda with List.forEach and method reference
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		names.forEach(System.out::println); // method reference

		// 7. Lambda with multiple parameters and type inference
		MathOperation add = (a, b) -> a + b;
		MathOperation multiply = (a, b) -> a * b;
		MathOperation divison = (a, b) -> a / b;

		System.out.println("Addition: " + add.operate(5, 3)); // Output: 8
		System.out.println("Multiplication: " + multiply.operate(5, 3)); // Output: 15
		System.out.println("Multiplication: " + divison.operate(6, 3)); // Output: 2
	}

	@FunctionalInterface
	interface MathOperation {
		int operate(int a, int b);
	}
}
