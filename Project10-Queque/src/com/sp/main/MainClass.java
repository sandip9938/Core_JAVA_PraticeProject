package com.sp.main;

import java.util.LinkedList;
import java.util.Queue;

public class MainClass {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // 1. Adding elements
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        System.out.println("Queue after adding elements: " + queue);

        // 2. Peek at the first element (without removing)
        System.out.println("Peek: " + queue.peek()); // Alice

        // 3. Removing elements
        System.out.println("Removed element: " + queue.poll()); // Alice
        System.out.println("Queue after removal: " + queue);

        // 4. Adding elements using offer (non-throwing)
        queue.offer("David");
        System.out.println("Queue after adding 'David' with offer: " + queue);

        // 5. Using remove to retrieve and delete the head
        System.out.println("Removed element: " + queue.remove()); // Bob
        System.out.println("Queue after removal: " + queue);

        // 6. Checking head element with element() (throws exception if empty)
        System.out.println("Head of the queue: " + queue.element()); // Charlie
    }
}
