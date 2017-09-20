package com.yinzifan.liandisys._0918_SpringJDBC04_JdbcTemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.yinzifan.liandisys._0918_SpringJDBC03_JDBCDemo.bean.Customer;

/**
 * @author yinzf2
 * 2017/09/18	16:36:00
 * 标准的JDBC插入语法
 */
public class JdbcDemo {
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void insert(Customer customer) {
		String sql = "INSERT INTO CUSTOMER" + "(CUST_ID,NAME,AGE) VALUES(?,?,?);";
		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, customer.getCustId());
			ps.setString(2, customer.getName());
			ps.setInt(3, customer.getAge());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
