package com.yinzifan.liandisys._0920_Spring06_SpringJdbcTemplateBatchUpdate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.yinzifan.liandisys._0918_spring03_JDBCDemo.bean.Customer;

/**
 * @author yinzf2
 * 2017/09/20	13:14:01
 */
public class QueryBiz extends JdbcDaoSupport {
	/**
	 * 
	 * @param sql 传入的sql语句.
	 * @return
	 */
	public List<Customer> queryAll(String tableName) {
		String sql = "SELECT * FROM " + tableName + ";";
		SqlRowSet rowSet = getJdbcTemplate().queryForRowSet(sql);
		List<Customer> customers = new ArrayList<>();
		while (rowSet.next()) {
			int custId = rowSet.getInt(1);
			String name = rowSet.getString(2);
			int age = rowSet.getInt(3);
			Customer customer = new Customer(custId, name, age);
			customers.add(customer);
		}
		return customers;

	}
}
