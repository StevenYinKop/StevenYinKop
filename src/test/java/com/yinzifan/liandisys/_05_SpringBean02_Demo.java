package com.yinzifan.liandisys;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yinzifan.liandisys._0922_SpringBean02_Demo.bean.Customer;

/**
 * @author yinzf2
 * 2017/09/22	14:05:56
 */
public class _05_SpringBean02_Demo {
	private static final String BEAN_NAME = "customer";

	@Test
	public void testSpringBean() throws Exception {
		demo("1");
		demo("2");
		demo("3");
	}

	private void demo(String num) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("_0922_SpringBean02_ApplicationContext.xml");
		Customer customer = (Customer) ac.getBean(BEAN_NAME + num);
		System.out.println(customer.toString());
	}
	
	
}
