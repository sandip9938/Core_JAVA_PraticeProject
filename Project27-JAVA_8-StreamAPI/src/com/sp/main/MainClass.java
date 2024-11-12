package com.sp.main;

import java.util.*;
import java.util.stream.Collectors;

class Person {
	private String name;
	private int age;
	private String city;

	// Parameter Constructer
	public Person(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

	// Generate Getter and Setter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

	// ToString()
	@Override
	public String toString() {
		return name + " (" + age + " years, " + city + ")";
	}
}

public class MainClass {
	public static void main(String[] args) {
		// Add Value In Data In Person Object
		List<Person> people = Arrays.asList(
				new Person("Alice", 24, "New York"),
				new Person("Bob", 30, "Chicago"),
				new Person("Charlie", 28, "New York"), 
				new Person("Diana", 35, "Los Angeles"),
				new Person("Eve", 40, "Chicago"), 
				new Person("Frank", 18, "New York"),
				new Person("Grace", 22, "Los Angeles")
				);

		// 1. Filter: Find people older than 25
		List<Person> filtered = people.stream().filter(person -> person.getAge() > 25).collect(Collectors.toList());
		System.out.println("People older than 25: " + filtered);

		// 2. Map: Get list of all names in uppercase
		List<String> names = people.stream().map(person -> person.getName().toUpperCase()).collect(Collectors.toList());
		System.out.println("Names in uppercase: " + names);
		// Exactly Generate LowerCase
		List<String> names1=people.stream().map(person->person.getName().toLowerCase()).collect(Collectors.toList());
		System.out.println("Names In LowerCase: " + names1);

		// 3. Sorted: Sort people by age
		List<Person> sortedByAge = people.stream().sorted(Comparator.comparingInt(Person::getAge))
				.collect(Collectors.toList());
		System.out.println("People sorted by age: " + sortedByAge);

		// 4. Match: Check if any person is from "Chicago"
		boolean anyFromChicago = people.stream().anyMatch(person -> "Chicago".equals(person.getCity()));
		System.out.println("Any person from Chicago: " + anyFromChicago);

		// 5. Reduce: Find the oldest person
		Optional<Person> oldestPerson = people.stream()
				.reduce((person1, person2) -> person1.getAge() > person2.getAge() ? person1 : person2);
		oldestPerson.ifPresent(person -> System.out.println("Oldest person: " + person));

		// 6. Collectors: Group by city
		Map<String, List<Person>> groupByCity = people.stream().collect(Collectors.groupingBy(Person::getCity));
		System.out.println("People grouped by city: " + groupByCity);

		// 7. Collectors: Partition by age (younger than 30 vs 30 and older)
		Map<Boolean, List<Person>> partitionedByAge = people.stream()
				.collect(Collectors.partitioningBy(person -> person.getAge() < 30));
		System.out.println("Partitioned by age < 30: " + partitionedByAge);

		// 8. Counting: Count number of people in "New York"
		long countInNewYork = people.stream().filter(person -> "New York".equals(person.getCity())).count();
		System.out.println("Number of people in New York: " + countInNewYork);

		// 9. Collectors: Joining names into a single string
		String allNames = people.stream().map(Person::getName).collect(Collectors.joining(", "));
		System.out.println("All names joined: " + allNames);
	}
}
