package com.eight.gytManage.pojo;


import java.sql.Timestamp;
import java.sql.Date;


/**
 * @Author Kele-Bing
 * @Create 2021-08-16 11:10:17
 * @Version 1.0
 */
public class User {
	// itemID ：
	private Long itemID;
	// 唯一标识UUID
	private String itemCode;
	// 机构id(关联organization表中的itemID）
	private String ORG_CODE;
	// 登陆账号
	private String USERNAME;
	// 密码
	private String PASSWORD;
	// 盐
	private String SALT;
	// 用户名
	private String NAME;
	// 性别
	private String GENDER;
	// 肖像
	private byte PORTRAIT;
	// 身份证件类型
	private String IDCARD_TYPE;
	// 证件号码
	private String IDCARD_NO;
	// email
	private String EMAIL;
	// STATE ：
	private String STATE;
	// 电话号码
	private String mobilePhone;
	// 创建人
	private String CREATER;
	// 创建时间
	private Timestamp itemCreateAt;
	// 修改人
	private String UPDATER;
	// 修改时间
	private Timestamp itemUpdateAt;
	// 地级机构id
	private String CITYID;
	// 类型（0：普通，1：管理员）
	private Integer TYPE;
	// 出生日期
	private Date BIRTH;
	// WX_OPENID ：
	private String WX_OPENID;

	// 无参构造器
	public User() {
	}

