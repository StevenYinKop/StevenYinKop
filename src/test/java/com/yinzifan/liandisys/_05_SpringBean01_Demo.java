package com.yinzifan.liandisys;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yinzifan.liandisys._0922_SpringBean01_Demo.FileNameGenerator;

/**
 * @author yinzf2
 * 2017/09/22	14:05:56
 */
public class _05_SpringBean01_Demo {
	private static final String BEAN_NAME = "fileNameGenerator";

	@Test
	public void testSpringBean() throws Exception {
		demo("1");//常规操作
		demo("2");//快捷注入
		demo("3");//P命名空间
	}

	private void demo(String num) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("_0922_SpringBean01_ApplicationContext.xml");
		FileNameGenerator generator = (FileNameGenerator) ac.getBean(BEAN_NAME + num);
		System.out.println(generator.toString());
	}
}
