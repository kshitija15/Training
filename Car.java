package io.sevenx.vehiclemanagement.data;

public class Car extends Vehicle{
	private String carName;
	private String carType;
	private int carCapacity;
	private double carPrice;
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public int getCarCapacity() {
		return carCapacity;
	}
	public void setCarCapacity(int carCapacity) {
		this.carCapacity = carCapacity;
	}
	public double getCarPrice() {
		return carPrice;
	}
	
	
	public void setCarPrice(double carPrice) {
       this.carPrice=carPrice;
       
	}
	

}
