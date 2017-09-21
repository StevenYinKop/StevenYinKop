package com.yinzifan.liandisys._0921_SpringAutoWire02ByName_Demo.bean;

/**
 * @author yinzf2
 * 2017/09/21	9:07:00
 */
public class Address {
	private String fullAddress;

	/**
	 * @param fullAddress
	 */
	public Address(String fullAddress) {
		super();
		this.fullAddress = fullAddress;
	}

	/**
	 * 
	 */
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	@Override
	public String toString() {
		return "Address [fullAddress=" + fullAddress + "]";
	}
	
}
