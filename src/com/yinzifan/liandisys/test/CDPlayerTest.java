package com.yinzifan.liandisys.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yinzifan.liandisys._0911_DI.CDPlayerConfig;
import com.yinzifan.liandisys._0911_DI.CompactDisc;

public class CDPlayerTest {
	@Test
	public void test01() throws Exception {
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
		CompactDisc bean = acac.getBean(CompactDisc.class);
		bean.play();
	}
}
