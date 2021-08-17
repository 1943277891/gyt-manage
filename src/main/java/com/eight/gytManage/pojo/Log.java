package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class Log {
	// itemID ：
	private Long itemID;
	// uuid
	private String itemCode;
	// 应用id
	private String APP_CODE;
	// 错误标题
	private String LOG_TITLE;
	// 日志等级
	private String LOG_LEVEL;
	// 创建人
	private String CREATER;
	// itemCreateAt ：
	private Timestamp itemCreateAt;
	// UPDATER ：
	private String UPDATER;
	// 修改时间
	private Timestamp itemUpdateAt;

	// 无参构造器
	public Log() {
	}

	// 有参构造器，进行属性值的初始化
	public Log(Long itemID, String itemCode, String APP_CODE, String LOG_TITLE, String LOG_LEVEL, String CREATER, Timestamp itemCreateAt, String UPDATER, Timestamp itemUpdateAt) {
		this.itemID = itemID;
		this.itemCode = itemCode;
		this.APP_CODE = APP_CODE;
		this.LOG_TITLE = LOG_TITLE;
		this.LOG_LEVEL = LOG_LEVEL;
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

	// 获取 uuid 的属性值
	public String getItemCode() {
		return itemCode;
	}

	// 设置 uuid 的属性值
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	// 获取 应用id 的属性值
	public String getAPP_CODE() {
		return APP_CODE;
	}

	// 设置 应用id 的属性值
	public void setAPP_CODE(String APP_CODE) {
		this.APP_CODE = APP_CODE;
	}

	// 获取 错误标题 的属性值
	public String getLOG_TITLE() {
		return LOG_TITLE;
	}

	// 设置 错误标题 的属性值
	public void setLOG_TITLE(String LOG_TITLE) {
		this.LOG_TITLE = LOG_TITLE;
	}

	// 获取 日志等级 的属性值
	public String getLOG_LEVEL() {
		return LOG_LEVEL;
	}

	// 设置 日志等级 的属性值
	public void setLOG_LEVEL(String LOG_LEVEL) {
		this.LOG_LEVEL = LOG_LEVEL;
	}

	// 获取 创建人 的属性值
	public String getCREATER() {
		return CREATER;
	}

	// 设置 创建人 的属性值
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
		return "Log {" + 
				", itemID='" + itemID + '\'' + 
				", itemCode='" + itemCode + '\'' + 
				", APP_CODE='" + APP_CODE + '\'' + 
				", LOG_TITLE='" + LOG_TITLE + '\'' + 
				", LOG_LEVEL='" + LOG_LEVEL + '\'' + 
				", CREATER='" + CREATER + '\'' + 
				", itemCreateAt='" + itemCreateAt + '\'' + 
				", UPDATER='" + UPDATER + '\'' + 
				", itemUpdateAt='" + itemUpdateAt + '\'' + 
				"}";
	}
}