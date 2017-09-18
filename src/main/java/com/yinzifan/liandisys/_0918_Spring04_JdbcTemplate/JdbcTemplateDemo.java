package com.yinzifan.liandisys._0918_Spring04_JdbcTemplate;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.yinzifan.liandisys._0918_spring03_JDBCDemo.bean.Customer;

/**
 * @author yinzf2
 * 2017/09/18	16:40:56
 * 使用JdbcTemplate的插入语法
 */
public class JdbcTemplateDemo {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void insert(Customer customer) {
		String sql = "INSERT INTO CUSTOMER " + "(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
		jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql, new Object[] { customer.getCustId(), customer.getName(), customer.getAge() });
	}
}
