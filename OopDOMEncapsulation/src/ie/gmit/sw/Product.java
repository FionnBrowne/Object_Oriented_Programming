package ie.gmit.sw;

public class Product {

	private String code;
	private String name;
	private String description;
	private float price;
	private String manufacturer;

	public Product() {
		// ======================================================================

		super();
		// TODO Auto-generated constructor stub
	}
	// ======================================================================

	public Product(String code, String name, String description, float price, String manufacturer) {
		super();
		this.code = code;
		this.name = name;
		this.description = description;
		this.price = price;
		this.manufacturer = manufacturer;
	}
	// ======================================================================

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	// ======================================================================

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}
	// ======================================================================

	@Override
	public String toString() {
		return "Product [code=" + code + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", manufacturer=" + manufacturer + "]";
	}

	// ======================================================================

}
