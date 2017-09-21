package com.yinzifan.liandisys._0920_SpringAutoWire01ByType_Demo.bean;

/**
 * @author yinzf2
 * 2017/09/20	17:13:59
 */
public class Ability {
	private String skill;

	/**
	 * 
	 */
	public Ability() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param skill
	 */
	public Ability(String skill) {
		super();
		this.skill = skill;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Ability [skill=" + skill + "]";
	}

}
