package com.yinzifan.liandisys._0918_spring01_helloworld;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yinzf2
 * 2017/09/18	13:54:52
 * http://www.yiibai.com/spring/spring-3-hello-world-example.html
 */
public class RunTest {
	@Test
	public void testSpringHelloWorld() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld hw = (HelloWorld) ac.getBean("helloBean");
		hw.printHello();
	}
}
