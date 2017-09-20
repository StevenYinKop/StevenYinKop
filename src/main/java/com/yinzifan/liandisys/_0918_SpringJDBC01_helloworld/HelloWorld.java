package com.yinzifan.liandisys._0918_SpringJDBC01_helloworld;

/**
 * @author yinzf2
 * 2017/09/18	13:51:31
 * Spring bean
 * http://www.yiibai.com/spring/spring-3-hello-world-example.html
 */
public class HelloWorld {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void printHello() {
		System.out.println("Spring : Hello ! " + name);
	}
}
