package com.yinzifan.liandisys._0920_SpringJDBCFinal_JdbcDemo.dao;

import java.sql.SQLException;
import java.util.List;

import com.yinzifan.liandisys._0920_SpringJDBCFinal_JdbcDemo.bean.Department;

/**
 * @author yinzf2
 * 2017/09/20	14:53:19
 */
public interface DepartmentDAO {
	public List<Department> queryDepartment() throws SQLException;
}
