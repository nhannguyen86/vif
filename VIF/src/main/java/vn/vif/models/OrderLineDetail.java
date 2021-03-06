package vn.vif.models;

public class OrderLineDetail implements java.io.Serializable {

	private static final long serialVersionUID = -3382387198395167106L;

	private int id;
	
	private OrderItem orderItem;
	
	private OrderDetail orderDetail;
	
	private Integer number;
	
	public OrderLineDetail() {
	}

	public OrderLineDetail(int id, OrderItem orderItem, OrderDetail orderDetail) {
		this.id = id;
		this.orderItem = orderItem;
		this.orderDetail = orderDetail;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public OrderItem getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(OrderItem orderItem) {
		this.orderItem = orderItem;
	}

	public OrderDetail getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(OrderDetail orderDetail) {
		this.orderDetail = orderDetail;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
}