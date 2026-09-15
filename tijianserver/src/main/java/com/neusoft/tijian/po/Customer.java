package com.neusoft.tijian.po;

// customer 用户表
public class Customer {

	private Integer id;         // 主键,自增
	private String mobile;      // 手机号,unique
	private String password;    // 登录密码
	private String name;        // 姓名
	private Integer sex;        // 性别(1:男,0:女)
	private String idCard;      // 身份证号
	private String birthday;    // 生日
	private Integer userType;   // 用户类型(1:普通用户,2:东软内部员工,3:其他)
	private Integer active;     // 逻辑删除

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public Integer getUserType() {
		return userType;
	}
	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	public Integer getActive() {
		return active;
	}
	public void setActive(Integer active) {
		this.active = active;
	}
}
