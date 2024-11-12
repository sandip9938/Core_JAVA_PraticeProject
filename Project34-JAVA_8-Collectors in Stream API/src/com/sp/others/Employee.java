package com.sp.others;

import java.util.Objects;

@SuppressWarnings("unused")
public class Employee {
	private String name;
	private int age;
	private String department;
	private double salary;

	public Employee(String name, int age, String department, double salary) {
		this.name = name;
		this.age = age;
		this.department = department;
		this.salary = salary;
	}

	// Getters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return name + " (" + age + ") - " + department + ": $" + salary;
	}
}
