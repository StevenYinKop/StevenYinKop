package com.yinzifan.liandisys._0921_SpringAutoWire05AutoWireAnno_Demo.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author yinzf2
 * 2017/09/21	16:36:08
 */
public class Customer {
	@Autowired
	private Person person;
	private int type;
	private String action;
	/**
	 * 
	 */
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param person
	 * @param type
	 * @param action
	 */
	public Customer(Person person, int type, String action) {
		super();
		this.person = person;
		this.type = type;
		this.action = action;
	}
	public Person getPerson() {
		return person;
	}
//	@Autowired
	public void setPerson(Person person) {
		this.person = person;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	@Override
	public String toString() {
		return "Customer [person=" + person + ", type=" + type + ", action=" + action + "]";
	}
	
}
