package com.eight.gytManage.pojo;




/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class T_knowledge_tcm_type {
	// type_id ：
	private String type_id;
	// 体质名称
	private String type_name;
	// 体质类型
	private String type_number;
	// 体质特征
	private String lb_zttz;
	// 形体特征
	private String lb_xttz;
	// 常见表现
	private String lb_cjbx;
	// 心理特征
	private String lb_xltz;
	// 发病倾向
	private String lb_fbqx;
	// 对外界环境适应能力
	private String lb_dwjhjsynl;
	// 测评结果
	private String tl_zttz;
	// 针对人群
	private String tl_zdrq;
	// 情志调摄
	private String tl_qztj;
	// 饮食调养
	private String tl_tyfs_ys;
	// 起居调摄
	private String tl_tyfs_qj;
	// 运动保健
	private String tl_tyfs_yd;
	// 穴位保健
	private String tl_tyfs_xwbj;
	// options_text ：
	private String options_text;
	// options_value ：
	private String options_value;
	// del_flag ：
	private String del_flag;
	// uptFlag ：
	private String uptFlag;

	// 无参构造器
	public T_knowledge_tcm_type() {
	}

	// 有参构造器，进行属性值的初始化
	public T_knowledge_tcm_type(String type_id, String type_name, String type_number, String lb_zttz, String lb_xttz, String lb_cjbx, String lb_xltz, String lb_fbqx, String lb_dwjhjsynl, String tl_zttz, String tl_zdrq, String tl_qztj, String tl_tyfs_ys, String tl_tyfs_qj, String tl_tyfs_yd, String tl_tyfs_xwbj, String options_text, String options_value, String del_flag, String uptFlag) {
		this.type_id = type_id;
		this.type_name = type_name;
		this.type_number = type_number;
		this.lb_zttz = lb_zttz;
		this.lb_xttz = lb_xttz;
		this.lb_cjbx = lb_cjbx;
		this.lb_xltz = lb_xltz;
		this.lb_fbqx = lb_fbqx;
		this.lb_dwjhjsynl = lb_dwjhjsynl;
		this.tl_zttz = tl_zttz;
		this.tl_zdrq = tl_zdrq;
		this.tl_qztj = tl_qztj;
		this.tl_tyfs_ys = tl_tyfs_ys;
		this.tl_tyfs_qj = tl_tyfs_qj;
		this.tl_tyfs_yd = tl_tyfs_yd;
		this.tl_tyfs_xwbj = tl_tyfs_xwbj;
		this.options_text = options_text;
		this.options_value = options_value;
		this.del_flag = del_flag;
		this.uptFlag = uptFlag;
	}

	// 获取 type_id 的属性值
	public String getType_id() {
		return type_id;
	}

	// 设置 type_id 的属性值
	public void setType_id(String type_id) {
		this.type_id = type_id;
	}

	// 获取 体质名称 的属性值
	public String getType_name() {
		return type_name;
	}

	// 设置 体质名称 的属性值
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}

	// 获取 体质类型 的属性值
	public String getType_number() {
		return type_number;
	}

	// 设置 体质类型 的属性值
	public void setType_number(String type_number) {
		this.type_number = type_number;
	}

	// 获取 体质特征 的属性值
	public String getLb_zttz() {
		return lb_zttz;
	}

	// 设置 体质特征 的属性值
	public void setLb_zttz(String lb_zttz) {
		this.lb_zttz = lb_zttz;
	}

	// 获取 形体特征 的属性值
	public String getLb_xttz() {
		return lb_xttz;
	}

	// 设置 形体特征 的属性值
	public void setLb_xttz(String lb_xttz) {
		this.lb_xttz = lb_xttz;
	}

	// 获取 常见表现 的属性值
	public String getLb_cjbx() {
		return lb_cjbx;
	}

	// 设置 常见表现 的属性值
	public void setLb_cjbx(String lb_cjbx) {
		this.lb_cjbx = lb_cjbx;
	}

	// 获取 心理特征 的属性值
	public String getLb_xltz() {
		return lb_xltz;
	}

	// 设置 心理特征 的属性值
	public void setLb_xltz(String lb_xltz) {
		this.lb_xltz = lb_xltz;
	}

	// 获取 发病倾向 的属性值
	public String getLb_fbqx() {
		return lb_fbqx;
	}

	// 设置 发病倾向 的属性值
	public void setLb_fbqx(String lb_fbqx) {
		this.lb_fbqx = lb_fbqx;
	}

	// 获取 对外界环境适应能力 的属性值
	public String getLb_dwjhjsynl() {
		return lb_dwjhjsynl;
	}

	// 设置 对外界环境适应能力 的属性值
	public void setLb_dwjhjsynl(String lb_dwjhjsynl) {
		this.lb_dwjhjsynl = lb_dwjhjsynl;
	}

	// 获取 测评结果 的属性值
	public String getTl_zttz() {
		return tl_zttz;
	}

	// 设置 测评结果 的属性值
	public void setTl_zttz(String tl_zttz) {
		this.tl_zttz = tl_zttz;
	}

	// 获取 针对人群 的属性值
	public String getTl_zdrq() {
		return tl_zdrq;
	}

	// 设置 针对人群 的属性值
	public void setTl_zdrq(String tl_zdrq) {
		this.tl_zdrq = tl_zdrq;
	}

	// 获取 情志调摄 的属性值
	public String getTl_qztj() {
		return tl_qztj;
	}

	// 设置 情志调摄 的属性值
	public void setTl_qztj(String tl_qztj) {
		this.tl_qztj = tl_qztj;
	}

	// 获取 饮食调养 的属性值
	public String getTl_tyfs_ys() {
		return tl_tyfs_ys;
	}

	// 设置 饮食调养 的属性值
	public void setTl_tyfs_ys(String tl_tyfs_ys) {
		this.tl_tyfs_ys = tl_tyfs_ys;
	}

	// 获取 起居调摄 的属性值
	public String getTl_tyfs_qj() {
		return tl_tyfs_qj;
	}

	// 设置 起居调摄 的属性值
	public void setTl_tyfs_qj(String tl_tyfs_qj) {
		this.tl_tyfs_qj = tl_tyfs_qj;
	}

	// 获取 运动保健 的属性值
	public String getTl_tyfs_yd() {
		return tl_tyfs_yd;
	}

	// 设置 运动保健 的属性值
	public void setTl_tyfs_yd(String tl_tyfs_yd) {
		this.tl_tyfs_yd = tl_tyfs_yd;
	}

	// 获取 穴位保健 的属性值
	public String getTl_tyfs_xwbj() {
		return tl_tyfs_xwbj;
	}

	// 设置 穴位保健 的属性值
	public void setTl_tyfs_xwbj(String tl_tyfs_xwbj) {
		this.tl_tyfs_xwbj = tl_tyfs_xwbj;
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

	// 获取 uptFlag 的属性值
	public String getUptFlag() {
		return uptFlag;
	}

	// 设置 uptFlag 的属性值
	public void setUptFlag(String uptFlag) {
		this.uptFlag = uptFlag;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "T_knowledge_tcm_type {" + 
				", type_id='" + type_id + '\'' + 
				", type_name='" + type_name + '\'' + 
				", type_number='" + type_number + '\'' + 
				", lb_zttz='" + lb_zttz + '\'' + 
				", lb_xttz='" + lb_xttz + '\'' + 
				", lb_cjbx='" + lb_cjbx + '\'' + 
				", lb_xltz='" + lb_xltz + '\'' + 
				", lb_fbqx='" + lb_fbqx + '\'' + 
				", lb_dwjhjsynl='" + lb_dwjhjsynl + '\'' + 
				", tl_zttz='" + tl_zttz + '\'' + 
				", tl_zdrq='" + tl_zdrq + '\'' + 
				", tl_qztj='" + tl_qztj + '\'' + 
				", tl_tyfs_ys='" + tl_tyfs_ys + '\'' + 
				", tl_tyfs_qj='" + tl_tyfs_qj + '\'' + 
				", tl_tyfs_yd='" + tl_tyfs_yd + '\'' + 
				", tl_tyfs_xwbj='" + tl_tyfs_xwbj + '\'' + 
				", options_text='" + options_text + '\'' + 
				", options_value='" + options_value + '\'' + 
				", del_flag='" + del_flag + '\'' + 
				", uptFlag='" + uptFlag + '\'' + 
				"}";
	}
}