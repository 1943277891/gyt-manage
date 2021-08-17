package com.eight.gytManage.pojo;


import java.sql.Date;
import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class Tb_natmeha_health_base {
	// itemID ：
	private Long itemID;
	// PATIENT_ID ：
	private String PATIENT_ID;
	// 真实姓名
	private String NAME;
	// 证件类型代码
	private String ID_TYPE;
	// 身份证件号码
	private String ID_NO;
	// 性别(0-未知的性别、1-男性、2-女性、9-未说明的性别)
	private String SEX;
	// 出生日期
	private Date BIRTH_DATE;
	// 文化程度
	private String EDUCATION;
	// 户口性质
	private String ACCO_PROPERTY;
	// 婚姻状况
	private String MARRIAGE;
	// 移动电话
	private String MOBILE_PHONE;
	// 民族
	private String NATIONALITY;
	// 出生详细地址
	private String BIRTH_PLACE;
	// 既往患病种类
	private String PAST_SICKNESS_TYPE;
	// 家族性疾病名称
	private String FAMILY_DISEASE;
	// 患者与本人关系
	private String PATIENT_RELATION;
	// 创建人
	private String CREATER;
	// 创建时间
	private Timestamp itemCreateAt;
	// 修改人
	private String UPDATER;
	// 修改时间
	private Timestamp itemUpdateAt;

	// 无参构造器
	public Tb_natmeha_health_base() {
	}

	// 有参构造器，进行属性值的初始化
	public Tb_natmeha_health_base(Long itemID, String PATIENT_ID, String NAME, String ID_TYPE, String ID_NO, String SEX, Date BIRTH_DATE, String EDUCATION, String ACCO_PROPERTY, String MARRIAGE, String MOBILE_PHONE, String NATIONALITY, String BIRTH_PLACE, String PAST_SICKNESS_TYPE, String FAMILY_DISEASE, String PATIENT_RELATION, String CREATER, Timestamp itemCreateAt, String UPDATER, Timestamp itemUpdateAt) {
		this.itemID = itemID;
		this.PATIENT_ID = PATIENT_ID;
		this.NAME = NAME;
		this.ID_TYPE = ID_TYPE;
		this.ID_NO = ID_NO;
		this.SEX = SEX;
		this.BIRTH_DATE = BIRTH_DATE;
		this.EDUCATION = EDUCATION;
		this.ACCO_PROPERTY = ACCO_PROPERTY;
		this.MARRIAGE = MARRIAGE;
		this.MOBILE_PHONE = MOBILE_PHONE;
		this.NATIONALITY = NATIONALITY;
		this.BIRTH_PLACE = BIRTH_PLACE;
		this.PAST_SICKNESS_TYPE = PAST_SICKNESS_TYPE;
		this.FAMILY_DISEASE = FAMILY_DISEASE;
		this.PATIENT_RELATION = PATIENT_RELATION;
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

	// 获取 PATIENT_ID 的属性值
	public String getPATIENT_ID() {
		return PATIENT_ID;
	}

	// 设置 PATIENT_ID 的属性值
	public void setPATIENT_ID(String PATIENT_ID) {
		this.PATIENT_ID = PATIENT_ID;
	}

	// 获取 真实姓名 的属性值
	public String getNAME() {
		return NAME;
	}

	// 设置 真实姓名 的属性值
	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	// 获取 证件类型代码 的属性值
	public String getID_TYPE() {
		return ID_TYPE;
	}

	// 设置 证件类型代码 的属性值
	public void setID_TYPE(String ID_TYPE) {
		this.ID_TYPE = ID_TYPE;
	}

	// 获取 身份证件号码 的属性值
	public String getID_NO() {
		return ID_NO;
	}

	// 设置 身份证件号码 的属性值
	public void setID_NO(String ID_NO) {
		this.ID_NO = ID_NO;
	}

	// 获取 性别(0-未知的性别、1-男性、2-女性、9-未说明的性别) 的属性值
	public String getSEX() {
		return SEX;
	}

	// 设置 性别(0-未知的性别、1-男性、2-女性、9-未说明的性别) 的属性值
	public void setSEX(String SEX) {
		this.SEX = SEX;
	}

	// 获取 出生日期 的属性值
	public Date getBIRTH_DATE() {
		return BIRTH_DATE;
	}

	// 设置 出生日期 的属性值
	public void setBIRTH_DATE(Date BIRTH_DATE) {
		this.BIRTH_DATE = BIRTH_DATE;
	}

	// 获取 文化程度 的属性值
	public String getEDUCATION() {
		return EDUCATION;
	}

	// 设置 文化程度 的属性值
	public void setEDUCATION(String EDUCATION) {
		this.EDUCATION = EDUCATION;
	}

	// 获取 户口性质 的属性值
	public String getACCO_PROPERTY() {
		return ACCO_PROPERTY;
	}

	// 设置 户口性质 的属性值
	public void setACCO_PROPERTY(String ACCO_PROPERTY) {
		this.ACCO_PROPERTY = ACCO_PROPERTY;
	}

	// 获取 婚姻状况 的属性值
	public String getMARRIAGE() {
		return MARRIAGE;
	}

	// 设置 婚姻状况 的属性值
	public void setMARRIAGE(String MARRIAGE) {
		this.MARRIAGE = MARRIAGE;
	}

	// 获取 移动电话 的属性值
	public String getMOBILE_PHONE() {
		return MOBILE_PHONE;
	}

	// 设置 移动电话 的属性值
	public void setMOBILE_PHONE(String MOBILE_PHONE) {
		this.MOBILE_PHONE = MOBILE_PHONE;
	}

	// 获取 民族 的属性值
	public String getNATIONALITY() {
		return NATIONALITY;
	}

	// 设置 民族 的属性值
	public void setNATIONALITY(String NATIONALITY) {
		this.NATIONALITY = NATIONALITY;
	}

	// 获取 出生详细地址 的属性值
	public String getBIRTH_PLACE() {
		return BIRTH_PLACE;
	}

	// 设置 出生详细地址 的属性值
	public void setBIRTH_PLACE(String BIRTH_PLACE) {
		this.BIRTH_PLACE = BIRTH_PLACE;
	}

	// 获取 既往患病种类 的属性值
	public String getPAST_SICKNESS_TYPE() {
		return PAST_SICKNESS_TYPE;
	}

	// 设置 既往患病种类 的属性值
	public void setPAST_SICKNESS_TYPE(String PAST_SICKNESS_TYPE) {
		this.PAST_SICKNESS_TYPE = PAST_SICKNESS_TYPE;
	}

	// 获取 家族性疾病名称 的属性值
	public String getFAMILY_DISEASE() {
		return FAMILY_DISEASE;
	}

	// 设置 家族性疾病名称 的属性值
	public void setFAMILY_DISEASE(String FAMILY_DISEASE) {
		this.FAMILY_DISEASE = FAMILY_DISEASE;
	}

	// 获取 患者与本人关系 的属性值
	public String getPATIENT_RELATION() {
		return PATIENT_RELATION;
	}

	// 设置 患者与本人关系 的属性值
	public void setPATIENT_RELATION(String PATIENT_RELATION) {
		this.PATIENT_RELATION = PATIENT_RELATION;
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

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "Tb_natmeha_health_base {" + 
				", itemID='" + itemID + '\'' + 
				", PATIENT_ID='" + PATIENT_ID + '\'' + 
				", NAME='" + NAME + '\'' + 
				", ID_TYPE='" + ID_TYPE + '\'' + 
				", ID_NO='" + ID_NO + '\'' + 
				", SEX='" + SEX + '\'' + 
				", BIRTH_DATE='" + BIRTH_DATE + '\'' + 
				", EDUCATION='" + EDUCATION + '\'' + 
				", ACCO_PROPERTY='" + ACCO_PROPERTY + '\'' + 
				", MARRIAGE='" + MARRIAGE + '\'' + 
				", MOBILE_PHONE='" + MOBILE_PHONE + '\'' + 
				", NATIONALITY='" + NATIONALITY + '\'' + 
				", BIRTH_PLACE='" + BIRTH_PLACE + '\'' + 
				", PAST_SICKNESS_TYPE='" + PAST_SICKNESS_TYPE + '\'' + 
				", FAMILY_DISEASE='" + FAMILY_DISEASE + '\'' + 
				", PATIENT_RELATION='" + PATIENT_RELATION + '\'' + 
				", CREATER='" + CREATER + '\'' + 
				", itemCreateAt='" + itemCreateAt + '\'' + 
				", UPDATER='" + UPDATER + '\'' + 
				", itemUpdateAt='" + itemUpdateAt + '\'' + 
				"}";
	}
}