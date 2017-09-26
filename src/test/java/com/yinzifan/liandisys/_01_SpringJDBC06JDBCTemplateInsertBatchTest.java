package com.yinzifan.liandisys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.wiring.BeanWiringInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yinzifan.liandisys._0918_SpringJDBC03_JDBCDemo.bean.Customer;
import com.yinzifan.liandisys._0920_SpringJDBC06_SpringJdbcTemplateBatchUpdate.InsertBatch;
import com.yinzifan.liandisys._0920_SpringJDBC06_SpringJdbcTemplateBatchUpdate.QueryBiz;
import com.yinzifan.liandisys._0920_SpringJDBC06_SpringJdbcTemplateBatchUpdate.bean.DemoUser;

/**
 * @author yinzf2
 * 2017/09/20	13:06:22
 */
public class _01_SpringJDBC06JDBCTemplateInsertBatchTest {
	@Test
	public void testInsertBatch() throws Exception {
		//		ApplicationContext ac = new ClassPathXmlApplicationContext("_0920_spring06_ApplicationContext.xml");
		//		InsertBatch insertBatch = (InsertBatch) ac.getBean("InsertBatch");
		//		List<Customer> customers = new ArrayList<>();
		//		customers.add(new Customer(0, "zhangsan", 23));
		//		customers.add(new Customer(0, "lisi", 24));
		//		customers.add(new Customer(0, "wangwu", 25));
		//		insertBatch.insertBatch(customers);
		System.out.println("_01_SpringJDBC06JDBCTemplateInsertBatchTest.testInsertBatch()");
		ApplicationContext ac = new ClassPathXmlApplicationContext("_0920_SpringJDBC06_ApplicationContext.xml");
		InsertBatch insertBatch = (InsertBatch) ac.getBean("InsertBatch");
		List<DemoUser> demoUsers = new ArrayList<>();
		demoUsers.add(new DemoUser("3", "tom", "tommy", 789465132, 21, "america", true, "tom@gmail.com", new Date(),
				"0", ""));
		demoUsers.add(new DemoUser("4", "yamashita", "yamashita", 789465132, 31, "japan", true, "tom@gmail.com",
				new Date(), "0", ""));
		demoUsers.add(new DemoUser("5", "tom", "tommy", 789465132, 21, "america", true, "tom@gmail.com", new Date(),
				"0", ""));
		demoUsers.add(new DemoUser("6", "tom", "tommy", 789465132, 21, "america", true, "tom@gmail.com", new Date(),
				"0", ""));
		demoUsers.add(new DemoUser("7", "tom", "tommy", 789465132, 21, "america", true, "tom@gmail.com", new Date(),
				"0", ""));
		demoUsers.add(new DemoUser("8", "tom", "tommy", 789465132, 21, "america", true, "tom@gmail.com", new Date(),
				"0", ""));
		demoUsers.add(new DemoUser("9", "tom", "tommy", 789465132, 21, "america", true, "tom@gmail.com", new Date(),
				"0", ""));
		demoUsers.add(new DemoUser("10", "tom", "tommy", 789465132, 21, "america", true, "tom@gmail.com", new Date(),
				"0", ""));
		demoUsers.add(new DemoUser("11", "tom", "tommy", 789465132, 21, "america", true, "tom@gmail.com", new Date(),
				"0", ""));
		demoUsers.add(new DemoUser("12", "tom", "tommy", 789465132, 21, "america", true, "tom@gmail.com", new Date(),
				"0", ""));
		demoUsers.add(new DemoUser("13", "tom", "tommy", 789465132, 21, "america", true, "tom@gmail.com", new Date(),
				"0", ""));
		demoUsers.add(new DemoUser("14", "tom", "tommy", 789465132, 21, "america", true, "tom@gmail.com", new Date(),
				"0", ""));
		demoUsers.add(new DemoUser("15", "tom", "tommy", 789465132, 21, "america", true, "tom@gmail.com", new Date(),
				"0", ""));
		System.out.println(demoUsers);
		insertBatch.insertBatch(demoUsers);
	}

	@Test
	public void testQuery() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("_0920_spring06_ApplicationContext.xml");
		QueryBiz biz = (QueryBiz) ac.getBean("QueryBiz");
		List<Customer> customers = biz.queryAll("CUSTOMER");
		if (customers == null) {
			System.out.println("NULL!!!");
		} else {
			System.out.println(customers.size());
			for (Customer customer : customers) {
				System.out.println(customer.toString());
			}
		}
	}
}
