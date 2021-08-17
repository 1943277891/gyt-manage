package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class Tb_natmeha_register_ref {
	// itemID ：
	private Long itemID;
	// 唯一标识UUID
	private String itemCode;
	// 预约号码
	private Integer REGISTER_NUM;
	// 号源code
	private String SOURCE_CODE;
	// 用户code
	private String USER_CODE;
	// 就诊人code
	private String PATIENT_CODE;
	// 就诊状态
	private String REGISTER_STATUS;
	// 匿名评价
	private Boolean ANONYMOUS;
	// 总体评分
	private Double OVERALL_SOURCE;
	// 诊疗效果评分
	private Double EFFECT_SOURCE;
	// 诊疗环境评分
	private Double ENVIRONMENT_SOURCE;
	// 服务态度评分
	private Double SERVICE_SOURCE;
	// 所患疾病
	private String ILLNESS;
	// 就诊评分
	private Double SOURCE;
	// CREATER ：
	private String CREATER;
	// itemCreateAt ：
	private Timestamp itemCreateAt;
	// UPDATER ：
	private String UPDATER;
	// itemUpdateAt ：
	private Timestamp itemUpdateAt;

	// 无参构造器
	public Tb_natmeha_register_ref() {
	}

	// 有参构造器，进行属性值的初始化
	public Tb_natmeha_register_ref(Long itemID, String itemCode, Integer REGISTER_NUM, String SOURCE_CODE, String USER_CODE, String PATIENT_CODE, String REGISTER_STATUS, Boolean ANONYMOUS, Double OVERALL_SOURCE, Double EFFECT_SOURCE, Double ENVIRONMENT_SOURCE, Double SERVICE_SOURCE, String ILLNESS, Double SOURCE, String CREATER, Timestamp itemCreateAt, String UPDATER, Timestamp itemUpdateAt) {
		this.itemID = itemID;
		this.itemCode = itemCode;
		this.REGISTER_NUM = REGISTER_NUM;
		this.SOURCE_CODE = SOURCE_CODE;
		this.USER_CODE = USER_CODE;
		this.PATIENT_CODE = PATIENT_CODE;
		this.REGISTER_STATUS = REGISTER_STATUS;
		this.ANONYMOUS = ANONYMOUS;
		this.OVERALL_SOURCE = OVERALL_SOURCE;
		this.EFFECT_SOURCE = EFFECT_SOURCE;
		this.ENVIRONMENT_SOURCE = ENVIRONMENT_SOURCE;
		this.SERVICE_SOURCE = SERVICE_SOURCE;
		this.ILLNESS = ILLNESS;
		this.SOURCE = SOURCE;
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

	// 获取 唯一标识UUID 的属性值
	public String getItemCode() {
		return itemCode;
	}

	// 设置 唯一标识UUID 的属性值
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	// 获取 预约号码 的属性值
	public Integer getREGISTER_NUM() {
		return REGISTER_NUM;
	}

	// 设置 预约号码 的属性值
	public void setREGISTER_NUM(Integer REGISTER_NUM) {
		this.REGISTER_NUM = REGISTER_NUM;
	}

	// 获取 号源code 的属性值
	public String getSOURCE_CODE() {
		return SOURCE_CODE;
	}

	// 设置 号源code 的属性值
	public void setSOURCE_CODE(String SOURCE_CODE) {
		this.SOURCE_CODE = SOURCE_CODE;
	}

	// 获取 用户code 的属性值
	public String getUSER_CODE() {
		return USER_CODE;
	}

	// 设置 用户code 的属性值
	public void setUSER_CODE(String USER_CODE) {
		this.USER_CODE = USER_CODE;
	}

	// 获取 就诊人code 的属性值
	public String getPATIENT_CODE() {
		return PATIENT_CODE;
	}

	// 设置 就诊人code 的属性值
	public void setPATIENT_CODE(String PATIENT_CODE) {
		this.PATIENT_CODE = PATIENT_CODE;
	}

	// 获取 就诊状态 的属性值
	public String getREGISTER_STATUS() {
		return REGISTER_STATUS;
	}

	// 设置 就诊状态 的属性值
	public void setREGISTER_STATUS(String REGISTER_STATUS) {
		this.REGISTER_STATUS = REGISTER_STATUS;
	}

	// 获取 匿名评价 的属性值
	public Boolean getANONYMOUS() {
		return ANONYMOUS;
	}

	// 设置 匿名评价 的属性值
	public void setANONYMOUS(Boolean ANONYMOUS) {
		this.ANONYMOUS = ANONYMOUS;
	}

	// 获取 总体评分 的属性值
	public Double getOVERALL_SOURCE() {
		return OVERALL_SOURCE;
	}

	// 设置 总体评分 的属性值
	public void setOVERALL_SOURCE(Double OVERALL_SOURCE) {
		this.OVERALL_SOURCE = OVERALL_SOURCE;
	}

	// 获取 诊疗效果评分 的属性值
	public Double getEFFECT_SOURCE() {
		return EFFECT_SOURCE;
	}

	// 设置 诊疗效果评分 的属性值
	public void setEFFECT_SOURCE(Double EFFECT_SOURCE) {
		this.EFFECT_SOURCE = EFFECT_SOURCE;
	}

	// 获取 诊疗环境评分 的属性值
	public Double getENVIRONMENT_SOURCE() {
		return ENVIRONMENT_SOURCE;
	}

	// 设置 诊疗环境评分 的属性值
	public void setENVIRONMENT_SOURCE(Double ENVIRONMENT_SOURCE) {
		this.ENVIRONMENT_SOURCE = ENVIRONMENT_SOURCE;
	}

	// 获取 服务态度评分 的属性值
	public Double getSERVICE_SOURCE() {
		return SERVICE_SOURCE;
	}

	// 设置 服务态度评分 的属性值
	public void setSERVICE_SOURCE(Double SERVICE_SOURCE) {
		this.SERVICE_SOURCE = SERVICE_SOURCE;
	}

	// 获取 所患疾病 的属性值
	public String getILLNESS() {
		return ILLNESS;
	}

	// 设置 所患疾病 的属性值
	public void setILLNESS(String ILLNESS) {
		this.ILLNESS = ILLNESS;
	}

	// 获取 就诊评分 的属性值
	public Double getSOURCE() {
		return SOURCE;
	}

	// 设置 就诊评分 的属性值
	public void setSOURCE(Double SOURCE) {
		this.SOURCE = SOURCE;
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
		return "Tb_natmeha_register_ref {" + 
				", itemID='" + itemID + '\'' + 
				", itemCode='" + itemCode + '\'' + 
				", REGISTER_NUM='" + REGISTER_NUM + '\'' + 
				", SOURCE_CODE='" + SOURCE_CODE + '\'' + 
				", USER_CODE='" + USER_CODE + '\'' + 
				", PATIENT_CODE='" + PATIENT_CODE + '\'' + 
				", REGISTER_STATUS='" + REGISTER_STATUS + '\'' + 
				", ANONYMOUS='" + ANONYMOUS + '\'' + 
				", OVERALL_SOURCE='" + OVERALL_SOURCE + '\'' + 
				", EFFECT_SOURCE='" + EFFECT_SOURCE + '\'' + 
				", ENVIRONMENT_SOURCE='" + ENVIRONMENT_SOURCE + '\'' + 
				", SERVICE_SOURCE='" + SERVICE_SOURCE + '\'' + 
				", ILLNESS='" + ILLNESS + '\'' + 
				", SOURCE='" + SOURCE + '\'' + 
				", CREATER='" + CREATER + '\'' + 
				", itemCreateAt='" + itemCreateAt + '\'' + 
				", UPDATER='" + UPDATER + '\'' + 
				", itemUpdateAt='" + itemUpdateAt + '\'' + 
				"}";
	}
}