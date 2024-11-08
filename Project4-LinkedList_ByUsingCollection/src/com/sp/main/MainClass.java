package com.sp.main;

import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // 1. Adding elements
        list.add("Node1");
        list.add("Node2");
        list.add("Node3");
        System.out.println("List after adding elements: " + list);

        // 2. Adding elements at the start and end
        list.addFirst("Node0");
        list.addLast("Node4");
        System.out.println("List after adding at start and end: " + list);

        // 3. Accessing elements
        System.out.println("First element: " + list.getFirst()); // Should print "Node0"
        System.out.println("Last element: " + list.getLast()); // Should print "Node4"
        System.out.println("Element at index 2: " + list.get(2)); // Should print "Node1"

        // 4. Modifying elements
        list.set(2, "ModifiedNode1");
        System.out.println("List after modification: " + list);

        // 5. Removing elements
        list.removeFirst(); // Removes "Node0"
        list.removeLast(); // Removes "Node4"
        list.remove(1); // Removes element at index 1
        System.out.println("List after removals: " + list);

        // 6. Checking for an element
        System.out.println("Contains 'Node2'? " + list.contains("Node2"));
        System.out.println("Contains 'Node3'? " + list.contains("Node3"));

        // 7. Get the size of the list
        System.out.println("Size of the list: " + list.size());

        // 8. Iterating through the list
        System.out.println("\nIterating over elements:");
        for (String node : list) {
            System.out.println(node);
        }

        // 9. Clearing the list
        list.clear();
        System.out.println("List after clearing: " + list);
        System.out.println("Is the list empty? " + list.isEmpty());
    }
}

