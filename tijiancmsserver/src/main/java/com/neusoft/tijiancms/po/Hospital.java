package com.neusoft.tijiancms.po;

// hospital 医院信息表
public class Hospital {

	private Integer hpId;          // 医院编号
	private String name;           // 医院名称
	private String picture;        // 医院图片
	private String telephone;      // 医院电话
	private String address;        // 医院地址
	private String businessHours;  // 营业时间
	private String deadline;       // 采血截止时间
	private String rule;           // 预约人数规则
	private Integer state;         // 医院状态（1：正常；2：其他）

	public Integer getHpId() {
		return hpId;
	}
	public void setHpId(Integer hpId) {
		this.hpId = hpId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBusinessHours() {
		return businessHours;
	}
	public void setBusinessHours(String businessHours) {
		this.businessHours = businessHours;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	public String getRule() {
		return rule;
	}
	public void setRule(String rule) {
		this.rule = rule;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
}
