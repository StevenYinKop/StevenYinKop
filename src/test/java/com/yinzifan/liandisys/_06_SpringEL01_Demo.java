package com.yinzifan.liandisys;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yinzifan.liandisys._0926_SpringEL01_Hello_Demo.bean.Customer;

/**
 * @author yinzf2
 * 2017/09/26	16:36:45
 */
public class _06_SpringEL01_Demo {
	@Test
	public void testSpringEL01() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("_0926_SpringEL01_ApplicationContext.xml");
		Customer customer = ac.getBean("customerBean", Customer.class);
		System.out.println(customer.toString());
	}
}
