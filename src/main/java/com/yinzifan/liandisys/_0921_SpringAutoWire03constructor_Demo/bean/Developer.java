package com.yinzifan.liandisys._0921_SpringAutoWire03constructor_Demo.bean;

/**
 * @author yinzf2
 * 2017/09/21	9:22:58
 */
public class Developer {
	private Language language;

	/**
	 * 
	 */
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param language
	 */
	public Developer(Language language) {
		super();
		this.language = language;
	}

	@Override
	public String toString() {
		return "Developer [language=" + language + "]";
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

}
