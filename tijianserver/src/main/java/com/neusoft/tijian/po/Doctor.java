package com.neusoft.tijian.po;

// doctor 医生信息表
public class Doctor {

	private Integer docId;     // 医生编号
	private String docCode;    // 医生编码（登录用）
	private String realName;   // 真实姓名
	private String password;   // 密码（登录用）
	private Integer sex;       // 性别（1：男；0：女）
	private Integer deptno;    // 所属科室（1：检验科；2：内科；3：外科）

	public Integer getDocId() {
		return docId;
	}
	public void setDocId(Integer docId) {
		this.docId = docId;
	}
	public String getDocCode() {
		return docCode;
	}
	public void setDocCode(String docCode) {
		this.docCode = docCode;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
}