	// 有参构造器，进行属性值的初始化
	public User(Long itemID, String itemCode, String ORG_CODE, String USERNAME, String PASSWORD, String SALT, String NAME, String GENDER, byte PORTRAIT, String IDCARD_TYPE, String IDCARD_NO, String EMAIL, String STATE, String mobilePhone, String CREATER, Timestamp itemCreateAt, String UPDATER, Timestamp itemUpdateAt, String CITYID, Integer TYPE, Date BIRTH, String WX_OPENID) {
		this.itemID = itemID;
		this.itemCode = itemCode;
		this.ORG_CODE = ORG_CODE;
		this.USERNAME = USERNAME;
		this.PASSWORD = PASSWORD;
		this.SALT = SALT;
		this.NAME = NAME;
		this.GENDER = GENDER;
		this.PORTRAIT = PORTRAIT;
		this.IDCARD_TYPE = IDCARD_TYPE;
		this.IDCARD_NO = IDCARD_NO;
		this.EMAIL = EMAIL;
		this.STATE = STATE;
		this.mobilePhone = mobilePhone;
		this.CREATER = CREATER;
		this.itemCreateAt = itemCreateAt;
		this.UPDATER = UPDATER;
		this.itemUpdateAt = itemUpdateAt;
		this.CITYID = CITYID;
		this.TYPE = TYPE;
		this.BIRTH = BIRTH;
		this.WX_OPENID = WX_OPENID;
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

	// 获取 机构id(关联organization表中的itemID） 的属性值
	public String getORG_CODE() {
		return ORG_CODE;
	}

	// 设置 机构id(关联organization表中的itemID） 的属性值
	public void setORG_CODE(String ORG_CODE) {
		this.ORG_CODE = ORG_CODE;
	}

	// 获取 登陆账号 的属性值
	public String getUSERNAME() {
		return USERNAME;
	}

	// 设置 登陆账号 的属性值
	public void setUSERNAME(String USERNAME) {
		this.USERNAME = USERNAME;
	}

	// 获取 密码 的属性值
	public String getPASSWORD() {
		return PASSWORD;
	}

	// 设置 密码 的属性值
	public void setPASSWORD(String PASSWORD) {
		this.PASSWORD = PASSWORD;
	}

	// 获取 盐 的属性值
	public String getSALT() {
		return SALT;
	}

	// 设置 盐 的属性值
	public void setSALT(String SALT) {
		this.SALT = SALT;
	}

	// 获取 用户名 的属性值
	public String getNAME() {
		return NAME;
	}

	// 设置 用户名 的属性值
	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	// 获取 性别 的属性值
	public String getGENDER() {
		return GENDER;
	}

	// 设置 性别 的属性值
	public void setGENDER(String GENDER) {
		this.GENDER = GENDER;
	}

	// 获取 肖像 的属性值
	public byte getPORTRAIT() {
		return PORTRAIT;
	}

	// 设置 肖像 的属性值
	public void setPORTRAIT(byte PORTRAIT) {
		this.PORTRAIT = PORTRAIT;
	}

	// 获取 身份证件类型 的属性值
	public String getIDCARD_TYPE() {
		return IDCARD_TYPE;
	}

	// 设置 身份证件类型 的属性值
	public void setIDCARD_TYPE(String IDCARD_TYPE) {
		this.IDCARD_TYPE = IDCARD_TYPE;
	}

	// 获取 证件号码 的属性值
	public String getIDCARD_NO() {
		return IDCARD_NO;
	}

	// 设置 证件号码 的属性值
	public void setIDCARD_NO(String IDCARD_NO) {
		this.IDCARD_NO = IDCARD_NO;
	}

	// 获取 email 的属性值
	public String getEMAIL() {
		return EMAIL;
	}

	// 设置 email 的属性值
	public void setEMAIL(String EMAIL) {
		this.EMAIL = EMAIL;
	}

	// 获取 STATE 的属性值
	public String getSTATE() {
		return STATE;
	}

	// 设置 STATE 的属性值
	public void setSTATE(String STATE) {
		this.STATE = STATE;
	}

	// 获取 电话号码 的属性值
	public String getMobilePhone() {
		return mobilePhone;
	}

	// 设置 电话号码 的属性值
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
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

	// 获取 地级机构id 的属性值
	public String getCITYID() {
		return CITYID;
	}

	// 设置 地级机构id 的属性值
	public void setCITYID(String CITYID) {
		this.CITYID = CITYID;
	}

	// 获取 类型（0：普通，1：管理员） 的属性值
	public Integer getTYPE() {
		return TYPE;
	}

	// 设置 类型（0：普通，1：管理员） 的属性值
	public void setTYPE(Integer TYPE) {
		this.TYPE = TYPE;
	}

	// 获取 出生日期 的属性值
	public Date getBIRTH() {
		return BIRTH;
	}

	// 设置 出生日期 的属性值
	public void setBIRTH(Date BIRTH) {
		this.BIRTH = BIRTH;
	}

	// 获取 WX_OPENID 的属性值
	public String getWX_OPENID() {
		return WX_OPENID;
	}

	// 设置 WX_OPENID 的属性值
	public void setWX_OPENID(String WX_OPENID) {
		this.WX_OPENID = WX_OPENID;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "User {" + 
				", itemID='" + itemID + '\'' + 
				", itemCode='" + itemCode + '\'' + 
				", ORG_CODE='" + ORG_CODE + '\'' + 
				", USERNAME='" + USERNAME + '\'' + 
				", PASSWORD='" + PASSWORD + '\'' + 
				", SALT='" + SALT + '\'' + 
				", NAME='" + NAME + '\'' + 
				", GENDER='" + GENDER + '\'' + 
				", PORTRAIT='" + PORTRAIT + '\'' + 
				", IDCARD_TYPE='" + IDCARD_TYPE + '\'' + 
				", IDCARD_NO='" + IDCARD_NO + '\'' + 
				", EMAIL='" + EMAIL + '\'' + 
				", STATE='" + STATE + '\'' + 
				", mobilePhone='" + mobilePhone + '\'' + 
				", CREATER='" + CREATER + '\'' + 
				", itemCreateAt='" + itemCreateAt + '\'' + 
				", UPDATER='" + UPDATER + '\'' + 
				", itemUpdateAt='" + itemUpdateAt + '\'' + 
				", CITYID='" + CITYID + '\'' + 
				", TYPE='" + TYPE + '\'' + 
				", BIRTH='" + BIRTH + '\'' + 
				", WX_OPENID='" + WX_OPENID + '\'' + 
				"}";
	}
}