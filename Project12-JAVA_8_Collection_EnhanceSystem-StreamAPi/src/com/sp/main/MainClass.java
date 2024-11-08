package com.sp.main;

import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        int sumOfEvenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of even numbers: " + sumOfEvenNumbers); // Output: 12
    }
}
