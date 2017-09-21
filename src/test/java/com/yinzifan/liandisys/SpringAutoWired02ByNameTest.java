package com.yinzifan.liandisys;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yinzifan.liandisys._0921_SpringAutoWire02ByName_Demo.bean.Customer;

/**
 * @author yinzf2
 * 2017/09/21	9:19:04
 */
public class SpringAutoWired02ByNameTest {
	@Test
	public void testSpringAutoWired02ByName() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"_0921_SpringAutoWire02ByName_ApplicationContext.xml");
		Customer customer = (Customer) ac.getBean("customer");
		System.out.println(customer);
	}
}
