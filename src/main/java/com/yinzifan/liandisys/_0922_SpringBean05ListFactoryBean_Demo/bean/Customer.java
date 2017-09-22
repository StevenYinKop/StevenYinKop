package com.yinzifan.liandisys._0922_SpringBean05ListFactoryBean_Demo.bean;

import java.util.List;

/**
 * @author yinzf2
 * 2017/09/22	17:51:14
 */
public class Customer {
	private List<Object> list;

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	/**
	 * 
	 */
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param list
	 */
	public Customer(List<Object> list) {
		super();
		this.list = list;
	}

	@Override
	public String toString() {
		return "Customer [list=" + list + "]";
	}

}
