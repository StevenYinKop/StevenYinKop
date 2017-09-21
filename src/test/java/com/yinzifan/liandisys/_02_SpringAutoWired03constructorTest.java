package com.yinzifan.liandisys;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yinzifan.liandisys._0921_SpringAutoWire03constructor_Demo.bean.Developer;

/**
 * @author yinzf2
 * 2017/09/21	9:28:05
 */
public class _02_SpringAutoWired03constructorTest {
	@Test
	public void testSpringAutoWired03constructor() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"_0921_SpringAutoWire03constructor_ApplicationContext.xml");
		Developer developer = (Developer) ac.getBean("developer");
		System.out.println(developer.toString());
	}
}
