package com.yinzifan.liandisys._0919_Spring05_JdbcTemplateQuery;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.yinzifan.liandisys._0918_spring03_JDBCDemo.bean.Customer;
import com.yinzifan.liandisys._0918_spring03_JDBCDemo.dao.CustomerDAO;

/**
 * @author yinzf2
 * 2017/09/19	9:58:49
 */
public class CustomerDAOImpl extends JdbcDaoSupport implements CustomerDAO {

	private static final String INSERT_SQL = "INSERT INTO CUSTOMER " + "(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
	private static final String QUERY_SQL = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?;";

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.yinzifan.liandisys._0918_spring03_JDBCDemo.dao.CustomerDAO#insert(com.
	 * yinzifan.liandisys._0918_spring03_JDBCDemo.bean.Customer)
	 */
	@Override
	public void insert(Customer customer) {
		int column = getJdbcTemplate().update(INSERT_SQL,
				new Object[] { customer.getCustId(), customer.getName(), customer.getAge() });
		if (column != 0) {
			System.out.println("INSERT SUCCESS!");
		} else {
			System.out.println("INSERT ERROR!");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.yinzifan.liandisys._0918_spring03_JDBCDemo.dao.CustomerDAO#
	 * findByCustomerId(int)
	 */
	@Override
	public Customer findByCustomerId(int custId) {
		List<Customer> list = getJdbcTemplate().query(QUERY_SQL, new String[] { "" + custId }, new CustomerRowMapper());
		if (list.isEmpty()) {
			return null;
		} else {
			return list.get(0);
		}
	}

}
