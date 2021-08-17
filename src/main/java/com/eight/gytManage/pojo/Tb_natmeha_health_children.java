package com.eight.gytManage.pojo;


import java.sql.Date;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class Tb_natmeha_health_children {
	// itemID ：
	private Long itemID;
	// 唯一标识UUID
	private String itemCode;
	// baseinfo中patient_id
	private String PATIENT_ID;
	// 新生儿姓名
	private String NEWBORN_NAME;
	// 新生儿性别
	private String NEWBORN_SEX;
	// 新生儿出生日期
	private Date NEWBORN_BIRTH_DATE;
	// 总检结论
	private String EXAM_SUMMARY;
	// 新生儿身份证件类别
	private String NEWBORN_ID_TYPE;
	// 新生儿身份证件号码
	private String NEWBORN_ID_NO;
	// 父亲姓名
	private String FATHER_NAME;
	// 母亲姓名
	private String MOTHER_NAME;
	// 出生体重(g)
	private BigDecimal BIRTH_WEIGHT;
	// 出生身长
	private BigDecimal BIRTH_LENGTH;
	// 体重
	private BigDecimal WEIGHT;
	// 身长
	private BigDecimal LENGTH;
	// 喂养方式类别
	private String FEED_WAY;
	// 药物使用途径
	private String DRUG_ROUTE;
	// 每天吃奶次数
	private Integer DAILY_FEEDING_TIMES;
	// 每天吃奶量（mL)
	private Integer DAILY_FEEDING_AMOUNT;
	// 既往患病种类
	private Integer STOOL_TIMES;
	// 随访医生名称
	private String VISIT_DOCTOR_NAME;
	// 本次访问日期
	private LocalDateTime THIS_VISIT_DATE;
	// 下次访问日期
	private LocalDateTime NEXT_VISIT_DATE;
	// 创建人
	private String CREATER;
	// 创建时间
	private Timestamp itemCreateAt;
	// 修改人
	private String UPDATER;
	// 修改时间
	private Timestamp itemUpdateAt;

	// 无参构造器
	public Tb_natmeha_health_children() {
	}

	// 有参构造器，进行属性值的初始化
	public Tb_natmeha_health_children(Long itemID, String itemCode, String PATIENT_ID, String NEWBORN_NAME, String NEWBORN_SEX, Date NEWBORN_BIRTH_DATE, String EXAM_SUMMARY, String NEWBORN_ID_TYPE, String NEWBORN_ID_NO, String FATHER_NAME, String MOTHER_NAME, BigDecimal BIRTH_WEIGHT, BigDecimal BIRTH_LENGTH, BigDecimal WEIGHT, BigDecimal LENGTH, String FEED_WAY, String DRUG_ROUTE, Integer DAILY_FEEDING_TIMES, Integer DAILY_FEEDING_AMOUNT, Integer STOOL_TIMES, String VISIT_DOCTOR_NAME, LocalDateTime THIS_VISIT_DATE, LocalDateTime NEXT_VISIT_DATE, String CREATER, Timestamp itemCreateAt, String UPDATER, Timestamp itemUpdateAt) {
		this.itemID = itemID;
		this.itemCode = itemCode;
		this.PATIENT_ID = PATIENT_ID;
		this.NEWBORN_NAME = NEWBORN_NAME;
		this.NEWBORN_SEX = NEWBORN_SEX;
		this.NEWBORN_BIRTH_DATE = NEWBORN_BIRTH_DATE;
		this.EXAM_SUMMARY = EXAM_SUMMARY;
		this.NEWBORN_ID_TYPE = NEWBORN_ID_TYPE;
		this.NEWBORN_ID_NO = NEWBORN_ID_NO;
		this.FATHER_NAME = FATHER_NAME;
		this.MOTHER_NAME = MOTHER_NAME;
		this.BIRTH_WEIGHT = BIRTH_WEIGHT;
		this.BIRTH_LENGTH = BIRTH_LENGTH;
		this.WEIGHT = WEIGHT;
		this.LENGTH = LENGTH;
		this.FEED_WAY = FEED_WAY;
		this.DRUG_ROUTE = DRUG_ROUTE;
		this.DAILY_FEEDING_TIMES = DAILY_FEEDING_TIMES;
		this.DAILY_FEEDING_AMOUNT = DAILY_FEEDING_AMOUNT;
		this.STOOL_TIMES = STOOL_TIMES;
		this.VISIT_DOCTOR_NAME = VISIT_DOCTOR_NAME;
		this.THIS_VISIT_DATE = THIS_VISIT_DATE;
		this.NEXT_VISIT_DATE = NEXT_VISIT_DATE;
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

	// 获取 baseinfo中patient_id 的属性值
	public String getPATIENT_ID() {
		return PATIENT_ID;
	}

	// 设置 baseinfo中patient_id 的属性值
	public void setPATIENT_ID(String PATIENT_ID) {
		this.PATIENT_ID = PATIENT_ID;
	}

	// 获取 新生儿姓名 的属性值
	public String getNEWBORN_NAME() {
		return NEWBORN_NAME;
	}

	// 设置 新生儿姓名 的属性值
	public void setNEWBORN_NAME(String NEWBORN_NAME) {
		this.NEWBORN_NAME = NEWBORN_NAME;
	}

	// 获取 新生儿性别 的属性值
	public String getNEWBORN_SEX() {
		return NEWBORN_SEX;
	}

	// 设置 新生儿性别 的属性值
	public void setNEWBORN_SEX(String NEWBORN_SEX) {
		this.NEWBORN_SEX = NEWBORN_SEX;
	}

	// 获取 新生儿出生日期 的属性值
	public Date getNEWBORN_BIRTH_DATE() {
		return NEWBORN_BIRTH_DATE;
	}

	// 设置 新生儿出生日期 的属性值
	public void setNEWBORN_BIRTH_DATE(Date NEWBORN_BIRTH_DATE) {
		this.NEWBORN_BIRTH_DATE = NEWBORN_BIRTH_DATE;
	}

	// 获取 总检结论 的属性值
	public String getEXAM_SUMMARY() {
		return EXAM_SUMMARY;
	}

	// 设置 总检结论 的属性值
	public void setEXAM_SUMMARY(String EXAM_SUMMARY) {
		this.EXAM_SUMMARY = EXAM_SUMMARY;
	}

	// 获取 新生儿身份证件类别 的属性值
	public String getNEWBORN_ID_TYPE() {
		return NEWBORN_ID_TYPE;
	}

	// 设置 新生儿身份证件类别 的属性值
	public void setNEWBORN_ID_TYPE(String NEWBORN_ID_TYPE) {
		this.NEWBORN_ID_TYPE = NEWBORN_ID_TYPE;
	}

	// 获取 新生儿身份证件号码 的属性值
	public String getNEWBORN_ID_NO() {
		return NEWBORN_ID_NO;
	}

	// 设置 新生儿身份证件号码 的属性值
	public void setNEWBORN_ID_NO(String NEWBORN_ID_NO) {
		this.NEWBORN_ID_NO = NEWBORN_ID_NO;
	}

	// 获取 父亲姓名 的属性值
	public String getFATHER_NAME() {
		return FATHER_NAME;
	}

	// 设置 父亲姓名 的属性值
	public void setFATHER_NAME(String FATHER_NAME) {
		this.FATHER_NAME = FATHER_NAME;
	}

	// 获取 母亲姓名 的属性值
	public String getMOTHER_NAME() {
		return MOTHER_NAME;
	}

	// 设置 母亲姓名 的属性值
	public void setMOTHER_NAME(String MOTHER_NAME) {
		this.MOTHER_NAME = MOTHER_NAME;
	}

	// 获取 出生体重(g) 的属性值
	public BigDecimal getBIRTH_WEIGHT() {
		return BIRTH_WEIGHT;
	}

	// 设置 出生体重(g) 的属性值
	public void setBIRTH_WEIGHT(BigDecimal BIRTH_WEIGHT) {
		this.BIRTH_WEIGHT = BIRTH_WEIGHT;
	}

	// 获取 出生身长 的属性值
	public BigDecimal getBIRTH_LENGTH() {
		return BIRTH_LENGTH;
	}

	// 设置 出生身长 的属性值
	public void setBIRTH_LENGTH(BigDecimal BIRTH_LENGTH) {
		this.BIRTH_LENGTH = BIRTH_LENGTH;
	}

	// 获取 体重 的属性值
	public BigDecimal getWEIGHT() {
		return WEIGHT;
	}

	// 设置 体重 的属性值
	public void setWEIGHT(BigDecimal WEIGHT) {
		this.WEIGHT = WEIGHT;
	}

	// 获取 身长 的属性值
	public BigDecimal getLENGTH() {
		return LENGTH;
	}

	// 设置 身长 的属性值
	public void setLENGTH(BigDecimal LENGTH) {
		this.LENGTH = LENGTH;
	}

	// 获取 喂养方式类别 的属性值
	public String getFEED_WAY() {
		return FEED_WAY;
	}

	// 设置 喂养方式类别 的属性值
	public void setFEED_WAY(String FEED_WAY) {
		this.FEED_WAY = FEED_WAY;
	}

	// 获取 药物使用途径 的属性值
	public String getDRUG_ROUTE() {
		return DRUG_ROUTE;
	}

	// 设置 药物使用途径 的属性值
	public void setDRUG_ROUTE(String DRUG_ROUTE) {
		this.DRUG_ROUTE = DRUG_ROUTE;
	}

	// 获取 每天吃奶次数 的属性值
	public Integer getDAILY_FEEDING_TIMES() {
		return DAILY_FEEDING_TIMES;
	}

	// 设置 每天吃奶次数 的属性值
	public void setDAILY_FEEDING_TIMES(Integer DAILY_FEEDING_TIMES) {
		this.DAILY_FEEDING_TIMES = DAILY_FEEDING_TIMES;
	}

	// 获取 每天吃奶量（mL) 的属性值
	public Integer getDAILY_FEEDING_AMOUNT() {
		return DAILY_FEEDING_AMOUNT;
	}

	// 设置 每天吃奶量（mL) 的属性值
	public void setDAILY_FEEDING_AMOUNT(Integer DAILY_FEEDING_AMOUNT) {
		this.DAILY_FEEDING_AMOUNT = DAILY_FEEDING_AMOUNT;
	}

	// 获取 既往患病种类 的属性值
	public Integer getSTOOL_TIMES() {
		return STOOL_TIMES;
	}

	// 设置 既往患病种类 的属性值
	public void setSTOOL_TIMES(Integer STOOL_TIMES) {
		this.STOOL_TIMES = STOOL_TIMES;
	}

	// 获取 随访医生名称 的属性值
	public String getVISIT_DOCTOR_NAME() {
		return VISIT_DOCTOR_NAME;
	}

	// 设置 随访医生名称 的属性值
	public void setVISIT_DOCTOR_NAME(String VISIT_DOCTOR_NAME) {
		this.VISIT_DOCTOR_NAME = VISIT_DOCTOR_NAME;
	}

	// 获取 本次访问日期 的属性值
	public LocalDateTime getTHIS_VISIT_DATE() {
		return THIS_VISIT_DATE;
	}

	// 设置 本次访问日期 的属性值
	public void setTHIS_VISIT_DATE(LocalDateTime THIS_VISIT_DATE) {
		this.THIS_VISIT_DATE = THIS_VISIT_DATE;
	}

	// 获取 下次访问日期 的属性值
	public LocalDateTime getNEXT_VISIT_DATE() {
		return NEXT_VISIT_DATE;
	}

	// 设置 下次访问日期 的属性值
	public void setNEXT_VISIT_DATE(LocalDateTime NEXT_VISIT_DATE) {
		this.NEXT_VISIT_DATE = NEXT_VISIT_DATE;
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
		return "Tb_natmeha_health_children {" + 
				", itemID='" + itemID + '\'' + 
				", itemCode='" + itemCode + '\'' + 
				", PATIENT_ID='" + PATIENT_ID + '\'' + 
				", NEWBORN_NAME='" + NEWBORN_NAME + '\'' + 
				", NEWBORN_SEX='" + NEWBORN_SEX + '\'' + 
				", NEWBORN_BIRTH_DATE='" + NEWBORN_BIRTH_DATE + '\'' + 
				", EXAM_SUMMARY='" + EXAM_SUMMARY + '\'' + 
				", NEWBORN_ID_TYPE='" + NEWBORN_ID_TYPE + '\'' + 
				", NEWBORN_ID_NO='" + NEWBORN_ID_NO + '\'' + 
				", FATHER_NAME='" + FATHER_NAME + '\'' + 
				", MOTHER_NAME='" + MOTHER_NAME + '\'' + 
				", BIRTH_WEIGHT='" + BIRTH_WEIGHT + '\'' + 
				", BIRTH_LENGTH='" + BIRTH_LENGTH + '\'' + 
				", WEIGHT='" + WEIGHT + '\'' + 
				", LENGTH='" + LENGTH + '\'' + 
				", FEED_WAY='" + FEED_WAY + '\'' + 
				", DRUG_ROUTE='" + DRUG_ROUTE + '\'' + 
				", DAILY_FEEDING_TIMES='" + DAILY_FEEDING_TIMES + '\'' + 
				", DAILY_FEEDING_AMOUNT='" + DAILY_FEEDING_AMOUNT + '\'' + 
				", STOOL_TIMES='" + STOOL_TIMES + '\'' + 
				", VISIT_DOCTOR_NAME='" + VISIT_DOCTOR_NAME + '\'' + 
				", THIS_VISIT_DATE='" + THIS_VISIT_DATE + '\'' + 
				", NEXT_VISIT_DATE='" + NEXT_VISIT_DATE + '\'' + 
				", CREATER='" + CREATER + '\'' + 
				", itemCreateAt='" + itemCreateAt + '\'' + 
				", UPDATER='" + UPDATER + '\'' + 
				", itemUpdateAt='" + itemUpdateAt + '\'' + 
				"}";
	}
}