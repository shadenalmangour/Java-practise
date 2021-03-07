package shop.solution;

public class Main {

	public static void main(String[] args) {

		Shop shop = new Shop("Supermarket");
		Product product = new Product("banana", 5, 4);
		shop.addProduct(product);
		Product product2 = new Product("apple", 9, 2);
		shop.addProduct(product2);
		shop.printShop();
		Product product3 = new Product("banana", 5, 2);
		shop.addProduct(product3);	
		shop.printShop();	
		Product product4 = new Product("apple", 9, 8);
		shop.addProduct(product4);
		shop.printShop();
		shop.sale(50);
		shop.printShop();
		shop.purchase("banana", 5);
		shop.printShop();
	}

}
