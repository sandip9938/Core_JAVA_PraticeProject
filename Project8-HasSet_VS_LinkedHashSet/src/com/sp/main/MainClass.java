package com.sp.main;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MainClass {
    public static void main(String[] args) {
        // HashSet Example
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Grapes");
        System.out.println("HashSet (no specific order): " + hashSet);

        // LinkedHashSet Example
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Grapes");
        System.out.println("LinkedHashSet (maintains insertion order): " + linkedHashSet);
    }
}

