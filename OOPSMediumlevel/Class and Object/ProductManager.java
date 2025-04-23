import java.util.*;

class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Product: " + name + ", Price: " + price;
    }
}

public class ProductManager {
    Scanner sc = new Scanner(System.in);
    int maxPrice = Integer.MIN_VALUE; 
    ArrayList<Product> list = new ArrayList<>();

    public void addProduct(String name, int price) {
        list.add(new Product(name, price));

        
        if (price > maxPrice) {
            maxPrice = price;
        }
    }

    public void showProducts() {
        if (list.isEmpty()) {
            System.out.println("No products added yet.");
            return;
        }

        System.out.println("Product List:");
        for (Product p : list) {
            System.out.println(p);
        }
        System.out.println("Highest Price: " + maxPrice);
    }

    public static void main(String[] args) {
        ProductManager manager = new ProductManager();

       
        manager.addProduct("Laptop", 50000);
        manager.addProduct("Phone", 30000);
        manager.addProduct("Tablet", 20000);

       
        manager.showProducts();
    }
}