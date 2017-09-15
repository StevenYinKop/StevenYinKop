package com.yinzifan.liandisys;

import org.joda.time.LocalTime;

public class HelloWorld {
	public void say() {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		System.out.println(new Greeter().sayHello());
	}
}
