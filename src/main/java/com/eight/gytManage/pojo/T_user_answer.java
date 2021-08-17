package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class T_user_answer {
	// itemID ：
	private Long itemID;
	// itemCode ：
	private String itemCode;
	// 患者id
	private String user_id;
	// 题目id
	private String q_id;
	// 患者答题选项
	private String q_option;
	// 答题时间
	private Timestamp tcm_remark;
	// 体质类型id
	private String type_id;
	// 患者本次答题题目序号
	private String seq;
	// 是否生效（1：是  0：否）
	private String useflag;
	// 预留字段，暂未使用
	private String flag1;
	// 预留字段，暂未使用
	private String flag2;
	// 预留字段，暂未使用
	private String flag3;
	// uptFlag ：
	private String uptFlag;
	// 体质测评结果itemcode
	private String result_itemcode;

	// 无参构造器
	public T_user_answer() {
	}

	// 有参构造器，进行属性值的初始化
	public T_user_answer(Long itemID, String itemCode, String user_id, String q_id, String q_option, Timestamp tcm_remark, String type_id, String seq, String useflag, String flag1, String flag2, String flag3, String uptFlag, String result_itemcode) {
		this.itemID = itemID;
		this.itemCode = itemCode;
		this.user_id = user_id;
		this.q_id = q_id;
		this.q_option = q_option;
		this.tcm_remark = tcm_remark;
		this.type_id = type_id;
		this.seq = seq;
		this.useflag = useflag;
		this.flag1 = flag1;
		this.flag2 = flag2;
		this.flag3 = flag3;
		this.uptFlag = uptFlag;
		this.result_itemcode = result_itemcode;
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

	// 获取 患者id 的属性值
	public String getUser_id() {
		return user_id;
	}

	// 设置 患者id 的属性值
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	// 获取 题目id 的属性值
	public String getq_id() {
		return q_id;
	}

	// 设置 题目id 的属性值
	public void setq_id(String q_id) {
		this.q_id = q_id;
	}

	// 获取 患者答题选项 的属性值
	public String getq_option() {
		return q_option;
	}

	// 设置 患者答题选项 的属性值
	public void setq_option(String q_option) {
		this.q_option = q_option;
	}

	// 获取 答题时间 的属性值
	public Timestamp getTcm_remark() {
		return tcm_remark;
	}

	// 设置 答题时间 的属性值
	public void setTcm_remark(Timestamp tcm_remark) {
		this.tcm_remark = tcm_remark;
	}

	// 获取 体质类型id 的属性值
	public String getType_id() {
		return type_id;
	}

	// 设置 体质类型id 的属性值
	public void setType_id(String type_id) {
		this.type_id = type_id;
	}

	// 获取 患者本次答题题目序号 的属性值
	public String getSeq() {
		return seq;
	}

	// 设置 患者本次答题题目序号 的属性值
	public void setSeq(String seq) {
		this.seq = seq;
	}

	// 获取 是否生效（1：是  0：否） 的属性值
	public String getUseflag() {
		return useflag;
	}

	// 设置 是否生效（1：是  0：否） 的属性值
	public void setUseflag(String useflag) {
		this.useflag = useflag;
	}

	// 获取 预留字段，暂未使用 的属性值
	public String getFlag1() {
		return flag1;
	}

	// 设置 预留字段，暂未使用 的属性值
	public void setFlag1(String flag1) {
		this.flag1 = flag1;
	}

	// 获取 预留字段，暂未使用 的属性值
	public String getFlag2() {
		return flag2;
	}

	// 设置 预留字段，暂未使用 的属性值
	public void setFlag2(String flag2) {
		this.flag2 = flag2;
	}

	// 获取 预留字段，暂未使用 的属性值
	public String getFlag3() {
		return flag3;
	}

	// 设置 预留字段，暂未使用 的属性值
	public void setFlag3(String flag3) {
		this.flag3 = flag3;
	}

	// 获取 uptFlag 的属性值
	public String getUptFlag() {
		return uptFlag;
	}

	// 设置 uptFlag 的属性值
	public void setUptFlag(String uptFlag) {
		this.uptFlag = uptFlag;
	}

	// 获取 体质测评结果itemcode 的属性值
	public String getResult_itemcode() {
		return result_itemcode;
	}

	// 设置 体质测评结果itemcode 的属性值
	public void setResult_itemcode(String result_itemcode) {
		this.result_itemcode = result_itemcode;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "T_user_answer {" + 
				", itemID='" + itemID + '\'' + 
				", itemCode='" + itemCode + '\'' + 
				", user_id='" + user_id + '\'' + 
				", q_id='" + q_id + '\'' + 
				", q_option='" + q_option + '\'' + 
				", tcm_remark='" + tcm_remark + '\'' + 
				", type_id='" + type_id + '\'' + 
				", seq='" + seq + '\'' + 
				", useflag='" + useflag + '\'' + 
				", flag1='" + flag1 + '\'' + 
				", flag2='" + flag2 + '\'' + 
				", flag3='" + flag3 + '\'' + 
				", uptFlag='" + uptFlag + '\'' + 
				", result_itemcode='" + result_itemcode + '\'' + 
				"}";
	}
}