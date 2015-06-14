package vn.vif.utils.xml;


/**
 * Response generated by hbm2java
 */
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement
public class Rec implements java.io.Serializable {
	private static final long serialVersionUID = 3293675195247547203L;

	
	String product_type;
	int quantity;
	long price;
	
	
	@XmlElement
	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}
	
	public String getProduct_type() {
		return product_type;
	}
	
	@XmlElement
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	@XmlElement
	public void setPrice(long price) {
		this.price = price;
	}
	
	public long getPrice() {
		return price;
	}
	
	
 
	

}