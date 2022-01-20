package dto;

import java.io.Serializable;

public class Product implements Serializable{
	private static final long seriaVersionUID = -4274700572038677000L;
	
	private int quantity;
	private String productId;
	private String pname;
	private Integer unitPrice;
	private String Description;
	private String manufacturer;
	private String category;
	private Long unitsInStock;
	private String condition;
	private String filename;
	
	public Product() {
		super();
	}
	
	public Product(String productId, String pname, Integer unitPrice) {
		this.productId = productId;
		this.pname = pname;
		this.unitPrice = unitPrice;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public String getFilename() {
		return filename;
	}
	
	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Long getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(Long unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public static long getSeriaversionuid() {
		return seriaVersionUID;
	}
	public int getQuanity() {
		return quantity;
	}
	public void setQuanity(int quantity) {
		this.quantity = quantity;
	}

	
	
}
