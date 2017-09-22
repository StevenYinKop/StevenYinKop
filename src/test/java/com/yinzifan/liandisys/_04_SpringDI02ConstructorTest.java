package com.yinzifan.liandisys;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yinzifan.liandisys._0922_SpringDI02Constructor_Demo.bean.Person;

/**
 * @author yinzf2
 * 2017/09/22	13:21:10
 */
public class _04_SpringDI02ConstructorTest {
	@Test
	public void testSpringDI02Constructor() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"_0922_SpringDi02Constructor_ApplicationContext.xml");
		Person person = (Person) ac.getBean("person");
		System.out.println(person.toString());
	}
}
