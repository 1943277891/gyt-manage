package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class Tb_natmeha_hots_coll_ref {
	// itemID ：
	private Long itemID;
	// 唯一标识UUID
	private String itemCode;
	// 热点code（中药常识code）
	private String HOTSPOT_CODE;
	// 用户code
	private String USER_CODE;
	// CREATER ：
	private String CREATER;
	// itemCreateAt ：
	private Timestamp itemCreateAt;
	// UPDATER ：
	private String UPDATER;
	// itemUpdateAt ：
	private Timestamp itemUpdateAt;

	// 无参构造器
	public Tb_natmeha_hots_coll_ref() {
	}

	// 有参构造器，进行属性值的初始化
	public Tb_natmeha_hots_coll_ref(Long itemID, String itemCode, String HOTSPOT_CODE, String USER_CODE, String CREATER, Timestamp itemCreateAt, String UPDATER, Timestamp itemUpdateAt) {
		this.itemID = itemID;
		this.itemCode = itemCode;
		this.HOTSPOT_CODE = HOTSPOT_CODE;
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

	// 获取 热点code（中药常识code） 的属性值
	public String getHOTSPOT_CODE() {
		return HOTSPOT_CODE;
	}

	// 设置 热点code（中药常识code） 的属性值
	public void setHOTSPOT_CODE(String HOTSPOT_CODE) {
		this.HOTSPOT_CODE = HOTSPOT_CODE;
	}

	// 获取 用户code 的属性值
	public String getUSER_CODE() {
		return USER_CODE;
	}

	// 设置 用户code 的属性值
	public void setUSER_CODE(String USER_CODE) {
		this.USER_CODE = USER_CODE;
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

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "Tb_natmeha_hots_coll_ref {" + 
				", itemID='" + itemID + '\'' + 
				", itemCode='" + itemCode + '\'' + 
				", HOTSPOT_CODE='" + HOTSPOT_CODE + '\'' + 
				", USER_CODE='" + USER_CODE + '\'' + 
				", CREATER='" + CREATER + '\'' + 
				", itemCreateAt='" + itemCreateAt + '\'' + 
				", UPDATER='" + UPDATER + '\'' + 
				", itemUpdateAt='" + itemUpdateAt + '\'' + 
				"}";
	}
}