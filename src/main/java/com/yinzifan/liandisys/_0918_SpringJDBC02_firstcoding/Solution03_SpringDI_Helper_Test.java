package com.yinzifan.liandisys._0918_SpringJDBC02_firstcoding;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yinzf2
 * 2017/09/18	14:25:04
 */
public class Solution03_SpringDI_Helper_Test {
	@Test
	public void test() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Solution03_SpringDI_Helper output = (Solution03_SpringDI_Helper) context.getBean("OutputHelper");
		output.generatedOutput();
	}
}
