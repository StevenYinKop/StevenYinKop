package com.yinzifan.liandisys._0908_reflect;

public class PrivateCar {
	private String color;

	protected void drive() {
		System.out.println("drive private car!the color is:" + color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
