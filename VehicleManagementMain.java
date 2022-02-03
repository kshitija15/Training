package io.sevenx.vehiclemanagement;

import io.sevenx.vehiclemanagement.data.Car;
import io.sevenx.vehiclemanagement.data.Bike;
import io.sevenx.vehiclemanagement.data.Vehicle;

public class VehicleManagementMain {

	public static void main(String[] args) {
		
		Vehicle vehicle=new Vehicle();
		
		vehicle.setVehicleNumber(3245);
		vehicle.setFuelType("Petrol");
		vehicle.setColour("White");
		
		System.out.println("Vehicle Number :" + vehicle.getVehicleNumber());
		System.out.println("Fuel Type  :" + vehicle.getFuelType());
		System.out.println("Colour :" + vehicle.getColour());
		
		
		Car car=new Car();
		
		car.setVehicleNumber(5475);
		car.setFuelType("Petrol");
		car.setColour("Black");
		car.setCarName("Tata Nexon");
		car.setCarType("SUV");
		car.setCapacity(4);
		car.setCarPrice(740000);
		System.out.println("*******************" );

		System.out.println("Vehicle Number :" + car.getVehicleNumber());
		System.out.println("Fuel Type  :" + car.getFuelType());
		System.out.println("Colour :" + car.getColour());
		System.out.println("Car Name :" + car.getCarName());
		System.out.println("Car Type  :" + car.getCarType());
		System.out.println("Car Capacity :" + car.getCapacity());
		System.out.println("Car Price :" + car.getCarPrice());
		
                Bike bike=new Bike();
		
		bike.setVehicleNumber(9823);
		bike.setFuelType("Petrol");
	        bike.setColour("Brown");
		bike.setBikeName("TVS jupiter");
		bike.setCapacity(2);
		bike.setBikePrice(75000);

		System.out.println("*******************" );
		System.out.println("Vehicle Number :" + bike.getVehicleNumber());
		System.out.println("Fuel Type  :" + bike.getFuelType());
		System.out.println("Colour :" + bike.getColour());
		System.out.println("Bike Name :" + bike.getBikeName());
		System.out.println("Bike Capacity :" + bike.getCapacity());
		System.out.println("Bike Price :" + bike.getBikePrice());
		
		

		
		


	}

}
