package com.sp.main;

import java.util.TreeSet;

public class MainClass {
    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add(15);
        treeSet.add(5);
        treeSet.add(25);
        treeSet.add(10);
        System.out.println("TreeSet after adding elements: " + treeSet);

        // Accessing first and last elements
        System.out.println("First element: " + treeSet.first()); // 5
        System.out.println("Last element: " + treeSet.last());   // 25

        // Using range operations
        System.out.println("Elements less than 15: " + treeSet.headSet(15)); // [5, 10]
        System.out.println("Elements greater than or equal to 10: " + treeSet.tailSet(10)); // [10, 15, 25]
        System.out.println("Elements between 5 (inclusive) and 15 (exclusive): " + treeSet.subSet(5, 15)); // [5, 10]

        // Using navigation methods
        System.out.println("Element higher than 10: " + treeSet.higher(10)); // 15
        System.out.println("Element lower than 15: " + treeSet.lower(15));   // 10
        System.out.println("Ceiling of 12 (>= 12): " + treeSet.ceiling(12)); // 15
        System.out.println("Floor of 20 (<= 20): " + treeSet.floor(20));     // 15

        // Removing an element
        treeSet.remove(10);
        System.out.println("TreeSet after removing element 10: " + treeSet);

        // Checking if the set contains a specific element
        System.out.println("Contains 15? " + treeSet.contains(15)); // true
        System.out.println("Contains 10? " + treeSet.contains(10)); // false
    }
}

