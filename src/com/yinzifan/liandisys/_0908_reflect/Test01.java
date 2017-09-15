package com.yinzifan.liandisys._0908_reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test01 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// 常规
		Car car = new Car("1", "2", 3);
		System.out.println(car.toString());
		// 反射
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Class clz = loader.loadClass("com.yinzifan.liandisys.reflect0908.Car");
		Constructor con = clz.getDeclaredConstructor(null);
		Car car2 = (Car) con.newInstance();
		car2.setBrand("11");
		car2.setColor("22");
		car2.setMaxSpeed(33);
		System.out.println(car2.toString());

	}
}
