package com.sp.main;

import java.util.*;
import java.util.stream.Collectors;

import com.sp.others.Employee;

public class MainClass {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Alice", 30, "HR", 3000.0),
				new Employee("Bob", 45, "IT", 7000.0), new Employee("Charlie", 25, "Finance", 4000.0),
				new Employee("David", 35, "IT", 6000.0), new Employee("Eve", 28, "Finance", 4500.0),
				new Employee("Frank", 50, "HR", 5000.0));

		// Collecting to a List
		List<String> employeeNames = employees.stream().map(Employee::getName).collect(Collectors.toList());
		System.out.println("Employee Names: " + employeeNames);

		// Grouping by Department
		Map<String, List<Employee>> employeesByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println("Employees by Department: " + employeesByDept);

		// Counting Employees
		long count = employees.stream().collect(Collectors.counting());
		System.out.println("Total Number of Employees: " + count);

		// Summing Salaries
		double totalSalary = employees.stream().collect(Collectors.summingDouble(Employee::getSalary));
		System.out.println("Total Salary: $" + totalSalary);

		// Averaging Salary
		double averageSalary = employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println("Average Salary: $" + averageSalary);

		// Joining Names
		String names = employees.stream().map(Employee::getName).collect(Collectors.joining(", "));
		System.out.println("All Employee Names: " + names);

		// Partitioning by Salary Threshold
		Map<Boolean, List<Employee>> partitionedBySalary = employees.stream()
				.collect(Collectors.partitioningBy(emp -> emp.getSalary() > 5000));
		System.out.println("Employees Partitioned by Salary > $5000: " + partitionedBySalary);

		// Maximum Salary Employee
		employees.stream().collect(Collectors.maxBy((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())))
				.ifPresent(emp -> System.out.println("Employee with Max Salary: " + emp));

		// Mapping Salaries by Department
		Map<String, List<Double>> salaryByDept = employees.stream().collect(Collectors
				.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getSalary, Collectors.toList())));
		System.out.println("Salaries by Department: " + salaryByDept);
	}
}
