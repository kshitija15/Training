package io.sevenx.vehiclemanagement;
import io.sevenx.vehiclemanagement.data.Car;

import java.util.ArrayList;
import java.util.List;

import io.sevenx.vehiclemanagement.data.*;

import io.sevenx.vehiclemanagement.ui.Display;


public class VehicleManagementMain {

	public static void main(String[] args) {
		
		
		
		Car car=new Car();
		
		//car.setVehicleNumber(5475);
		car.setFuelType("Petrol");
		car.setColour("Blue");
		car.setBrand("Tata");
		car.setMaximumSpeed(400);
		car.setNumberOfGears(5);
        car.setHorsePower(800);
        car.setHorsePower(800);
		car.setBootSpace(500);
		

		
		
         Bike bike=new Bike();
		
		//bike.setVehicleNumber(9823);
		bike.setFuelType("Petrol");
	    bike.setColour("Black");
	    bike.setBrand("Honda");
		bike.setMaximumSpeed(150);
		bike.setNumberOfGears(4);
        bike.setPower(100);
        
        List<Vehicle> list = new ArrayList<Vehicle>();
        list.add(car);
        list.add(bike);
        
        Display.printVehicle(list);
		
		
		
		

		
		
		
		


	}

}
