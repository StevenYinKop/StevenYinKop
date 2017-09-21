package com.yinzifan.liandisys._0921_SpringAutoWire03constructor_Demo.bean;

/**
 * @author yinzf2
 * 2017/09/21	9:23:17
 */
public class Language {
	private String name;

	/**
	 * 
	 */
	public Language() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 */
	public Language(String name) {
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
		return "Language [name=" + name + "]";
	}

}
