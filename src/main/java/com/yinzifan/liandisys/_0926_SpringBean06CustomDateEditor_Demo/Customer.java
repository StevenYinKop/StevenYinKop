package com.yinzifan.liandisys._0926_SpringBean06CustomDateEditor_Demo;

import java.util.Date;

/**
 * @author yinzf2
 * 2017/09/26	10:19:04
 */
public class Customer {
	private Date date;

	/**
	 * 
	 */
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param date
	 */
	public Customer(Date date) {
		super();
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Customer [date=" + date + "]";
	}
}
