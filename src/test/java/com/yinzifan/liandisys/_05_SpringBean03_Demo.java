package com.yinzifan.liandisys;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yinzifan.liandisys._0922_SpringBean03Scope_Demo.bean.CustomerService;

/**
 * @author yinzf2
 * 2017/09/22	16:18:59
 */
public class _05_SpringBean03_Demo {
	@Test
	public void testSpringBean03() throws Exception {
		demo("customerService");
		demo("customerServicePrototype");
	}

	/**
	 * demo();
	 * 由于 bean 的 "CustomerService"是单例作用域，
	 * 第二个通过提取"custB"将显示消息由 "custA" 设置，
	 * 即使它是由一个新的 getBean()方法来提取。
	 * 在单例中，每个Spring IoC容器只有一个实例，
	 * 无论多少次调用 getBean()方法获取它，它总是返回同一个实例。
	 */
	private void demo(String beanName) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("_0922_SpringBean03_ApplicationContext.xml");
		CustomerService cs = (CustomerService) ac.getBean(beanName);
		cs.setMessage("This is a Message FIRSTTIME");
		System.out.println(cs.message);
		CustomerService cs2 = (CustomerService) ac.getBean(beanName);
		System.out.println(cs2.message);
		System.out.println("=-*=-*=-*=-*=-*=-*=-*=-*=-*=-*=-*=-*=-*=-*=-*=-*=-*=-*=-*");
	}
}
