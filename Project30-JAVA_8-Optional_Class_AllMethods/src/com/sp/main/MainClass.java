package com.sp.main;

import java.util.Optional;

class Address {
	private String city;

	public Address(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}
}

class User {
	private String name;
	private Optional<Address> address;

	public User(String name, Optional<Address> address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public Optional<Address> getAddress() {
		return address;
	}
}

public class MainClass {
	public static void main(String[] args) {
		// Case 1: User with Address
		Optional<Address> address = Optional.of(new Address("New York"));
		User userWithAddress = new User("Alice", address);

		// Case 2: User without Address
		User userWithoutAddress = new User("Bob", Optional.empty());

		// Example 1: of() - create Optional with non-null value
		Optional<User> optionalUser = Optional.of(userWithAddress);

		// Example 2: ofNullable() - create Optional that allows null values
		Optional<User> optionalUserNullable = Optional.ofNullable(userWithoutAddress);

		// Example 3: empty() - create an empty Optional
		Optional<User> emptyUser = Optional.empty();

		// Example 4: isPresent() - check if value is present
		if (optionalUser.isPresent()) {
			System.out.println("User is present: " + optionalUser.get().getName());
		}

		// Example 5: ifPresent() - perform action if value is present
		optionalUser.ifPresent(user -> System.out.println("Hello, " + user.getName()));

		// Example 6: map() - apply function if value is present
		Optional<String> cityOptional = userWithAddress.getAddress().map(Address::getCity);
		cityOptional.ifPresent(city -> System.out.println("City: " + city));

		// Example 7: flatMap() - for chaining Optional objects
		Optional<String> cityFlatOptional = optionalUser.flatMap(User::getAddress).map(Address::getCity);
		System.out.println("City using flatMap: " + cityFlatOptional.orElse("City not available"));

		// Example 8: orElse() - provide default value if value is absent
		String cityName = userWithoutAddress.getAddress().map(Address::getCity).orElse("Unknown City");
		System.out.println("City Name: " + cityName);

		// Example 9: orElseGet() - supply default value using a Supplier
		String cityWithSupplier = userWithoutAddress.getAddress().map(Address::getCity).orElseGet(() -> "Default City");
		System.out.println("City using orElseGet: " + cityWithSupplier);

		// Example 10: orElseThrow() - throw exception if value is absent
		try {
			String cityOrThrow = userWithoutAddress.getAddress().map(Address::getCity)
					.orElseThrow(() -> new IllegalArgumentException("City not found!"));
			System.out.println("City: " + cityOrThrow);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
