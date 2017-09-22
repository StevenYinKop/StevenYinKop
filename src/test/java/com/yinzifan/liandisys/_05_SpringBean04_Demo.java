package com.yinzifan.liandisys;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yinzifan.liandisys._0922_SpringBean04ListSetMapProperties_Demo.bean.Customer;

/**
 * @author yinzf2
 * 2017/09/22	17:05:59
 */
public class _05_SpringBean04_Demo {
	@Test
	public void testSpringBean04() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("_0922_SpringBean04_ApplicationContext.xml");
		Customer customer = (Customer) ac.getBean("Customer");
		System.out.println(customer.toString());
	}
}
