package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class Tb_natmeha_doctor {
	// 自增id
	private Long itemID;
	// UUID
	private String itemCode;
	// 医生姓名
	private String DOCTOR_NAME;
	// 医生职称
	private String DOCTOR_TITLE;
	// 擅长治疗
	private String DOCTOR_TREATMENT;
	// 评分
	private Double DOCTOR_SORCE;
	// 科室code（默认都为中医科）
	private String DEPT_CODE;
	// 挂号类别
	private String NUM_TYPE;
	// 用户code
	private String USER_CODE;
	// 创建者
	private String CREATER;
	// 创建时间
	private Timestamp itemCreateAt;
	// 修改人
	private String UPDATER;
	// 修改时间
	private Timestamp itemUpdateAt;
	// 机构（医院）itemcode
	private String ORG_CODE;
	//关联Tb_natmeha_project表，获取该表的数据
	private Tb_natmeha_project tb_natmeha_project;

	// 无参构造器
	public Tb_natmeha_doctor() {
	}

	// 有参构造器，进行属性值的初始化
	public Tb_natmeha_doctor(Long itemID, String itemCode, String DOCTOR_NAME, String DOCTOR_TITLE, String DOCTOR_TREATMENT, Double DOCTOR_SORCE, String DEPT_CODE, String NUM_TYPE, String USER_CODE, String CREATER, Timestamp itemCreateAt, String UPDATER, Timestamp itemUpdateAt, String ORG_CODE) {
		this.itemID = itemID;
		this.itemCode = itemCode;
		this.DOCTOR_NAME = DOCTOR_NAME;
		this.DOCTOR_TITLE = DOCTOR_TITLE;
		this.DOCTOR_TREATMENT = DOCTOR_TREATMENT;
		this.DOCTOR_SORCE = DOCTOR_SORCE;
		this.DEPT_CODE = DEPT_CODE;
		this.NUM_TYPE = NUM_TYPE;
		this.USER_CODE = USER_CODE;
		this.CREATER = CREATER;
		this.itemCreateAt = itemCreateAt;
		this.UPDATER = UPDATER;
		this.itemUpdateAt = itemUpdateAt;
		this.ORG_CODE = ORG_CODE;
	}

	// 获取 自增id 的属性值
	public Long getItemID() {
		return itemID;
	}

	// 设置 自增id 的属性值
	public void setItemID(Long itemID) {
		this.itemID = itemID;
	}

	// 获取 UUID 的属性值
	public String getItemCode() {
		return itemCode;
	}

	// 设置 UUID 的属性值
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	// 获取 医生姓名 的属性值
	public String getDOCTOR_NAME() {
		return DOCTOR_NAME;
	}

	// 设置 医生姓名 的属性值
	public void setDOCTOR_NAME(String DOCTOR_NAME) {
		this.DOCTOR_NAME = DOCTOR_NAME;
	}

	// 获取 医生职称 的属性值
	public String getDOCTOR_TITLE() {
		return DOCTOR_TITLE;
	}

	// 设置 医生职称 的属性值
	public void setDOCTOR_TITLE(String DOCTOR_TITLE) {
		this.DOCTOR_TITLE = DOCTOR_TITLE;
	}

	// 获取 擅长治疗 的属性值
	public String getDOCTOR_TREATMENT() {
		return DOCTOR_TREATMENT;
	}

	// 设置 擅长治疗 的属性值
	public void setDOCTOR_TREATMENT(String DOCTOR_TREATMENT) {
		this.DOCTOR_TREATMENT = DOCTOR_TREATMENT;
	}

	// 获取 评分 的属性值
	public Double getDOCTOR_SORCE() {
		return DOCTOR_SORCE;
	}

	// 设置 评分 的属性值
	public void setDOCTOR_SORCE(Double DOCTOR_SORCE) {
		this.DOCTOR_SORCE = DOCTOR_SORCE;
	}

	// 获取 科室code（默认都为中医科） 的属性值
	public String getDEPT_CODE() {
		return DEPT_CODE;
	}

	// 设置 科室code（默认都为中医科） 的属性值
	public void setDEPT_CODE(String DEPT_CODE) {
		this.DEPT_CODE = DEPT_CODE;
	}

	// 获取 挂号类别 的属性值
	public String getNUM_TYPE() {
		return NUM_TYPE;
	}

	// 设置 挂号类别 的属性值
	public void setNUM_TYPE(String NUM_TYPE) {
		this.NUM_TYPE = NUM_TYPE;
	}

	// 获取 用户code 的属性值
	public String getUSER_CODE() {
		return USER_CODE;
	}

	// 设置 用户code 的属性值
	public void setUSER_CODE(String USER_CODE) {
		this.USER_CODE = USER_CODE;
	}

	// 获取 创建者 的属性值
	public String getCREATER() {
		return CREATER;
	}

	// 设置 创建者 的属性值
	public void setCREATER(String CREATER) {
		this.CREATER = CREATER;
	}

	// 获取 创建时间 的属性值
	public Timestamp getItemCreateAt() {
		return itemCreateAt;
	}

	// 设置 创建时间 的属性值
	public void setItemCreateAt(Timestamp itemCreateAt) {
		this.itemCreateAt = itemCreateAt;
	}

	// 获取 修改人 的属性值
	public String getUPDATER() {
		return UPDATER;
	}

	// 设置 修改人 的属性值
	public void setUPDATER(String UPDATER) {
		this.UPDATER = UPDATER;
	}

	// 获取 修改时间 的属性值
	public Timestamp getItemUpdateAt() {
		return itemUpdateAt;
	}

	// 设置 修改时间 的属性值
	public void setItemUpdateAt(Timestamp itemUpdateAt) {
		this.itemUpdateAt = itemUpdateAt;
	}

	// 获取 机构（医院）itemcode 的属性值
	public String getORG_CODE() {
		return ORG_CODE;
	}

	// 设置 机构（医院）itemcode 的属性值
	public void setORG_CODE(String ORG_CODE) {
		this.ORG_CODE = ORG_CODE;
	}

	public Tb_natmeha_project getTb_natmeha_project() {
		return tb_natmeha_project;
	}

	public void setTb_natmeha_project(Tb_natmeha_project tb_natmeha_project) {
		this.tb_natmeha_project = tb_natmeha_project;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "Tb_natmeha_doctor {" + 
				", itemID='" + itemID + '\'' + 
				", itemCode='" + itemCode + '\'' + 
				", DOCTOR_NAME='" + DOCTOR_NAME + '\'' + 
				", DOCTOR_TITLE='" + DOCTOR_TITLE + '\'' + 
				", DOCTOR_TREATMENT='" + DOCTOR_TREATMENT + '\'' + 
				", DOCTOR_SORCE='" + DOCTOR_SORCE + '\'' + 
				", DEPT_CODE='" + DEPT_CODE + '\'' + 
				", NUM_TYPE='" + NUM_TYPE + '\'' + 
				", USER_CODE='" + USER_CODE + '\'' + 
				", CREATER='" + CREATER + '\'' + 
				", itemCreateAt='" + itemCreateAt + '\'' + 
				", UPDATER='" + UPDATER + '\'' + 
				", itemUpdateAt='" + itemUpdateAt + '\'' + 
				", ORG_CODE='" + ORG_CODE + '\'' + 
				"}";
	}
}