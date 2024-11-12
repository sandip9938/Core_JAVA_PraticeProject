package com.sp.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Use parallelStream to perform operations in parallel
        List<Integer> evenSquares = numbers.parallelStream()
                                           .filter(n -> n % 2 == 0)         // Filter even numbers
                                           .map(n -> n * n)                 // Square each number
                                           .collect(Collectors.toList());   // Collect results into a list
        
        System.out.println("Even squares (processed in parallel): " + evenSquares);
    }
}

