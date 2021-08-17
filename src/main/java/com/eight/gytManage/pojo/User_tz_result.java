package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class User_tz_result {
	// itemID ：
	private Long itemID;
	// itemCode ：
	private String itemCode;
	// 患者usercode
	private String user_code;
	// 体质判定结果
	private String tz_determine;
	// 答题时间
	private Timestamp tcm_remark;
	// 体质判定结果:倾向是（基本是）
	private String tz_tendency;

	// 无参构造器
	public User_tz_result() {
	}

	// 有参构造器，进行属性值的初始化
	public User_tz_result(Long itemID, String itemCode, String user_code, String tz_determine, Timestamp tcm_remark, String tz_tendency) {
		this.itemID = itemID;
		this.itemCode = itemCode;
		this.user_code = user_code;
		this.tz_determine = tz_determine;
		this.tcm_remark = tcm_remark;
		this.tz_tendency = tz_tendency;
	}

	// 获取 itemID 的属性值
	public Long getItemID() {
		return itemID;
	}

	// 设置 itemID 的属性值
	public void setItemID(Long itemID) {
		this.itemID = itemID;
	}

	// 获取 itemCode 的属性值
	public String getItemCode() {
		return itemCode;
	}

	// 设置 itemCode 的属性值
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	// 获取 患者usercode 的属性值
	public String getUser_code() {
		return user_code;
	}

	// 设置 患者usercode 的属性值
	public void setUser_code(String user_code) {
		this.user_code = user_code;
	}

	// 获取 体质判定结果 的属性值
	public String getTz_determine() {
		return tz_determine;
	}

	// 设置 体质判定结果 的属性值
	public void setTz_determine(String tz_determine) {
		this.tz_determine = tz_determine;
	}

	// 获取 答题时间 的属性值
	public Timestamp getTcm_remark() {
		return tcm_remark;
	}

	// 设置 答题时间 的属性值
	public void setTcm_remark(Timestamp tcm_remark) {
		this.tcm_remark = tcm_remark;
	}

	// 获取 体质判定结果:倾向是（基本是） 的属性值
	public String getTz_tendency() {
		return tz_tendency;
	}

	// 设置 体质判定结果:倾向是（基本是） 的属性值
	public void setTz_tendency(String tz_tendency) {
		this.tz_tendency = tz_tendency;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "User_tz_result {" + 
				", itemID='" + itemID + '\'' + 
				", itemCode='" + itemCode + '\'' + 
				", user_code='" + user_code + '\'' + 
				", tz_determine='" + tz_determine + '\'' + 
				", tcm_remark='" + tcm_remark + '\'' + 
				", tz_tendency='" + tz_tendency + '\'' + 
				"}";
	}
}