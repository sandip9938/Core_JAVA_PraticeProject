package com.sp.main;

import java.util.Optional;

class Insurance {
	private String policyNumber;

	public Insurance(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}
}

class Car {
	private Optional<Insurance> insurance;

	public Car(Optional<Insurance> insurance) {
		this.insurance = insurance;
	}

	public Optional<Insurance> getInsurance() {
		return insurance;
	}
}

class Person {
	private Optional<Car> car;

	public Person(Optional<Car> car) {
		this.car = car;
	}

	public Optional<Car> getCar() {
		return car;
	}
}

public class MainClass {
	public static void main(String[] args) {
		// Case 1: Person with insurance policy number
		Optional<Insurance> insurance = Optional.of(new Insurance("123-456"));
		Optional<Car> carWithInsurance = Optional.of(new Car(insurance));
		Person personWithInsurance = new Person(carWithInsurance);

		// Case 2: Person without insurance policy
		Person personWithoutInsurance = new Person(Optional.empty());

		// Retrieve policy number using Optional methods
		System.out.println("Person with Insurance: " + getPolicyNumber(personWithInsurance)); // Output: 123-456

		System.out.println("Person without Insurance: " + getPolicyNumber(personWithoutInsurance)); // Output: Not
																									// Available
	}

	// Method to safely retrieve policy number using Optional
	public static String getPolicyNumber(Person person) {
		return person.getCar() // Retrieve car
				.flatMap(Car::getInsurance) // Retrieve insurance if present
				.map(Insurance::getPolicyNumber) // Get policy number if insurance is present
				.orElse("Not Available"); // Provide default value if not present
	}
}
