package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class Organization {
	// itemID ：
	private Long itemID;
	// 唯一标识UUID
	private String itemCode;
	// 机构名称
	private String ORG_NAME;
	// 机构编码
	private String ORG_CODE;
	// 描述
	private String ORG_DESCRIPTION;
	// 标识符(用来标识机构类型)
	private String ORG_IDENTIFY;
	// 备用字段
	private String backup1;
	// 备用字段
	private String backup2;
	// 左值
	private Integer LEFT;
	// 右值
	private Integer RIGHT;
	// 层级
	private Integer LEVEL;
	// 创建人
	private String CREATER;
	// 创建时间
	private Timestamp itemCreateAt;
	// 修改人
	private String UPDATER;
	// 修改时间
	private Timestamp itemUpdateAt;

	// 无参构造器
	public Organization() {
	}

	// 有参构造器，进行属性值的初始化
	public Organization(Long itemID, String itemCode, String ORG_NAME, String ORG_CODE, String ORG_DESCRIPTION, String ORG_IDENTIFY, String backup1, String backup2, Integer LEFT, Integer RIGHT, Integer LEVEL, String CREATER, Timestamp itemCreateAt, String UPDATER, Timestamp itemUpdateAt) {
		this.itemID = itemID;
		this.itemCode = itemCode;
		this.ORG_NAME = ORG_NAME;
		this.ORG_CODE = ORG_CODE;
		this.ORG_DESCRIPTION = ORG_DESCRIPTION;
		this.ORG_IDENTIFY = ORG_IDENTIFY;
		this.backup1 = backup1;
		this.backup2 = backup2;
		this.LEFT = LEFT;
		this.RIGHT = RIGHT;
		this.LEVEL = LEVEL;
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

	// 获取 机构名称 的属性值
	public String getORG_NAME() {
		return ORG_NAME;
	}

	// 设置 机构名称 的属性值
	public void setORG_NAME(String ORG_NAME) {
		this.ORG_NAME = ORG_NAME;
	}

	// 获取 机构编码 的属性值
	public String getORG_CODE() {
		return ORG_CODE;
	}

	// 设置 机构编码 的属性值
	public void setORG_CODE(String ORG_CODE) {
		this.ORG_CODE = ORG_CODE;
	}

	// 获取 描述 的属性值
	public String getORG_DESCRIPTION() {
		return ORG_DESCRIPTION;
	}

	// 设置 描述 的属性值
	public void setORG_DESCRIPTION(String ORG_DESCRIPTION) {
		this.ORG_DESCRIPTION = ORG_DESCRIPTION;
	}

	// 获取 标识符(用来标识机构类型) 的属性值
	public String getORG_IDENTIFY() {
		return ORG_IDENTIFY;
	}

	// 设置 标识符(用来标识机构类型) 的属性值
	public void setORG_IDENTIFY(String ORG_IDENTIFY) {
		this.ORG_IDENTIFY = ORG_IDENTIFY;
	}

	// 获取 备用字段 的属性值
	public String getBackup1() {
		return backup1;
	}

	// 设置 备用字段 的属性值
	public void setBackup1(String backup1) {
		this.backup1 = backup1;
	}

	// 获取 备用字段 的属性值
	public String getBackup2() {
		return backup2;
	}

	// 设置 备用字段 的属性值
	public void setBackup2(String backup2) {
		this.backup2 = backup2;
	}

	// 获取 左值 的属性值
	public Integer getLEFT() {
		return LEFT;
	}

	// 设置 左值 的属性值
	public void setLEFT(Integer LEFT) {
		this.LEFT = LEFT;
	}

	// 获取 右值 的属性值
	public Integer getRIGHT() {
		return RIGHT;
	}

	// 设置 右值 的属性值
	public void setRIGHT(Integer RIGHT) {
		this.RIGHT = RIGHT;
	}

	// 获取 层级 的属性值
	public Integer getLEVEL() {
		return LEVEL;
	}

	// 设置 层级 的属性值
	public void setLEVEL(Integer LEVEL) {
		this.LEVEL = LEVEL;
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
		return "Organization {" + 
				", itemID='" + itemID + '\'' + 
				", itemCode='" + itemCode + '\'' + 
				", ORG_NAME='" + ORG_NAME + '\'' + 
				", ORG_CODE='" + ORG_CODE + '\'' + 
				", ORG_DESCRIPTION='" + ORG_DESCRIPTION + '\'' + 
				", ORG_IDENTIFY='" + ORG_IDENTIFY + '\'' + 
				", backup1='" + backup1 + '\'' + 
				", backup2='" + backup2 + '\'' + 
				", LEFT='" + LEFT + '\'' + 
				", RIGHT='" + RIGHT + '\'' + 
				", LEVEL='" + LEVEL + '\'' + 
				", CREATER='" + CREATER + '\'' + 
				", itemCreateAt='" + itemCreateAt + '\'' + 
				", UPDATER='" + UPDATER + '\'' + 
				", itemUpdateAt='" + itemUpdateAt + '\'' + 
				"}";
	}
}