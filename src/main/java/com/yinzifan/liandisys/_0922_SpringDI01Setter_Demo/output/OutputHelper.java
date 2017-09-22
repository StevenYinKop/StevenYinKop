package com.yinzifan.liandisys._0922_SpringDI01Setter_Demo.output;

/**
 * @author yinzf2
 * 2017/09/22	11:27:28
 */
public class OutputHelper {
	IOutputGenerator outputGenerator;
	public void generateOutput() {
		outputGenerator.generateOutput();
	}
	//DI via setter method
	public void setOutputGenerator(IOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}
}
