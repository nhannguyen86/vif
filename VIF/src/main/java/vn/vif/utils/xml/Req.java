package vn.vif.utils.xml;


/**
 * Response generated by hbm2java
 */
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement
public class Req implements java.io.Serializable {
	private static final long serialVersionUID = 3293675195247547203L;
	
	
	
	//String username,
	//String password,
	String account_name;
	String mobile_number;
	String discount_code;
	String discount_code_topup;
	long limit_transfer;
	long limit_transfer_per_time;
	long have_child;
	String phone_number;
	String email_addr;
	String prepaid_code;
	String expdate;
	
	String appid;
	String password;
	String version;
	String partnercode;
	String sign ;
	String username ;
	String reqtype ;
	long requestid;
	
	String sessionid;
	String new_pass;
	
	String product_type;
	String topup_account;
	long amount;
	
	long quantity;
	long tracenumber ;
	
	String fromdate;
	String todate ;
	
	String content;
	String serial;
	
	String mac;
	
//	String trans_type ;
	long account_number2;
	
	String parent_id;
	
	
	
	String prepaiddiscount;
	
	String topupdiscount;
	
	String postpaiddiscount;
	
	String otpphone;
	
	String otp;
//	
//	int state;
//	String message;
//	String transtime;
//	String url ;
//	
//	
//	
//	long accountid ;
//	String account_name ;
//	String balance ;
//	
//	
//	long ord ;
//	
//	long partnertrace ;
//	
//	
//	long topup_value;
//	
//	
//	List<Product> product;
	

	
	@XmlElement
	public void setReqtype(String reqtype) {
		this.reqtype = reqtype;
	}
	
	public String getReqtype() {
		return reqtype;
	}
 
	@XmlElement
	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}
	
	public String getSessionid() {
		return sessionid;
	}
	
	@XmlElement
	public void setAppid(String appid) {
		this.appid = appid;
	}
	
	public String getAppid() {
		return appid;
	}
	
	@XmlElement
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}

	@XmlElement
	public void setVersion(String version) {
		this.version = version;
	}
	
	public String getVersion() {
		return version;
	}
	
	@XmlElement
	public void setPartnercode(String partnercode) {
		this.partnercode = partnercode;
	}
	
	public String getPartnercode() {
		return partnercode;
	}
	
	@XmlElement
	public void setRequestid(long requestid) {
		this.requestid = requestid;
	}
	
	public long getRequestid() {
		return requestid;
	}
	
	@XmlElement
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	
	@XmlElement
	public void setSign(String sign) {
		this.sign = sign;
	}
	
	public String getSign() {
		return sign;
	}
	@XmlElement
	public void setNew_pass(String new_pass) {
		this.new_pass = new_pass;
	}
	
	public String getNew_pass() {
		return new_pass;
	}
	@XmlElement
	public void setTopup_account(String topup_account) {
		this.topup_account = topup_account;
	}
	
	public String getTopup_account() {
		return topup_account;
	}


	@XmlElement
	public void setTracenumber(long tracenumber) {
		this.tracenumber = tracenumber;
	}
	
	public long getTracenumber() {
		return tracenumber;
	}
	
	
	@XmlElement
	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}
	
	public String getProduct_type() {
		return product_type;
	}
	
	@XmlElement
	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	public long getAmount() {
		return amount;
	}
	
	
	
	@XmlElement
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	
	public long getQuantity() {
		return quantity;
	}
	
	
	
	
	
	
	@XmlElement
	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}
	
	public String getFromdate() {
		return fromdate;
	}
	
	@XmlElement
	public void setTodate(String todate) {
		this.todate = todate;
	}
	
	public String getTodate() {
		return todate;
	}
	
	
	@XmlElement
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}
	
	
	@XmlElement
	public void setAccount_number2(long account_number2) {
		this.account_number2 = account_number2;
	}
	
	public long getAccount_number2() {
		return account_number2;
	}
	
	
	

	
	@XmlElement
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	
	public String getAccount_name() {
		return account_name;
	}
	
	@XmlElement
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	
	public String getMobile_number() {
		return mobile_number;
	}
	
	@XmlElement
	public void setDiscount_code(String discount_code) {
		this.discount_code = discount_code;
	}
	
	public String getDiscount_code() {
		return discount_code;
	}
	
	@XmlElement
	public void setDiscount_code_topup(String discount_code_topup) {
		this.discount_code_topup = discount_code_topup;
	}
	
	public String getDiscount_code_topup() {
		return discount_code_topup;
	}
	
	
	@XmlElement
	public void setLimit_transfer(long limit_transfer) {
		this.limit_transfer = limit_transfer;
	}
	
	public long getLimit_transfer() {
		return limit_transfer;
	}
	
	@XmlElement
	public void setLimit_transfer_per_time(long limit_transfer_per_time) {
		this.limit_transfer_per_time = limit_transfer_per_time;
	}
	
	public long getLimit_transfer_per_time() {
		return limit_transfer_per_time;
	}
	
	@XmlElement
	public void setHave_child(long have_child) {
		this.have_child = have_child;
	}
	
	public long getHave_child() {
		return have_child;
	}
	
	@XmlElement
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	
	public String getPhone_number() {
		return phone_number;
	}
	
	@XmlElement
	public void setEmail_addr(String email_addr) {
		this.email_addr = email_addr;
	}
	
	public String getEmail_addr() {
		return email_addr;
	}
	
	@XmlElement
	public void setSerial(String serial) {
		this.serial = serial;
	}
	
	public String getSerial() {
		return serial;
	}
	
	@XmlElement
	public void setPrepaid_code(String prepaid_code) {
		this.prepaid_code = prepaid_code;
	}
	
	public String getPrepaid_code() {
		return prepaid_code;
	}
	
	@XmlElement
	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}
	
	public String getExpdate() {
		return expdate;
	}
	
	@XmlElement
	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}
	
	public String getParent_id() {
		return parent_id;
	}
	
	@XmlElement
	public void setMac(String mac) {
		this.mac = mac;
	}
	
	public String getMac() {
		return mac;
	}
	////////////////////////
	@XmlElement
	public void setPrepaiddiscount(String prepaiddiscount) {
		this.prepaiddiscount = prepaiddiscount;
	}
	
	public String getPrepaiddiscount() {
		return prepaiddiscount;
	}
	
	@XmlElement
	public void setTopupdiscount(String topupdiscount) {
		this.topupdiscount = topupdiscount;
	}
	
	public String getTopupdiscount() {
		return topupdiscount;
	}
	
	@XmlElement
	public void setPostpaiddiscount(String postpaiddiscount) {
		this.postpaiddiscount = postpaiddiscount;
	}
	
	public String getPostpaiddiscount() {
		return postpaiddiscount;
	}

	@XmlElement
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public String getOtp() {
		return otp;
	}
	
	@XmlElement
	public void setOtpphone(String otpphone) {
		this.otpphone = otpphone;
	}
	public String getOtpphone() {
		return otpphone;
	}

	
	
	
	
}
