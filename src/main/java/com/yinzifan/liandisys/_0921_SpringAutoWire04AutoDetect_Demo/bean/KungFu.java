package com.yinzifan.liandisys._0921_SpringAutoWire04AutoDetect_Demo.bean;

/**
 * @author yinzf2
 * 2017/09/21	16:13:42
 */
public class KungFu {
	private String name;

	/**
	 * 
	 */
	public KungFu() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 */
	public KungFu(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "KungFu [name=" + name + "]";
	}

}
