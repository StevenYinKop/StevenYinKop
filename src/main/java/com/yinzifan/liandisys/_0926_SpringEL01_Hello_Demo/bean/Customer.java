package com.yinzifan.liandisys._0926_SpringEL01_Hello_Demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author yinzf2
 * 2017/09/26	16:27:52
 */
@Component("customerBean")
public class Customer {
	@Value("#{itemBean}")
	private Item item;
	@Value("#{itemBean.name}")
	private String itemName;

	/**
	 * 
	 */
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param item
	 * @param itemName
	 */
	public Customer(Item item, String itemName) {
		super();
		this.item = item;
		this.itemName = itemName;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "Customer [item=" + item + ", itemName=" + itemName + "]";
	}

}
