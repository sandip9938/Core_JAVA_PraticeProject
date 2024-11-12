package com.sp.main;

interface Vehicle {
	// Abstract method
	void start();

	// Default method
	default void stop() {
		System.out.println("Vehicle has stopped.");
	}

	// Another default method
	default void fuelUp() {
		System.out.println("Fueling up the vehicle.");
	}
}

interface ElectricVehicle {
	// Abstract method
	void chargeBattery();

	// Default method
	default void stop() {
		System.out.println("Electric Vehicle has stopped.");
	}

	// Default method specific to electric vehicles
	default void recharge() {
		System.out.println("Recharging electric vehicle battery.");
	}
}

class Car implements Vehicle, ElectricVehicle {
	@Override
	public void start() {
		System.out.println("Car is starting.");
	}

	@Override
	public void chargeBattery() {
		System.out.println("Car battery is charging.");
	}

	// Overriding the stop method to resolve conflict between Vehicle and
	// ElectricVehicle
	@Override
	public void stop() {
		System.out.println("Car has stopped.");
	}
}

public class MainClass {
	public static void main(String[] args) {
		Car myCar = new Car();

		// Calling overridden start method
		myCar.start();

		// Calling overridden stop method
		myCar.stop();

		// Calling fuelUp method from Vehicle interface
		myCar.fuelUp();

		// Calling recharge method from ElectricVehicle interface
		myCar.recharge();
	}
}
