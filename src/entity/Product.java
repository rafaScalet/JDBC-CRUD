package entity;

public class Product {
	private int id;
	private int quantity;
	private String sku;
	private String description;
	private float price;
	private float maxDiscount;

	public Product(int id, int quantity, String sku, String description, float price, float maxDiscount) {
		this.id = id;
		this.quantity = quantity;
		this.sku = sku;
		this.description = description;
		this.price = price;
		this.maxDiscount = maxDiscount;
	}

	public Product(int quantity, String sku, String description, float price, float maxDiscount) {
		this.quantity = quantity;
		this.sku = sku;
		this.description = description;
		this.price = price;
		this.maxDiscount = maxDiscount;
  }

	public int getId() {
		return id;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getSku() {
		return sku;
	}

	public String getDescription() {
		return description;
	}

	public float getPrice() {
		return price;
	}

	public float getMaxDiscount() {
		return maxDiscount;
	}
}
