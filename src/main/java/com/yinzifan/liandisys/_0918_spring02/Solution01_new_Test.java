package com.yinzifan.liandisys._0918_spring02;

import org.junit.Test;

/**
 * @author yinzf2
 * 2017/09/18	14:11:59
 */
public class Solution01_new_Test {
	@Test
	public void testSolution01() throws Exception {
		IOutputGenerator output = new CsvOutputGenerator();
		output.generatedOutput();
		/**
		 * 以这种方式，这个问题是“output”紧密到CsvOutputGenerator耦合，
		 * 输出生成的每一个变化可能涉及代码变化。
		 * 如果此代码分散在你的项目中，
		 * 输出生成的每一次变化都会让你受苦。
		 */
	}
}
