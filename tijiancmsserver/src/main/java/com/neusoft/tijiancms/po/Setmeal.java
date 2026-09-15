package com.neusoft.tijiancms.po;

// setmeal 体检套餐信息表
public class Setmeal {

	private Integer smId;   // 体检套餐编号
	private String name;    // 体检套餐名称
	private Integer type;   // 体检套餐类型（1：男士套餐；0：女士套餐）
	private Integer price;  // 体检套餐价格

	public Integer getSmId() {
		return smId;
	}
	public void setSmId(Integer smId) {
		this.smId = smId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
}
