package com.neusoft.tijian.po;

// cireport 体检报告检查项信息表
public class CiReport {

	private Integer cirId;   // 检查项报告主键
	private Integer ciId;    // 检查项编号
	private String ciName;   // 检查项名称
	private Integer orderId; // 所属预约编号

	public Integer getCirId() {
		return cirId;
	}
	public void setCirId(Integer cirId) {
		this.cirId = cirId;
	}
	public Integer getCiId() {
		return ciId;
	}
	public void setCiId(Integer ciId) {
		this.ciId = ciId;
	}
	public String getCiName() {
		return ciName;
	}
	public void setCiName(String ciName) {
		this.ciName = ciName;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
}
