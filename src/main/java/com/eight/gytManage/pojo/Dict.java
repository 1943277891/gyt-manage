package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class Dict {
	// 自增id
	private Long itemID;
	// 唯一标识UUID
	private String itemCode;
	// 字典名称
	private String DICT_NAME;
	// 字典编码
	private String DICT_CODE;
	// DICT_ISTREE ：
	private String DICT_ISTREE;
	// 描述
	private String DICT_DESCRIPTION;
	// 创建人
	private String CREATER;
	// 创建时间
	private Timestamp itemCreateAt;
	// 修改人
	private String UPDATER;
	// 修改时间
	private Timestamp itemUpdateAt;

	// 无参构造器
	public Dict() {
	}

	// 有参构造器，进行属性值的初始化
	public Dict(Long itemID, String itemCode, String DICT_NAME, String DICT_CODE, String DICT_ISTREE, String DICT_DESCRIPTION, String CREATER, Timestamp itemCreateAt, String UPDATER, Timestamp itemUpdateAt) {
		this.itemID = itemID;
		this.itemCode = itemCode;
		this.DICT_NAME = DICT_NAME;
		this.DICT_CODE = DICT_CODE;
		this.DICT_ISTREE = DICT_ISTREE;
		this.DICT_DESCRIPTION = DICT_DESCRIPTION;
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

	// 获取 字典名称 的属性值
	public String getDICT_NAME() {
		return DICT_NAME;
	}

	// 设置 字典名称 的属性值
	public void setDICT_NAME(String DICT_NAME) {
		this.DICT_NAME = DICT_NAME;
	}

	// 获取 字典编码 的属性值
	public String getDICT_CODE() {
		return DICT_CODE;
	}

	// 设置 字典编码 的属性值
	public void setDICT_CODE(String DICT_CODE) {
		this.DICT_CODE = DICT_CODE;
	}

	// 获取 DICT_ISTREE 的属性值
	public String getDICT_ISTREE() {
		return DICT_ISTREE;
	}

	// 设置 DICT_ISTREE 的属性值
	public void setDICT_ISTREE(String DICT_ISTREE) {
		this.DICT_ISTREE = DICT_ISTREE;
	}

	// 获取 描述 的属性值
	public String getDICT_DESCRIPTION() {
		return DICT_DESCRIPTION;
	}

	// 设置 描述 的属性值
	public void setDICT_DESCRIPTION(String DICT_DESCRIPTION) {
		this.DICT_DESCRIPTION = DICT_DESCRIPTION;
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
		return "Dict {" + 
				", itemID='" + itemID + '\'' + 
				", itemCode='" + itemCode + '\'' + 
				", DICT_NAME='" + DICT_NAME + '\'' + 
				", DICT_CODE='" + DICT_CODE + '\'' + 
				", DICT_ISTREE='" + DICT_ISTREE + '\'' + 
				", DICT_DESCRIPTION='" + DICT_DESCRIPTION + '\'' + 
				", CREATER='" + CREATER + '\'' + 
				", itemCreateAt='" + itemCreateAt + '\'' + 
				", UPDATER='" + UPDATER + '\'' + 
				", itemUpdateAt='" + itemUpdateAt + '\'' + 
				"}";
	}
}