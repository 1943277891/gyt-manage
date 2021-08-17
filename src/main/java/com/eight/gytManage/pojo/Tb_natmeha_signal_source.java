package com.eight.gytManage.pojo;


import java.time.LocalDateTime;
import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class Tb_natmeha_signal_source {
	// itemID ：
	private Long itemID;
	// 唯一标识UUID
	private String itemCode;
	// 医生code
	private String DOCTOR_CODE;
	// 挂号类别
	private String REGISTER_TYPE;
	// 就诊时间
	private LocalDateTime REGISTER_DATE;
	// 预约量
	private Integer REGISTER_COUNT;
	// 状态
	private String STATUS;
	// USER_CODE ：
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
	public Tb_natmeha_signal_source() {
	}

	// 有参构造器，进行属性值的初始化
	public Tb_natmeha_signal_source(Long itemID, String itemCode, String DOCTOR_CODE, String REGISTER_TYPE, LocalDateTime REGISTER_DATE, Integer REGISTER_COUNT, String STATUS, String USER_CODE, String CREATER, Timestamp itemCreateAt, String UPDATER, Timestamp itemUpdateAt) {
		this.itemID = itemID;
		this.itemCode = itemCode;
		this.DOCTOR_CODE = DOCTOR_CODE;
		this.REGISTER_TYPE = REGISTER_TYPE;
		this.REGISTER_DATE = REGISTER_DATE;
		this.REGISTER_COUNT = REGISTER_COUNT;
		this.STATUS = STATUS;
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

	// 获取 医生code 的属性值
	public String getDOCTOR_CODE() {
		return DOCTOR_CODE;
	}

	// 设置 医生code 的属性值
	public void setDOCTOR_CODE(String DOCTOR_CODE) {
		this.DOCTOR_CODE = DOCTOR_CODE;
	}

	// 获取 挂号类别 的属性值
	public String getREGISTER_TYPE() {
		return REGISTER_TYPE;
	}

	// 设置 挂号类别 的属性值
	public void setREGISTER_TYPE(String REGISTER_TYPE) {
		this.REGISTER_TYPE = REGISTER_TYPE;
	}

	// 获取 就诊时间 的属性值
	public LocalDateTime getREGISTER_DATE() {
		return REGISTER_DATE;
	}

	// 设置 就诊时间 的属性值
	public void setREGISTER_DATE(LocalDateTime REGISTER_DATE) {
		this.REGISTER_DATE = REGISTER_DATE;
	}

	// 获取 预约量 的属性值
	public Integer getREGISTER_COUNT() {
		return REGISTER_COUNT;
	}

	// 设置 预约量 的属性值
	public void setREGISTER_COUNT(Integer REGISTER_COUNT) {
		this.REGISTER_COUNT = REGISTER_COUNT;
	}

	// 获取 状态 的属性值
	public String getSTATUS() {
		return STATUS;
	}

	// 设置 状态 的属性值
	public void setSTATUS(String STATUS) {
		this.STATUS = STATUS;
	}

	// 获取 USER_CODE 的属性值
	public String getUSER_CODE() {
		return USER_CODE;
	}

	// 设置 USER_CODE 的属性值
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
		return "Tb_natmeha_signal_source {" + 
				", itemID='" + itemID + '\'' + 
				", itemCode='" + itemCode + '\'' + 
				", DOCTOR_CODE='" + DOCTOR_CODE + '\'' + 
				", REGISTER_TYPE='" + REGISTER_TYPE + '\'' + 
				", REGISTER_DATE='" + REGISTER_DATE + '\'' + 
				", REGISTER_COUNT='" + REGISTER_COUNT + '\'' + 
				", STATUS='" + STATUS + '\'' + 
				", USER_CODE='" + USER_CODE + '\'' + 
				", CREATER='" + CREATER + '\'' + 
				", itemCreateAt='" + itemCreateAt + '\'' + 
				", UPDATER='" + UPDATER + '\'' + 
				", itemUpdateAt='" + itemUpdateAt + '\'' + 
				"}";
	}
}