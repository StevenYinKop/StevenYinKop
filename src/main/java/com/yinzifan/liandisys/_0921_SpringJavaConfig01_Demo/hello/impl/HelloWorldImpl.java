package com.yinzifan.liandisys._0921_SpringJavaConfig01_Demo.hello.impl;

import com.yinzifan.liandisys._0921_SpringJavaConfig01_Demo.hello.HelloWorld;

/**
 * @author yinzf2
 * 2017/09/21	17:54:36
 */
public class HelloWorldImpl implements HelloWorld {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.yinzifan.liandisys._0921_SpringJavaConfig01_Demo.hello.HelloWorld#
	 * sayHello(java.lang.String)
	 */
	@Override
	public void sayHello(String arg) {
		System.out.println("HelloWorldImpl.sayHello()");
		System.out.println("Hello!" + arg);
	}

}
