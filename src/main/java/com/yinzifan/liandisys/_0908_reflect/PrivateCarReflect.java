package com.yinzifan.liandisys._0908_reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateCarReflect {
	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException,
			SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Class clz = loader.loadClass("com.yinzifan.liandisys.reflect0908.PrivateCar");

		PrivateCar car = (PrivateCar) clz.newInstance();
		Field field = clz.getDeclaredField("color");
		field.setAccessible(true);
		field.set(car, "22");

		Method method = clz.getDeclaredMethod("drive");
		method.setAccessible(true);
		method.invoke(car);
	}
}
