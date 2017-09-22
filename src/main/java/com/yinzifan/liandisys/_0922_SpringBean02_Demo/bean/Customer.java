package com.yinzifan.liandisys._0922_SpringBean02_Demo.bean;

/**
 * @author yinzf2
 * 2017/09/22	14:33:26
 */
public class Customer {
	private Person person;

	/**
	 * 
	 */
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	/**
	 * @param person
	 */
	public Customer(Person person) {
		super();
		this.person = person;
	}

	@Override
	public String toString() {
		return "Customer [person=" + person + "]";
	}

}
