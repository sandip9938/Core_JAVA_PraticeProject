package com.sp.main;

import java.io.*;

@SuppressWarnings("serial")
class Person implements Serializable {
	private String name;
	private int age;

	// Paramaeter Constructer
	public Person(String name, int age) {           
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + '}';
	}
}

public class MainClass {
	public static void main(String[] args) {
		Person person = new Person("Alice", 30);

		// Serialize the object
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.obj"))) {
			oos.writeObject(person);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Deserialize the object
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.obj"))) {
			Person deserializedPerson = (Person) ois.readObject();
			System.out.println("Deserialized Person: " + deserializedPerson);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
