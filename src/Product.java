
public class Product {
	private int productId;
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
	
	public Product(int productId, String name, String productType, String memory, int price, int originalCost, int quantity) {
		super();
		this.productId = productId;
		this.name = name;
		this.productType = productType;
		this.memory = memory;
		this.price = price;
		this.originalCost = originalCost;
		this.quantity = quantity;
	}
	
	public Product(int productId, String name, String productType, String memory, int price, int originalCost,
			float profitPercentage, int quantity, String availability) {
		super();
		this.productId = productId;
		this.name = name;
		this.productType = productType;
		this.memory = memory;
		this.price = price;
		this.originalCost = originalCost;
		this.profitPercentage = profitPercentage;
		this.quantity = quantity;
		this.availability = availability;
	}

	// Getters & Setters
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

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
	
	public float getProfitPercentage() {
		return profitPercentage;
	}

	public void setProfitPercentage(float profitPercentage) {
		this.profitPercentage = profitPercentage;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	
	// Override toString method
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", productType=" + productType + ", memory="
				+ memory + ", price=" + price + ", originalCost=" + originalCost + ", profitPercentage="
				+ profitPercentage + ", quantity=" + quantity + ", availability=" + availability + "]";
	}
	
}
