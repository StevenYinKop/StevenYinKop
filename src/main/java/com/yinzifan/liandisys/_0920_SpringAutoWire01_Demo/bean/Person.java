package com.yinzifan.liandisys._0920_SpringAutoWire01_Demo.bean;

/**
 * @author yinzf2
 * 2017/09/20	17:13:49
 */
public class Person {
	private Ability ability;

	/**
	 * 
	 */
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param ability
	 */
	public Person(Ability ability) {
		super();
		this.ability = ability;
	}

	@Override
	public String toString() {
		return "Person [ability=" + ability + "]";
	}

	public Ability getAbility() {
		return ability;
	}

	public void setAbility(Ability ability) {
		this.ability = ability;
	}

}
