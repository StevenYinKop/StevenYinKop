package com.yinzifan.liandisys._0918_SpringJDBC03_JDBCDemo.bean;

/**
 * @author yinzf2
 * 2017/09/18	14:46:50
 */
public class Customer {
	private int custId;
	private String name;
	private int age;

	/**
	 * 
	 */
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param custId
	 * @param name
	 * @param age
	 */
	public Customer(int custId, String name, int age) {
		super();
		this.custId = custId;
		this.name = name;
		this.age = age;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", age=" + age + "]";
	}

}
