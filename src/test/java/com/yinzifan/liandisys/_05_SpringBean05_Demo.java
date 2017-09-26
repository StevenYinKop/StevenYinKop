package com.yinzifan.liandisys;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yinzifan.liandisys._0922_SpringBean05FactoryBean_Demo.bean.Customer;

/**
 * @author yinzf2
 * 2017/09/22	17:56:34
 */
public class _05_SpringBean05_Demo {
	@Test
	public void testSpringBean05() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("_0922_SpringBean05_ApplicationContext.xml");
		System.out.println("_05_SpringBean05_Demo.testSpringBean05()");
		Customer customer = (Customer) ac.getBean("Customer");
		System.out.println(customer.toString());
	}
}
