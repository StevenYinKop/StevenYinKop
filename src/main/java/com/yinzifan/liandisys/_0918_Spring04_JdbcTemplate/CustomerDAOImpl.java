package com.yinzifan.liandisys._0918_Spring04_JdbcTemplate;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.sql.RowSet;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.yinzifan.liandisys._0918_spring03_JDBCDemo.bean.Customer;
import com.yinzifan.liandisys._0918_spring03_JDBCDemo.dao.CustomerDAO;

/**
 * @author yinzf2
 * 2017/09/18	16:44:38
 */
public class CustomerDAOImpl extends JdbcDaoSupport implements CustomerDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.yinzifan.liandisys._0918_spring03_JDBCDemo.dao.CustomerDAO#insert(com.
	 * yinzifan.liandisys._0918_spring03_JDBCDemo.bean.Customer)
	 */
	@Override
	public void insert(Customer customer) {
		//no need to set datasource here
		String sql = "INSERT INTO CUSTOMER " + "(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
		getJdbcTemplate().update(sql, new Object[] { customer.getCustId(), customer.getName(), customer.getAge() });
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.yinzifan.liandisys._0918_spring03_JDBCDemo.dao.CustomerDAO#
	 * findByCustomerId(int)
	 */
	@Override
	public Customer findByCustomerId(int custId) {
		String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID=" + custId + ";";
		SqlRowSet rowSet = getJdbcTemplate().queryForRowSet(sql);
		Customer customer = null;
		while (rowSet.next()) {
			customer = new Customer(rowSet.getInt("CUST_ID"), rowSet.getString("NAME"), rowSet.getInt("AGE"));
		}
		return customer;
	}

}
