package com.yinzifan.liandisys._0922_SpringJavaConfig02_Demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yinzifan.liandisys._0922_SpringJavaConfig02_Demo.core.CustomerBo;

/**
 * @author yinzf2
 * 2017/09/22	9:27:44
 */
@Configuration
public class CustomerConfig {
	@Bean(name="customer")
	public CustomerBo getCustomer() {
		return new CustomerBo();
	}
}
