package com.yinzifan.liandisys;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yinzifan.liandisys._0926_SpringBean07PropertyPlaceholderConfigurer_Demo.JdbcCustomerDAO;

/**
 * @author yinzf2
 * 2017/09/26	10:24:12
 */
public class _05_SpringBean07_Demo {
	@Test
	public void testSpringBean07() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("_0926_SpringBean07_ApplicationContext.xml");
		JdbcCustomerDAO jdbcCustomerDAO = ac.getBean("jdbcCustomerDAO",JdbcCustomerDAO.class);
		System.out.println(jdbcCustomerDAO.toString());
	}
}
