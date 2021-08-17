package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class Tb_natmeha_health_postpartum {
	// itemID ：
	private Long itemID;
	// baseinfo中patient_id
	private String PATIENT_ID;
	// 健康状况详细描述
	private String HEALTH_CONDITION_DESCR;
	// 心理状况详细描述
	private String PSYCHOLOGY_CONDITION_DESCR;
	// 伤口愈合状况
	private String WOUND_HEALING;
	// 产妇健康状况评估描述
	private String PUERPERA_HEALTH_EVAL_DESCR;
	// 访视医师姓名
	private String VISIT_DOCTOR_NAME;
	// 孕产妇健康指导类别
	private String PREG_HEALTH_GUIDE;
	// 备注
	private String NOTES;
	// 创建人
	private String CREATER;
	// 创建时间
	private Timestamp itemCreateAt;
	// 修改人
	private String UPDATER;
	// 修改时间
	private Timestamp itemUpdateAt;

	// 无参构造器
	public Tb_natmeha_health_postpartum() {
	}

	// 有参构造器，进行属性值的初始化
	public Tb_natmeha_health_postpartum(Long itemID, String PATIENT_ID, String HEALTH_CONDITION_DESCR, String PSYCHOLOGY_CONDITION_DESCR, String WOUND_HEALING, String PUERPERA_HEALTH_EVAL_DESCR, String VISIT_DOCTOR_NAME, String PREG_HEALTH_GUIDE, String NOTES, String CREATER, Timestamp itemCreateAt, String UPDATER, Timestamp itemUpdateAt) {
		this.itemID = itemID;
		this.PATIENT_ID = PATIENT_ID;
		this.HEALTH_CONDITION_DESCR = HEALTH_CONDITION_DESCR;
		this.PSYCHOLOGY_CONDITION_DESCR = PSYCHOLOGY_CONDITION_DESCR;
		this.WOUND_HEALING = WOUND_HEALING;
		this.PUERPERA_HEALTH_EVAL_DESCR = PUERPERA_HEALTH_EVAL_DESCR;
		this.VISIT_DOCTOR_NAME = VISIT_DOCTOR_NAME;
		this.PREG_HEALTH_GUIDE = PREG_HEALTH_GUIDE;
		this.NOTES = NOTES;
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

	// 获取 baseinfo中patient_id 的属性值
	public String getPATIENT_ID() {
		return PATIENT_ID;
	}

	// 设置 baseinfo中patient_id 的属性值
	public void setPATIENT_ID(String PATIENT_ID) {
		this.PATIENT_ID = PATIENT_ID;
	}

	// 获取 健康状况详细描述 的属性值
	public String getHEALTH_CONDITION_DESCR() {
		return HEALTH_CONDITION_DESCR;
	}

	// 设置 健康状况详细描述 的属性值
	public void setHEALTH_CONDITION_DESCR(String HEALTH_CONDITION_DESCR) {
		this.HEALTH_CONDITION_DESCR = HEALTH_CONDITION_DESCR;
	}

	// 获取 心理状况详细描述 的属性值
	public String getPSYCHOLOGY_CONDITION_DESCR() {
		return PSYCHOLOGY_CONDITION_DESCR;
	}

	// 设置 心理状况详细描述 的属性值
	public void setPSYCHOLOGY_CONDITION_DESCR(String PSYCHOLOGY_CONDITION_DESCR) {
		this.PSYCHOLOGY_CONDITION_DESCR = PSYCHOLOGY_CONDITION_DESCR;
	}

	// 获取 伤口愈合状况 的属性值
	public String getWOUND_HEALING() {
		return WOUND_HEALING;
	}

	// 设置 伤口愈合状况 的属性值
	public void setWOUND_HEALING(String WOUND_HEALING) {
		this.WOUND_HEALING = WOUND_HEALING;
	}

	// 获取 产妇健康状况评估描述 的属性值
	public String getPUERPERA_HEALTH_EVAL_DESCR() {
		return PUERPERA_HEALTH_EVAL_DESCR;
	}

	// 设置 产妇健康状况评估描述 的属性值
	public void setPUERPERA_HEALTH_EVAL_DESCR(String PUERPERA_HEALTH_EVAL_DESCR) {
		this.PUERPERA_HEALTH_EVAL_DESCR = PUERPERA_HEALTH_EVAL_DESCR;
	}

	// 获取 访视医师姓名 的属性值
	public String getVISIT_DOCTOR_NAME() {
		return VISIT_DOCTOR_NAME;
	}

	// 设置 访视医师姓名 的属性值
	public void setVISIT_DOCTOR_NAME(String VISIT_DOCTOR_NAME) {
		this.VISIT_DOCTOR_NAME = VISIT_DOCTOR_NAME;
	}

	// 获取 孕产妇健康指导类别 的属性值
	public String getPREG_HEALTH_GUIDE() {
		return PREG_HEALTH_GUIDE;
	}

	// 设置 孕产妇健康指导类别 的属性值
	public void setPREG_HEALTH_GUIDE(String PREG_HEALTH_GUIDE) {
		this.PREG_HEALTH_GUIDE = PREG_HEALTH_GUIDE;
	}

	// 获取 备注 的属性值
	public String getNOTES() {
		return NOTES;
	}

	// 设置 备注 的属性值
	public void setNOTES(String NOTES) {
		this.NOTES = NOTES;
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
		return "Tb_natmeha_health_postpartum {" + 
				", itemID='" + itemID + '\'' + 
				", PATIENT_ID='" + PATIENT_ID + '\'' + 
				", HEALTH_CONDITION_DESCR='" + HEALTH_CONDITION_DESCR + '\'' + 
				", PSYCHOLOGY_CONDITION_DESCR='" + PSYCHOLOGY_CONDITION_DESCR + '\'' + 
				", WOUND_HEALING='" + WOUND_HEALING + '\'' + 
				", PUERPERA_HEALTH_EVAL_DESCR='" + PUERPERA_HEALTH_EVAL_DESCR + '\'' + 
				", VISIT_DOCTOR_NAME='" + VISIT_DOCTOR_NAME + '\'' + 
				", PREG_HEALTH_GUIDE='" + PREG_HEALTH_GUIDE + '\'' + 
				", NOTES='" + NOTES + '\'' + 
				", CREATER='" + CREATER + '\'' + 
				", itemCreateAt='" + itemCreateAt + '\'' + 
				", UPDATER='" + UPDATER + '\'' + 
				", itemUpdateAt='" + itemUpdateAt + '\'' + 
				"}";
	}
}