package com.yinzifan.liandisys._0926_SpringBean07PropertyPlaceholderConfigurer_Demo;

import javax.sql.DataSource;

/**
 * @author yinzf2
 * 2017/09/26	10:39:02
 */
public class JdbcCustomerDAO {
	private DataSource dataSource;

	/**
	 * 
	 */
	public JdbcCustomerDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param dataSource
	 */
	public JdbcCustomerDAO(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	@Override
	public String toString() {
		return "JdbcCustomerDAO [dataSource=" + dataSource + "]";
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}
