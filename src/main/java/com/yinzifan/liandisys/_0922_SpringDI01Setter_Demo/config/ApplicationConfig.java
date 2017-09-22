package com.yinzifan.liandisys._0922_SpringDI01Setter_Demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yinzifan.liandisys._0922_SpringDI01Setter_Demo.output.OutputHelper;
import com.yinzifan.liandisys._0922_SpringDI01Setter_Demo.output.impl.CsvOutputGenerator;

/**
 * @author yinzf2
 * 2017/09/22	11:43:42
 */
@Configuration
public class ApplicationConfig {
	@Bean(name = "outputHelper")
	public OutputHelper outputHelper(CsvOutputGenerator csvOutputGenerator) {
		OutputHelper outputHelper = new OutputHelper();
		outputHelper.setOutputGenerator(csvOutputGenerator);
		return outputHelper;
	}

	@Bean(name = "CsvOutputGenerator")
	public CsvOutputGenerator csvOutputGenerator() {
		return new CsvOutputGenerator();
	}
}
