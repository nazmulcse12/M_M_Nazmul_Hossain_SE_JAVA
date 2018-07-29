
public class Product {
	
	private String name;
	private String productType;
	private String memory;
	private int price;
	private int originalCost;
	private float profitPercentage;
	private int quantity;
	private String availability;
	
	// Constructor
	public Product() {}

	public Product(String name, String productType, String memory, int price, int originalCost, int quantity) {
		super();
		this.name = name;
		this.productType = productType;
		this.memory = memory;
		this.price = price;
		this.originalCost = originalCost;
		this.quantity = quantity;
	}
	
	// Getter & Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getOriginalCost() {
		return originalCost;
	}

	public void setOriginalCost(int originalCost) {
		this.originalCost = originalCost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	// toString method
	@Override
	public String toString() {
		return "Product [name=" + name + ", productType=" + productType + ", memory=" + memory + ", price=" + price
				+ ", originalCost=" + originalCost + ", quantity=" + quantity + "]";
	}
	
}
