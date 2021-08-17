package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class Tb_natmeha_hotspot {
	// 自增id
	private Long itemID;
	// UUID
	private String itemCode;
	// 热点名称
	private String HOTSPOT_TITLE;
	// 介绍
	private String HOTSPOT_CONTENT;
	// 数据状态
	private String DATA_STATUS;
	// 数据类型(用来区分处中药常识以外几项）
	private String DATA_TYPE;
	// USER_CODE ：
	private String USER_CODE;
	// 创建者
	private String CREATER;
	// 创建时间
	private Timestamp itemCreateAt;
	// 修改人
	private String UPDATER;
	// 修改时间
	private Timestamp itemUpdateAt;

	// 无参构造器
	public Tb_natmeha_hotspot() {
	}

	// 有参构造器，进行属性值的初始化
	public Tb_natmeha_hotspot(Long itemID, String itemCode, String HOTSPOT_TITLE, String HOTSPOT_CONTENT, String DATA_STATUS, String DATA_TYPE, String USER_CODE, String CREATER, Timestamp itemCreateAt, String UPDATER, Timestamp itemUpdateAt) {
		this.itemID = itemID;
		this.itemCode = itemCode;
		this.HOTSPOT_TITLE = HOTSPOT_TITLE;
		this.HOTSPOT_CONTENT = HOTSPOT_CONTENT;
		this.DATA_STATUS = DATA_STATUS;
		this.DATA_TYPE = DATA_TYPE;
		this.USER_CODE = USER_CODE;
		this.CREATER = CREATER;
		this.itemCreateAt = itemCreateAt;
		this.UPDATER = UPDATER;
		this.itemUpdateAt = itemUpdateAt;
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

	// 获取 热点名称 的属性值
	public String getHOTSPOT_TITLE() {
		return HOTSPOT_TITLE;
	}

	// 设置 热点名称 的属性值
	public void setHOTSPOT_TITLE(String HOTSPOT_TITLE) {
		this.HOTSPOT_TITLE = HOTSPOT_TITLE;
	}

	// 获取 介绍 的属性值
	public String getHOTSPOT_CONTENT() {
		return HOTSPOT_CONTENT;
	}

	// 设置 介绍 的属性值
	public void setHOTSPOT_CONTENT(String HOTSPOT_CONTENT) {
		this.HOTSPOT_CONTENT = HOTSPOT_CONTENT;
	}

	// 获取 数据状态 的属性值
	public String getDATA_STATUS() {
		return DATA_STATUS;
	}

	// 设置 数据状态 的属性值
	public void setDATA_STATUS(String DATA_STATUS) {
		this.DATA_STATUS = DATA_STATUS;
	}

	// 获取 数据类型(用来区分处中药常识以外几项） 的属性值
	public String getDATA_TYPE() {
		return DATA_TYPE;
	}

	// 设置 数据类型(用来区分处中药常识以外几项） 的属性值
	public void setDATA_TYPE(String DATA_TYPE) {
		this.DATA_TYPE = DATA_TYPE;
	}

	// 获取 USER_CODE 的属性值
	public String getUSER_CODE() {
		return USER_CODE;
	}

	// 设置 USER_CODE 的属性值
	public void setUSER_CODE(String USER_CODE) {
		this.USER_CODE = USER_CODE;
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

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "Tb_natmeha_hotspot {" + 
				", itemID='" + itemID + '\'' + 
				", itemCode='" + itemCode + '\'' + 
				", HOTSPOT_TITLE='" + HOTSPOT_TITLE + '\'' + 
				", HOTSPOT_CONTENT='" + HOTSPOT_CONTENT + '\'' + 
				", DATA_STATUS='" + DATA_STATUS + '\'' + 
				", DATA_TYPE='" + DATA_TYPE + '\'' + 
				", USER_CODE='" + USER_CODE + '\'' + 
				", CREATER='" + CREATER + '\'' + 
				", itemCreateAt='" + itemCreateAt + '\'' + 
				", UPDATER='" + UPDATER + '\'' + 
				", itemUpdateAt='" + itemUpdateAt + '\'' + 
				"}";
	}
}