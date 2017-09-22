package com.yinzifan.liandisys;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yinzifan.liandisys._0922_SpringJavaConfig02_Demo.config.ApplicationConfig;
import com.yinzifan.liandisys._0922_SpringJavaConfig02_Demo.core.CustomerBo;
import com.yinzifan.liandisys._0922_SpringJavaConfig02_Demo.core.SchedulerBo;

/**
 * @author yinzf2
 * 2017/09/22	11:08:07
 */
public class _03_SpringJavaConfig02ImportTest {
	@Test
	public void testSpringJavaConfig02Import() throws Exception {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		CustomerBo cb = (CustomerBo) ac.getBean("customer");
		cb.printMsg("CustomerBo!");
		SchedulerBo sb = (SchedulerBo) ac.getBean("scheduler");
		sb.printMsg("SchedulerBo!");
	}
}
