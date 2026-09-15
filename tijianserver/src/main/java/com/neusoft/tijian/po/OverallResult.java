package com.neusoft.tijian.po;

// overallresult 总检结论信息表
public class OverallResult {

	private Integer orId;     // 总检结论项编号
	private String title;     // 总检结论项标题
	private String content;   // 总检结论项内容
	private Integer orderId;  // 所属预约编号

	public Integer getOrId() {
		return orId;
	}
	public void setOrId(Integer orId) {
		this.orId = orId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
}
