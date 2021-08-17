package com.eight.gytManage.pojo;




/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class T_knowledge_tcm_question {
	// q_id ：
	private String q_id;
	// type_id ：
	private String type_id;
	// q_number ：
	private String q_number;
	// q_text ：
	private String q_text;
	// options_text ：
	private String options_text;
	// options_value ：
	private String options_value;
	// del_flag ：
	private String del_flag;
	// fea_id ：
	private String fea_id;
	// q_sex ：
	private String q_sex;

	// 无参构造器
	public T_knowledge_tcm_question() {
	}

	// 有参构造器，进行属性值的初始化
	public T_knowledge_tcm_question(String q_id, String type_id, String q_number, String q_text, String options_text, String options_value, String del_flag, String fea_id, String q_sex) {
		this.q_id = q_id;
		this.type_id = type_id;
		this.q_number = q_number;
		this.q_text = q_text;
		this.options_text = options_text;
		this.options_value = options_value;
		this.del_flag = del_flag;
		this.fea_id = fea_id;
		this.q_sex = q_sex;
	}

	// 获取 q_id 的属性值
	public String getq_id() {
		return q_id;
	}

	// 设置 q_id 的属性值
	public void setq_id(String q_id) {
		this.q_id = q_id;
	}

	// 获取 type_id 的属性值
	public String getType_id() {
		return type_id;
	}

	// 设置 type_id 的属性值
	public void setType_id(String type_id) {
		this.type_id = type_id;
	}

	// 获取 q_number 的属性值
	public String getq_number() {
		return q_number;
	}

	// 设置 q_number 的属性值
	public void setq_number(String q_number) {
		this.q_number = q_number;
	}

	// 获取 q_text 的属性值
	public String getq_text() {
		return q_text;
	}

	// 设置 q_text 的属性值
	public void setq_text(String q_text) {
		this.q_text = q_text;
	}

	// 获取 options_text 的属性值
	public String getOptions_text() {
		return options_text;
	}

	// 设置 options_text 的属性值
	public void setOptions_text(String options_text) {
		this.options_text = options_text;
	}

	// 获取 options_value 的属性值
	public String getOptions_value() {
		return options_value;
	}

	// 设置 options_value 的属性值
	public void setOptions_value(String options_value) {
		this.options_value = options_value;
	}

	// 获取 del_flag 的属性值
	public String getDel_flag() {
		return del_flag;
	}

	// 设置 del_flag 的属性值
	public void setDel_flag(String del_flag) {
		this.del_flag = del_flag;
	}

	// 获取 fea_id 的属性值
	public String getFea_id() {
		return fea_id;
	}

	// 设置 fea_id 的属性值
	public void setFea_id(String fea_id) {
		this.fea_id = fea_id;
	}

	// 获取 q_sex 的属性值
	public String getq_sex() {
		return q_sex;
	}

	// 设置 q_sex 的属性值
	public void setq_sex(String q_sex) {
		this.q_sex = q_sex;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "T_knowledge_tcm_question {" + 
				", q_id='" + q_id + '\'' + 
				", type_id='" + type_id + '\'' + 
				", q_number='" + q_number + '\'' + 
				", q_text='" + q_text + '\'' + 
				", options_text='" + options_text + '\'' + 
				", options_value='" + options_value + '\'' + 
				", del_flag='" + del_flag + '\'' + 
				", fea_id='" + fea_id + '\'' + 
				", q_sex='" + q_sex + '\'' + 
				"}";
	}
}