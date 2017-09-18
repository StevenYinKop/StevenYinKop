package com.yinzifan.liandisys._0918_annotation;

/**
 * @author yinzf2 2017/09/18 11:17:30
 */
public class ForumService {
	@NeedTest(value = true) // ①
	public void deleteForum(int forumId) {
		System.out.println("删除论坛模块：" + forumId);
	}

	@NeedTest(value = false) // ②
	public void deleteTopic(int postId) {
		System.out.println("删除论坛主题：" + postId);
	}
}
