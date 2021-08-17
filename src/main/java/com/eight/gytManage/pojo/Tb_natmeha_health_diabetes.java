package com.eight.gytManage.pojo;


import java.time.LocalDateTime;
import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class Tb_natmeha_health_diabetes {
	// itemID ：
	private Long itemID;
	// baseinfo中的patient_id
	private String PATIENT_ID;
	// 责任医师姓名
	private String RESP_DOCTOR_NAME;
	// 随访方式
	private String VISIT_WAY;
	// 本次随访日期
	private LocalDateTime THIS_FOLLOWUP_VISIT_DATE;
	// 随访评价结果
	private String VISIT_EVAL_RESULT;
	// 下次随访日期
	private LocalDateTime NEXT_FOLLOWUP_DATE;
	// 随访医师姓名
	private String FOLLOWUP_VISIT_DOCTOR_NAME;
	// 症状名称
	private String SYMPTOM_NAME;
	// 创建人
	private String CREATER;
	// 创建时间
	private Timestamp itemCreateAt;
	// 修改人
	private String UPDATER;
	// 修改时间
	private Timestamp itemUpdateAt;

	// 无参构造器
	public Tb_natmeha_health_diabetes() {
	}

	// 有参构造器，进行属性值的初始化
	public Tb_natmeha_health_diabetes(Long itemID, String PATIENT_ID, String RESP_DOCTOR_NAME, String VISIT_WAY, LocalDateTime THIS_FOLLOWUP_VISIT_DATE, String VISIT_EVAL_RESULT, LocalDateTime NEXT_FOLLOWUP_DATE, String FOLLOWUP_VISIT_DOCTOR_NAME, String SYMPTOM_NAME, String CREATER, Timestamp itemCreateAt, String UPDATER, Timestamp itemUpdateAt) {
		this.itemID = itemID;
		this.PATIENT_ID = PATIENT_ID;
		this.RESP_DOCTOR_NAME = RESP_DOCTOR_NAME;
		this.VISIT_WAY = VISIT_WAY;
		this.THIS_FOLLOWUP_VISIT_DATE = THIS_FOLLOWUP_VISIT_DATE;
		this.VISIT_EVAL_RESULT = VISIT_EVAL_RESULT;
		this.NEXT_FOLLOWUP_DATE = NEXT_FOLLOWUP_DATE;
		this.FOLLOWUP_VISIT_DOCTOR_NAME = FOLLOWUP_VISIT_DOCTOR_NAME;
		this.SYMPTOM_NAME = SYMPTOM_NAME;
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

	// 获取 baseinfo中的patient_id 的属性值
	public String getPATIENT_ID() {
		return PATIENT_ID;
	}

	// 设置 baseinfo中的patient_id 的属性值
	public void setPATIENT_ID(String PATIENT_ID) {
		this.PATIENT_ID = PATIENT_ID;
	}

	// 获取 责任医师姓名 的属性值
	public String getRESP_DOCTOR_NAME() {
		return RESP_DOCTOR_NAME;
	}

	// 设置 责任医师姓名 的属性值
	public void setRESP_DOCTOR_NAME(String RESP_DOCTOR_NAME) {
		this.RESP_DOCTOR_NAME = RESP_DOCTOR_NAME;
	}

	// 获取 随访方式 的属性值
	public String getVISIT_WAY() {
		return VISIT_WAY;
	}

	// 设置 随访方式 的属性值
	public void setVISIT_WAY(String VISIT_WAY) {
		this.VISIT_WAY = VISIT_WAY;
	}

	// 获取 本次随访日期 的属性值
	public LocalDateTime getTHIS_FOLLOWUP_VISIT_DATE() {
		return THIS_FOLLOWUP_VISIT_DATE;
	}

	// 设置 本次随访日期 的属性值
	public void setTHIS_FOLLOWUP_VISIT_DATE(LocalDateTime THIS_FOLLOWUP_VISIT_DATE) {
		this.THIS_FOLLOWUP_VISIT_DATE = THIS_FOLLOWUP_VISIT_DATE;
	}

	// 获取 随访评价结果 的属性值
	public String getVISIT_EVAL_RESULT() {
		return VISIT_EVAL_RESULT;
	}

	// 设置 随访评价结果 的属性值
	public void setVISIT_EVAL_RESULT(String VISIT_EVAL_RESULT) {
		this.VISIT_EVAL_RESULT = VISIT_EVAL_RESULT;
	}

	// 获取 下次随访日期 的属性值
	public LocalDateTime getNEXT_FOLLOWUP_DATE() {
		return NEXT_FOLLOWUP_DATE;
	}

	// 设置 下次随访日期 的属性值
	public void setNEXT_FOLLOWUP_DATE(LocalDateTime NEXT_FOLLOWUP_DATE) {
		this.NEXT_FOLLOWUP_DATE = NEXT_FOLLOWUP_DATE;
	}

	// 获取 随访医师姓名 的属性值
	public String getFOLLOWUP_VISIT_DOCTOR_NAME() {
		return FOLLOWUP_VISIT_DOCTOR_NAME;
	}

	// 设置 随访医师姓名 的属性值
	public void setFOLLOWUP_VISIT_DOCTOR_NAME(String FOLLOWUP_VISIT_DOCTOR_NAME) {
		this.FOLLOWUP_VISIT_DOCTOR_NAME = FOLLOWUP_VISIT_DOCTOR_NAME;
	}

	// 获取 症状名称 的属性值
	public String getSYMPTOM_NAME() {
		return SYMPTOM_NAME;
	}

	// 设置 症状名称 的属性值
	public void setSYMPTOM_NAME(String SYMPTOM_NAME) {
		this.SYMPTOM_NAME = SYMPTOM_NAME;
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
		return "Tb_natmeha_health_diabetes {" + 
				", itemID='" + itemID + '\'' + 
				", PATIENT_ID='" + PATIENT_ID + '\'' + 
				", RESP_DOCTOR_NAME='" + RESP_DOCTOR_NAME + '\'' + 
				", VISIT_WAY='" + VISIT_WAY + '\'' + 
				", THIS_FOLLOWUP_VISIT_DATE='" + THIS_FOLLOWUP_VISIT_DATE + '\'' + 
				", VISIT_EVAL_RESULT='" + VISIT_EVAL_RESULT + '\'' + 
				", NEXT_FOLLOWUP_DATE='" + NEXT_FOLLOWUP_DATE + '\'' + 
				", FOLLOWUP_VISIT_DOCTOR_NAME='" + FOLLOWUP_VISIT_DOCTOR_NAME + '\'' + 
				", SYMPTOM_NAME='" + SYMPTOM_NAME + '\'' + 
				", CREATER='" + CREATER + '\'' + 
				", itemCreateAt='" + itemCreateAt + '\'' + 
				", UPDATER='" + UPDATER + '\'' + 
				", itemUpdateAt='" + itemUpdateAt + '\'' + 
				"}";
	}
}