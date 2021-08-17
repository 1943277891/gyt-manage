package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class Tb_natmeha_file {
	// 自增id
	private Long itemID;
	// 唯一标识
	private String itemCode;
	// 数据源itemcode
	private String DATA_CODE;
	// 上传人
	private String UPLOADER;
	// 上传人的id
	private String UPLOADER_CODE;
	// 附件名称
	private String FILE_NAME;
	// 附件文件类型 文档或图片
	private String FILE_TYPE;
	// FILE_SIZE ：
	private Double FILE_SIZE;
	// 附件路径
	private String FILE_PATH;
	// itemCreateAt ：
	private Timestamp itemCreateAt;

	// 无参构造器
	public Tb_natmeha_file() {
	}

	// 有参构造器，进行属性值的初始化
	public Tb_natmeha_file(Long itemID, String itemCode, String DATA_CODE, String UPLOADER, String UPLOADER_CODE, String FILE_NAME, String FILE_TYPE, Double FILE_SIZE, String FILE_PATH, Timestamp itemCreateAt) {
		this.itemID = itemID;
		this.itemCode = itemCode;
		this.DATA_CODE = DATA_CODE;
		this.UPLOADER = UPLOADER;
		this.UPLOADER_CODE = UPLOADER_CODE;
		this.FILE_NAME = FILE_NAME;
		this.FILE_TYPE = FILE_TYPE;
		this.FILE_SIZE = FILE_SIZE;
		this.FILE_PATH = FILE_PATH;
		this.itemCreateAt = itemCreateAt;
	}

	// 获取 自增id 的属性值
	public Long getItemID() {
		return itemID;
	}

	// 设置 自增id 的属性值
	public void setItemID(Long itemID) {
		this.itemID = itemID;
	}

	// 获取 唯一标识 的属性值
	public String getItemCode() {
		return itemCode;
	}

	// 设置 唯一标识 的属性值
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	// 获取 数据源itemcode 的属性值
	public String getDATA_CODE() {
		return DATA_CODE;
	}

	// 设置 数据源itemcode 的属性值
	public void setDATA_CODE(String DATA_CODE) {
		this.DATA_CODE = DATA_CODE;
	}

	// 获取 上传人 的属性值
	public String getUPLOADER() {
		return UPLOADER;
	}

	// 设置 上传人 的属性值
	public void setUPLOADER(String UPLOADER) {
		this.UPLOADER = UPLOADER;
	}

	// 获取 上传人的id 的属性值
	public String getUPLOADER_CODE() {
		return UPLOADER_CODE;
	}

	// 设置 上传人的id 的属性值
	public void setUPLOADER_CODE(String UPLOADER_CODE) {
		this.UPLOADER_CODE = UPLOADER_CODE;
	}

	// 获取 附件名称 的属性值
	public String getFILE_NAME() {
		return FILE_NAME;
	}

	// 设置 附件名称 的属性值
	public void setFILE_NAME(String FILE_NAME) {
		this.FILE_NAME = FILE_NAME;
	}

	// 获取 附件文件类型 文档或图片 的属性值
	public String getFILE_TYPE() {
		return FILE_TYPE;
	}

	// 设置 附件文件类型 文档或图片 的属性值
	public void setFILE_TYPE(String FILE_TYPE) {
		this.FILE_TYPE = FILE_TYPE;
	}

	// 获取 FILE_SIZE 的属性值
	public Double getFILE_SIZE() {
		return FILE_SIZE;
	}

	// 设置 FILE_SIZE 的属性值
	public void setFILE_SIZE(Double FILE_SIZE) {
		this.FILE_SIZE = FILE_SIZE;
	}

	// 获取 附件路径 的属性值
	public String getFILE_PATH() {
		return FILE_PATH;
	}

	// 设置 附件路径 的属性值
	public void setFILE_PATH(String FILE_PATH) {
		this.FILE_PATH = FILE_PATH;
	}

	// 获取 itemCreateAt 的属性值
	public Timestamp getItemCreateAt() {
		return itemCreateAt;
	}

	// 设置 itemCreateAt 的属性值
	public void setItemCreateAt(Timestamp itemCreateAt) {
		this.itemCreateAt = itemCreateAt;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "Tb_natmeha_file {" + 
				", itemID='" + itemID + '\'' + 
				", itemCode='" + itemCode + '\'' + 
				", DATA_CODE='" + DATA_CODE + '\'' + 
				", UPLOADER='" + UPLOADER + '\'' + 
				", UPLOADER_CODE='" + UPLOADER_CODE + '\'' + 
				", FILE_NAME='" + FILE_NAME + '\'' + 
				", FILE_TYPE='" + FILE_TYPE + '\'' + 
				", FILE_SIZE='" + FILE_SIZE + '\'' + 
				", FILE_PATH='" + FILE_PATH + '\'' + 
				", itemCreateAt='" + itemCreateAt + '\'' + 
				"}";
	}
}