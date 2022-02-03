package io.sevenx.vehiclemanagement.data;

public class Bike extends Vehicle {
 private String BikeName;
 private int BikeCapacity;
 private double BikePrice;
public String getBikeName() {
	return BikeName;
}
public void setBikeName(String bikeName) {
	BikeName = bikeName;
}
public int getBikeCapacity() {
	return BikeCapacity;
}
public void setBikeCapacity(int bikeCapacity) {
	BikeCapacity = bikeCapacity;
}
public double getBikePrice() {
	return BikePrice;
}
public void setBikePrice(double bikePrice) {
	BikePrice = bikePrice;
}
}
