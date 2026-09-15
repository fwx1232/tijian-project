package com.neusoft.tijian.po;

// checkitemdetailed 检查项明细表
public class CheckItemDetailed {

	private Integer cdId;              // 检查项明细编号
	private String name;               // 检查项明细名称
	private String unit;               // 检查项明细单位
	private Double minrange;           // 检查项明细正常值范围中的最小值
	private Double maxrange;           // 检查项明细正常值范围中的最大值
	private String normalValue;        // 检查项明细正常值（非数字型）
	private String normalValueString;  // 检查项验证范围说明文字
	private Integer type;              // 明细类型（1：数值范围验证型；2：数值相等验证型；3：无需验证型；4：描述型；5：其它）
	private Integer ciId;              // 所属检查项编号
	private String remarks;            // 备注

	public Integer getCdId() {
		return cdId;
	}
	public void setCdId(Integer cdId) {
		this.cdId = cdId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Double getMinrange() {
		return minrange;
	}
	public void setMinrange(Double minrange) {
		this.minrange = minrange;
	}
	public Double getMaxrange() {
		return maxrange;
	}
	public void setMaxrange(Double maxrange) {
		this.maxrange = maxrange;
	}
	public String getNormalValue() {
		return normalValue;
	}
	public void setNormalValue(String normalValue) {
		this.normalValue = normalValue;
	}
	public String getNormalValueString() {
		return normalValueString;
	}
	public void setNormalValueString(String normalValueString) {
		this.normalValueString = normalValueString;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getCiId() {
		return ciId;
	}
	public void setCiId(Integer ciId) {
		this.ciId = ciId;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
