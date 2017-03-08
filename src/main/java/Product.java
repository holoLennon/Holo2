/*
 * zmax 2015
 * 
 



//  


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.annotations.*;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import javax.persistence.Entity;
import com.zmax.utils.string.JsonUtilAli;


import org.apache.commons.lang.builder.*;
import java.text.*;
import java.util.*;
import com.zmax.so.common.dal.bean.base.BaseEntity;
import com.zmax.user.common.dal.bean.User;
import com.zmax.user.common.dal.bean.Member;
import com.zmax.user.common.dal.bean.Manufacturer;
import com.zmax.user.common.dal.bean.Area;
import com.zmax.weix.common.dal.bean.Wxouser;
import com.zmax.weix.common.dal.bean.Wxinvite;
import com.zmax.weix.common.dal.bean.WxinviteMember;


*//**
 * 代理商品
 * @author zmax
 * @version 1.0
 * @since 2015年09月
 *//*

@Entity
@Table(name = "product")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)//可读可写
public class Product extends BaseEntity{
	
	//alias
	public static final String TABLE_ALIAS = "代理商品";

	//date formats
	public static final String FORMAT_GMT_CREATE = DATE_FORMAT;
	public static final String FORMAT_GMT_MODIFIED = DATE_FORMAT;
	public static final String FORMAT_GMT_RELEASE = DATE_FORMAT;
	
	//columns START
	*//**序号ID Integer   *//*
	@Max(99999999999L)
	private Integer id;
	*//**创建时间 Date   *//*
	
	private Date gmtCreate;
	*//**修改时间 Date   *//*
	
	private Date gmtModified;
	*//**发布时间 Date   *//*
	
	private Date gmtRelease;
	*//**商橙状态 Integer default=1  *//*
	@Max(999L)
	private Integer statusApplyPassRefuse = 1;
	*//**卖货宝状态 Integer default=0  map={'0':'下架','1':'上架'}*//*
	@Max(999L)
	private Integer statusSo = 0;
	*//**是否认证 Integer default=0  map={'0':'未认证','1':'已认证'}*//*
	@Max(999L)
	private Integer statusAuthentication = 0;
	*//**库存值类型 Integer default=0  map={'0':'无关联属性库存','1':'关联属性库存'}*//*
	@Max(999L)
	private Integer statusStore = 0;
	*//**微店业主 Integer default=0  *//*
	@Max(99999999999L)
	private Integer userId = 0;
	*//**商品类型 Integer default=0  map={'0':'原创商品','1':'代销商品'}*//*
	@Max(999L)
	private Integer itypeAll = 0;
	*//**代销系统商品 Integer  如果是代销商品，第一次时，输入完此字段即可，其它内容都会从上游戏复制下来，操作员再次修改即可。 *//*
	@Max(99999999999L)
	private Integer allProductId;
	*//**商品分类 Integer   *//*
	@Max(99999999999L)
	private Integer productchannelId;
	*//**发货商 Integer default=0 默认是微商业主自己发货 *//*
	@Max(99999999999L)
	private Integer productsendId = 0;
	*//**产地 String   *//*
	@Length(max=50)
	private String mplace;
	*//**规格 String   *//*
	@Length(max=50)
	private String stype;
	*//**排列顺序 Integer default=99  *//*
	@Max(99999999999L)
	private Integer priority = 99;
	*//**利润类别 Integer default=1 类别数字越小利润越高。如：服装为3类产品，而话费卡为9类产品 map={'1':'1类','2':'2类','3':'3类','4':'4类','5':'5类','6':'6类','7':'7类','8':'8类','9':'9类'}*//*
	@Max(999L)
	private Integer profitclass = 1;
	*//**货号 String   *//*
	@Length(max=50)
	private String productno;
	*//**商品名 String   *//*
	@Length(max=100)
	private String title;
	*//**图1 String  160x160 *//*
	@Length(max=200)
	private String img1;
	*//**手机轮播图1 String  405x240 *//*
	@Length(max=200)
	private String img2;
	*//**手机轮播图2 String  405x240 *//*
	@Length(max=200)
	private String img3;
	*//**手机轮播图3 String  405x240 *//*
	@Length(max=200)
	private String img4;
	*//**图5 String  160x160 *//*
	@Length(max=200)
	private String img5;
	*//**图6 String  160x160 *//*
	@Length(max=200)
	private String img6;
	*//**二维码标签 String  160x160 *//*
	@Length(max=200)
	private String qrimg;
	*//**点击次数 Integer default=0  *//*
	@Max(99999999999L)
	private Integer hittimes = 0;
	*//**购买次数 Integer default=0  *//*
	@Max(99999999999L)
	private Integer buytimes = 0;
	*//**商品单位 Integer default=0  map={'0':'件','1':'个','2':'箱'}*//*
	@Max(999L)
	private Integer punit = 0;
	*//**货币符号 Integer default=0  map={'0':'人民币','1':'美元','2':'日元','3':'欧元','4':'英镑','5':'德国马克','6':'瑞士法郎','7':'法国法郎','8':'加拿大元','9':'澳大利亚元','10':'港币'}*//*
	@Max(999L)
	private Integer currencysymbol = 0;
	*//**市场价 Double default=0.0  *//*
	
	private Double marketprice;
	*//**优惠价 Double default=0.0  *//*
	
	private Double price;
	*//**折扣 Integer default=100 1-100,100表示无折扣 *//*
	@Max(999L)
	private Integer selloff = 100;
	*//**出厂价 Double default=0.0  *//*
	
	private Double inprice;
	*//**毛利率% Integer  百分之几 *//*
	@Max(99999999999L)
	private Integer grossProfit;
	*//**运费 Double default=0.0  *//*
	
	private Double carriagePrice;
	*//**满件数免邮费 Integer default=0  *//*
	@Max(99999999999L)
	private Integer carriageFree = 0;
	*//**最多买几件 Integer default=0  *//*
	@Max(99999999999L)
	private Integer maxBuy = 0;
	*//**银豆 Integer default=0  *//*
	@Max(99999999999L)
	private Integer score = 0;
	*//**金豆 Integer default=0  *//*
	@Max(99999999999L)
	private Integer scoreg = 0;
	*//**库存 Integer default=1 如果要是有属性库存，这里数字会被属性库存的和更新 *//*
	@Max(99999999999L)
	private Integer store = 1;
	*//**简介 String   *//*
	@Length(max=400)
	private String intro;
	*//**生成地址 String   *//*
	@Length(max=200)
	private String genurl;
	*//**详细介绍 String  如果要在这里放图的话，如果不是全屏，请点源码，图片的style属性从style=‘width: 111px; height: 222px;’改为：style=‘width: 100%;’ *//*
	@Length(max=2147483647)
	private String txt;
	*//**关联属性库存列表*//*
	private List<ProductProductpropStore> listProductProductpropStore;
	//columns END
	*//**
	 * 设置默认值
	 * @param _this
	 *//*
	public void makedefault(Product _this){
		_this.gmtCreate=new Date();
		_this.statusApplyPassRefuse=1;
		_this.statusSo=0;
		_this.statusAuthentication=0;
		_this.statusStore=0;
		_this.userId=0;
		_this.itypeAll=0;
		_this.productsendId=0;
		_this.priority=99;
		_this.profitclass=1;
		_this.hittimes=0;
		_this.buytimes=0;
		_this.punit=0;
		_this.currencysymbol=0;
		_this.marketprice=0.0;
		_this.price=0.0;
		_this.selloff=100;
		_this.inprice=0.0;
		_this.carriagePrice=0.0;
		_this.carriageFree=0;
		_this.maxBuy=0;
		_this.score=0;
		_this.scoreg=0;
		_this.store=1;
	}
	public Product(){
		makedefault(this);
	}
	public Product(Integer _id){
		this.id=_id;
		makedefault(this);
	}
	*//**
	 * 不包括自动变量的构造
	 * @param id Integer 序号ID   
	 * @param gmtModified Date 修改时间   
	 * @param gmtRelease Date 发布时间   
	 * @param statusApplyPassRefuse Integer 商橙状态 default=1  
	 * @param statusSo Integer 卖货宝状态 default=0  {'0':'下架','1':'上架'}
	 * @param statusAuthentication Integer 是否认证 default=0  {'0':'未认证','1':'已认证'}
	 * @param statusStore Integer 库存值类型 default=0  {'0':'无关联属性库存','1':'关联属性库存'}
	 * @param userId Integer 微店业主 default=0  
	 * @param itypeAll Integer 商品类型 default=0  {'0':'原创商品','1':'代销商品'}
	 * @param allProductId Integer 代销系统商品  如果是代销商品，第一次时，输入完此字段即可，其它内容都会从上游戏复制下来，操作员再次修改即可。 
	 * @param productchannelId Integer 商品分类   
	 * @param productsendId Integer 发货商 default=0 默认是微商业主自己发货 
	 * @param mplace String 产地   
	 * @param stype String 规格   
	 * @param priority Integer 排列顺序 default=99  
	 * @param profitclass Integer 利润类别 default=1 类别数字越小利润越高。如：服装为3类产品，而话费卡为9类产品 {'1':'1类','2':'2类','3':'3类','4':'4类','5':'5类','6':'6类','7':'7类','8':'8类','9':'9类'}
	 * @param productno String 货号   
	 * @param title String 商品名   
	 * @param img1 String 图1  160x160 
	 * @param img2 String 手机轮播图1  405x240 
	 * @param img3 String 手机轮播图2  405x240 
	 * @param img4 String 手机轮播图3  405x240 
	 * @param img5 String 图5  160x160 
	 * @param img6 String 图6  160x160 
	 * @param qrimg String 二维码标签  160x160 
	 * @param hittimes Integer 点击次数 default=0  
	 * @param buytimes Integer 购买次数 default=0  
	 * @param punit Integer 商品单位 default=0  {'0':'件','1':'个','2':'箱'}
	 * @param currencysymbol Integer 货币符号 default=0  {'0':'人民币','1':'美元','2':'日元','3':'欧元','4':'英镑','5':'德国马克','6':'瑞士法郎','7':'法国法郎','8':'加拿大元','9':'澳大利亚元','10':'港币'}
	 * @param marketprice Double 市场价 default=0.0  
	 * @param price Double 优惠价 default=0.0  
	 * @param selloff Integer 折扣 default=100 1-100,100表示无折扣 
	 * @param inprice Double 出厂价 default=0.0  
	 * @param grossProfit Integer 毛利率%  百分之几 
	 * @param carriagePrice Double 运费 default=0.0  
	 * @param carriageFree Integer 满件数免邮费 default=0  
	 * @param maxBuy Integer 最多买几件 default=0  
	 * @param score Integer 银豆 default=0  
	 * @param scoreg Integer 金豆 default=0  
	 * @param store Integer 库存 default=1 如果要是有属性库存，这里数字会被属性库存的和更新 
	 * @param intro String 简介   
	 * @param genurl String 生成地址   
	 * @param txt String 详细介绍  如果要在这里放图的话，如果不是全屏，请点源码，图片的style属性从style=‘width: 111px; height: 222px;’改为：style=‘width: 100%;’ 
	* @param notuse String 没用
	 *//*
	public Product(Integer id ,Date gmtModified ,Date gmtRelease ,Integer statusApplyPassRefuse ,Integer statusSo ,Integer statusAuthentication ,Integer statusStore ,Integer userId ,Integer itypeAll ,Integer allProductId ,Integer productchannelId ,Integer productsendId ,String mplace ,String stype ,Integer priority ,Integer profitclass ,String productno ,String title ,String img1 ,String img2 ,String img3 ,String img4 ,String img5 ,String img6 ,String qrimg ,Integer hittimes ,Integer buytimes ,Integer punit ,Integer currencysymbol ,Double marketprice ,Double price ,Integer selloff ,Double inprice ,Integer grossProfit ,Double carriagePrice ,Integer carriageFree ,Integer maxBuy ,Integer score ,Integer scoreg ,Integer store ,String intro ,String genurl ,String txt ,String notuse) {
		super();
		this.id = id;
		this.gmtCreate = new Date();
		this.gmtModified = gmtModified;
		this.gmtRelease = gmtRelease;
		this.statusApplyPassRefuse = statusApplyPassRefuse;
		this.statusSo = statusSo;
		this.statusAuthentication = statusAuthentication;
		this.statusStore = statusStore;
		this.userId = userId;
		this.itypeAll = itypeAll;
		this.allProductId = allProductId;
		this.productchannelId = productchannelId;
		this.productsendId = productsendId;
		this.mplace = mplace;
		this.stype = stype;
		this.priority = priority;
		this.profitclass = profitclass;
		this.productno = productno;
		this.title = title;
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
		this.img4 = img4;
		this.img5 = img5;
		this.img6 = img6;
		this.qrimg = qrimg;
		this.hittimes = hittimes;
		this.buytimes = buytimes;
		this.punit = punit;
		this.currencysymbol = currencysymbol;
		this.marketprice = marketprice;
		this.price = price;
		this.selloff = selloff;
		this.inprice = inprice;
		this.grossProfit = grossProfit;
		this.carriagePrice = carriagePrice;
		this.carriageFree = carriageFree;
		this.maxBuy = maxBuy;
		this.score = score;
		this.scoreg = scoreg;
		this.store = store;
		this.intro = intro;
		this.genurl = genurl;
		this.txt = txt;
	}
	*//**
	 * 全部数据的构造，包括了对象字段
	 * @param id Integer 序号ID   
	 * @param gmtCreate Date 创建时间   
	 * @param gmtModified Date 修改时间   
	 * @param gmtRelease Date 发布时间   
	 * @param statusApplyPassRefuse Integer 商橙状态 default=1  
	 * @param statusSo Integer 卖货宝状态 default=0  {'0':'下架','1':'上架'}
	 * @param statusAuthentication Integer 是否认证 default=0  {'0':'未认证','1':'已认证'}
	 * @param statusStore Integer 库存值类型 default=0  {'0':'无关联属性库存','1':'关联属性库存'}
	 * @param userId Integer 微店业主 default=0  
	 * @param itypeAll Integer 商品类型 default=0  {'0':'原创商品','1':'代销商品'}
	 * @param allProductId Integer 代销系统商品  如果是代销商品，第一次时，输入完此字段即可，其它内容都会从上游戏复制下来，操作员再次修改即可。 
	 * @param productchannelId Integer 商品分类   
	 * @param productsendId Integer 发货商 default=0 默认是微商业主自己发货 
	 * @param mplace String 产地   
	 * @param stype String 规格   
	 * @param priority Integer 排列顺序 default=99  
	 * @param profitclass Integer 利润类别 default=1 类别数字越小利润越高。如：服装为3类产品，而话费卡为9类产品 {'1':'1类','2':'2类','3':'3类','4':'4类','5':'5类','6':'6类','7':'7类','8':'8类','9':'9类'}
	 * @param productno String 货号   
	 * @param title String 商品名   
	 * @param img1 String 图1  160x160 
	 * @param img2 String 手机轮播图1  405x240 
	 * @param img3 String 手机轮播图2  405x240 
	 * @param img4 String 手机轮播图3  405x240 
	 * @param img5 String 图5  160x160 
	 * @param img6 String 图6  160x160 
	 * @param qrimg String 二维码标签  160x160 
	 * @param hittimes Integer 点击次数 default=0  
	 * @param buytimes Integer 购买次数 default=0  
	 * @param punit Integer 商品单位 default=0  {'0':'件','1':'个','2':'箱'}
	 * @param currencysymbol Integer 货币符号 default=0  {'0':'人民币','1':'美元','2':'日元','3':'欧元','4':'英镑','5':'德国马克','6':'瑞士法郎','7':'法国法郎','8':'加拿大元','9':'澳大利亚元','10':'港币'}
	 * @param marketprice Double 市场价 default=0.0  
	 * @param price Double 优惠价 default=0.0  
	 * @param selloff Integer 折扣 default=100 1-100,100表示无折扣 
	 * @param inprice Double 出厂价 default=0.0  
	 * @param grossProfit Integer 毛利率%  百分之几 
	 * @param carriagePrice Double 运费 default=0.0  
	 * @param carriageFree Integer 满件数免邮费 default=0  
	 * @param maxBuy Integer 最多买几件 default=0  
	 * @param score Integer 银豆 default=0  
	 * @param scoreg Integer 金豆 default=0  
	 * @param store Integer 库存 default=1 如果要是有属性库存，这里数字会被属性库存的和更新 
	 * @param intro String 简介   
	 * @param genurl String 生成地址   
	 * @param txt String 详细介绍  如果要在这里放图的话，如果不是全屏，请点源码，图片的style属性从style=‘width: 111px; height: 222px;’改为：style=‘width: 100%;’ 
	 * @param listProductProductpropStore String 关联属性库存列表   
	* @param notuse String 没用
	 *//*
	public Product(Integer id ,Date gmtCreate ,Date gmtModified ,Date gmtRelease ,Integer statusApplyPassRefuse ,Integer statusSo ,Integer statusAuthentication ,Integer statusStore ,Integer userId ,Integer itypeAll ,Integer allProductId ,Integer productchannelId ,Integer productsendId ,String mplace ,String stype ,Integer priority ,Integer profitclass ,String productno ,String title ,String img1 ,String img2 ,String img3 ,String img4 ,String img5 ,String img6 ,String qrimg ,Integer hittimes ,Integer buytimes ,Integer punit ,Integer currencysymbol ,Double marketprice ,Double price ,Integer selloff ,Double inprice ,Integer grossProfit ,Double carriagePrice ,Integer carriageFree ,Integer maxBuy ,Integer score ,Integer scoreg ,Integer store ,String intro ,String genurl ,String txt ,List<ProductProductpropStore> listProductProductpropStore ,String notuse,Object notuse2) {
		super();
		this.id = id;
		this.gmtCreate = gmtCreate;
		this.gmtModified = gmtModified;
		this.gmtRelease = gmtRelease;
		this.statusApplyPassRefuse = statusApplyPassRefuse;
		this.statusSo = statusSo;
		this.statusAuthentication = statusAuthentication;
		this.statusStore = statusStore;
		this.userId = userId;
		this.itypeAll = itypeAll;
		this.allProductId = allProductId;
		this.productchannelId = productchannelId;
		this.productsendId = productsendId;
		this.mplace = mplace;
		this.stype = stype;
		this.priority = priority;
		this.profitclass = profitclass;
		this.productno = productno;
		this.title = title;
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
		this.img4 = img4;
		this.img5 = img5;
		this.img6 = img6;
		this.qrimg = qrimg;
		this.hittimes = hittimes;
		this.buytimes = buytimes;
		this.punit = punit;
		this.currencysymbol = currencysymbol;
		this.marketprice = marketprice;
		this.price = price;
		this.selloff = selloff;
		this.inprice = inprice;
		this.grossProfit = grossProfit;
		this.carriagePrice = carriagePrice;
		this.carriageFree = carriageFree;
		this.maxBuy = maxBuy;
		this.score = score;
		this.scoreg = scoreg;
		this.store = store;
		this.intro = intro;
		this.genurl = genurl;
		this.txt = txt;
		this.listProductProductpropStore = listProductProductpropStore;
	}

	*//**我的中文名称*//*
	private String myname;
	*//**我的中文名称*//*
	@Transient
	
	//@JSONField(serialize = false)
	public String getMyname() {
		myname=(myname==null)?""+id+" "+title+" ":myname;
		return myname;
	}
	*//**我的中文名称*//*
	public void setMyname(String myname) {
		this.myname = myname;
	}
	*//**设置主键*//*
	

	public void setId(Integer value) {
		this.id = value;
	}
	*//**获取主键*//*
	

	@Id @GeneratedValue(generator="custom-id")
	@GenericGenerator(name="custom-id", strategy = "identity")
	@Column(name = "id",  unique = false, nullable = false, insertable = true, updatable = true, length = 11)
	public Integer getId() {
		return this.id;
	}
	
	*//**获取创建时间  *//*
	

	@Column(name = "gmt_create", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	*//**设置创建时间  *//*

	public void setGmtCreate(Date value) {
		this.gmtCreate = value;
	}
	*//**获取修改时间  *//*
	

	@Column(name = "gmt_modified", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
	public Date getGmtModified() {
		return this.gmtModified;
	}
	*//**设置修改时间  *//*

	public void setGmtModified(Date value) {
		this.gmtModified = value;
	}
	*//**获取发布时间  *//*
	

	@Column(name = "gmt_release", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
	public Date getGmtRelease() {
		return this.gmtRelease;
	}
	*//**设置发布时间  *//*

	public void setGmtRelease(Date value) {
		this.gmtRelease = value;
	}
	*//**获取商橙状态  *//*
	

	@Column(name = "status_apply_pass_refuse", unique = false, nullable = true, insertable = true, updatable = true, length = 3)
	public Integer getStatusApplyPassRefuse() {
		return this.statusApplyPassRefuse;
	}
	*//**设置商橙状态  *//*

	public void setStatusApplyPassRefuse(Integer value) {
		this.statusApplyPassRefuse = value;
	}
	*//**获取卖货宝状态  {'0':'下架','1':'上架'}*//*
	

	@Column(name = "status_so", unique = false, nullable = true, insertable = true, updatable = true, length = 3)
	public Integer getStatusSo() {
		return this.statusSo;
	}
	*//**设置卖货宝状态  {'0':'下架','1':'上架'}*//*

	public void setStatusSo(Integer value) {
		this.statusSo = value;
	}
	*//**获取是否认证  {'0':'未认证','1':'已认证'}*//*
	

	@Column(name = "status_authentication", unique = false, nullable = true, insertable = true, updatable = true, length = 3)
	public Integer getStatusAuthentication() {
		return this.statusAuthentication;
	}
	*//**设置是否认证  {'0':'未认证','1':'已认证'}*//*

	public void setStatusAuthentication(Integer value) {
		this.statusAuthentication = value;
	}
	*//**获取库存值类型  {'0':'无关联属性库存','1':'关联属性库存'}*//*
	

	@Column(name = "status_store", unique = false, nullable = true, insertable = true, updatable = true, length = 3)
	public Integer getStatusStore() {
		return this.statusStore;
	}
	*//**设置库存值类型  {'0':'无关联属性库存','1':'关联属性库存'}*//*

	public void setStatusStore(Integer value) {
		this.statusStore = value;
	}
	*//**获取微店业主  *//*
	

	@Column(name = "user_id", unique = false, nullable = true, insertable = true, updatable = true, length = 11)
	public Integer getUserId() {
		return this.userId;
	}
	*//**设置微店业主  *//*

	public void setUserId(Integer value) {
		this.userId = value;
	}
	*//**获取商品类型  {'0':'原创商品','1':'代销商品'}*//*
	

	@Column(name = "itype_all", unique = false, nullable = true, insertable = true, updatable = true, length = 3)
	public Integer getItypeAll() {
		return this.itypeAll;
	}
	*//**设置商品类型  {'0':'原创商品','1':'代销商品'}*//*

	public void setItypeAll(Integer value) {
		this.itypeAll = value;
	}
	*//**获取代销系统商品 如果是代销商品，第一次时，输入完此字段即可，其它内容都会从上游戏复制下来，操作员再次修改即可。 *//*
	

	@Column(name = "all_product_id", unique = false, nullable = true, insertable = true, updatable = true, length = 11)
	public Integer getAllProductId() {
		return this.allProductId;
	}
	*//**设置代销系统商品 如果是代销商品，第一次时，输入完此字段即可，其它内容都会从上游戏复制下来，操作员再次修改即可。 *//*

	public void setAllProductId(Integer value) {
		this.allProductId = value;
	}
	*//**获取商品分类  *//*
	

	@Column(name = "productchannel_id", unique = false, nullable = true, insertable = true, updatable = true, length = 11)
	public Integer getProductchannelId() {
		return this.productchannelId;
	}
	*//**设置商品分类  *//*

	public void setProductchannelId(Integer value) {
		this.productchannelId = value;
	}
	*//**获取发货商 默认是微商业主自己发货 *//*
	

	@Column(name = "productsend_id", unique = false, nullable = true, insertable = true, updatable = true, length = 11)
	public Integer getProductsendId() {
		return this.productsendId;
	}
	*//**设置发货商 默认是微商业主自己发货 *//*

	public void setProductsendId(Integer value) {
		this.productsendId = value;
	}
	*//**获取产地  *//*
	

	@Column(name = "mplace", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
	public String getMplace() {
		return this.mplace;
	}
	*//**设置产地  *//*

	public void setMplace(String value) {
		this.mplace = value;
	}
	*//**获取规格  *//*
	

	@Column(name = "stype", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
	public String getStype() {
		return this.stype;
	}
	*//**设置规格  *//*

	public void setStype(String value) {
		this.stype = value;
	}
	*//**获取排列顺序  *//*
	

	@Column(name = "priority", unique = false, nullable = true, insertable = true, updatable = true, length = 11)
	public Integer getPriority() {
		return this.priority;
	}
	*//**设置排列顺序  *//*

	public void setPriority(Integer value) {
		this.priority = value;
	}
	*//**获取利润类别 类别数字越小利润越高。如：服装为3类产品，而话费卡为9类产品 {'1':'1类','2':'2类','3':'3类','4':'4类','5':'5类','6':'6类','7':'7类','8':'8类','9':'9类'}*//*
	

	@Column(name = "profitclass", unique = false, nullable = true, insertable = true, updatable = true, length = 3)
	public Integer getProfitclass() {
		return this.profitclass;
	}
	*//**设置利润类别 类别数字越小利润越高。如：服装为3类产品，而话费卡为9类产品 {'1':'1类','2':'2类','3':'3类','4':'4类','5':'5类','6':'6类','7':'7类','8':'8类','9':'9类'}*//*

	public void setProfitclass(Integer value) {
		this.profitclass = value;
	}
	*//**获取货号  *//*
	

	@Column(name = "productno", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
	public String getProductno() {
		return this.productno;
	}
	*//**设置货号  *//*

	public void setProductno(String value) {
		this.productno = value;
	}
	*//**获取商品名  *//*
	

	@Column(name = "title", unique = false, nullable = true, insertable = true, updatable = true, length = 100)
	public String getTitle() {
		return this.title;
	}
	*//**设置商品名  *//*

	public void setTitle(String value) {
		this.title = value;
	}
	*//**获取图1 160x160 *//*
	

	@Column(name = "img1", unique = false, nullable = true, insertable = true, updatable = true, length = 200)
	public String getImg1() {
		return this.img1;
	}
	*//**设置图1 160x160 *//*

	public void setImg1(String value) {
		this.img1 = value;
	}
	*//**获取手机轮播图1 405x240 *//*
	

	@Column(name = "img2", unique = false, nullable = true, insertable = true, updatable = true, length = 200)
	public String getImg2() {
		return this.img2;
	}
	*//**设置手机轮播图1 405x240 *//*

	public void setImg2(String value) {
		this.img2 = value;
	}
	*//**获取手机轮播图2 405x240 *//*
	

	@Column(name = "img3", unique = false, nullable = true, insertable = true, updatable = true, length = 200)
	public String getImg3() {
		return this.img3;
	}
	*//**设置手机轮播图2 405x240 *//*

	public void setImg3(String value) {
		this.img3 = value;
	}
	*//**获取手机轮播图3 405x240 *//*
	

	@Column(name = "img4", unique = false, nullable = true, insertable = true, updatable = true, length = 200)
	public String getImg4() {
		return this.img4;
	}
	*//**设置手机轮播图3 405x240 *//*

	public void setImg4(String value) {
		this.img4 = value;
	}
	*//**获取图5 160x160 *//*
	

	@Column(name = "img5", unique = false, nullable = true, insertable = true, updatable = true, length = 200)
	public String getImg5() {
		return this.img5;
	}
	*//**设置图5 160x160 *//*

	public void setImg5(String value) {
		this.img5 = value;
	}
	*//**获取图6 160x160 *//*
	

	@Column(name = "img6", unique = false, nullable = true, insertable = true, updatable = true, length = 200)
	public String getImg6() {
		return this.img6;
	}
	*//**设置图6 160x160 *//*

	public void setImg6(String value) {
		this.img6 = value;
	}
	*//**获取二维码标签 160x160 *//*
	

	@Column(name = "qrimg", unique = false, nullable = true, insertable = true, updatable = true, length = 200)
	public String getQrimg() {
		return this.qrimg;
	}
	*//**设置二维码标签 160x160 *//*

	public void setQrimg(String value) {
		this.qrimg = value;
	}
	*//**获取点击次数  *//*
	

	@Column(name = "hittimes", unique = false, nullable = true, insertable = true, updatable = true, length = 11)
	public Integer getHittimes() {
		return this.hittimes;
	}
	*//**设置点击次数  *//*

	public void setHittimes(Integer value) {
		this.hittimes = value;
	}
	*//**获取购买次数  *//*
	

	@Column(name = "buytimes", unique = false, nullable = true, insertable = true, updatable = true, length = 11)
	public Integer getBuytimes() {
		return this.buytimes;
	}
	*//**设置购买次数  *//*

	public void setBuytimes(Integer value) {
		this.buytimes = value;
	}
	*//**获取商品单位  {'0':'件','1':'个','2':'箱'}*//*
	

	@Column(name = "punit", unique = false, nullable = true, insertable = true, updatable = true, length = 3)
	public Integer getPunit() {
		return this.punit;
	}
	*//**设置商品单位  {'0':'件','1':'个','2':'箱'}*//*

	public void setPunit(Integer value) {
		this.punit = value;
	}
	*//**获取货币符号  {'0':'人民币','1':'美元','2':'日元','3':'欧元','4':'英镑','5':'德国马克','6':'瑞士法郎','7':'法国法郎','8':'加拿大元','9':'澳大利亚元','10':'港币'}*//*
	

	@Column(name = "currencysymbol", unique = false, nullable = true, insertable = true, updatable = true, length = 3)
	public Integer getCurrencysymbol() {
		return this.currencysymbol;
	}
	*//**设置货币符号  {'0':'人民币','1':'美元','2':'日元','3':'欧元','4':'英镑','5':'德国马克','6':'瑞士法郎','7':'法国法郎','8':'加拿大元','9':'澳大利亚元','10':'港币'}*//*

	public void setCurrencysymbol(Integer value) {
		this.currencysymbol = value;
	}
	*//**获取市场价  *//*
	

	@Column(name = "marketprice", columnDefinition="double(11,2) default '0.00'", unique = false, nullable = true, insertable = true, updatable = true, length = 11)
	public Double getMarketprice() {
		return this.marketprice;
	}
	*//**设置市场价  *//*

	public void setMarketprice(Double value) {
		this.marketprice = value;
	}
	*//**获取优惠价  *//*
	

	@Column(name = "price", columnDefinition="double(11,2) default '0.00'", unique = false, nullable = true, insertable = true, updatable = true, length = 11)
	public Double getPrice() {
		return this.price;
	}
	*//**设置优惠价  *//*

	public void setPrice(Double value) {
		this.price = value;
	}
	*//**获取折扣 1-100,100表示无折扣 *//*
	

	@Column(name = "selloff", unique = false, nullable = true, insertable = true, updatable = true, length = 3)
	public Integer getSelloff() {
		return this.selloff;
	}
	*//**设置折扣 1-100,100表示无折扣 *//*

	public void setSelloff(Integer value) {
		this.selloff = value;
	}
	*//**获取出厂价  *//*
	

	@Column(name = "inprice", columnDefinition="double(11,2) default '0.00'", unique = false, nullable = true, insertable = true, updatable = true, length = 11)
	public Double getInprice() {
		return this.inprice;
	}
	*//**设置出厂价  *//*

	public void setInprice(Double value) {
		this.inprice = value;
	}
	*//**获取毛利率% 百分之几 *//*
	

	@Column(name = "gross_profit", unique = false, nullable = true, insertable = true, updatable = true, length = 11)
	public Integer getGrossProfit() {
		return this.grossProfit;
	}
	*//**设置毛利率% 百分之几 *//*

	public void setGrossProfit(Integer value) {
		this.grossProfit = value;
	}
	*//**获取运费  *//*
	

	@Column(name = "carriage_price", columnDefinition="double(11,2) default '0.00'", unique = false, nullable = true, insertable = true, updatable = true, length = 11)
	public Double getCarriagePrice() {
		return this.carriagePrice;
	}
	*//**设置运费  *//*

	public void setCarriagePrice(Double value) {
		this.carriagePrice = value;
	}
	*//**获取满件数免邮费  *//*
	

	@Column(name = "carriage_free", unique = false, nullable = true, insertable = true, updatable = true, length = 11)
	public Integer getCarriageFree() {
		return this.carriageFree;
	}
	*//**设置满件数免邮费  *//*

	public void setCarriageFree(Integer value) {
		this.carriageFree = value;
	}
	*//**获取最多买几件  *//*
	

	@Column(name = "max_buy", unique = false, nullable = true, insertable = true, updatable = true, length = 11)
	public Integer getMaxBuy() {
		return this.maxBuy;
	}
	*//**设置最多买几件  *//*

	public void setMaxBuy(Integer value) {
		this.maxBuy = value;
	}
	*//**获取银豆  *//*
	

	@Column(name = "score", unique = false, nullable = true, insertable = true, updatable = true, length = 11)
	public Integer getScore() {
		return this.score;
	}
	*//**设置银豆  *//*

	public void setScore(Integer value) {
		this.score = value;
	}
	*//**获取金豆  *//*
	

	@Column(name = "scoreg", unique = false, nullable = true, insertable = true, updatable = true, length = 11)
	public Integer getScoreg() {
		return this.scoreg;
	}
	*//**设置金豆  *//*

	public void setScoreg(Integer value) {
		this.scoreg = value;
	}
	*//**获取库存 如果要是有属性库存，这里数字会被属性库存的和更新 *//*
	

	@Column(name = "store", unique = false, nullable = true, insertable = true, updatable = true, length = 11)
	public Integer getStore() {
		return this.store;
	}
	*//**设置库存 如果要是有属性库存，这里数字会被属性库存的和更新 *//*

	public void setStore(Integer value) {
		this.store = value;
	}
	*//**获取简介  *//*
	

	@Column(name = "intro", unique = false, nullable = true, insertable = true, updatable = true, length = 400)
	public String getIntro() {
		return this.intro;
	}
	*//**设置简介  *//*

	public void setIntro(String value) {
		this.intro = value;
	}
	*//**获取生成地址  *//*
	

	@Column(name = "genurl", unique = false, nullable = true, insertable = true, updatable = true, length = 200)
	public String getGenurl() {
		return this.genurl;
	}
	*//**设置生成地址  *//*

	public void setGenurl(String value) {
		this.genurl = value;
	}
	*//**获取详细介绍 如果要在这里放图的话，如果不是全屏，请点源码，图片的style属性从style=‘width: 111px; height: 222px;’改为：style=‘width: 100%;’ *//*
	

	@Column(name = "txt", unique = false, nullable = true, insertable = true, updatable = true, length = 2147483647)
	public String getTxt() {
		return this.txt;
	}
	*//**设置详细介绍 如果要在这里放图的话，如果不是全屏，请点源码，图片的style属性从style=‘width: 111px; height: 222px;’改为：style=‘width: 100%;’ *//*

	public void setTxt(String value) {
		this.txt = value;
	}
	*//**对象 获取关联属性库存列表  *//*
	@Transient
	

	public List<ProductProductpropStore> getListProductProductpropStore() {
		return this.listProductProductpropStore;
	}
	*//**设置关联属性库存列表  *//*

	public void setListProductProductpropStore(List<ProductProductpropStore> value) {
		this.listProductProductpropStore = value;
	}
	*//**创建时间String*//*
	private String gmtCreateString;
	*//**获取创建时间String*//*
	@Transient
	
	public String getGmtCreateString() {
		if(gmtCreateString==null && gmtCreate!=null)
			gmtCreateString=new SimpleDateFormat(DATE_FORMAT).format(gmtCreate);
		return gmtCreateString;
	}
	*//**设置创建时间String*//*
	public void setGmtCreateString(String value) {
		this.gmtCreateString=value;
	}
	*//**修改时间String*//*
	private String gmtModifiedString;
	*//**获取修改时间String*//*
	@Transient
	
	public String getGmtModifiedString() {
		if(gmtModifiedString==null && gmtModified!=null)
			gmtModifiedString=new SimpleDateFormat(DATE_FORMAT).format(gmtModified);
		return gmtModifiedString;
	}
	*//**设置修改时间String*//*
	public void setGmtModifiedString(String value) {
		this.gmtModifiedString=value;
	}
	*//**发布时间String*//*
	private String gmtReleaseString;
	*//**获取发布时间String*//*
	@Transient
	
	public String getGmtReleaseString() {
		if(gmtReleaseString==null && gmtRelease!=null)
			gmtReleaseString=new SimpleDateFormat(DATE_FORMAT).format(gmtRelease);
		return gmtReleaseString;
	}
	*//**设置发布时间String*//*
	public void setGmtReleaseString(String value) {
		this.gmtReleaseString=value;
	}
	*//**商橙状态String*//*
	private String statusApplyPassRefuseString;
	*//**获取商橙状态String*//*
	@Transient
	
	public String getStatusApplyPassRefuseString() {
		return statusApplyPassRefuseString;
	}
	*//**设置商橙状态String*//*
	public void setStatusApplyPassRefuseString(String value) {
		this.statusApplyPassRefuseString=value;
	}
	*//**商橙状态Map*//*
	private Map<String, Object> statusApplyPassRefuseMap;
	*//**获取商橙状态Map*//*
	@Transient
	
	public Map<String, Object> getStatusApplyPassRefuseMap() {
		return statusApplyPassRefuseMap;
	}
	*//**设置商橙状态Map*//*
	public void setStatusApplyPassRefuseMap(Map<String, Object> value) {
		this.statusApplyPassRefuseMap=value;
	}
	*//**卖货宝状态String*//*
	private String statusSoString;
	*//**获取卖货宝状态String*//*
	@Transient
	
	public String getStatusSoString() {
		return statusSoString;
	}
	*//**设置卖货宝状态String*//*
	public void setStatusSoString(String value) {
		this.statusSoString=value;
	}
	*//**卖货宝状态Map*//*
	private Map<String, Object> statusSoMap;
	*//**获取卖货宝状态Map*//*
	@Transient
	
	public Map<String, Object> getStatusSoMap() {
		return statusSoMap;
	}
	*//**设置卖货宝状态Map*//*
	public void setStatusSoMap(Map<String, Object> value) {
		this.statusSoMap=value;
	}
	*//**是否认证String*//*
	private String statusAuthenticationString;
	*//**获取是否认证String*//*
	@Transient
	
	public String getStatusAuthenticationString() {
		return statusAuthenticationString;
	}
	*//**设置是否认证String*//*
	public void setStatusAuthenticationString(String value) {
		this.statusAuthenticationString=value;
	}
	*//**是否认证Map*//*
	private Map<String, Object> statusAuthenticationMap;
	*//**获取是否认证Map*//*
	@Transient
	
	public Map<String, Object> getStatusAuthenticationMap() {
		return statusAuthenticationMap;
	}
	*//**设置是否认证Map*//*
	public void setStatusAuthenticationMap(Map<String, Object> value) {
		this.statusAuthenticationMap=value;
	}
	*//**库存值类型String*//*
	private String statusStoreString;
	*//**获取库存值类型String*//*
	@Transient
	
	public String getStatusStoreString() {
		return statusStoreString;
	}
	*//**设置库存值类型String*//*
	public void setStatusStoreString(String value) {
		this.statusStoreString=value;
	}
	*//**库存值类型Map*//*
	private Map<String, Object> statusStoreMap;
	*//**获取库存值类型Map*//*
	@Transient
	
	public Map<String, Object> getStatusStoreMap() {
		return statusStoreMap;
	}
	*//**设置库存值类型Map*//*
	public void setStatusStoreMap(Map<String, Object> value) {
		this.statusStoreMap=value;
	}
	*//**微店业主String*//*
	private String userIdString;
	*//**获取微店业主String*//*
	@Transient
	
	public String getUserIdString() {
		return userIdString;
	}
	*//**设置微店业主String*//*
	public void setUserIdString(String value) {
		this.userIdString=value;
	}
	*//**User - userIdUserObj*//*
	private User userIdUserObj;
	*//**获取 User - userIdUserObj*//*
	@Transient
	
	public User getUserIdUserObj() {
		return userIdUserObj;
	}
	*//**设置 User - 微店业主Obj*//*
	public void setUserIdUserObj(User value) {
		this.userIdUserObj=value;
	}
	*//**商品类型String*//*
	private String itypeAllString;
	*//**获取商品类型String*//*
	@Transient
	
	public String getItypeAllString() {
		return itypeAllString;
	}
	*//**设置商品类型String*//*
	public void setItypeAllString(String value) {
		this.itypeAllString=value;
	}
	*//**商品类型Map*//*
	private Map<String, Object> itypeAllMap;
	*//**获取商品类型Map*//*
	@Transient
	
	public Map<String, Object> getItypeAllMap() {
		return itypeAllMap;
	}
	*//**设置商品类型Map*//*
	public void setItypeAllMap(Map<String, Object> value) {
		this.itypeAllMap=value;
	}
	*//**代销系统商品String*//*
	private String allProductIdString;
	*//**获取代销系统商品String*//*
	@Transient
	
	public String getAllProductIdString() {
		return allProductIdString;
	}
	*//**设置代销系统商品String*//*
	public void setAllProductIdString(String value) {
		this.allProductIdString=value;
	}
	*//**AllProduct - allProductIdAllProductObj*//*
	private AllProduct allProductIdAllProductObj;
	*//**获取 AllProduct - allProductIdAllProductObj*//*
	@Transient
	
	public AllProduct getAllProductIdAllProductObj() {
		return allProductIdAllProductObj;
	}
	*//**设置 AllProduct - 代销系统商品Obj*//*
	public void setAllProductIdAllProductObj(AllProduct value) {
		this.allProductIdAllProductObj=value;
	}
	*//**商品分类String*//*
	private String productchannelIdString;
	*//**获取商品分类String*//*
	@Transient
	
	public String getProductchannelIdString() {
		return productchannelIdString;
	}
	*//**设置商品分类String*//*
	public void setProductchannelIdString(String value) {
		this.productchannelIdString=value;
	}
	*//**Productchannel - productchannelIdProductchannelObj*//*
	private Productchannel productchannelIdProductchannelObj;
	*//**获取 Productchannel - productchannelIdProductchannelObj*//*
	@Transient
	
	public Productchannel getProductchannelIdProductchannelObj() {
		return productchannelIdProductchannelObj;
	}
	*//**设置 Productchannel - 商品分类Obj*//*
	public void setProductchannelIdProductchannelObj(Productchannel value) {
		this.productchannelIdProductchannelObj=value;
	}
	*//**发货商String*//*
	private String productsendIdString;
	*//**获取发货商String*//*
	@Transient
	
	public String getProductsendIdString() {
		return productsendIdString;
	}
	*//**设置发货商String*//*
	public void setProductsendIdString(String value) {
		this.productsendIdString=value;
	}
	*//**Productsend - productsendIdProductsendObj*//*
	private Productsend productsendIdProductsendObj;
	*//**获取 Productsend - productsendIdProductsendObj*//*
	@Transient
	
	public Productsend getProductsendIdProductsendObj() {
		return productsendIdProductsendObj;
	}
	*//**设置 Productsend - 发货商Obj*//*
	public void setProductsendIdProductsendObj(Productsend value) {
		this.productsendIdProductsendObj=value;
	}
	*//**利润类别String*//*
	private String profitclassString;
	*//**获取利润类别String*//*
	@Transient
	
	public String getProfitclassString() {
		return profitclassString;
	}
	*//**设置利润类别String*//*
	public void setProfitclassString(String value) {
		this.profitclassString=value;
	}
	*//**利润类别Map*//*
	private Map<String, Object> profitclassMap;
	*//**获取利润类别Map*//*
	@Transient
	
	public Map<String, Object> getProfitclassMap() {
		return profitclassMap;
	}
	*//**设置利润类别Map*//*
	public void setProfitclassMap(Map<String, Object> value) {
		this.profitclassMap=value;
	}
	*//**商品单位String*//*
	private String punitString;
	*//**获取商品单位String*//*
	@Transient
	
	public String getPunitString() {
		return punitString;
	}
	*//**设置商品单位String*//*
	public void setPunitString(String value) {
		this.punitString=value;
	}
	*//**商品单位Map*//*
	private Map<String, Object> punitMap;
	*//**获取商品单位Map*//*
	@Transient
	
	public Map<String, Object> getPunitMap() {
		return punitMap;
	}
	*//**设置商品单位Map*//*
	public void setPunitMap(Map<String, Object> value) {
		this.punitMap=value;
	}
	*//**货币符号String*//*
	private String currencysymbolString;
	*//**获取货币符号String*//*
	@Transient
	
	public String getCurrencysymbolString() {
		return currencysymbolString;
	}
	*//**设置货币符号String*//*
	public void setCurrencysymbolString(String value) {
		this.currencysymbolString=value;
	}
	*//**货币符号Map*//*
	private Map<String, Object> currencysymbolMap;
	*//**获取货币符号Map*//*
	@Transient
	
	public Map<String, Object> getCurrencysymbolMap() {
		return currencysymbolMap;
	}
	*//**设置货币符号Map*//*
	public void setCurrencysymbolMap(Map<String, Object> value) {
		this.currencysymbolMap=value;
	}

	*//**
	 * 清空ONE MANY对象，用于WS,JSON等场景
	 *//*
	public void makeNullObj(){
		this.obj1=null;
		this.obj2=null;
		this.obj3=null;
		this.obj4=null;
		this.obj5=null;
		this.statusApplyPassRefuseMap=null;
		this.statusSoMap=null;
		this.statusAuthenticationMap=null;
		this.statusStoreMap=null;
		this.userIdUserObj=null; //User
		this.itypeAllMap=null;
		this.allProductIdAllProductObj=null; //AllProduct
		this.productchannelIdProductchannelObj=null; //Productchannel
		this.productsendIdProductsendObj=null; //Productsend
		this.profitclassMap=null;
		this.punitMap=null;
		this.currencysymbolMap=null;
	}
	*//**
	 * 非常严格的检查对象，不能空不能0
	 * @param checkId 是否检查id
	 * @return
	 *//*
	public boolean errCheckObjHard(boolean checkId){
		if (errCheckObj(checkId))
			return true;
		if(checkId){
			if(0==this.id)
				return true;
		}
		return false;
	}
	*//**
	 * 较松的的检查对象，不能空，可以是0
	 * @param checkId 是否检查id
	 * @return
	 *//*
	public boolean errCheckObj(boolean checkId){
		if(checkId){
			if(this.id==null)
				return true;
		}
		return false;
	}
	*//**备用对象1*//*
	private Object obj1;
	*//**
	 * 获取备用对象1
	 * @return Object
	 *//*
	@Transient
	
	public Object getObj1() {
		return obj1;
	}
	*//**
	 * 设置备用对象1
	 * @param obj1
	 *//*
	public void setObj1(Object obj1) {
		this.obj1 = obj1;
	}
	*//**备用对象2*//*
	private Object obj2;
	*//**
	 * 获取备用对象2
	 * @return Object
	 *//*
	@Transient
	
	public Object getObj2() {
		return obj2;
	}
	*//**
	 * 设置备用对象2
	 * @param obj2
	 *//*
	public void setObj2(Object obj2) {
		this.obj2 = obj2;
	}
	*//**备用对象3*//*
	private Object obj3;
	*//**
	 * 获取备用对象3
	 * @return Object
	 *//*
	@Transient
	
	public Object getObj3() {
		return obj3;
	}
	*//**
	 * 设置备用对象3
	 * @param obj3
	 *//*
	public void setObj3(Object obj3) {
		this.obj3 = obj3;
	}
	*//**备用对象4*//*
	private Object obj4;
	*//**
	 * 获取备用对象4
	 * @return Object
	 *//*
	@Transient
	
	public Object getObj4() {
		return obj4;
	}
	*//**
	 * 设置备用对象4
	 * @param obj4
	 *//*
	public void setObj4(Object obj4) {
		this.obj4 = obj4;
	}
	*//**备用对象5*//*
	private Object obj5;
	*//**
	 * 获取备用对象5
	 * @return Object
	 *//*
	@Transient
	
	public Object getObj5() {
		return obj5;
	}
	*//**
	 * 设置备用对象5
	 * @param obj5
	 *//*
	public void setObj5(Object obj5) {
		this.obj5 = obj5;
	}

	*//**
	 * Hash，同所有字段相加判断
	 *//*
	public int hashCode() {
		if(getId()==null)
		return new HashCodeBuilder()
			.append(getId())
			.append(getGmtCreate())
			.append(getGmtModified())
			.append(getGmtRelease())
			.append(getStatusApplyPassRefuse())
			.append(getStatusSo())
			.append(getStatusAuthentication())
			.append(getStatusStore())
			.append(getUserId())
			.append(getItypeAll())
			.append(getAllProductId())
			.append(getProductchannelId())
			.append(getProductsendId())
			.append(getMplace())
			.append(getStype())
			.append(getPriority())
			.append(getProfitclass())
			.append(getProductno())
			.append(getTitle())
			.append(getImg1())
			.append(getImg2())
			.append(getImg3())
			.append(getImg4())
			.append(getImg5())
			.append(getImg6())
			.append(getQrimg())
			.append(getHittimes())
			.append(getBuytimes())
			.append(getPunit())
			.append(getCurrencysymbol())
			.append(getMarketprice())
			.append(getPrice())
			.append(getSelloff())
			.append(getInprice())
			.append(getGrossProfit())
			.append(getCarriagePrice())
			.append(getCarriageFree())
			.append(getMaxBuy())
			.append(getScore())
			.append(getScoreg())
			.append(getStore())
			.append(getIntro())
			.append(getGenurl())
			.append(getTxt())
			.toHashCode();
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	*//**
	 * 重写，对象是否相同，用ID来判断
	 *//*
	public boolean equals(Object obj) {
		if(obj instanceof Product == false) return false;
		if(this == obj) return true;
		Product other = (Product)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
	*//**
	 * 转文本
	 *//*
	@Override
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.SHORT_PREFIX_STYLE)
			.append(super.toString())
			.append(",Id:",getId())
			.append(",GmtCreate:",getGmtCreate())
			.append(",GmtModified:",getGmtModified())
			.append(",GmtRelease:",getGmtRelease())
			.append(",StatusApplyPassRefuse:",getStatusApplyPassRefuse())
			.append(",StatusSo:",getStatusSo())
			.append(",StatusAuthentication:",getStatusAuthentication())
			.append(",StatusStore:",getStatusStore())
			.append(",UserId:",getUserId())
			.append(",ItypeAll:",getItypeAll())
			.append(",AllProductId:",getAllProductId())
			.append(",ProductchannelId:",getProductchannelId())
			.append(",ProductsendId:",getProductsendId())
			.append(",Mplace:",getMplace())
			.append(",Stype:",getStype())
			.append(",Priority:",getPriority())
			.append(",Profitclass:",getProfitclass())
			.append(",Productno:",getProductno())
			.append(",Title:",getTitle())
			.append(",Img1:",getImg1())
			.append(",Img2:",getImg2())
			.append(",Img3:",getImg3())
			.append(",Img4:",getImg4())
			.append(",Img5:",getImg5())
			.append(",Img6:",getImg6())
			.append(",Qrimg:",getQrimg())
			.append(",Hittimes:",getHittimes())
			.append(",Buytimes:",getBuytimes())
			.append(",Punit:",getPunit())
			.append(",Currencysymbol:",getCurrencysymbol())
			.append(",Marketprice:",getMarketprice())
			.append(",Price:",getPrice())
			.append(",Selloff:",getSelloff())
			.append(",Inprice:",getInprice())
			.append(",GrossProfit:",getGrossProfit())
			.append(",CarriagePrice:",getCarriagePrice())
			.append(",CarriageFree:",getCarriageFree())
			.append(",MaxBuy:",getMaxBuy())
			.append(",Score:",getScore())
			.append(",Scoreg:",getScoreg())
			.append(",Store:",getStore())
			.append(",Intro:",getIntro())
			.append(",Genurl:",getGenurl())
			.append(",Txt:",getTxt())
			.toString();

	}
	*//**
	 * 返回JSON之不显示第0级，对于一些不能传递的对象，不进行json编码，比如password明文，用得较少。
	 * @return
	 *//*
	public String toJsonNotshow(){
		String[] excludesProperties={"null"};
		String ret=JsonUtilAli.toJSONString(this, null, excludesProperties);
		return ret;
	}
	*//**
	 * 返回JSON之不显示第1级，nowshow+notshow1('notshow1'+xxxObj+xxxString+xxxList)
	 * <br>在内部服务通讯时，防止get页面参数过大，通常设置为notshow1，返回时可以是notshow或notshow1
	 * @return
	 *//*
	public String toJsonNotshow1(){
		String[] excludesProperties={"myname","gmtCreateString","gmtModifiedString","gmtReleaseString","statusApplyPassRefuseString","statusApplyPassRefuseMap","statusSoString","statusSoMap","statusAuthenticationString","statusAuthenticationMap","statusStoreString","statusStoreMap","userIdString","userIdUserObj","itypeAllString","itypeAllMap","allProductIdString","allProductIdAllProductObj","productchannelIdString","productchannelIdProductchannelObj","productsendIdString","productsendIdProductsendObj","profitclassString","profitclassMap","punitString","punitMap","currencysymbolString","currencysymbolMap","obj1","obj2","obj3","obj4","obj5","null"};
		String ret=JsonUtilAli.toJSONString(this, null, excludesProperties);
		return ret;
	}
	*//**
	 * 返回JSON之不显示第2级，nowshow+notshow1+notshow2，用于外部服务通讯，符合对方的api要求
	 * @return
	 *//*
	public String toJsonNotshow2(){
		String[] excludesProperties={"myname","gmtCreateString","gmtModifiedString","gmtReleaseString","statusApplyPassRefuseString","statusApplyPassRefuseMap","statusSoString","statusSoMap","statusAuthenticationString","statusAuthenticationMap","statusStoreString","statusStoreMap","userIdString","userIdUserObj","itypeAllString","itypeAllMap","allProductIdString","allProductIdAllProductObj","productchannelIdString","productchannelIdProductchannelObj","productsendIdString","productsendIdProductsendObj","profitclassString","profitclassMap","punitString","punitMap","currencysymbolString","currencysymbolMap","obj1","obj2","obj3","obj4","obj5","null"};
		String ret=JsonUtilAli.toJSONString(this, null, excludesProperties);
		return ret;
	}

}
*/