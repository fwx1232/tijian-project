package com.neusoft.tijiancms.po;

// users 用户表
public class Users {

	private String userId;       // 用户编号（手机号码）
	private String password;     // 密码
	private String realName;     // 真实姓名
	private Integer sex;         // 用户性别（1：男；0：女）
	private String identityCard; // 身份证号
	private String birthday;     // 出生日期
	private Integer userType;    // 用户类型（1：普通用户；2：东软内部员工；3：其他）

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
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
}
