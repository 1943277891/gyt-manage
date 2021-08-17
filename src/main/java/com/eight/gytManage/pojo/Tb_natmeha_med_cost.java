package com.eight.gytManage.pojo;


import java.sql.Date;
import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class Tb_natmeha_med_cost {
	// itemID ：
	private Long itemID;
	// 门诊记录表编号
	private String OUTPAT_FORM_NO;
	// 就诊机构名称
	private String VISIT_ORG_NAME;
	// 就诊科室名称
	private String VISIT_DEPT_NAME;
	// 就诊日期时间
	private Date VISIT_DTIME;
	// SPECIFICATIONS ：
	private String SPECIFICATIONS;
	// PRICE ：
	private Double PRICE;
	// NUM ：
	private String NUM;
	// 门诊个人承担费用金额（元）
	private Double OUTPAT_Self_Payment;
	// 住院个人承担费用金额（元）
	private Double INPAT_Self_Payment;
	// CREATER ：
	private String CREATER;
	// itemCreateAt ：
	private Timestamp itemCreateAt;
	// UPDATER ：
	private String UPDATER;
	// itemUpdateAt ：
	private Timestamp itemUpdateAt;

	// 无参构造器
	public Tb_natmeha_med_cost() {
	}

	// 有参构造器，进行属性值的初始化
	public Tb_natmeha_med_cost(Long itemID, String OUTPAT_FORM_NO, String VISIT_ORG_NAME, String VISIT_DEPT_NAME, Date VISIT_DTIME, String SPECIFICATIONS, Double PRICE, String NUM, Double OUTPAT_Self_Payment, Double INPAT_Self_Payment, String CREATER, Timestamp itemCreateAt, String UPDATER, Timestamp itemUpdateAt) {
		this.itemID = itemID;
		this.OUTPAT_FORM_NO = OUTPAT_FORM_NO;
		this.VISIT_ORG_NAME = VISIT_ORG_NAME;
		this.VISIT_DEPT_NAME = VISIT_DEPT_NAME;
		this.VISIT_DTIME = VISIT_DTIME;
		this.SPECIFICATIONS = SPECIFICATIONS;
		this.PRICE = PRICE;
		this.NUM = NUM;
		this.OUTPAT_Self_Payment = OUTPAT_Self_Payment;
		this.INPAT_Self_Payment = INPAT_Self_Payment;
		this.CREATER = CREATER;
		this.itemCreateAt = itemCreateAt;
		this.UPDATER = UPDATER;
		this.itemUpdateAt = itemUpdateAt;
	}

	// 获取 itemID 的属性值
	public Long getItemID() {
		return itemID;
	}

	// 设置 itemID 的属性值
	public void setItemID(Long itemID) {
		this.itemID = itemID;
	}

	// 获取 门诊记录表编号 的属性值
	public String getOUTPAT_FORM_NO() {
		return OUTPAT_FORM_NO;
	}

	// 设置 门诊记录表编号 的属性值
	public void setOUTPAT_FORM_NO(String OUTPAT_FORM_NO) {
		this.OUTPAT_FORM_NO = OUTPAT_FORM_NO;
	}

	// 获取 就诊机构名称 的属性值
	public String getVISIT_ORG_NAME() {
		return VISIT_ORG_NAME;
	}

	// 设置 就诊机构名称 的属性值
	public void setVISIT_ORG_NAME(String VISIT_ORG_NAME) {
		this.VISIT_ORG_NAME = VISIT_ORG_NAME;
	}

	// 获取 就诊科室名称 的属性值
	public String getVISIT_DEPT_NAME() {
		return VISIT_DEPT_NAME;
	}

	// 设置 就诊科室名称 的属性值
	public void setVISIT_DEPT_NAME(String VISIT_DEPT_NAME) {
		this.VISIT_DEPT_NAME = VISIT_DEPT_NAME;
	}

	// 获取 就诊日期时间 的属性值
	public Date getVISIT_DTIME() {
		return VISIT_DTIME;
	}

	// 设置 就诊日期时间 的属性值
	public void setVISIT_DTIME(Date VISIT_DTIME) {
		this.VISIT_DTIME = VISIT_DTIME;
	}

	// 获取 SPECIFICATIONS 的属性值
	public String getSPECIFICATIONS() {
		return SPECIFICATIONS;
	}

	// 设置 SPECIFICATIONS 的属性值
	public void setSPECIFICATIONS(String SPECIFICATIONS) {
		this.SPECIFICATIONS = SPECIFICATIONS;
	}

	// 获取 PRICE 的属性值
	public Double getPRICE() {
		return PRICE;
	}

	// 设置 PRICE 的属性值
	public void setPRICE(Double PRICE) {
		this.PRICE = PRICE;
	}

	// 获取 NUM 的属性值
	public String getNUM() {
		return NUM;
	}

	// 设置 NUM 的属性值
	public void setNUM(String NUM) {
		this.NUM = NUM;
	}

	// 获取 门诊个人承担费用金额（元） 的属性值
	public Double getOUTPAT_Self_Payment() {
		return OUTPAT_Self_Payment;
	}

	// 设置 门诊个人承担费用金额（元） 的属性值
	public void setOUTPAT_Self_Payment(Double OUTPAT_Self_Payment) {
		this.OUTPAT_Self_Payment = OUTPAT_Self_Payment;
	}

	// 获取 住院个人承担费用金额（元） 的属性值
	public Double getINPAT_Self_Payment() {
		return INPAT_Self_Payment;
	}

	// 设置 住院个人承担费用金额（元） 的属性值
	public void setINPAT_Self_Payment(Double INPAT_Self_Payment) {
		this.INPAT_Self_Payment = INPAT_Self_Payment;
	}

	// 获取 CREATER 的属性值
	public String getCREATER() {
		return CREATER;
	}

	// 设置 CREATER 的属性值
	public void setCREATER(String CREATER) {
		this.CREATER = CREATER;
	}

	// 获取 itemCreateAt 的属性值
	public Timestamp getItemCreateAt() {
		return itemCreateAt;
	}

	// 设置 itemCreateAt 的属性值
	public void setItemCreateAt(Timestamp itemCreateAt) {
		this.itemCreateAt = itemCreateAt;
	}

	// 获取 UPDATER 的属性值
	public String getUPDATER() {
		return UPDATER;
	}

	// 设置 UPDATER 的属性值
	public void setUPDATER(String UPDATER) {
		this.UPDATER = UPDATER;
	}

	// 获取 itemUpdateAt 的属性值
	public Timestamp getItemUpdateAt() {
		return itemUpdateAt;
	}

	// 设置 itemUpdateAt 的属性值
	public void setItemUpdateAt(Timestamp itemUpdateAt) {
		this.itemUpdateAt = itemUpdateAt;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "Tb_natmeha_med_cost {" + 
				", itemID='" + itemID + '\'' + 
				", OUTPAT_FORM_NO='" + OUTPAT_FORM_NO + '\'' + 
				", VISIT_ORG_NAME='" + VISIT_ORG_NAME + '\'' + 
				", VISIT_DEPT_NAME='" + VISIT_DEPT_NAME + '\'' + 
				", VISIT_DTIME='" + VISIT_DTIME + '\'' + 
				", SPECIFICATIONS='" + SPECIFICATIONS + '\'' + 
				", PRICE='" + PRICE + '\'' + 
				", NUM='" + NUM + '\'' + 
				", OUTPAT_Self_Payment='" + OUTPAT_Self_Payment + '\'' + 
				", INPAT_Self_Payment='" + INPAT_Self_Payment + '\'' + 
				", CREATER='" + CREATER + '\'' + 
				", itemCreateAt='" + itemCreateAt + '\'' + 
				", UPDATER='" + UPDATER + '\'' + 
				", itemUpdateAt='" + itemUpdateAt + '\'' + 
				"}";
	}
}