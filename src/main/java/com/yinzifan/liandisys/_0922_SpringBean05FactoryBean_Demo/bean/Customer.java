package com.yinzifan.liandisys._0922_SpringBean05FactoryBean_Demo.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author yinzf2
 * 2017/09/22	17:51:14
 */
public class Customer {
	private List<Object> list;
	private Set<Object> set;
	private Map<String, Object> map;

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	public Set<Object> getSet() {
		return set;
	}

	public void setSet(Set<Object> set) {
		this.set = set;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	/**
	 * 
	 */
	public Customer() {
		super();
	}

	/**
	 * @param list
	 * @param set
	 * @param map
	 */
	public Customer(List<Object> list, Set<Object> set, Map<String, Object> map) {
		super();
		this.list = list;
		this.set = set;
		this.map = map;
	}

	@Override
	public String toString() {
		return "Customer [list=" + list + ", set=" + set + ", map=" + map + "]";
	}

}
