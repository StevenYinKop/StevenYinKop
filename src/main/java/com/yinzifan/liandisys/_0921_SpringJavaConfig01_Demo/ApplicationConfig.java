package com.yinzifan.liandisys._0921_SpringJavaConfig01_Demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yinzifan.liandisys._0921_SpringJavaConfig01_Demo.hello.HelloWorld;
import com.yinzifan.liandisys._0921_SpringJavaConfig01_Demo.hello.impl.HelloWorldImpl;

/**
 * @author yinzf2
 * 2017/09/21	17:53:22
 */
@Configuration
public class ApplicationConfig {
	@Bean(name = "helloWorld")
	public HelloWorld helloWorld() {
		return new HelloWorldImpl();
	}
}
