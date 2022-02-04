package io.sevenx.vehiclemanagement.data;

public abstract class Vehicle {
	//private int vehicleNumber;
	private String fuelType;
	private String colour;
	private String brand;
	private int  maximumSpeed;
	private int numberOfGears;
	
    public Vehicle() {}
	
	
	//private int cost;
	/*public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}*/
	/*public int getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}*/
	public String getFuelType() {
		return fuelType;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getMaximumSpeed() {
		return maximumSpeed;
	}
	public void setMaximumSpeed(int maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
	}
	public int getNumberOfGears() {
		return numberOfGears;
	}
	public void setNumberOfGears(int numberOfGears) {
		this.numberOfGears = numberOfGears;
	}
	
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	

}
