package io.sevenx.vehiclemanagement;
import io.sevenx.vehiclemanagement.data.Car;
import io.sevenx.vehiclemanagement.data.Bike;
import io.sevenx.vehiclemanagement.data.Vehicle;

public class VehicleManagementMain {

	public static void main(String[] args) {
		
		Vehicle vehicle=new Vehicle();
		
		//vehicle.setVehicleNumber(3245);
		vehicle.setFuelType("Petrol");
		vehicle.setColour("White");
		vehicle.setBrand("Tata");
		vehicle.setMaximumSpeed(120);
		vehicle.setNumberOfGears(5);


		
	
		System.out.println("Fuel Type  :" + vehicle.getFuelType());
		System.out.println("Colour :" + vehicle.getColour());
		System.out.println("Brand:" + vehicle.getBrand());
		System.out.println("Maximum Speed :" + vehicle.getMaximumSpeed());
		System.out.println("Number of gears :" + vehicle.getNumberOfGears());

		
		Car car=new Car();
		
		//car.setVehicleNumber(5475);
		car.setFuelType("Petrol");
		car.setColour("Blue");
		car.setBrand("Tata");
		car.setMaximumSpeed(400);
		car.setNumberOfGears(5);
        car.setHorsePower(800);
		
		
		System.out.println("*******************" );

		//System.out.println("Vehicle Number :" + car.getVehicleNumber());
		System.out.println("Fuel Type  :" + car.getFuelType());
		System.out.println("Colour :" + car.getColour());
		System.out.println("brand :" + car.getBrand());
		System.out.println("Maximum speed :" + car.getMaximumSpeed());
		System.out.println("Number of gears :" + car.getNumberOfGears());
		System.out.println("Power :" + car.getHorsePower());

		
         Bike bike=new Bike();
		
		
		bike.setFuelType("Petrol");
	    bike.setColour("Brown");
		

		System.out.println("*******************" );
		//System.out.println("Vehicle Number :" + bike.getVehicleNumber());
		System.out.println("Fuel Type  :" + bike.getFuelType());
		System.out.println("Colour :" + bike.getColour());
		//System.out.println("Bike Name :" + bike.getBikeName());
		//System.out.println("Bike Capacity :" + bike.getCapacity());
		//System.out.println("Bike Price :" + bike.getBikePrice());
		
		

		
		


	}

}
