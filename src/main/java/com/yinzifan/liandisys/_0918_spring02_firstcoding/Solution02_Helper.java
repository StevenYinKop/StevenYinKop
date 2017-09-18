package com.yinzifan.liandisys._0918_spring02_firstcoding;

/**
 * @author yinzf2
 * 2017/09/18	14:16:32
 */
public class Solution02_Helper {
	IOutputGenerator outputGenerator;

	public Solution02_Helper() {
		outputGenerator = new CsvOutputGenerator();
	}

	public void generatedOutput() {
		outputGenerator.generatedOutput();
	}
}
