package com.yinzifan.liandisys;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yinzifan.liandisys._0921_SpringAutoWire04AutoDetect_Demo.bean.Panda;

/**
 * @author yinzf2
 * 2017/09/21	16:21:35
 */
public class _02_SpringAutoWired04AutoDetectTest {
	@Test
	public void testSpringAutoWired04AutoDetect() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"_0921_SpringAutoWire04AutoDetect_ApplicationContext.xml");
		Panda panda = (Panda) ac.getBean("panda");
		System.out.println(panda.toString());
	}
}
