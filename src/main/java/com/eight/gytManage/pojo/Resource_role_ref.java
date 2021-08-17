package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class Resource_role_ref {
	// 自增id
	private Long itemID;
	// 唯一标识UUID
	private String itemCode;
	// RESOURCE_CODE ：
	private String RESOURCE_CODE;
	// ROLE_CODE ：
	private String ROLE_CODE;
	// CREATER ：
	private String CREATER;
	// itemCreateAt ：
	private Timestamp itemCreateAt;
	// UPDATER ：
	private String UPDATER;
	// itemUpdateAt ：
	private Timestamp itemUpdateAt;

	// 无参构造器
	public Resource_role_ref() {
	}

	// 有参构造器，进行属性值的初始化
	public Resource_role_ref(Long itemID, String itemCode, String RESOURCE_CODE, String ROLE_CODE, String CREATER, Timestamp itemCreateAt, String UPDATER, Timestamp itemUpdateAt) {
		this.itemID = itemID;
		this.itemCode = itemCode;
		this.RESOURCE_CODE = RESOURCE_CODE;
		this.ROLE_CODE = ROLE_CODE;
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

	// 获取 唯一标识UUID 的属性值
	public String getItemCode() {
		return itemCode;
	}

	// 设置 唯一标识UUID 的属性值
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	// 获取 RESOURCE_CODE 的属性值
	public String getRESOURCE_CODE() {
		return RESOURCE_CODE;
	}

	// 设置 RESOURCE_CODE 的属性值
	public void setRESOURCE_CODE(String RESOURCE_CODE) {
		this.RESOURCE_CODE = RESOURCE_CODE;
	}

	// 获取 ROLE_CODE 的属性值
	public String getROLE_CODE() {
		return ROLE_CODE;
	}

	// 设置 ROLE_CODE 的属性值
	public void setROLE_CODE(String ROLE_CODE) {
		this.ROLE_CODE = ROLE_CODE;
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
		return "Resource_role_ref {" + 
				", itemID='" + itemID + '\'' + 
				", itemCode='" + itemCode + '\'' + 
				", RESOURCE_CODE='" + RESOURCE_CODE + '\'' + 
				", ROLE_CODE='" + ROLE_CODE + '\'' + 
				", CREATER='" + CREATER + '\'' + 
				", itemCreateAt='" + itemCreateAt + '\'' + 
				", UPDATER='" + UPDATER + '\'' + 
				", itemUpdateAt='" + itemUpdateAt + '\'' + 
				"}";
	}
}