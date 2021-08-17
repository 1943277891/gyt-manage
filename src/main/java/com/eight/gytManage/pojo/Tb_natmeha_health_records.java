package com.eight.gytManage.pojo;


import java.sql.Date;
import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class Tb_natmeha_health_records {
	// itemID ：
	private Long itemID;
	// 唯一标识UUID
	private String itemCode;
	// 真实姓名
	private String NAME;
	// 性别
	private String GENDER;
	// 出生日期
	private Date BIRTH;
	// 电话号码
	private String PHONE;
	// 地址省份code
	private String ADRESS_PRO;
	// 市级code
	private String ADRESS_CITY;
	// 地区省份
	private String ADRESS_COUNTRY;
	// 地址(手动输入)
	private String ADRESS;
	// 民族
	private String NATION;
	// 血型
	private String BLOOD_TYPE;
	// 文化程度
	private String EDUCATION;
	// 职业
	private String OCCUPATION;
	// 身高
	private Double HEIGHT;
	// 体重
	private Double WEIGHT;
	// BMI
	private String BMI;
	// 疾病史
	private String DISEASE_HISTORY;
	// 过敏
	private String ALLERGY;
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

	// 无参构造器
	public Tb_natmeha_health_records() {
	}

	// 有参构造器，进行属性值的初始化
	public Tb_natmeha_health_records(Long itemID, String itemCode, String NAME, String GENDER, Date BIRTH, String PHONE, String ADRESS_PRO, String ADRESS_CITY, String ADRESS_COUNTRY, String ADRESS, String NATION, String BLOOD_TYPE, String EDUCATION, String OCCUPATION, Double HEIGHT, Double WEIGHT, String BMI, String DISEASE_HISTORY, String ALLERGY, String USER_CODE, String CREATER, Timestamp itemCreateAt, String UPDATER, Timestamp itemUpdateAt) {
		this.itemID = itemID;
		this.itemCode = itemCode;
		this.NAME = NAME;
		this.GENDER = GENDER;
		this.BIRTH = BIRTH;
		this.PHONE = PHONE;
		this.ADRESS_PRO = ADRESS_PRO;
		this.ADRESS_CITY = ADRESS_CITY;
		this.ADRESS_COUNTRY = ADRESS_COUNTRY;
		this.ADRESS = ADRESS;
		this.NATION = NATION;
		this.BLOOD_TYPE = BLOOD_TYPE;
		this.EDUCATION = EDUCATION;
		this.OCCUPATION = OCCUPATION;
		this.HEIGHT = HEIGHT;
		this.WEIGHT = WEIGHT;
		this.BMI = BMI;
		this.DISEASE_HISTORY = DISEASE_HISTORY;
		this.ALLERGY = ALLERGY;
		this.USER_CODE = USER_CODE;
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

	// 获取 真实姓名 的属性值
	public String getNAME() {
		return NAME;
	}

	// 设置 真实姓名 的属性值
	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	// 获取 性别 的属性值
	public String getGENDER() {
		return GENDER;
	}

	// 设置 性别 的属性值
	public void setGENDER(String GENDER) {
		this.GENDER = GENDER;
	}

	// 获取 出生日期 的属性值
	public Date getBIRTH() {
		return BIRTH;
	}

	// 设置 出生日期 的属性值
	public void setBIRTH(Date BIRTH) {
		this.BIRTH = BIRTH;
	}

	// 获取 电话号码 的属性值
	public String getPHONE() {
		return PHONE;
	}

	// 设置 电话号码 的属性值
	public void setPHONE(String PHONE) {
		this.PHONE = PHONE;
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

	// 获取 民族 的属性值
	public String getNATION() {
		return NATION;
	}

	// 设置 民族 的属性值
	public void setNATION(String NATION) {
		this.NATION = NATION;
	}

	// 获取 血型 的属性值
	public String getBLOOD_TYPE() {
		return BLOOD_TYPE;
	}

	// 设置 血型 的属性值
	public void setBLOOD_TYPE(String BLOOD_TYPE) {
		this.BLOOD_TYPE = BLOOD_TYPE;
	}

	// 获取 文化程度 的属性值
	public String getEDUCATION() {
		return EDUCATION;
	}

	// 设置 文化程度 的属性值
	public void setEDUCATION(String EDUCATION) {
		this.EDUCATION = EDUCATION;
	}

	// 获取 职业 的属性值
	public String getOCCUPATION() {
		return OCCUPATION;
	}

	// 设置 职业 的属性值
	public void setOCCUPATION(String OCCUPATION) {
		this.OCCUPATION = OCCUPATION;
	}

	// 获取 身高 的属性值
	public Double getHEIGHT() {
		return HEIGHT;
	}

	// 设置 身高 的属性值
	public void setHEIGHT(Double HEIGHT) {
		this.HEIGHT = HEIGHT;
	}

	// 获取 体重 的属性值
	public Double getWEIGHT() {
		return WEIGHT;
	}

	// 设置 体重 的属性值
	public void setWEIGHT(Double WEIGHT) {
		this.WEIGHT = WEIGHT;
	}

	// 获取 BMI 的属性值
	public String getBMI() {
		return BMI;
	}

	// 设置 BMI 的属性值
	public void setBMI(String BMI) {
		this.BMI = BMI;
	}

	// 获取 疾病史 的属性值
	public String getDISEASE_HISTORY() {
		return DISEASE_HISTORY;
	}

	// 设置 疾病史 的属性值
	public void setDISEASE_HISTORY(String DISEASE_HISTORY) {
		this.DISEASE_HISTORY = DISEASE_HISTORY;
	}

	// 获取 过敏 的属性值
	public String getALLERGY() {
		return ALLERGY;
	}

	// 设置 过敏 的属性值
	public void setALLERGY(String ALLERGY) {
		this.ALLERGY = ALLERGY;
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

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "Tb_natmeha_health_records {" + 
				", itemID='" + itemID + '\'' + 
				", itemCode='" + itemCode + '\'' + 
				", NAME='" + NAME + '\'' + 
				", GENDER='" + GENDER + '\'' + 
				", BIRTH='" + BIRTH + '\'' + 
				", PHONE='" + PHONE + '\'' + 
				", ADRESS_PRO='" + ADRESS_PRO + '\'' + 
				", ADRESS_CITY='" + ADRESS_CITY + '\'' + 
				", ADRESS_COUNTRY='" + ADRESS_COUNTRY + '\'' + 
				", ADRESS='" + ADRESS + '\'' + 
				", NATION='" + NATION + '\'' + 
				", BLOOD_TYPE='" + BLOOD_TYPE + '\'' + 
				", EDUCATION='" + EDUCATION + '\'' + 
				", OCCUPATION='" + OCCUPATION + '\'' + 
				", HEIGHT='" + HEIGHT + '\'' + 
				", WEIGHT='" + WEIGHT + '\'' + 
				", BMI='" + BMI + '\'' + 
				", DISEASE_HISTORY='" + DISEASE_HISTORY + '\'' + 
				", ALLERGY='" + ALLERGY + '\'' + 
				", USER_CODE='" + USER_CODE + '\'' + 
				", CREATER='" + CREATER + '\'' + 
				", itemCreateAt='" + itemCreateAt + '\'' + 
				", UPDATER='" + UPDATER + '\'' + 
				", itemUpdateAt='" + itemUpdateAt + '\'' + 
				"}";
	}
}