package com.sp.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Adding entries to the map
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);
        System.out.println("Map after adding elements: " + map);

        // Accessing an entry
        System.out.println("Value associated with 'Apple': " + map.get("Apple")); // 10

        // Replacing a value
        map.put("Apple", 15);  // Updates the value for "Apple"
        System.out.println("Map after updating 'Apple': " + map);

        // Removing an entry
        map.remove("Banana");
        System.out.println("Map after removing 'Banana': " + map);

        // Checking contents
        System.out.println("Contains key 'Orange'? " + map.containsKey("Orange")); // true
        System.out.println("Contains value 15? " + map.containsValue(15));         // true

        // Iterating over entries
        System.out.println("Iterating over map entries:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

