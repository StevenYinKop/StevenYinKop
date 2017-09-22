package com.yinzifan.liandisys._0922_SpringDI02Constructor_Demo.bean;

/**
 * @author yinzf2
 * 2017/09/22	13:11:48
 */
public class Person {
	private String name;
	private String address;
	private int age;

	/**
	 * 
	 */
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 含有两个有参构造,并且参数顺序不同.
	 * @param name
	 * @param address
	 * @param age
	 */
	public Person(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
	/**
	 * @param name
	 * @param age
	 * @param address
	 */
	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", age=" + age + "]";
	}

}
