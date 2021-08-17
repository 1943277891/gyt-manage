package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class Tb_natmeha_hospital {
	// 自增id
	private Long itemID;
	// UUID
	private String itemCode;
	// 国医堂名称
	private String HOSPITAL_NAME;
	// 医院等级
	private String HOSPITAL_LEVEL;
	// 预约量
	private Integer HOSPITAL_BOOKING;
	// 评分
	private Double HOSPITAL_SOURCE;
	// 距离（暂定）
	private Integer HOSPITAL_DISTANCE;
	// 医院电话
	private String HOSPITAL_PHONE;
	// 医院地址省份
	private String HOSPITAL_PRO;
	// 医院地址市
	private String HOSPITAL_CITY;
	// 地址省份
	private String HOSPITAL_COUNTRY;
	// 医院详细地址
	private String HOSPITAL_ADRESS;
	// 简介
	private byte INTRODUCE;
	// 数据状态
	private String STATUS;
	// 创建者
	private String CREATER;
	// 创建时间
	private Timestamp itemCreateAt;
	// 修改人
	private String UPDATER;
	// 修改时间
	private Timestamp itemUpdateAt;

	// 无参构造器
	public Tb_natmeha_hospital() {
	}

	// 有参构造器，进行属性值的初始化
	public Tb_natmeha_hospital(Long itemID, String itemCode, String HOSPITAL_NAME, String HOSPITAL_LEVEL, Integer HOSPITAL_BOOKING, Double HOSPITAL_SOURCE, Integer HOSPITAL_DISTANCE, String HOSPITAL_PHONE, String HOSPITAL_PRO, String HOSPITAL_CITY, String HOSPITAL_COUNTRY, String HOSPITAL_ADRESS, byte INTRODUCE, String STATUS, String CREATER, Timestamp itemCreateAt, String UPDATER, Timestamp itemUpdateAt) {
		this.itemID = itemID;
		this.itemCode = itemCode;
		this.HOSPITAL_NAME = HOSPITAL_NAME;
		this.HOSPITAL_LEVEL = HOSPITAL_LEVEL;
		this.HOSPITAL_BOOKING = HOSPITAL_BOOKING;
		this.HOSPITAL_SOURCE = HOSPITAL_SOURCE;
		this.HOSPITAL_DISTANCE = HOSPITAL_DISTANCE;
		this.HOSPITAL_PHONE = HOSPITAL_PHONE;
		this.HOSPITAL_PRO = HOSPITAL_PRO;
		this.HOSPITAL_CITY = HOSPITAL_CITY;
		this.HOSPITAL_COUNTRY = HOSPITAL_COUNTRY;
		this.HOSPITAL_ADRESS = HOSPITAL_ADRESS;
		this.INTRODUCE = INTRODUCE;
		this.STATUS = STATUS;
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

	// 获取 国医堂名称 的属性值
	public String getHOSPITAL_NAME() {
		return HOSPITAL_NAME;
	}

	// 设置 国医堂名称 的属性值
	public void setHOSPITAL_NAME(String HOSPITAL_NAME) {
		this.HOSPITAL_NAME = HOSPITAL_NAME;
	}

	// 获取 医院等级 的属性值
	public String getHOSPITAL_LEVEL() {
		return HOSPITAL_LEVEL;
	}

	// 设置 医院等级 的属性值
	public void setHOSPITAL_LEVEL(String HOSPITAL_LEVEL) {
		this.HOSPITAL_LEVEL = HOSPITAL_LEVEL;
	}

	// 获取 预约量 的属性值
	public Integer getHOSPITAL_BOOKING() {
		return HOSPITAL_BOOKING;
	}

	// 设置 预约量 的属性值
	public void setHOSPITAL_BOOKING(Integer HOSPITAL_BOOKING) {
		this.HOSPITAL_BOOKING = HOSPITAL_BOOKING;
	}

	// 获取 评分 的属性值
	public Double getHOSPITAL_SOURCE() {
		return HOSPITAL_SOURCE;
	}

	// 设置 评分 的属性值
	public void setHOSPITAL_SOURCE(Double HOSPITAL_SOURCE) {
		this.HOSPITAL_SOURCE = HOSPITAL_SOURCE;
	}

	// 获取 距离（暂定） 的属性值
	public Integer getHOSPITAL_DISTANCE() {
		return HOSPITAL_DISTANCE;
	}

	// 设置 距离（暂定） 的属性值
	public void setHOSPITAL_DISTANCE(Integer HOSPITAL_DISTANCE) {
		this.HOSPITAL_DISTANCE = HOSPITAL_DISTANCE;
	}

	// 获取 医院电话 的属性值
	public String getHOSPITAL_PHONE() {
		return HOSPITAL_PHONE;
	}

	// 设置 医院电话 的属性值
	public void setHOSPITAL_PHONE(String HOSPITAL_PHONE) {
		this.HOSPITAL_PHONE = HOSPITAL_PHONE;
	}

	// 获取 医院地址省份 的属性值
	public String getHOSPITAL_PRO() {
		return HOSPITAL_PRO;
	}

	// 设置 医院地址省份 的属性值
	public void setHOSPITAL_PRO(String HOSPITAL_PRO) {
		this.HOSPITAL_PRO = HOSPITAL_PRO;
	}

	// 获取 医院地址市 的属性值
	public String getHOSPITAL_CITY() {
		return HOSPITAL_CITY;
	}

	// 设置 医院地址市 的属性值
	public void setHOSPITAL_CITY(String HOSPITAL_CITY) {
		this.HOSPITAL_CITY = HOSPITAL_CITY;
	}

	// 获取 地址省份 的属性值
	public String getHOSPITAL_COUNTRY() {
		return HOSPITAL_COUNTRY;
	}

	// 设置 地址省份 的属性值
	public void setHOSPITAL_COUNTRY(String HOSPITAL_COUNTRY) {
		this.HOSPITAL_COUNTRY = HOSPITAL_COUNTRY;
	}

	// 获取 医院详细地址 的属性值
	public String getHOSPITAL_ADRESS() {
		return HOSPITAL_ADRESS;
	}

	// 设置 医院详细地址 的属性值
	public void setHOSPITAL_ADRESS(String HOSPITAL_ADRESS) {
		this.HOSPITAL_ADRESS = HOSPITAL_ADRESS;
	}

	// 获取 简介 的属性值
	public byte getINTRODUCE() {
		return INTRODUCE;
	}

	// 设置 简介 的属性值
	public void setINTRODUCE(byte INTRODUCE) {
		this.INTRODUCE = INTRODUCE;
	}

	// 获取 数据状态 的属性值
	public String getSTATUS() {
		return STATUS;
	}

	// 设置 数据状态 的属性值
	public void setSTATUS(String STATUS) {
		this.STATUS = STATUS;
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
		return "Tb_natmeha_hospital {" + 
				", itemID='" + itemID + '\'' + 
				", itemCode='" + itemCode + '\'' + 
				", HOSPITAL_NAME='" + HOSPITAL_NAME + '\'' + 
				", HOSPITAL_LEVEL='" + HOSPITAL_LEVEL + '\'' + 
				", HOSPITAL_BOOKING='" + HOSPITAL_BOOKING + '\'' + 
				", HOSPITAL_SOURCE='" + HOSPITAL_SOURCE + '\'' + 
				", HOSPITAL_DISTANCE='" + HOSPITAL_DISTANCE + '\'' + 
				", HOSPITAL_PHONE='" + HOSPITAL_PHONE + '\'' + 
				", HOSPITAL_PRO='" + HOSPITAL_PRO + '\'' + 
				", HOSPITAL_CITY='" + HOSPITAL_CITY + '\'' + 
				", HOSPITAL_COUNTRY='" + HOSPITAL_COUNTRY + '\'' + 
				", HOSPITAL_ADRESS='" + HOSPITAL_ADRESS + '\'' + 
				", INTRODUCE='" + INTRODUCE + '\'' + 
				", STATUS='" + STATUS + '\'' + 
				", CREATER='" + CREATER + '\'' + 
				", itemCreateAt='" + itemCreateAt + '\'' + 
				", UPDATER='" + UPDATER + '\'' + 
				", itemUpdateAt='" + itemUpdateAt + '\'' + 
				"}";
	}
}