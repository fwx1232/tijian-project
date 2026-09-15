package com.neusoft.tijian.po;

// checkitem 检查项信息表
public class CheckItem {

	private Integer ciId;      // 检查项编号
	private String ciName;     // 检查项名称
	private String ciContent;  // 检查项内容
	private String meaning;    // 检查项意义
	private String remarks;    // 备注

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
	public String getCiContent() {
		return ciContent;
	}
	public void setCiContent(String ciContent) {
		this.ciContent = ciContent;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
