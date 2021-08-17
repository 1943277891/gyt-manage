package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class Dictitem {
	// 自增id
	private Long itemID;
	// 唯一标识UUID
	private String itemCode;
	// 关联dict表中的itemCode字段
	private String DICT_CODE;
	// 字典项编码
	private String DITEM_CODE;
	// 字典项的值
	private String DITEM_VALUE;
	// 父级CODE，关联本表的itemCode
	private String DITEM_PCODE;
	// 创建人
	private String CREATER;
	// 创建时间
	private Timestamp itemCreateAt;
	// 修改人
	private String UPDATER;
	// 修改时间
	private Timestamp itemUpdateAt;

	// 无参构造器
	public Dictitem() {
	}

	// 有参构造器，进行属性值的初始化
	public Dictitem(Long itemID, String itemCode, String DICT_CODE, String DITEM_CODE, String DITEM_VALUE, String DITEM_PCODE, String CREATER, Timestamp itemCreateAt, String UPDATER, Timestamp itemUpdateAt) {
		this.itemID = itemID;
		this.itemCode = itemCode;
		this.DICT_CODE = DICT_CODE;
		this.DITEM_CODE = DITEM_CODE;
		this.DITEM_VALUE = DITEM_VALUE;
		this.DITEM_PCODE = DITEM_PCODE;
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

	// 获取 关联dict表中的itemCode字段 的属性值
	public String getDICT_CODE() {
		return DICT_CODE;
	}

	// 设置 关联dict表中的itemCode字段 的属性值
	public void setDICT_CODE(String DICT_CODE) {
		this.DICT_CODE = DICT_CODE;
	}

	// 获取 字典项编码 的属性值
	public String getDITEM_CODE() {
		return DITEM_CODE;
	}

	// 设置 字典项编码 的属性值
	public void setDITEM_CODE(String DITEM_CODE) {
		this.DITEM_CODE = DITEM_CODE;
	}

	// 获取 字典项的值 的属性值
	public String getDITEM_VALUE() {
		return DITEM_VALUE;
	}

	// 设置 字典项的值 的属性值
	public void setDITEM_VALUE(String DITEM_VALUE) {
		this.DITEM_VALUE = DITEM_VALUE;
	}

	// 获取 父级CODE，关联本表的itemCode 的属性值
	public String getDITEM_PCODE() {
		return DITEM_PCODE;
	}

	// 设置 父级CODE，关联本表的itemCode 的属性值
	public void setDITEM_PCODE(String DITEM_PCODE) {
		this.DITEM_PCODE = DITEM_PCODE;
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
		return "Dictitem {" + 
				", itemID='" + itemID + '\'' + 
				", itemCode='" + itemCode + '\'' + 
				", DICT_CODE='" + DICT_CODE + '\'' + 
				", DITEM_CODE='" + DITEM_CODE + '\'' + 
				", DITEM_VALUE='" + DITEM_VALUE + '\'' + 
				", DITEM_PCODE='" + DITEM_PCODE + '\'' + 
				", CREATER='" + CREATER + '\'' + 
				", itemCreateAt='" + itemCreateAt + '\'' + 
				", UPDATER='" + UPDATER + '\'' + 
				", itemUpdateAt='" + itemUpdateAt + '\'' + 
				"}";
	}
}