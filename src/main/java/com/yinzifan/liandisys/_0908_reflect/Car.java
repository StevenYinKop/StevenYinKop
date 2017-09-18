package com.yinzifan.liandisys._0908_reflect;

public class Car {
	private String brand;
	private String color;
	private int maxSpeed;

	/**
	 * 
	 */
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param brand
	 * @param color
	 * @param maxSpeed
	 */
	public Car(String brand, String color, int maxSpeed) {
		super();
		this.brand = brand;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void introduce() {
		System.out.println("brand:" + brand + ";color:" + color + ";maxSpeed:" + maxSpeed);
	}
}
