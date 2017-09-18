package com.yinzifan.liandisys._0918_spring02_firstcoding;

import org.junit.Test;

/**
 * @author yinzf2
 * 2017/09/18	14:17:59
 */
public class Solution02_Helper_Test {
	@Test
	public void testSolution01() throws Exception {
		Solution02_Helper output = new Solution02_Helper();
		output.generatedOutput();
		/**
		 * 这看起来比Solution01更优雅，只需要管理一个辅助类，
		 * 但是辅助类仍是紧耦合 CsvOutputGenerator，
		 * 输出生成的每一个变化仍然涉及小的代码更改。
		 */
	}
}
