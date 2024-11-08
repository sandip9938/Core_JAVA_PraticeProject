package com.sp.main;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
	private String name;
	private String department;
	private int age;
	private double salary;

	public Employee(String name, String department, int age, double salary) {
		this.name = name;
		this.department = department;
		this.age = age;
		this.salary = salary;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee{name='" + name + "', department='" + department + "', age=" + age + ", salary=" + salary + "}";
	}
}

public class MainClass {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Alice", "IT", 25, 5000),
				new Employee("Bob", "HR", 30, 4500), new Employee("Charlie", "Finance", 28, 6000),
				new Employee("Dave", "IT", 40, 7000), new Employee("Eve", "HR", 35, 8000));

		// 1. Filter employees with salary greater than 5000 and collect as a List
		List<Employee> highSalaryEmployees = employees.stream().filter(emp -> emp.getSalary() > 5000)
				.collect(Collectors.toList());
		System.out.println("Employees with salary > 5000:");
		highSalaryEmployees.forEach(System.out::println);

		// 2. Increase salary by 10% for employees in the IT department
		employees.stream().filter(emp -> "IT".equals(emp.getDepartment()))
				.forEach(emp -> emp.setSalary(emp.getSalary() * 1.1));
		System.out.println("\nEmployees after 10% raise in IT department:");
		employees.forEach(System.out::println);

		// 3. Remove employees who are older than 35
		List<Employee> mutableEmployees = new ArrayList<>(employees); // Copy to mutable list
		mutableEmployees.removeIf(emp -> emp.getAge() > 35);
		System.out.println("\nEmployees after removing those older than 35:");
		mutableEmployees.forEach(System.out::println);

		// 4. Group employees by department
		Map<String, List<Employee>> employeesByDepartment = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println("\nEmployees grouped by department:");
		employeesByDepartment.forEach((department, empList) -> {
			System.out.println(department + ": " + empList);
		});

		// 5. Find the average salary in the IT department
		double averageITSalary = employees.stream().filter(emp -> "IT".equals(emp.getDepartment()))
				.mapToDouble(Employee::getSalary).average().orElse(0.0);
		System.out.println("\nAverage salary in IT department: " + averageITSalary);

		// 6. Increase salary by 15% for all employees in parallel
		employees.parallelStream().forEach(emp -> emp.setSalary(emp.getSalary() * 1.15));
		System.out.println("\nEmployees after 15% parallel raise:");
		employees.forEach(System.out::println);

		// 7. Use Map enhancements to handle employee benefits data
		Map<String, Double> employeeBenefits = new HashMap<>();
		employees.forEach(emp -> employeeBenefits.put(emp.getName(), emp.getSalary() * 0.1)); // Initialize with 10% of
																								// salary

		// Use computeIfAbsent to add benefit only if not present
		employeeBenefits.computeIfAbsent("Alice", key -> 700.0);
		employeeBenefits.computeIfPresent("Charlie", (key, benefit) -> benefit + 200); // Add extra 200 if exists

		System.out.println("\nEmployee benefits map:");
		employeeBenefits.forEach((name, benefit) -> {
			System.out.println(name + ": " + benefit);
		});
	}
}
