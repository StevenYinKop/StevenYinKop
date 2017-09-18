package com.yinzifan.liandisys._0918_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author yinzf2 2017/09/18 11:08:15
 */
@Retention(RetentionPolicy.RUNTIME) // ①声明注解的保留期限
@Target(ElementType.METHOD) // ②声明可以使用该注解的目标类型
public @interface NeedTest {// ③定义注解
	boolean value() default true;// ④声明注解成员
}
