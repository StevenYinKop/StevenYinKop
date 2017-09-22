package com.yinzifan.liandisys._0922_SpringJavaConfig02_Demo.config;

import org.springframework.context.annotation.Import;

import org.springframework.context.annotation.Configuration;

/**
 * @author yinzf2
 * 2017/09/22	9:27:16
 */
@Configuration
@Import({CustomerConfig.class, SchedulerConfig.class})
public class ApplicationConfig {
}
