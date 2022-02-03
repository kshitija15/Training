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
public int getCapacity() {
	return BikeCapacity;
}
public void setCapacity(int bikeCapacity) {
	BikeCapacity = bikeCapacity;
}
public double getBikePrice() {
	return BikePrice;
}
public void setBikePrice(double bikePrice) {
	BikePrice = bikePrice;
}
}
