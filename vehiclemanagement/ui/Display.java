package io.sevenx.vehiclemanagement.ui;

import java.util.List;

import io.sevenx.vehiclemanagement.data.*;

public class Display {
	
	public static void printVehicle(List<Vehicle> vehicles) {
		
		for(Vehicle vehicle : vehicles) {
			System.out.println("*******************" );

			System.out.println("Fuel Type  :" + vehicle.getFuelType());
			System.out.println("Colour :" + vehicle.getColour());
			System.out.println("brand :" + vehicle.getBrand());
			System.out.println("Maximum speed :" + vehicle.getMaximumSpeed());
			System.out.println("Number of gears :" + vehicle.getNumberOfGears());
			
			if(vehicle instanceof Car) {
				Car car=(Car)vehicle;
				System.out.println("Horse power:" + car.getHorsePower());
				System.out.println("Boot Space:" + car.getBootSpace());
			}
			if(vehicle instanceof Bike) {
				Bike bike=(Bike)vehicle;
				System.out.println("Power:" + bike.getPower());

				
			}
				

				

				
			


		}
	}

}
