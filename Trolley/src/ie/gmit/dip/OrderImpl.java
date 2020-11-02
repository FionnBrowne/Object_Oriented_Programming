package ie.gmit.dip;

import java.util.*;

public class OrderImpl implements Order {
	private String orderNum;
	private Date orderDate = new Date();
	private List<LineItem> items = new ArrayList<LineItem>();// collection is called items

	// first constructor
	public OrderImpl(String orderNum) {
		super();
		this.orderNum = orderNum;
	}
	// overload constructor

	public OrderImpl(String orderNum, Date orderDate) {
		super();
		this.orderNum = orderNum;
		this.orderDate = orderDate;
	}

	// =========================================================
	@Override
	public String getOrderNumber() {
		return this.orderNum;
	}

	@Override
	public Date getOrderDate() {
		return this.orderDate;
	}

	@Override
	public boolean addItem(LineItem item) {// big 0 = 0(1)
		return items.add(item);// delegate method
	}

	@Override
	public boolean removeItem(LineItem item) {//big 0 = 0(n) // if it doesnt exist 0
		return items.remove(item);// 
	}

	@Override
	public LineItem[] items() {
		LineItem[] temp = new LineItem[items.size()];
		for (int i = 0; i < items.size(); i++) {
			temp[i] = items.get(i);
		}
		return temp;
	}

	@Override
	public float getTotal() {
		float total = 0.0f;

		for (LineItem item : items) {
			total += (item.getItemQuantity() * item.getItemPrice());
		}
		return total;
	}

}
