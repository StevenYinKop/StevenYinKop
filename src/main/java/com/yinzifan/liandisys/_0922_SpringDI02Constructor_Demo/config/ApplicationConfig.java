package com.yinzifan.liandisys._0922_SpringDI02Constructor_Demo.config;

import java.beans.ConstructorProperties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yinzifan.liandisys._0922_SpringDI02Constructor_Demo.bean.Person;

/**
 * @author yinzf2
 * 2017/09/22	13:13:39
 */
@Configuration
public class ApplicationConfig {
	public Person getPerson() {
		return new Person();
	}
}
