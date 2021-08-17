package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class User_role_ref {
	// itemID ：
	private Long itemID;
	// 唯一标识UUID
	private String itemCode;
	// 关联user表itemCode字段
	private String USER_CODE;
	// 应用系统code
	private String APP_CODE;
	// 关联role表itemCode字段（应用系统角色）
	private String ROLE_CODE;
	// 平台角色
	private String PLAT_ROLE;
	// 创建人
	private String CREATER;
	// 创建时间
	private Timestamp itemCreateAt;
	// 修改人
	private String UPDATER;
	// 修改时间
	private Timestamp itemUpdateAt;

	// 无参构造器
	public User_role_ref() {
	}

	// 有参构造器，进行属性值的初始化
	public User_role_ref(Long itemID, String itemCode, String USER_CODE, String APP_CODE, String ROLE_CODE, String PLAT_ROLE, String CREATER, Timestamp itemCreateAt, String UPDATER, Timestamp itemUpdateAt) {
		this.itemID = itemID;
		this.itemCode = itemCode;
		this.USER_CODE = USER_CODE;
		this.APP_CODE = APP_CODE;
		this.ROLE_CODE = ROLE_CODE;
		this.PLAT_ROLE = PLAT_ROLE;
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

	// 获取 关联user表itemCode字段 的属性值
	public String getUSER_CODE() {
		return USER_CODE;
	}

	// 设置 关联user表itemCode字段 的属性值
	public void setUSER_CODE(String USER_CODE) {
		this.USER_CODE = USER_CODE;
	}

	// 获取 应用系统code 的属性值
	public String getAPP_CODE() {
		return APP_CODE;
	}

	// 设置 应用系统code 的属性值
	public void setAPP_CODE(String APP_CODE) {
		this.APP_CODE = APP_CODE;
	}

	// 获取 关联role表itemCode字段（应用系统角色） 的属性值
	public String getROLE_CODE() {
		return ROLE_CODE;
	}

	// 设置 关联role表itemCode字段（应用系统角色） 的属性值
	public void setROLE_CODE(String ROLE_CODE) {
		this.ROLE_CODE = ROLE_CODE;
	}

	// 获取 平台角色 的属性值
	public String getPLAT_ROLE() {
		return PLAT_ROLE;
	}

	// 设置 平台角色 的属性值
	public void setPLAT_ROLE(String PLAT_ROLE) {
		this.PLAT_ROLE = PLAT_ROLE;
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
		return "User_role_ref {" + 
				", itemID='" + itemID + '\'' + 
				", itemCode='" + itemCode + '\'' + 
				", USER_CODE='" + USER_CODE + '\'' + 
				", APP_CODE='" + APP_CODE + '\'' + 
				", ROLE_CODE='" + ROLE_CODE + '\'' + 
				", PLAT_ROLE='" + PLAT_ROLE + '\'' + 
				", CREATER='" + CREATER + '\'' + 
				", itemCreateAt='" + itemCreateAt + '\'' + 
				", UPDATER='" + UPDATER + '\'' + 
				", itemUpdateAt='" + itemUpdateAt + '\'' + 
				"}";
	}
}