package com.yinzifan.liandisys._0918_spring02_firstcoding;

/**
 * @author yinzf2
 * 2017/09/18	14:21:32
 */
public class Solution03_SpringDI_Helper {
	IOutputGenerator outputGenerator;

	public void generatedOutput() {
		outputGenerator.generatedOutput();
	}

	public void setOutputGenerator(IOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}
}
