package com.yinzifan.liandisys._0920_SpringFinal_JdbcDemo.bean;

/**
 * @author yinzf2
 * 2017/09/20	14:52:12
 */
public class Department {
	private Long deptId;
	private String deptNo;
	private String deptName;

	/**
	 * 
	 */
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param deptId
	 * @param deptNo
	 * @param deptName
	 */
	public Department(Long deptId, String deptNo, String deptName) {
		super();
		this.deptId = deptId;
		this.deptNo = deptNo;
		this.deptName = deptName;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptNo=" + deptNo + ", deptName=" + deptName + "]";
	}

}
