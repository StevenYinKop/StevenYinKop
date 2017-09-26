package com.yinzifan.liandisys._0926_SpringEL01_Hello_Demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author yinzf2
 * 2017/09/26	16:32:22
 */
@Component("itemBean")
public class Item {
	@Value("this is name")
	private String name;
	@Value("2")
	private int qty;

	/**
	 * 
	 */
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param qty
	 */
	public Item(String name, int qty) {
		super();
		this.name = name;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", qty=" + qty + "]";
	}

}
