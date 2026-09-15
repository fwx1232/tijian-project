package com.neusoft.tijian.po;

// setmealdetailed 体检套餐项目明细表
public class SetmealDetailed {

	private Integer sdId;        // 体检套餐项目明细编号（无意义主键）
	private Integer smId;        // 体检套餐编号
	private Integer ciId;        // 体格检查项编号
	private CheckItem checkItem; // 关联检查项

	public Integer getSdId() {
		return sdId;
	}
	public void setSdId(Integer sdId) {
		this.sdId = sdId;
	}
	public Integer getSmId() {
		return smId;
	}
	public void setSmId(Integer smId) {
		this.smId = smId;
	}
	public Integer getCiId() {
		return ciId;
	}
	public void setCiId(Integer ciId) {
		this.ciId = ciId;
	}
	public CheckItem getCheckItem() {
		return checkItem;
	}
	public void setCheckItem(CheckItem checkItem) {
		this.checkItem = checkItem;
	}
}
