package com.neusoft.tijian.po;

// orders 体检预约订单表
public class Orders {

	private Integer orderId;    // 订单编号
	private String orderDate;   // 预约日期
	private String userId;      // 客户编号
	private Integer hpId;       // 所属医院编号
	private Integer smId;       // 所属套餐编号
	private Integer state;      // 订单状态（1：未归档；2：已归档）
	private Setmeal setmeal;    // 关联套餐
	private Hospital hospital;  // 关联医院

	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getHpId() {
		return hpId;
	}
	public void setHpId(Integer hpId) {
		this.hpId = hpId;
	}
	public Integer getSmId() {
		return smId;
	}
	public void setSmId(Integer smId) {
		this.smId = smId;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Setmeal getSetmeal() {
		return setmeal;
	}
	public void setSetmeal(Setmeal setmeal) {
		this.setmeal = setmeal;
	}
	public Hospital getHospital() {
		return hospital;
	}
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
}
