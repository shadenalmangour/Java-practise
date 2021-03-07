[![General Assembly Logo](https://camo.githubusercontent.com/1a91b05b8f4d44b5bbfb83abac2b0996d8e26c92/687474703a2f2f692e696d6775722e636f6d2f6b6538555354712e706e67)](https://generalassemb.ly/education/web-development-immersive)
![Misk Logo](https://i.ibb.co/KmXhJbm/Webp-net-resizeimage-1.png)


# Shops!

Create a class Shop and class Product that can help shop owners keep track of their products!

Our class should have multiple functionality:

- initialize your shop with a random ID.
---
- **addProduct**
    should take a class Product which take name, price and stock of your product.


---

- **sale**
    should print out new prices for all your products based on the percentage you pass 
    ```java
    shop.sale(50); 
    ```

---
- **stock**
    show the stock of your products
---
- **purchase**
    should take the name and amount of the purchased item. Then subtracts the amount of items you purchase from your stock, if your stock is empty, it gives a warning.
---

```Java
    Shop shop = new Shop("Supermarket");
    Product product = new Product("banana", 5, 4);
    shop.addProduct(product);
    Product product2 = new Product("apple", 9, 2);
    shop.addProduct(product2);
    Product product3 = new Product("banana", 5, 4);
    shop.addProduct(product3);

    
    shop.printShop();

    # Our Products
    # Name  banana price  5.0 stock  8
    # Name  apple price  9.0 stock  2
    
    shop.sale(50)
    # Hooray! We have a 50% sale!
    # Our Products
    # Name  banana price  2.5 stock  8
    # Name  apple price  4.5 stock  2


    shop.purchase("banana", 5);
    # 5 Bananas purchased!
    # New stock is now 3

    shop.stock("apple")
    # Apple has 2 in stock

```
