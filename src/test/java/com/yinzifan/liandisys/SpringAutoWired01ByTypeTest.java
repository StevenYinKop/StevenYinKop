package com.yinzifan.liandisys;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yinzifan.liandisys._0920_SpringAutoWire01ByType_Demo.bean.Person;

/**
 * @author yinzf2
 * 2017/09/20	17:17:13
 */
public class SpringAutoWired01ByTypeTest {
	@Test
	public void testSpringAutoWired() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("_0920_SpringAutoWire01_ApplicationContext.xml");
		Person person = (Person) ac.getBean("person");
		System.out.println(person.toString());
	}
}
