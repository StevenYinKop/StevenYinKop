package com.yinzifan.liandisys._0920_SpringJDBC06_SpringJdbcTemplateBatchUpdate.bean;

import java.util.Date;

/**
 * @author yinzf2
 * 2017/09/25	15:42:58
 */
public class DemoUser {
	private String id;
	private String name;
	private String nickName;
	private long phone;
	private int age;
	private String address;
	private boolean isMale;
	private String email;
	private Date createTime;
	private String avatar;
	private String time;

	/**
	 * @param id
	 * @param name
	 * @param nickName
	 * @param phone
	 * @param age
	 * @param address
	 * @param isMale
	 * @param email
	 * @param createTime
	 * @param avatar
	 * @param time
	 */
	public DemoUser(String id, String name, String nickName, long phone, int age, String address, boolean isMale,
			String email, Date createTime, String avatar, String time) {
		super();
		this.id = id;
		this.name = name;
		this.nickName = nickName;
		this.phone = phone;
		this.age = age;
		this.address = address;
		this.isMale = isMale;
		this.email = email;
		this.createTime = createTime;
		this.avatar = avatar;
		this.time = time;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 
	 */
	public DemoUser() {
		super();
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Override
	public String toString() {
		return "DemoUser [id=" + id + ", name=" + name + ", nickName=" + nickName + ", phone=" + phone + ", age=" + age
				+ ", address=" + address + ", isMale=" + isMale + ", email=" + email + ", createTime=" + createTime
				+ ", avatar=" + avatar + ", time=" + time + "]";
	}
}
