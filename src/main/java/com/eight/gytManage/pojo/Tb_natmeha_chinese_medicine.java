package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class Tb_natmeha_chinese_medicine {
	// itemID ：
	private Long itemID;
	// 唯一标识UUID
	private String itemCode;
	// 中药材名称
	private String NAME;
	// 别名
	private String ALIAS;
	// 功效分类
	private String CLASSIFICATION;
	// 采制
	private String HARVESTING;
	// 性味
	private String TASTE;
	// 归经
	private String MER_TROPISM;
	// 主治
	private String GOVERNANCE;
	// 用法用量
	private String USAGE;
	// 数据状态
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
	public Tb_natmeha_chinese_medicine() {
	}

	// 有参构造器，进行属性值的初始化
	public Tb_natmeha_chinese_medicine(Long itemID, String itemCode, String NAME, String ALIAS, String CLASSIFICATION, String HARVESTING, String TASTE, String MER_TROPISM, String GOVERNANCE, String USAGE, String STATUS, String USER_CODE, String CREATER, Timestamp itemCreateAt, String UPDATER, Timestamp itemUpdateAt) {
		this.itemID = itemID;
		this.itemCode = itemCode;
		this.NAME = NAME;
		this.ALIAS = ALIAS;
		this.CLASSIFICATION = CLASSIFICATION;
		this.HARVESTING = HARVESTING;
		this.TASTE = TASTE;
		this.MER_TROPISM = MER_TROPISM;
		this.GOVERNANCE = GOVERNANCE;
		this.USAGE = USAGE;
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

	// 获取 中药材名称 的属性值
	public String getNAME() {
		return NAME;
	}

	// 设置 中药材名称 的属性值
	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	// 获取 别名 的属性值
	public String getALIAS() {
		return ALIAS;
	}

	// 设置 别名 的属性值
	public void setALIAS(String ALIAS) {
		this.ALIAS = ALIAS;
	}

	// 获取 功效分类 的属性值
	public String getCLASSIFICATION() {
		return CLASSIFICATION;
	}

	// 设置 功效分类 的属性值
	public void setCLASSIFICATION(String CLASSIFICATION) {
		this.CLASSIFICATION = CLASSIFICATION;
	}

	// 获取 采制 的属性值
	public String getHARVESTING() {
		return HARVESTING;
	}

	// 设置 采制 的属性值
	public void setHARVESTING(String HARVESTING) {
		this.HARVESTING = HARVESTING;
	}

	// 获取 性味 的属性值
	public String getTASTE() {
		return TASTE;
	}

	// 设置 性味 的属性值
	public void setTASTE(String TASTE) {
		this.TASTE = TASTE;
	}

	// 获取 归经 的属性值
	public String getMER_TROPISM() {
		return MER_TROPISM;
	}

	// 设置 归经 的属性值
	public void setMER_TROPISM(String MER_TROPISM) {
		this.MER_TROPISM = MER_TROPISM;
	}

	// 获取 主治 的属性值
	public String getGOVERNANCE() {
		return GOVERNANCE;
	}

	// 设置 主治 的属性值
	public void setGOVERNANCE(String GOVERNANCE) {
		this.GOVERNANCE = GOVERNANCE;
	}

	// 获取 用法用量 的属性值
	public String getUSAGE() {
		return USAGE;
	}

	// 设置 用法用量 的属性值
	public void setUSAGE(String USAGE) {
		this.USAGE = USAGE;
	}

	// 获取 数据状态 的属性值
	public String getSTATUS() {
		return STATUS;
	}

	// 设置 数据状态 的属性值
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
		return "Tb_natmeha_chinese_medicine {" + 
				", itemID='" + itemID + '\'' + 
				", itemCode='" + itemCode + '\'' + 
				", NAME='" + NAME + '\'' + 
				", ALIAS='" + ALIAS + '\'' + 
				", CLASSIFICATION='" + CLASSIFICATION + '\'' + 
				", HARVESTING='" + HARVESTING + '\'' + 
				", TASTE='" + TASTE + '\'' + 
				", MER_TROPISM='" + MER_TROPISM + '\'' + 
				", GOVERNANCE='" + GOVERNANCE + '\'' + 
				", USAGE='" + USAGE + '\'' + 
				", STATUS='" + STATUS + '\'' + 
				", USER_CODE='" + USER_CODE + '\'' + 
				", CREATER='" + CREATER + '\'' + 
				", itemCreateAt='" + itemCreateAt + '\'' + 
				", UPDATER='" + UPDATER + '\'' + 
				", itemUpdateAt='" + itemUpdateAt + '\'' + 
				"}";
	}
}