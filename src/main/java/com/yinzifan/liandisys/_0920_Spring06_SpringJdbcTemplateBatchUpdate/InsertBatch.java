package com.yinzifan.liandisys._0920_Spring06_SpringJdbcTemplateBatchUpdate;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.yinzifan.liandisys._0918_spring03_JDBCDemo.bean.Customer;

/**
 * @author yinzf2
 * 2017/09/20	11:58:02
 */
public class InsertBatch extends JdbcDaoSupport {
	public static final String batchSql = "INSERT INTO CUSTOMER " + "(NAME, AGE) VALUES (?, ?)";

	public void insertBatch(List<Customer> customers) {
		/**
		 * String sql :defining PreparedStatement that will be reused. All statements in the batch will use the same SQL.
			BatchPreparedStatementSetter pss: object to set parameters on the PreparedStatement created by this method
		 */
		getJdbcTemplate().batchUpdate(batchSql, new BatchPreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				Customer customer = customers.get(i);
				ps.setString(1, customer.getName());
				ps.setInt(2, customer.getAge());
			}

			@Override
			public int getBatchSize() {
				return customers.size();
			}
		});
	}

	public void insertBatchSQL(String sql) {
		getJdbcTemplate().batchUpdate(new String[] { sql });
	}
}
