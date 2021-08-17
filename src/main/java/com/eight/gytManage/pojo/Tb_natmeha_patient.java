package com.eight.gytManage.pojo;


import java.sql.Timestamp;
import java.sql.Date;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class Tb_natmeha_patient {
	// itemID ：
	private Long itemID;
	// 唯一标识UUID
	private String itemCode;
	// 就诊人名称
	private String PATIENT_NAME;
	// 性别
	private String GENDER;
	// 身份证件类型
	private String IDCARD_TYPE;
	// 证件号码
	private String IDCARD_NO;
	// 电话号码
	private String PHONE;
	// 关系
	private String RELATIONSHIP;
	// 是否为默认就诊人
	private String DEFAULT_PATIENT;
	// 地址省份code
	private String ADRESS_PRO;
	// 市级code
	private String ADRESS_CITY;
	// 地区省份
	private String ADRESS_COUNTRY;
	// 地址(手动输入)
	private String ADRESS;
	// 婚姻状况
	private String MARITAL_STATUS;
	// 用户code
	private String USER_CODE;
	// 创建人
	private String CREATER;
	// 创建时间
	private Timestamp itemCreateAt;
	// 修改人
	private String UPDATER;
	// 修改时间
	private Timestamp itemUpdateAt;
	// BIRTHDATE ：
	private Date BIRTHDATE;

	// 无参构造器
	public Tb_natmeha_patient() {
	}

	// 有参构造器，进行属性值的初始化
	public Tb_natmeha_patient(Long itemID, String itemCode, String PATIENT_NAME, String GENDER, String IDCARD_TYPE, String IDCARD_NO, String PHONE, String RELATIONSHIP, String DEFAULT_PATIENT, String ADRESS_PRO, String ADRESS_CITY, String ADRESS_COUNTRY, String ADRESS, String MARITAL_STATUS, String USER_CODE, String CREATER, Timestamp itemCreateAt, String UPDATER, Timestamp itemUpdateAt, Date BIRTHDATE) {
		this.itemID = itemID;
		this.itemCode = itemCode;
		this.PATIENT_NAME = PATIENT_NAME;
		this.GENDER = GENDER;
		this.IDCARD_TYPE = IDCARD_TYPE;
		this.IDCARD_NO = IDCARD_NO;
		this.PHONE = PHONE;
		this.RELATIONSHIP = RELATIONSHIP;
		this.DEFAULT_PATIENT = DEFAULT_PATIENT;
		this.ADRESS_PRO = ADRESS_PRO;
		this.ADRESS_CITY = ADRESS_CITY;
		this.ADRESS_COUNTRY = ADRESS_COUNTRY;
		this.ADRESS = ADRESS;
		this.MARITAL_STATUS = MARITAL_STATUS;
		this.USER_CODE = USER_CODE;
		this.CREATER = CREATER;
		this.itemCreateAt = itemCreateAt;
		this.UPDATER = UPDATER;
		this.itemUpdateAt = itemUpdateAt;
		this.BIRTHDATE = BIRTHDATE;
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

	// 获取 就诊人名称 的属性值
	public String getPATIENT_NAME() {
		return PATIENT_NAME;
	}

	// 设置 就诊人名称 的属性值
	public void setPATIENT_NAME(String PATIENT_NAME) {
		this.PATIENT_NAME = PATIENT_NAME;
	}

	// 获取 性别 的属性值
	public String getGENDER() {
		return GENDER;
	}

	// 设置 性别 的属性值
	public void setGENDER(String GENDER) {
		this.GENDER = GENDER;
	}

	// 获取 身份证件类型 的属性值
	public String getIDCARD_TYPE() {
		return IDCARD_TYPE;
	}

	// 设置 身份证件类型 的属性值
	public void setIDCARD_TYPE(String IDCARD_TYPE) {
		this.IDCARD_TYPE = IDCARD_TYPE;
	}

	// 获取 证件号码 的属性值
	public String getIDCARD_NO() {
		return IDCARD_NO;
	}

	// 设置 证件号码 的属性值
	public void setIDCARD_NO(String IDCARD_NO) {
		this.IDCARD_NO = IDCARD_NO;
	}

	// 获取 电话号码 的属性值
	public String getPHONE() {
		return PHONE;
	}

	// 设置 电话号码 的属性值
	public void setPHONE(String PHONE) {
		this.PHONE = PHONE;
	}

	// 获取 关系 的属性值
	public String getRELATIONSHIP() {
		return RELATIONSHIP;
	}

	// 设置 关系 的属性值
	public void setRELATIONSHIP(String RELATIONSHIP) {
		this.RELATIONSHIP = RELATIONSHIP;
	}

	// 获取 是否为默认就诊人 的属性值
	public String getDEFAULT_PATIENT() {
		return DEFAULT_PATIENT;
	}

	// 设置 是否为默认就诊人 的属性值
	public void setDEFAULT_PATIENT(String DEFAULT_PATIENT) {
		this.DEFAULT_PATIENT = DEFAULT_PATIENT;
	}

	// 获取 地址省份code 的属性值
	public String getADRESS_PRO() {
		return ADRESS_PRO;
	}

	// 设置 地址省份code 的属性值
	public void setADRESS_PRO(String ADRESS_PRO) {
		this.ADRESS_PRO = ADRESS_PRO;
	}

	// 获取 市级code 的属性值
	public String getADRESS_CITY() {
		return ADRESS_CITY;
	}

	// 设置 市级code 的属性值
	public void setADRESS_CITY(String ADRESS_CITY) {
		this.ADRESS_CITY = ADRESS_CITY;
	}

	// 获取 地区省份 的属性值
	public String getADRESS_COUNTRY() {
		return ADRESS_COUNTRY;
	}

	// 设置 地区省份 的属性值
	public void setADRESS_COUNTRY(String ADRESS_COUNTRY) {
		this.ADRESS_COUNTRY = ADRESS_COUNTRY;
	}

	// 获取 地址(手动输入) 的属性值
	public String getADRESS() {
		return ADRESS;
	}

	// 设置 地址(手动输入) 的属性值
	public void setADRESS(String ADRESS) {
		this.ADRESS = ADRESS;
	}

	// 获取 婚姻状况 的属性值
	public String getMARITAL_STATUS() {
		return MARITAL_STATUS;
	}

	// 设置 婚姻状况 的属性值
	public void setMARITAL_STATUS(String MARITAL_STATUS) {
		this.MARITAL_STATUS = MARITAL_STATUS;
	}

	// 获取 用户code 的属性值
	public String getUSER_CODE() {
		return USER_CODE;
	}

	// 设置 用户code 的属性值
	public void setUSER_CODE(String USER_CODE) {
		this.USER_CODE = USER_CODE;
	}

	// 获取 创建人 的属性值
	public String getCREATER() {
		return CREATER;
	}

	// 设置 创建人 的属性值
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

	// 获取 BIRTHDATE 的属性值
	public Date getBIRTHDATE() {
		return BIRTHDATE;
	}

	// 设置 BIRTHDATE 的属性值
	public void setBIRTHDATE(Date BIRTHDATE) {
		this.BIRTHDATE = BIRTHDATE;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "Tb_natmeha_patient {" + 
				", itemID='" + itemID + '\'' + 
				", itemCode='" + itemCode + '\'' + 
				", PATIENT_NAME='" + PATIENT_NAME + '\'' + 
				", GENDER='" + GENDER + '\'' + 
				", IDCARD_TYPE='" + IDCARD_TYPE + '\'' + 
				", IDCARD_NO='" + IDCARD_NO + '\'' + 
				", PHONE='" + PHONE + '\'' + 
				", RELATIONSHIP='" + RELATIONSHIP + '\'' + 
				", DEFAULT_PATIENT='" + DEFAULT_PATIENT + '\'' + 
				", ADRESS_PRO='" + ADRESS_PRO + '\'' + 
				", ADRESS_CITY='" + ADRESS_CITY + '\'' + 
				", ADRESS_COUNTRY='" + ADRESS_COUNTRY + '\'' + 
				", ADRESS='" + ADRESS + '\'' + 
				", MARITAL_STATUS='" + MARITAL_STATUS + '\'' + 
				", USER_CODE='" + USER_CODE + '\'' + 
				", CREATER='" + CREATER + '\'' + 
				", itemCreateAt='" + itemCreateAt + '\'' + 
				", UPDATER='" + UPDATER + '\'' + 
				", itemUpdateAt='" + itemUpdateAt + '\'' + 
				", BIRTHDATE='" + BIRTHDATE + '\'' + 
				"}";
	}
}