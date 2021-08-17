package com.eight.gytManage.pojo;


import java.sql.Timestamp;
import java.time.LocalDateTime;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class Tb_natmeha_med_records {
	// itemID ：
	private Long itemID;
	// CREATER ：
	private String CREATER;
	// itemCreateAt ：
	private Timestamp itemCreateAt;
	// UPDATER ：
	private String UPDATER;
	// itemUpdateAt ：
	private Timestamp itemUpdateAt;
	// 门诊记录表编号
	private String OUTPAT_FORM_NO;
	// 身份证号
	private String IDCARD_NO;
	// 就诊机构名称
	private String VISIT_ORG_NAME;
	// 就诊日期时间
	private LocalDateTime VISIT_DTIME;
	// 健康问题评估
	private String HEALTH_PROBLEM_EVAL;
	// 就诊医师
	private String RESP_DOCTOR_NAME;
	// 门诊诊断名称
	private String OUTPAT_DIAG_NAME;
	// 诊断日期
	private LocalDateTime DIAG_DATE;
	// 入院科室名称
	private String IN_DEPT_NAME;
	// 入院日期时间
	private LocalDateTime IN_DTIME;
	// 出院日期时间
	private LocalDateTime OUT_DTIME;
	// 住院原因
	private String IN_REASON_CODE;
	// 床号
	private String IN_BED;
	// 出院科室名称
	private String OUT_DEPT_NAME;
	// 其他医学处置
	private String OTHER_MEDICAL_TREATMENT;
	// 就诊科室名称
	private String VISIT_DEPT_NAME;

	// 无参构造器
	public Tb_natmeha_med_records() {
	}

	// 有参构造器，进行属性值的初始化
	public Tb_natmeha_med_records(Long itemID, String CREATER, Timestamp itemCreateAt, String UPDATER, Timestamp itemUpdateAt, String OUTPAT_FORM_NO, String IDCARD_NO, String VISIT_ORG_NAME, LocalDateTime VISIT_DTIME, String HEALTH_PROBLEM_EVAL, String RESP_DOCTOR_NAME, String OUTPAT_DIAG_NAME, LocalDateTime DIAG_DATE, String IN_DEPT_NAME, LocalDateTime IN_DTIME, LocalDateTime OUT_DTIME, String IN_REASON_CODE, String IN_BED, String OUT_DEPT_NAME, String OTHER_MEDICAL_TREATMENT, String VISIT_DEPT_NAME) {
		this.itemID = itemID;
		this.CREATER = CREATER;
		this.itemCreateAt = itemCreateAt;
		this.UPDATER = UPDATER;
		this.itemUpdateAt = itemUpdateAt;
		this.OUTPAT_FORM_NO = OUTPAT_FORM_NO;
		this.IDCARD_NO = IDCARD_NO;
		this.VISIT_ORG_NAME = VISIT_ORG_NAME;
		this.VISIT_DTIME = VISIT_DTIME;
		this.HEALTH_PROBLEM_EVAL = HEALTH_PROBLEM_EVAL;
		this.RESP_DOCTOR_NAME = RESP_DOCTOR_NAME;
		this.OUTPAT_DIAG_NAME = OUTPAT_DIAG_NAME;
		this.DIAG_DATE = DIAG_DATE;
		this.IN_DEPT_NAME = IN_DEPT_NAME;
		this.IN_DTIME = IN_DTIME;
		this.OUT_DTIME = OUT_DTIME;
		this.IN_REASON_CODE = IN_REASON_CODE;
		this.IN_BED = IN_BED;
		this.OUT_DEPT_NAME = OUT_DEPT_NAME;
		this.OTHER_MEDICAL_TREATMENT = OTHER_MEDICAL_TREATMENT;
		this.VISIT_DEPT_NAME = VISIT_DEPT_NAME;
	}

	// 获取 itemID 的属性值
	public Long getItemID() {
		return itemID;
	}

	// 设置 itemID 的属性值
	public void setItemID(Long itemID) {
		this.itemID = itemID;
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

	// 获取 门诊记录表编号 的属性值
	public String getOUTPAT_FORM_NO() {
		return OUTPAT_FORM_NO;
	}

	// 设置 门诊记录表编号 的属性值
	public void setOUTPAT_FORM_NO(String OUTPAT_FORM_NO) {
		this.OUTPAT_FORM_NO = OUTPAT_FORM_NO;
	}

	// 获取 身份证号 的属性值
	public String getIDCARD_NO() {
		return IDCARD_NO;
	}

	// 设置 身份证号 的属性值
	public void setIDCARD_NO(String IDCARD_NO) {
		this.IDCARD_NO = IDCARD_NO;
	}

	// 获取 就诊机构名称 的属性值
	public String getVISIT_ORG_NAME() {
		return VISIT_ORG_NAME;
	}

	// 设置 就诊机构名称 的属性值
	public void setVISIT_ORG_NAME(String VISIT_ORG_NAME) {
		this.VISIT_ORG_NAME = VISIT_ORG_NAME;
	}

	// 获取 就诊日期时间 的属性值
	public LocalDateTime getVISIT_DTIME() {
		return VISIT_DTIME;
	}

	// 设置 就诊日期时间 的属性值
	public void setVISIT_DTIME(LocalDateTime VISIT_DTIME) {
		this.VISIT_DTIME = VISIT_DTIME;
	}

	// 获取 健康问题评估 的属性值
	public String getHEALTH_PROBLEM_EVAL() {
		return HEALTH_PROBLEM_EVAL;
	}

	// 设置 健康问题评估 的属性值
	public void setHEALTH_PROBLEM_EVAL(String HEALTH_PROBLEM_EVAL) {
		this.HEALTH_PROBLEM_EVAL = HEALTH_PROBLEM_EVAL;
	}

	// 获取 就诊医师 的属性值
	public String getRESP_DOCTOR_NAME() {
		return RESP_DOCTOR_NAME;
	}

	// 设置 就诊医师 的属性值
	public void setRESP_DOCTOR_NAME(String RESP_DOCTOR_NAME) {
		this.RESP_DOCTOR_NAME = RESP_DOCTOR_NAME;
	}

	// 获取 门诊诊断名称 的属性值
	public String getOUTPAT_DIAG_NAME() {
		return OUTPAT_DIAG_NAME;
	}

	// 设置 门诊诊断名称 的属性值
	public void setOUTPAT_DIAG_NAME(String OUTPAT_DIAG_NAME) {
		this.OUTPAT_DIAG_NAME = OUTPAT_DIAG_NAME;
	}

	// 获取 诊断日期 的属性值
	public LocalDateTime getDIAG_DATE() {
		return DIAG_DATE;
	}

	// 设置 诊断日期 的属性值
	public void setDIAG_DATE(LocalDateTime DIAG_DATE) {
		this.DIAG_DATE = DIAG_DATE;
	}

	// 获取 入院科室名称 的属性值
	public String getIN_DEPT_NAME() {
		return IN_DEPT_NAME;
	}

	// 设置 入院科室名称 的属性值
	public void setIN_DEPT_NAME(String IN_DEPT_NAME) {
		this.IN_DEPT_NAME = IN_DEPT_NAME;
	}

	// 获取 入院日期时间 的属性值
	public LocalDateTime getIN_DTIME() {
		return IN_DTIME;
	}

	// 设置 入院日期时间 的属性值
	public void setIN_DTIME(LocalDateTime IN_DTIME) {
		this.IN_DTIME = IN_DTIME;
	}

	// 获取 出院日期时间 的属性值
	public LocalDateTime getOUT_DTIME() {
		return OUT_DTIME;
	}

	// 设置 出院日期时间 的属性值
	public void setOUT_DTIME(LocalDateTime OUT_DTIME) {
		this.OUT_DTIME = OUT_DTIME;
	}

	// 获取 住院原因 的属性值
	public String getIN_REASON_CODE() {
		return IN_REASON_CODE;
	}

	// 设置 住院原因 的属性值
	public void setIN_REASON_CODE(String IN_REASON_CODE) {
		this.IN_REASON_CODE = IN_REASON_CODE;
	}

	// 获取 床号 的属性值
	public String getIN_BED() {
		return IN_BED;
	}

	// 设置 床号 的属性值
	public void setIN_BED(String IN_BED) {
		this.IN_BED = IN_BED;
	}

	// 获取 出院科室名称 的属性值
	public String getOUT_DEPT_NAME() {
		return OUT_DEPT_NAME;
	}

	// 设置 出院科室名称 的属性值
	public void setOUT_DEPT_NAME(String OUT_DEPT_NAME) {
		this.OUT_DEPT_NAME = OUT_DEPT_NAME;
	}

	// 获取 其他医学处置 的属性值
	public String getOTHER_MEDICAL_TREATMENT() {
		return OTHER_MEDICAL_TREATMENT;
	}

	// 设置 其他医学处置 的属性值
	public void setOTHER_MEDICAL_TREATMENT(String OTHER_MEDICAL_TREATMENT) {
		this.OTHER_MEDICAL_TREATMENT = OTHER_MEDICAL_TREATMENT;
	}

	// 获取 就诊科室名称 的属性值
	public String getVISIT_DEPT_NAME() {
		return VISIT_DEPT_NAME;
	}

	// 设置 就诊科室名称 的属性值
	public void setVISIT_DEPT_NAME(String VISIT_DEPT_NAME) {
		this.VISIT_DEPT_NAME = VISIT_DEPT_NAME;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "Tb_natmeha_med_records {" + 
				", itemID='" + itemID + '\'' + 
				", CREATER='" + CREATER + '\'' + 
				", itemCreateAt='" + itemCreateAt + '\'' + 
				", UPDATER='" + UPDATER + '\'' + 
				", itemUpdateAt='" + itemUpdateAt + '\'' + 
				", OUTPAT_FORM_NO='" + OUTPAT_FORM_NO + '\'' + 
				", IDCARD_NO='" + IDCARD_NO + '\'' + 
				", VISIT_ORG_NAME='" + VISIT_ORG_NAME + '\'' + 
				", VISIT_DTIME='" + VISIT_DTIME + '\'' + 
				", HEALTH_PROBLEM_EVAL='" + HEALTH_PROBLEM_EVAL + '\'' + 
				", RESP_DOCTOR_NAME='" + RESP_DOCTOR_NAME + '\'' + 
				", OUTPAT_DIAG_NAME='" + OUTPAT_DIAG_NAME + '\'' + 
				", DIAG_DATE='" + DIAG_DATE + '\'' + 
				", IN_DEPT_NAME='" + IN_DEPT_NAME + '\'' + 
				", IN_DTIME='" + IN_DTIME + '\'' + 
				", OUT_DTIME='" + OUT_DTIME + '\'' + 
				", IN_REASON_CODE='" + IN_REASON_CODE + '\'' + 
				", IN_BED='" + IN_BED + '\'' + 
				", OUT_DEPT_NAME='" + OUT_DEPT_NAME + '\'' + 
				", OTHER_MEDICAL_TREATMENT='" + OTHER_MEDICAL_TREATMENT + '\'' + 
				", VISIT_DEPT_NAME='" + VISIT_DEPT_NAME + '\'' + 
				"}";
	}
}