package com.yinzifan.liandisys;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yinzifan.liandisys._0920_SpringJDBCFinal_JdbcDemo.bean.Department;
import com.yinzifan.liandisys._0920_SpringJDBCFinal_JdbcDemo.dao.DepartmentDAO;

/**
 * @author yinzf2
 * 2017/09/20	14:57:59
 */
public class _01_SpringJDBCFinal_JdbcDemoTest {
	@Test
	public void testJdbcDemo() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("_0920_springfinal_ApplicationContext.xml");
		DepartmentDAO dao = (DepartmentDAO) ac.getBean("DepartmentDAO");
		List<Department> departments = dao.queryDepartment();
		for (Department department : departments) {
			System.out.println(department.toString());
		}
	}
}
