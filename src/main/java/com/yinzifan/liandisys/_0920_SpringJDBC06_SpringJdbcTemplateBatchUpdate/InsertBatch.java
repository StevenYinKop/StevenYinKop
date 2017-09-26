package com.yinzifan.liandisys._0920_SpringJDBC06_SpringJdbcTemplateBatchUpdate;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.yinzifan.liandisys._0918_SpringJDBC03_JDBCDemo.bean.Customer;
import com.yinzifan.liandisys._0920_SpringJDBC06_SpringJdbcTemplateBatchUpdate.bean.DemoUser;

/**
 * @author yinzf2
 * 2017/09/20	11:58:02
 */
public class InsertBatch extends JdbcDaoSupport {
	//	String id;
	//	String name;
	//	String nickName;
	//	long phone;
	//	int age;
	//	String address;
	//	boolean isMale;
	//	String email;
	//	Date createTime;
	//	String avatar;
	//	String time;
	public static final String batchSql = "INSERT INTO yinzf2_user "
			+ "(id,name,nick_name,phone,age,address,is_male,email,create_time,avatar) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	public void insertBatch(List<DemoUser> demoUsers) {
		/**
		 * String sql :defining PreparedStatement that will be reused. All statements in the batch will use the same SQL.
			BatchPreparedStatementSetter pss: object to set parameters on the PreparedStatement created by this method
		 */
		getJdbcTemplate().batchUpdate(batchSql, new BatchPreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				DemoUser demoUser = demoUsers.get(i);
				ps.setString(1, demoUser.getId());
				ps.setString(2, demoUser.getName());
				ps.setString(3, demoUser.getNickName());
				ps.setLong(4, demoUser.getPhone());
				ps.setInt(5, demoUser.getAge());
				ps.setString(6, demoUser.getAddress());
				ps.setBoolean(7, demoUser.isMale());
				ps.setString(8, demoUser.getEmail());
				ps.setDate(9, new Date(demoUser.getCreateTime().getTime()));
				ps.setString(10, demoUser.getAvatar());
			}

			@Override
			public int getBatchSize() {
				return demoUsers.size();
			}
		});
	}

	public void insertBatchSQL(String sql) {
		getJdbcTemplate().batchUpdate(new String[] { sql });
	}
}
