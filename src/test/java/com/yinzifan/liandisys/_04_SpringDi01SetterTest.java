package com.yinzifan.liandisys;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yinzifan.liandisys._0922_SpringDI01Setter_Demo.config.ApplicationConfig;
import com.yinzifan.liandisys._0922_SpringDI01Setter_Demo.output.IOutputGenerator;
import com.yinzifan.liandisys._0922_SpringDI01Setter_Demo.output.OutputHelper;

/**
 * @author yinzf2
 * 2017/09/22	11:36:30
 */
public class _04_SpringDi01SetterTest {
	@Test
	public void testSpringDi01Setter() throws Exception {
		//demoByClassPathXmlApplicationContext();
		//demoByAnnotationConfigApplicationContext();
	}

	/**
	 * 通过JavaConfig的方式进行实例化
	 */
	private void demoByAnnotationConfigApplicationContext() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		OutputHelper helper = (OutputHelper) ac.getBean("outputHelper");
		helper.generateOutput();
	}

	/**
	 * 通过XML配置文件的方式进行实例化
	 */
	private void demoByClassPathXmlApplicationContext() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("_0922_SpringDi01Setter_ApplicationContext.xml");
		OutputHelper helper = (OutputHelper) ac.getBean("OutputHelper");
		helper.generateOutput();
	}
}
