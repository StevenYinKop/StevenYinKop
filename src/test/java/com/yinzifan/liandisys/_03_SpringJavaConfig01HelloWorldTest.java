package com.yinzifan.liandisys;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yinzifan.liandisys._0921_SpringJavaConfig01_Demo.ApplicationConfig;
import com.yinzifan.liandisys._0921_SpringJavaConfig01_Demo.hello.HelloWorld;

/**
 * @author yinzf2
 * 2017/09/21	17:57:42
 */
public class _03_SpringJavaConfig01HelloWorldTest {
	@Test
	public void testSpringJavaConfig01HelloWorld() throws Exception {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		HelloWorld helloWorld = (HelloWorld) ac.getBean("helloWorld");
		helloWorld.sayHello("yinzf2");
	}
}
