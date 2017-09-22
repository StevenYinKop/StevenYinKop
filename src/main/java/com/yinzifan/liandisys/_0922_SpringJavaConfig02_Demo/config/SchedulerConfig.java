package com.yinzifan.liandisys._0922_SpringJavaConfig02_Demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yinzifan.liandisys._0922_SpringJavaConfig02_Demo.core.SchedulerBo;

/**
 * @author yinzf2
 * 2017/09/22	9:27:51
 */
@Configuration
public class SchedulerConfig {
	@Bean(name="scheduler")
	public SchedulerBo getSchedulerBo() {
		return new SchedulerBo();
	}
}
