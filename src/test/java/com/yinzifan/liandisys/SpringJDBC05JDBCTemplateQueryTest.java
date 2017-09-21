package com.yinzifan.liandisys;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yinzifan.liandisys._0918_SpringJDBC03_JDBCDemo.dao.CustomerDAO;

/**
 * @author yinzf2
 * 2017/09/19	10:19:58
 */
public class SpringJDBC05JDBCTemplateQueryTest {
	@Test
	public void testSpringJDBCTemplateQuery() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("_0919_spring05_ApplicationContext.xml");
		CustomerDAO dao = (CustomerDAO) ac.getBean("customerDAO");
		dao.findByCustomerId(1);
	}

}
