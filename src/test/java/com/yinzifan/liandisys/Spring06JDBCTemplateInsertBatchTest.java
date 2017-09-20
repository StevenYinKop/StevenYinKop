package com.yinzifan.liandisys;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yinzifan.liandisys._0918_spring03_JDBCDemo.bean.Customer;
import com.yinzifan.liandisys._0920_Spring06_SpringJdbcTemplateBatchUpdate.InsertBatch;
import com.yinzifan.liandisys._0920_Spring06_SpringJdbcTemplateBatchUpdate.QueryBiz;

/**
 * @author yinzf2
 * 2017/09/20	13:06:22
 */
public class Spring06JDBCTemplateInsertBatchTest {
	@Test
	public void testInsertBatch() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("_0920_spring06_ApplicationContext.xml");
		InsertBatch insertBatch = (InsertBatch) ac.getBean("InsertBatch");
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer(0, "zhangsan", 23));
		customers.add(new Customer(0, "lisi", 24));
		customers.add(new Customer(0, "wangwu", 25));
		insertBatch.insertBatch(customers);
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
