package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class Tb_natmeha_health_med_chi_manage {
	// itemID ：
	private Long itemID;
	// 姓名
	private String PATIENT_ID;
	// 责任医师姓名
	private Integer IDENTITY_1_SCORE;
	// 随访方式
	private Integer IDENTITY_2_SCORE;
	// 本次随访日期
	private Integer IDENTITY_3_SCORE;
	// 摄盐量分级
	private Integer IDENTITY_4_SCORE;
	// 目标摄盐量分级
	private Integer IDENTITY_5_SCORE;
	// 心理调整评价结果
	private Integer IDENTITY_6_SCORE;
	// 随访遵医行为评价结果
	private Integer IDENTITY_7_SCORE;
	// 下次随访日期
	private Integer IDENTITY_8_SCORE;
	// 随访医师姓名
	private Integer IDENTITY_9_SCORE;
	// 主要体质
	private String BODY_TYPE;
	// 情志调摄指导
	private String GUIDE_FEELING;
	// 饮食调养指导
	private String GUIDE_FOOD;
	// 起居调摄指导
	private String GUIDE_LIFE;
	// 运动保健指导
	private String GUIDE_SPORTS;
	// 穴位保健指导
	private String GUIDE_POINTS;
	// 创建人
	private String CREATER;
	// 创建时间
	private Timestamp itemCreateAt;
	// 修改人
	private String UPDATER;
	// 修改时间
	private Timestamp itemUpdateAt;

	// 无参构造器
	public Tb_natmeha_health_med_chi_manage() {
	}

	// 有参构造器，进行属性值的初始化
	public Tb_natmeha_health_med_chi_manage(Long itemID, String PATIENT_ID, Integer IDENTITY_1_SCORE, Integer IDENTITY_2_SCORE, Integer IDENTITY_3_SCORE, Integer IDENTITY_4_SCORE, Integer IDENTITY_5_SCORE, Integer IDENTITY_6_SCORE, Integer IDENTITY_7_SCORE, Integer IDENTITY_8_SCORE, Integer IDENTITY_9_SCORE, String BODY_TYPE, String GUIDE_FEELING, String GUIDE_FOOD, String GUIDE_LIFE, String GUIDE_SPORTS, String GUIDE_POINTS, String CREATER, Timestamp itemCreateAt, String UPDATER, Timestamp itemUpdateAt) {
		this.itemID = itemID;
		this.PATIENT_ID = PATIENT_ID;
		this.IDENTITY_1_SCORE = IDENTITY_1_SCORE;
		this.IDENTITY_2_SCORE = IDENTITY_2_SCORE;
		this.IDENTITY_3_SCORE = IDENTITY_3_SCORE;
		this.IDENTITY_4_SCORE = IDENTITY_4_SCORE;
		this.IDENTITY_5_SCORE = IDENTITY_5_SCORE;
		this.IDENTITY_6_SCORE = IDENTITY_6_SCORE;
		this.IDENTITY_7_SCORE = IDENTITY_7_SCORE;
		this.IDENTITY_8_SCORE = IDENTITY_8_SCORE;
		this.IDENTITY_9_SCORE = IDENTITY_9_SCORE;
		this.BODY_TYPE = BODY_TYPE;
		this.GUIDE_FEELING = GUIDE_FEELING;
		this.GUIDE_FOOD = GUIDE_FOOD;
		this.GUIDE_LIFE = GUIDE_LIFE;
		this.GUIDE_SPORTS = GUIDE_SPORTS;
		this.GUIDE_POINTS = GUIDE_POINTS;
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

	// 获取 姓名 的属性值
	public String getPATIENT_ID() {
		return PATIENT_ID;
	}

	// 设置 姓名 的属性值
	public void setPATIENT_ID(String PATIENT_ID) {
		this.PATIENT_ID = PATIENT_ID;
	}

	// 获取 责任医师姓名 的属性值
	public Integer getIDENTITY_1_SCORE() {
		return IDENTITY_1_SCORE;
	}

	// 设置 责任医师姓名 的属性值
	public void setIDENTITY_1_SCORE(Integer IDENTITY_1_SCORE) {
		this.IDENTITY_1_SCORE = IDENTITY_1_SCORE;
	}

	// 获取 随访方式 的属性值
	public Integer getIDENTITY_2_SCORE() {
		return IDENTITY_2_SCORE;
	}

	// 设置 随访方式 的属性值
	public void setIDENTITY_2_SCORE(Integer IDENTITY_2_SCORE) {
		this.IDENTITY_2_SCORE = IDENTITY_2_SCORE;
	}

	// 获取 本次随访日期 的属性值
	public Integer getIDENTITY_3_SCORE() {
		return IDENTITY_3_SCORE;
	}

	// 设置 本次随访日期 的属性值
	public void setIDENTITY_3_SCORE(Integer IDENTITY_3_SCORE) {
		this.IDENTITY_3_SCORE = IDENTITY_3_SCORE;
	}

	// 获取 摄盐量分级 的属性值
	public Integer getIDENTITY_4_SCORE() {
		return IDENTITY_4_SCORE;
	}

	// 设置 摄盐量分级 的属性值
	public void setIDENTITY_4_SCORE(Integer IDENTITY_4_SCORE) {
		this.IDENTITY_4_SCORE = IDENTITY_4_SCORE;
	}

	// 获取 目标摄盐量分级 的属性值
	public Integer getIDENTITY_5_SCORE() {
		return IDENTITY_5_SCORE;
	}

	// 设置 目标摄盐量分级 的属性值
	public void setIDENTITY_5_SCORE(Integer IDENTITY_5_SCORE) {
		this.IDENTITY_5_SCORE = IDENTITY_5_SCORE;
	}

	// 获取 心理调整评价结果 的属性值
	public Integer getIDENTITY_6_SCORE() {
		return IDENTITY_6_SCORE;
	}

	// 设置 心理调整评价结果 的属性值
	public void setIDENTITY_6_SCORE(Integer IDENTITY_6_SCORE) {
		this.IDENTITY_6_SCORE = IDENTITY_6_SCORE;
	}

	// 获取 随访遵医行为评价结果 的属性值
	public Integer getIDENTITY_7_SCORE() {
		return IDENTITY_7_SCORE;
	}

	// 设置 随访遵医行为评价结果 的属性值
	public void setIDENTITY_7_SCORE(Integer IDENTITY_7_SCORE) {
		this.IDENTITY_7_SCORE = IDENTITY_7_SCORE;
	}

	// 获取 下次随访日期 的属性值
	public Integer getIDENTITY_8_SCORE() {
		return IDENTITY_8_SCORE;
	}

	// 设置 下次随访日期 的属性值
	public void setIDENTITY_8_SCORE(Integer IDENTITY_8_SCORE) {
		this.IDENTITY_8_SCORE = IDENTITY_8_SCORE;
	}

	// 获取 随访医师姓名 的属性值
	public Integer getIDENTITY_9_SCORE() {
		return IDENTITY_9_SCORE;
	}

	// 设置 随访医师姓名 的属性值
	public void setIDENTITY_9_SCORE(Integer IDENTITY_9_SCORE) {
		this.IDENTITY_9_SCORE = IDENTITY_9_SCORE;
	}

	// 获取 主要体质 的属性值
	public String getBODY_TYPE() {
		return BODY_TYPE;
	}

	// 设置 主要体质 的属性值
	public void setBODY_TYPE(String BODY_TYPE) {
		this.BODY_TYPE = BODY_TYPE;
	}

	// 获取 情志调摄指导 的属性值
	public String getGUIDE_FEELING() {
		return GUIDE_FEELING;
	}

	// 设置 情志调摄指导 的属性值
	public void setGUIDE_FEELING(String GUIDE_FEELING) {
		this.GUIDE_FEELING = GUIDE_FEELING;
	}

	// 获取 饮食调养指导 的属性值
	public String getGUIDE_FOOD() {
		return GUIDE_FOOD;
	}

	// 设置 饮食调养指导 的属性值
	public void setGUIDE_FOOD(String GUIDE_FOOD) {
		this.GUIDE_FOOD = GUIDE_FOOD;
	}

	// 获取 起居调摄指导 的属性值
	public String getGUIDE_LIFE() {
		return GUIDE_LIFE;
	}

	// 设置 起居调摄指导 的属性值
	public void setGUIDE_LIFE(String GUIDE_LIFE) {
		this.GUIDE_LIFE = GUIDE_LIFE;
	}

	// 获取 运动保健指导 的属性值
	public String getGUIDE_SPORTS() {
		return GUIDE_SPORTS;
	}

	// 设置 运动保健指导 的属性值
	public void setGUIDE_SPORTS(String GUIDE_SPORTS) {
		this.GUIDE_SPORTS = GUIDE_SPORTS;
	}

	// 获取 穴位保健指导 的属性值
	public String getGUIDE_POINTS() {
		return GUIDE_POINTS;
	}

	// 设置 穴位保健指导 的属性值
	public void setGUIDE_POINTS(String GUIDE_POINTS) {
		this.GUIDE_POINTS = GUIDE_POINTS;
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
		return "Tb_natmeha_health_med_chi_manage {" + 
				", itemID='" + itemID + '\'' + 
				", PATIENT_ID='" + PATIENT_ID + '\'' + 
				", IDENTITY_1_SCORE='" + IDENTITY_1_SCORE + '\'' + 
				", IDENTITY_2_SCORE='" + IDENTITY_2_SCORE + '\'' + 
				", IDENTITY_3_SCORE='" + IDENTITY_3_SCORE + '\'' + 
				", IDENTITY_4_SCORE='" + IDENTITY_4_SCORE + '\'' + 
				", IDENTITY_5_SCORE='" + IDENTITY_5_SCORE + '\'' + 
				", IDENTITY_6_SCORE='" + IDENTITY_6_SCORE + '\'' + 
				", IDENTITY_7_SCORE='" + IDENTITY_7_SCORE + '\'' + 
				", IDENTITY_8_SCORE='" + IDENTITY_8_SCORE + '\'' + 
				", IDENTITY_9_SCORE='" + IDENTITY_9_SCORE + '\'' + 
				", BODY_TYPE='" + BODY_TYPE + '\'' + 
				", GUIDE_FEELING='" + GUIDE_FEELING + '\'' + 
				", GUIDE_FOOD='" + GUIDE_FOOD + '\'' + 
				", GUIDE_LIFE='" + GUIDE_LIFE + '\'' + 
				", GUIDE_SPORTS='" + GUIDE_SPORTS + '\'' + 
				", GUIDE_POINTS='" + GUIDE_POINTS + '\'' + 
				", CREATER='" + CREATER + '\'' + 
				", itemCreateAt='" + itemCreateAt + '\'' + 
				", UPDATER='" + UPDATER + '\'' + 
				", itemUpdateAt='" + itemUpdateAt + '\'' + 
				"}";
	}
}