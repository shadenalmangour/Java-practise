package shop.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

class Shop {
	private String shopName; 	
    private String id;
    public  ArrayList<Product> products;

    public Shop (String shopName) {
    	products = new ArrayList<Product>();
    	setShop(shopName);
        }
    // show products
    public void printShop() {
    	System.out.println("Our Products");
    	for(int i=0; i<products.size();i++) {
    		System.out.println(products.get(i).getProduct());
    	}
    }
    // show id
    public String getId() {
    	System.out.println(id);
    	return id;
    }
    public void setShop(String shopName) {
    	this.shopName = shopName;
    	this.id = UUID.randomUUID().toString();
    }
    // add product
    public void addProduct(Product product) {
		int index = exists(product);
		if (index == -1) {
			products.add(product);
		} else {
			int newStock = products.get(index).getStock() + product.getStock();
			products.get(index).setStock(newStock);
		}
	}
	private int exists(Product product) {
		for (Product i : products) {
			if (i.getProductName().equals(product.getProductName())) {
				
				return products.indexOf(i);
			}
		}
		return -1;
	}
	
	// sale
	public void sale(double percentage) {
		for(int i=0; i<products.size();i++) {
    		double newPrice = products.get(i).getPrice()*percentage/100;
    		products.get(i).setPrice(newPrice);
    	}
	}
	// purchase
	public void purchase(String name, int amount) {
		for(int i=0; i<products.size();i++) {
			if (products.get(i).getProductName().equals(name)) {
				if(products.get(i).getStock()>=amount) {
					int newStock = products.get(i).getStock() - amount ;
					products.get(i).setStock(newStock);
				}else {
					System.out.println("You do not have enough Stock");
				}
				
			}

		}
	}

}
