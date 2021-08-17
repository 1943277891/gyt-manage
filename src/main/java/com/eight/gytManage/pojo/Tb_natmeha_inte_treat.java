package com.eight.gytManage.pojo;


import java.sql.Date;
import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class Tb_natmeha_inte_treat {
	// itemID ：
	private Long itemID;
	// 唯一标识UUID
	private String itemCode;
	// 性别
	private String GENDER;
	// 证件号码
	private Date BIRTH;
	// 不适部位
	private String DISCOMFORT_SITE;
	// 不适症状
	private String SYMPTOM;
	// 辅助描述症状
	private String DESCRIBE;
	// 处于节点位置
	private String POSITION;
	// 节点是否完成
	private String STATUS;
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
	public Tb_natmeha_inte_treat() {
	}

	// 有参构造器，进行属性值的初始化
	public Tb_natmeha_inte_treat(Long itemID, String itemCode, String GENDER, Date BIRTH, String DISCOMFORT_SITE, String SYMPTOM, String DESCRIBE, String POSITION, String STATUS, String USER_CODE, String CREATER, Timestamp itemCreateAt, String UPDATER, Timestamp itemUpdateAt) {
		this.itemID = itemID;
		this.itemCode = itemCode;
		this.GENDER = GENDER;
		this.BIRTH = BIRTH;
		this.DISCOMFORT_SITE = DISCOMFORT_SITE;
		this.SYMPTOM = SYMPTOM;
		this.DESCRIBE = DESCRIBE;
		this.POSITION = POSITION;
		this.STATUS = STATUS;
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

	// 获取 性别 的属性值
	public String getGENDER() {
		return GENDER;
	}

	// 设置 性别 的属性值
	public void setGENDER(String GENDER) {
		this.GENDER = GENDER;
	}

	// 获取 证件号码 的属性值
	public Date getBIRTH() {
		return BIRTH;
	}

	// 设置 证件号码 的属性值
	public void setBIRTH(Date BIRTH) {
		this.BIRTH = BIRTH;
	}

	// 获取 不适部位 的属性值
	public String getDISCOMFORT_SITE() {
		return DISCOMFORT_SITE;
	}

	// 设置 不适部位 的属性值
	public void setDISCOMFORT_SITE(String DISCOMFORT_SITE) {
		this.DISCOMFORT_SITE = DISCOMFORT_SITE;
	}

	// 获取 不适症状 的属性值
	public String getSYMPTOM() {
		return SYMPTOM;
	}

	// 设置 不适症状 的属性值
	public void setSYMPTOM(String SYMPTOM) {
		this.SYMPTOM = SYMPTOM;
	}

	// 获取 辅助描述症状 的属性值
	public String getDESCRIBE() {
		return DESCRIBE;
	}

	// 设置 辅助描述症状 的属性值
	public void setDESCRIBE(String DESCRIBE) {
		this.DESCRIBE = DESCRIBE;
	}

	// 获取 处于节点位置 的属性值
	public String getPOSITION() {
		return POSITION;
	}

	// 设置 处于节点位置 的属性值
	public void setPOSITION(String POSITION) {
		this.POSITION = POSITION;
	}

	// 获取 节点是否完成 的属性值
	public String getSTATUS() {
		return STATUS;
	}

	// 设置 节点是否完成 的属性值
	public void setSTATUS(String STATUS) {
		this.STATUS = STATUS;
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
		return "Tb_natmeha_inte_treat {" + 
				", itemID='" + itemID + '\'' + 
				", itemCode='" + itemCode + '\'' + 
				", GENDER='" + GENDER + '\'' + 
				", BIRTH='" + BIRTH + '\'' + 
				", DISCOMFORT_SITE='" + DISCOMFORT_SITE + '\'' + 
				", SYMPTOM='" + SYMPTOM + '\'' + 
				", DESCRIBE='" + DESCRIBE + '\'' + 
				", POSITION='" + POSITION + '\'' + 
				", STATUS='" + STATUS + '\'' + 
				", USER_CODE='" + USER_CODE + '\'' + 
				", CREATER='" + CREATER + '\'' + 
				", itemCreateAt='" + itemCreateAt + '\'' + 
				", UPDATER='" + UPDATER + '\'' + 
				", itemUpdateAt='" + itemUpdateAt + '\'' + 
				"}";
	}
}