package vn.vif.models;

import java.util.List;

public class OrderInfor {
	public List<Long> ids;
	public List<Integer> quantity;
	public List<Integer> miniQuantity;
	public List<String> description;
	public List<Long> getIds() {
		return ids;
	}
	public void setIds(List<Long> ids) {
		this.ids = ids;
	}
	public List<Integer> getQuantity() {
		return quantity;
	}
	public void setQuantity(List<Integer> quantity) {
		this.quantity = quantity;
	}
	public List<Integer> getMiniQuantity() {
		return miniQuantity;
	}
	public void setMiniQuantity(List<Integer> miniQuantity) {
		this.miniQuantity = miniQuantity;
	}
	public List<String> getDescription() {
		return description;
	}
	public void setDescription(List<String> description) {
		this.description = description;
	}
}
