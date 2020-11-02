package ie.gmit.dip;

public class LineItemImpl implements LineItem {

	private String number;
	private String name;
	private int qty;
	private float price;

	@Override
	public void setItemNumber(String number) {
		this.number = number;
	}

	@Override
	public String getItemNumber() {
		return this.number;
	}

	@Override
	public void setItemName(String name) {
		this.name = name;
	}

	@Override
	public String getItemName() {
		return this.name;
	}

	@Override
	public void setItemQuantity(int qty) {
		this.qty = qty;
	}

	@Override
	public int getItemQuantity() {
		return this.qty;
	}

	@Override
	public void setItemPrice(float price) {
		this.price = price;
	}

	@Override
	public float getItemPrice() {
		return this.price;
	}
//constructor
	public LineItemImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
//second constructor
public LineItemImpl(String number, String name) {
	super();
	this.number = number;
	this.name = name;
}
//third constructor
public LineItemImpl(String number, String name, int qty, float price) {
	super();
	this.number = number;
	this.name = name;
	this.qty = qty;
	this.price = price;
}
//================================================================================
}
