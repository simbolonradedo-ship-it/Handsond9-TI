package latihan3;

public class Product {
    private String name;
    private double price;
    private int stock;

    // Constructor 1
    public Product(String name) {
        this.name = name;
        this.price = 0;
        this.stock = 0;
    }

    // Constructor 2
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.stock = 0;
    }

    // Constructor 3
    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void tampilkanInfo() {
        System.out.printf("Product: %s | Price: Rp %.1f | Stock: %d%n", name, price, stock);
    }
}
