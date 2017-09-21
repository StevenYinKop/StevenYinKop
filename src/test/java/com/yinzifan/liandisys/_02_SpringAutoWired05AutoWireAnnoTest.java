package com.yinzifan.liandisys;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yinzifan.liandisys._0921_SpringAutoWire05AutoWireAnno_Demo.bean.Customer;

/**
 * @author yinzf2
 * 2017/09/21	16:56:10
 */
public class _02_SpringAutoWired05AutoWireAnnoTest {
	@Test
	public void testSpringAutoWired05AutoWireAnno() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"_0921_SpringAutoWire05AutoWireAnno_ApplicationContext.xml");
		Customer customer = (Customer) ac.getBean("CustomerBean");
		System.out.println(customer.toString());
	}
}
