package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class Resource {
	// 自增id
	private Long itemID;
	// 唯一标识UUID
	private String itemCode;
	// 权限名称
	private String RESOURCE_NAME;
	// 权限类型
	private String RESOURCE_TYPE;
	// 父级id
	private String RESOURCE_PCODE;
	// 等级
	private String RESOURCE_LEVEL;
	// 权限访问地址
	private String RESOURCE_URL;
	// 权限描述
	private String RESOURCE_DESCRIPTION;
	// 排序
	private Integer SORT;
	// 创建人
	private String CREATER;
	// 创建时间
	private Timestamp itemCreateAt;
	// 修改人
	private String UPDATER;
	// 修改时间
	private Timestamp itemUpdateAt;

	// 无参构造器
	public Resource() {
	}

	// 有参构造器，进行属性值的初始化
	public Resource(Long itemID, String itemCode, String RESOURCE_NAME, String RESOURCE_TYPE, String RESOURCE_PCODE, String RESOURCE_LEVEL, String RESOURCE_URL, String RESOURCE_DESCRIPTION, Integer SORT, String CREATER, Timestamp itemCreateAt, String UPDATER, Timestamp itemUpdateAt) {
		this.itemID = itemID;
		this.itemCode = itemCode;
		this.RESOURCE_NAME = RESOURCE_NAME;
		this.RESOURCE_TYPE = RESOURCE_TYPE;
		this.RESOURCE_PCODE = RESOURCE_PCODE;
		this.RESOURCE_LEVEL = RESOURCE_LEVEL;
		this.RESOURCE_URL = RESOURCE_URL;
		this.RESOURCE_DESCRIPTION = RESOURCE_DESCRIPTION;
		this.SORT = SORT;
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

	// 获取 权限名称 的属性值
	public String getRESOURCE_NAME() {
		return RESOURCE_NAME;
	}

	// 设置 权限名称 的属性值
	public void setRESOURCE_NAME(String RESOURCE_NAME) {
		this.RESOURCE_NAME = RESOURCE_NAME;
	}

	// 获取 权限类型 的属性值
	public String getRESOURCE_TYPE() {
		return RESOURCE_TYPE;
	}

	// 设置 权限类型 的属性值
	public void setRESOURCE_TYPE(String RESOURCE_TYPE) {
		this.RESOURCE_TYPE = RESOURCE_TYPE;
	}

	// 获取 父级id 的属性值
	public String getRESOURCE_PCODE() {
		return RESOURCE_PCODE;
	}

	// 设置 父级id 的属性值
	public void setRESOURCE_PCODE(String RESOURCE_PCODE) {
		this.RESOURCE_PCODE = RESOURCE_PCODE;
	}

	// 获取 等级 的属性值
	public String getRESOURCE_LEVEL() {
		return RESOURCE_LEVEL;
	}

	// 设置 等级 的属性值
	public void setRESOURCE_LEVEL(String RESOURCE_LEVEL) {
		this.RESOURCE_LEVEL = RESOURCE_LEVEL;
	}

	// 获取 权限访问地址 的属性值
	public String getRESOURCE_URL() {
		return RESOURCE_URL;
	}

	// 设置 权限访问地址 的属性值
	public void setRESOURCE_URL(String RESOURCE_URL) {
		this.RESOURCE_URL = RESOURCE_URL;
	}

	// 获取 权限描述 的属性值
	public String getRESOURCE_DESCRIPTION() {
		return RESOURCE_DESCRIPTION;
	}

	// 设置 权限描述 的属性值
	public void setRESOURCE_DESCRIPTION(String RESOURCE_DESCRIPTION) {
		this.RESOURCE_DESCRIPTION = RESOURCE_DESCRIPTION;
	}

	// 获取 排序 的属性值
	public Integer getSORT() {
		return SORT;
	}

	// 设置 排序 的属性值
	public void setSORT(Integer SORT) {
		this.SORT = SORT;
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
		return "Resource {" + 
				", itemID='" + itemID + '\'' + 
				", itemCode='" + itemCode + '\'' + 
				", RESOURCE_NAME='" + RESOURCE_NAME + '\'' + 
				", RESOURCE_TYPE='" + RESOURCE_TYPE + '\'' + 
				", RESOURCE_PCODE='" + RESOURCE_PCODE + '\'' + 
				", RESOURCE_LEVEL='" + RESOURCE_LEVEL + '\'' + 
				", RESOURCE_URL='" + RESOURCE_URL + '\'' + 
				", RESOURCE_DESCRIPTION='" + RESOURCE_DESCRIPTION + '\'' + 
				", SORT='" + SORT + '\'' + 
				", CREATER='" + CREATER + '\'' + 
				", itemCreateAt='" + itemCreateAt + '\'' + 
				", UPDATER='" + UPDATER + '\'' + 
				", itemUpdateAt='" + itemUpdateAt + '\'' + 
				"}";
	}
}