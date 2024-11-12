package com.sp.main;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class MainClass {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

		// 1. Predicate: Checks if a number is greater than 15
		Predicate<Integer> isGreaterThan15 = num -> num > 15;
		System.out.println("Numbers greater than 15:");
		numbers.stream().filter(isGreaterThan15).forEach(System.out::println);

		// 2. Function: Squares each number
		Function<Integer, Integer> squareFunction = num -> num * num;
		System.out.println("\nSquared numbers:");
		numbers.stream().map(squareFunction).forEach(System.out::println);

		// 3. Consumer: Prints each number with a prefix
		Consumer<Integer> printConsumer = num -> System.out.println("Number: " + num);
		System.out.println("\nUsing Consumer to print numbers:");
		numbers.forEach(printConsumer);

		// 4. Supplier: Supplies a default value (fallback example)
		Supplier<Integer> defaultNumberSupplier = () -> 0;
		System.out.println("\nDefault value from Supplier: " + defaultNumberSupplier.get());

		// 5. BiFunction: Adds two integers and returns their sum
		BiFunction<Integer, Integer, Integer> addBiFunction = (a, b) -> a + b;
		int a = 10, b = 20;
		System.out.println("\nSum using BiFunction:");
		System.out.println("Sum of " + a + " and " + b + " is: " + addBiFunction.apply(a, b));

		BiFunction<Integer, Integer, Integer> mulBiFunction = (x, y) -> x * y;
		int x = 10, y = 20;
		System.out.println("\nMultiplication using BiFunction:");
		System.out.println("Multiplication of " + x + " and " + y + " is: " + mulBiFunction.apply(x, y));
	}
}
