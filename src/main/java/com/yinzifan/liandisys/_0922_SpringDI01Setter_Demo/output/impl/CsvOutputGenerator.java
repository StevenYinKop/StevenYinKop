package com.yinzifan.liandisys._0922_SpringDI01Setter_Demo.output.impl;

import com.yinzifan.liandisys._0922_SpringDI01Setter_Demo.output.IOutputGenerator;

/**
 * @author yinzf2
 * 2017/09/22	11:25:32
 */
public class CsvOutputGenerator implements IOutputGenerator {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.yinzifan.liandisys._0922_SpringDI01_Demo.output.IOutputGenerator#
	 * generateOutput()
	 */
	@Override
	public void generateOutput() {
		System.out.println("This is Csv Output Generator");
	}
}
