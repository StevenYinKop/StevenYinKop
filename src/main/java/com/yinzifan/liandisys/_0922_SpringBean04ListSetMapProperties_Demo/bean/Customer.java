package com.yinzifan.liandisys._0922_SpringBean04ListSetMapProperties_Demo.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author yinzf2
 * 2017/09/22	16:44:23
 */
public class Customer {
	private List<Object> lists;
	private Set<Object> sets;
	private Map<Object, Object> maps;
	private Properties pros;

	/**
	 * 
	 */
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param lists
	 * @param sets
	 * @param maps
	 * @param pros
	 */
	public Customer(List<Object> lists, Set<Object> sets, Map<Object, Object> maps, Properties pros) {
		super();
		this.lists = lists;
		this.sets = sets;
		this.maps = maps;
		this.pros = pros;
	}

	public List<Object> getLists() {
		return lists;
	}

	public void setLists(List<Object> lists) {
		this.lists = lists;
	}

	public Set<Object> getSets() {
		return sets;
	}

	public void setSets(Set<Object> sets) {
		this.sets = sets;
	}

	public Map<Object, Object> getMaps() {
		return maps;
	}

	public void setMaps(Map<Object, Object> maps) {
		this.maps = maps;
	}

	public Properties getPros() {
		return pros;
	}

	public void setPros(Properties pros) {
		this.pros = pros;
	}

	@Override
	public String toString() {
		return " Customer [lists=" + lists + ", \n sets=" + sets + ", \n maps=" + maps + ", \n pros=" + pros + "]";
	}

}