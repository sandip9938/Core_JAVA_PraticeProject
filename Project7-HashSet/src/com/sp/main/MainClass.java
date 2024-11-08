package com.sp.main;

import java.util.HashSet;
import java.util.Set;

public class MainClass {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // 1. Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        System.out.println("Set after adding elements: " + set);

        // 2. Adding a duplicate (ignored)
        set.add("Apple");
        System.out.println("Set after adding duplicate 'Apple': " + set);

        // 3. Checking for an element
        System.out.println("Contains 'Banana'? " + set.contains("Banana"));
        System.out.println("Contains 'Grapes'? " + set.contains("Grapes"));

        // 4. Removing an element
        set.remove("Orange");
        System.out.println("Set after removing 'Orange': " + set);

        // 5. Iterating over the set
        System.out.println("Iterating over elements:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // 6. Getting the size of the set
        System.out.println("Size of the set: " + set.size());

        // 7. Clearing the set
        set.clear();
        System.out.println("Set after clearing: " + set);
        System.out.println("Is the set empty? " + set.isEmpty());
    }
}

