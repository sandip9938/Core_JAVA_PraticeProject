package com.sp.main;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceExample {

    // Static method for the static method reference
    public static void printUpperCase(String s) {
        System.out.println(s.toUpperCase());
    }

    // Instance method for instance method reference
    public void printLowerCase(String s) {
        System.out.println(s.toLowerCase());
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // 1. Static Method Reference
        // Syntax: ClassName::methodName
        System.out.println("Using Static Method Reference:");
        names.forEach(MethodReferenceExample::printUpperCase);

        // 2. Instance Method Reference of a Particular Object
        MethodReferenceExample example = new MethodReferenceExample();
        System.out.println("\nUsing Instance Method Reference of a Particular Object:");
        names.forEach(example::printLowerCase);

        // 3. Instance Method Reference of an Arbitrary Object of a Particular Type
        System.out.println("\nUsing Instance Method Reference of an Arbitrary Object of a Particular Type:");
        names.forEach(String::toUpperCase); // Each element is treated as a separate String instance

        // 4. Constructor Reference
        System.out.println("\nUsing Constructor Reference:");
        List<String> newNames = Arrays.asList("David", "Eva");
        newNames.stream().map(Name::new).forEach(System.out::println);
    }
}

// Additional Class for Constructor Reference
class Name {
    private String name;

    // Constructor accepting a String
    public Name(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}

