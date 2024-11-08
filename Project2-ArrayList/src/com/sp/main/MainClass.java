package com.sp.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.stream.Collectors;

public class MainClass {
	public static void main(String[] args) {
		// Create an ArrayList to hold inventory items
		ArrayList<String> inventory = new ArrayList<>();

		// 1. Adding elements to the inventory
		inventory.add("Laptop");
		inventory.add("Smartphone");
		inventory.add("Tablet");
		inventory.add("Headphones");
		inventory.add("Charger");

		// 2. Adding an element at a specific index
		inventory.add(2, "Keyboard");

		// 3. Accessing elements
		System.out.println("Item at index 2: " + inventory.get(2)); // Should print "Keyboard"

		// 4. Updating elements
		inventory.set(3, "Smartwatch"); // Replaces "Tablet" with "Smartwatch"

		// 5. Checking if the inventory contains a specific item
		System.out.println("Contains 'Laptop'? " + inventory.contains("Laptop"));

		// 6. Getting the index of an item
		System.out.println("Index of 'Smartphone': " + inventory.indexOf("Smartphone"));

		// 7. Removing elements by index and by value
		inventory.remove(4); // Removes "Headphones"
		inventory.remove("Charger"); // Removes "Charger"

		// 8. Iterating through the list using a for loop
		System.out.println("\nInventory items:");
		for (String item : inventory) {
			System.out.println(item);
		}

		// 9. Using an iterator to remove all items containing the word "smart"
		Iterator<String> iterator = inventory.iterator();
		while (iterator.hasNext()) {
			String item = iterator.next();
			if (item.toLowerCase().contains("smart")) {
				iterator.remove(); // Safe way to remove items while iterating
			}
		}

		// 10. Displaying inventory after removals
		System.out.println("\nInventory after removing items containing 'smart':");
		inventory.forEach(System.out::println);

		// 11. Using streams (Java 8+) to filter and collect items starting with "L"
		List<String> itemsStartingWithL = inventory.stream().filter(item -> item.startsWith("L"))
				.collect(Collectors.toList());
		System.out.println("\nItems starting with 'L': " + itemsStartingWithL);

		// 12. Converting the inventory list to an array
		String[] inventoryArray = inventory.toArray(new String[0]);
		System.out.println("\nInventory array:");
		for (String item : inventoryArray) {
			System.out.println(item);
		}

		// 13. Clearing all items from the inventory
		inventory.clear();
		System.out.println("\nIs the inventory empty? " + inventory.isEmpty());
	}
}
