package com.yinzifan.liandisys._0918_annotation;

import java.lang.reflect.Method;

/**
 * @author yinzf2 2017/09/18 11:05:02
 */
public class AnnotationTest {
	public static void main(String[] args) {
		// ①得到ForumService对应的Class对象
		Class clazz = ForumService.class;

		// ②得到ForumSerivce对应的Method数组
		Method[] methods = clazz.getDeclaredMethods();

		System.out.println(methods.length);
		for (Method method : methods) {

			// ③获取方法上所标注的注解对象
			NeedTest nt = method.getAnnotation(NeedTest.class);
			if (nt != null) {
				if (nt.value()) {
					System.out.println(method.getName() + "()需要测试");
				} else {
					System.out.println(method.getName() + "()不需要测试");
				}
			}
		}
	}
}
