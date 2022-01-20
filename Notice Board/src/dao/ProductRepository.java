package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {
	private ArrayList<Product> ListOfProducts = new ArrayList<Product>();
	private static ProductRepository instance = new ProductRepository();
	
	public ProductRepository() {
		Product phone = new Product("P1234", "iPhone 6s", 80000);
		phone.setDescription("4.7-inch, 1334X750 Renina HD display, 8-megapixel iSight Camera");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock((long) 1000);
		phone.setCondition("New");
		phone.setFilename("P1234.png");
		
		Product notebook = new Product("P1235", "LG PC 노트북", 150000);
		notebook.setDescription("13.3-inch, IPS LED display, 5rd Generation Intel Core processor");
		notebook.setCategory("Notebook");
		notebook.setManufacturer("LG");
		notebook.setUnitsInStock((long) 1000);
		notebook.setCondition("Refurbished");
		notebook.setFilename("P1235.png");
		
		Product tablet = new Product("P1236", "Galaxt Tab S", 90000);
		tablet.setDescription("212.8*125.6*6.6mm, Super AMOLED display, Octa-Core Processor");
		tablet.setCategory("Tablet");
		tablet.setManufacturer("SamSung");
		tablet.setUnitsInStock((long) 1000);
		tablet.setCondition("Old");
		tablet.setFilename("P1236.png");
		
		ListOfProducts.add(phone);
		ListOfProducts.add(notebook);
		ListOfProducts.add(tablet);
	}
	
	public ArrayList<Product> getAllProducts(){
		return ListOfProducts;
	}
	
	public Product getProductById(String productId) {
		Product productById = null;
		
		for(int i = 0; i < ListOfProducts.size(); i++) {
			Product product = ListOfProducts.get(i);
			if(product != null && product.getProductId() != null && 
					product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		return productById;
	}
	
	public static ProductRepository getInstance() {
		return instance;
	}
	public void addProduct(Product product) {
		ListOfProducts.add(product);
	}
}


