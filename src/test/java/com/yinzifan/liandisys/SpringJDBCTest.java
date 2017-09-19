package com.yinzifan.liandisys;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yinzifan.liandisys._0918_spring03_JDBCDemo.bean.Customer;
import com.yinzifan.liandisys._0918_spring03_JDBCDemo.dao.CustomerDAO;

/**
 * @author yinzf2
 * 2017/09/18	15:04:08
 */
public class SpringJDBCTest {
	@Test
	public void testJDBC() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("_0918_spring03_ApplicationContext.xml");

		CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
//		Customer customer = new Customer(1, "yinzifan", 22);
//		customerDAO.insert(customer);

		Customer customer1 = customerDAO.findByCustomerId(1);
		System.out.println(customer1);
	}
}
