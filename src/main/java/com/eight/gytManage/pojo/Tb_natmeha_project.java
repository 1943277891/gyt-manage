package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class Tb_natmeha_project {
	// 自增id
	private Long itemID;
	// UUID
	private String itemCode;
	// 开展项目、功效特色名称
	private String NAME;
	// 项目、功效特色简介
	private String CONTENT;
	// 数据区分
	private String DATA_TYPE;
	// 功效特色价格
	private Integer PRICE;
	// 数据状态
	private String DATA_STATUS;
	// USER_CODE ：
	private String USER_CODE;
	// 浏览次数
	private Integer VISIT_NUM;
	// 创建者
	private String CREATER;
	// 创建时间
	private Timestamp itemCreateAt;
	// 修改人
	private String UPDATER;
	// 修改时间
	private Timestamp itemUpdateAt;
	// 评分
	private Double PROJECT_SORCE;

	// 无参构造器
	public Tb_natmeha_project() {
	}

	// 有参构造器，进行属性值的初始化
	public Tb_natmeha_project(Long itemID, String itemCode, String NAME, String CONTENT, String DATA_TYPE, Integer PRICE, String DATA_STATUS, String USER_CODE, Integer VISIT_NUM, String CREATER, Timestamp itemCreateAt, String UPDATER, Timestamp itemUpdateAt, Double PROJECT_SORCE) {
		this.itemID = itemID;
		this.itemCode = itemCode;
		this.NAME = NAME;
		this.CONTENT = CONTENT;
		this.DATA_TYPE = DATA_TYPE;
		this.PRICE = PRICE;
		this.DATA_STATUS = DATA_STATUS;
		this.USER_CODE = USER_CODE;
		this.VISIT_NUM = VISIT_NUM;
		this.CREATER = CREATER;
		this.itemCreateAt = itemCreateAt;
		this.UPDATER = UPDATER;
		this.itemUpdateAt = itemUpdateAt;
		this.PROJECT_SORCE = PROJECT_SORCE;
	}

	// 获取 自增id 的属性值
	public Long getItemID() {
		return itemID;
	}

	// 设置 自增id 的属性值
	public void setItemID(Long itemID) {
		this.itemID = itemID;
	}

	// 获取 UUID 的属性值
	public String getItemCode() {
		return itemCode;
	}

	// 设置 UUID 的属性值
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	// 获取 开展项目、功效特色名称 的属性值
	public String getNAME() {
		return NAME;
	}

	// 设置 开展项目、功效特色名称 的属性值
	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	// 获取 项目、功效特色简介 的属性值
	public String getCONTENT() {
		return CONTENT;
	}

	// 设置 项目、功效特色简介 的属性值
	public void setCONTENT(String CONTENT) {
		this.CONTENT = CONTENT;
	}

	// 获取 数据区分 的属性值
	public String getDATA_TYPE() {
		return DATA_TYPE;
	}

	// 设置 数据区分 的属性值
	public void setDATA_TYPE(String DATA_TYPE) {
		this.DATA_TYPE = DATA_TYPE;
	}

	// 获取 功效特色价格 的属性值
	public Integer getPRICE() {
		return PRICE;
	}

	// 设置 功效特色价格 的属性值
	public void setPRICE(Integer PRICE) {
		this.PRICE = PRICE;
	}

	// 获取 数据状态 的属性值
	public String getDATA_STATUS() {
		return DATA_STATUS;
	}

	// 设置 数据状态 的属性值
	public void setDATA_STATUS(String DATA_STATUS) {
		this.DATA_STATUS = DATA_STATUS;
	}

	// 获取 USER_CODE 的属性值
	public String getUSER_CODE() {
		return USER_CODE;
	}

	// 设置 USER_CODE 的属性值
	public void setUSER_CODE(String USER_CODE) {
		this.USER_CODE = USER_CODE;
	}

	// 获取 浏览次数 的属性值
	public Integer getVISIT_NUM() {
		return VISIT_NUM;
	}

	// 设置 浏览次数 的属性值
	public void setVISIT_NUM(Integer VISIT_NUM) {
		this.VISIT_NUM = VISIT_NUM;
	}

	// 获取 创建者 的属性值
	public String getCREATER() {
		return CREATER;
	}

	// 设置 创建者 的属性值
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

	// 获取 评分 的属性值
	public Double getPROJECT_SORCE() {
		return PROJECT_SORCE;
	}

	// 设置 评分 的属性值
	public void setPROJECT_SORCE(Double PROJECT_SORCE) {
		this.PROJECT_SORCE = PROJECT_SORCE;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "Tb_natmeha_project {" + 
				", itemID='" + itemID + '\'' + 
				", itemCode='" + itemCode + '\'' + 
				", NAME='" + NAME + '\'' + 
				", CONTENT='" + CONTENT + '\'' + 
				", DATA_TYPE='" + DATA_TYPE + '\'' + 
				", PRICE='" + PRICE + '\'' + 
				", DATA_STATUS='" + DATA_STATUS + '\'' + 
				", USER_CODE='" + USER_CODE + '\'' + 
				", VISIT_NUM='" + VISIT_NUM + '\'' + 
				", CREATER='" + CREATER + '\'' + 
				", itemCreateAt='" + itemCreateAt + '\'' + 
				", UPDATER='" + UPDATER + '\'' + 
				", itemUpdateAt='" + itemUpdateAt + '\'' + 
				", PROJECT_SORCE='" + PROJECT_SORCE + '\'' + 
				"}";
	}
}