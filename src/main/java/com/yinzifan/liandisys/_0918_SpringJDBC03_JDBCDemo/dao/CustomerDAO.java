package com.yinzifan.liandisys._0918_SpringJDBC03_JDBCDemo.dao;

import com.yinzifan.liandisys._0918_SpringJDBC03_JDBCDemo.bean.Customer;

/**
 * @author yinzf2
 * 2017/09/18	14:47:58
 */
public interface CustomerDAO {
	public void insert(Customer customer);

	public Customer findByCustomerId(int custId);
}
