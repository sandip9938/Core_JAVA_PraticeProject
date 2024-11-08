package com.sp.main;

import java.util.Vector;

public class MainClass {
    public static void main(String[] args) {
        // Create a Vector
        Vector<String> vector = new Vector<>();

        // 1. Adding elements
        vector.add("Element1");
        vector.add("Element2");
        vector.add("Element3");
        System.out.println("Vector after adding elements: " + vector);

        // 2. Adding an element at a specific index
        vector.add(1, "Element1.5");
        System.out.println("Vector after adding at index 1: " + vector);

        // 3. Accessing elements
        System.out.println("First element: " + vector.firstElement()); // Should print "Element1"
        System.out.println("Last element: " + vector.lastElement()); // Should print "Element3"
        System.out.println("Element at index 2: " + vector.get(2)); // Should print "Element1.5"

        // 4. Checking the size and capacity
        System.out.println("Size of vector: " + vector.size());
        System.out.println("Capacity of vector: " + vector.capacity());

        // 5. Removing elements
        vector.remove(2); // Removes "Element1.5"
        vector.remove("Element3"); // Removes "Element3"
        System.out.println("Vector after removals: " + vector);

        // 6. Checking for an element
        System.out.println("Contains 'Element2'? " + vector.contains("Element2"));

        // 7. Iterating through the vector
        System.out.println("\nIterating over elements:");
        for (String element : vector) {
            System.out.println(element);
        }

        // 8. Converting vector to array
        Object[] array = vector.toArray();
        System.out.println("Array elements:");
        for (Object element : array) {
            System.out.println(element);
        }
    }
}
