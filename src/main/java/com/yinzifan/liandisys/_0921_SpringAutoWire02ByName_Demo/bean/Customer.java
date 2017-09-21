package com.yinzifan.liandisys._0921_SpringAutoWire02ByName_Demo.bean;

/**
 * @author yinzf2
 * 2017/09/21	9:05:51
 */
public class Customer {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * 
	 */
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param address
	 */
	public Customer(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [address=" + address + "]";
	}

}
