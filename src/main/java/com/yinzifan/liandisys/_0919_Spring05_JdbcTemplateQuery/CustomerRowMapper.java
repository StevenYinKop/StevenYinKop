package com.yinzifan.liandisys._0919_Spring05_JdbcTemplateQuery;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.yinzifan.liandisys._0918_spring03_JDBCDemo.bean.Customer;

/**
 * @author yinzf2
 * 2017/09/19	9:54:31
 */
public class CustomerRowMapper implements RowMapper<Customer> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 */
	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setCustId(rs.getInt("CUST_ID"));
		customer.setName(rs.getString("NAME"));
		customer.setAge(rs.getInt("AGE"));
		return customer;
	}

}
