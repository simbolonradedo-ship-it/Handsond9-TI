package latihan4.utils;

import java.util.ArrayList;
import java.util.List;
import latihan4.product.Product;
import latihan4.customer.Customer;

public class ShoppingCart {
    private List<CartItem> items = new ArrayList<>();
    private Customer customer; // optional owner

    public ShoppingCart(Customer customer) {
        this.customer = customer;
    }

    public void addItem(Product product, int quantity) {
        if (product.getStock() < quantity) {
            System.out.println("Stok tidak cukup untuk produk: " + product.getName());
            return;
        }
        items.add(new CartItem(product, quantity));
        product.updateStock(-quantity); // kurangi stok saat ditambahkan ke cart
    }

    public double calculateSubtotal() {
        double total = 0;
        for (CartItem item : items) total += item.getSubtotal();
        return total;
    }

    public double calculateTotalAfterDiscount() {
        double subtotal = calculateSubtotal();
        double discountPct = (customer != null) ? customer.getDiscountPercentage() : 0;
        double discount = subtotal * (discountPct / 100.0);
        return subtotal - discount;
    }

    public void displayCart() {
        System.out.println("=== Shopping Cart ===");
        for (CartItem item : items) {
            System.out.println(item.getProduct().getName() + " x" + item.getQuantity() + " = Rp " + item.getSubtotal());
        }
        System.out.println("Subtotal: Rp " + calculateSubtotal());
        if (customer != null) {
            System.out.println("Customer discount: " + customer.getDiscountPercentage() + "%");
            System.out.println("Total after discount: Rp " + calculateTotalAfterDiscount());
        }
        System.out.println();
    }

    public List<CartItem> getItems() {
        return items;
    }

    public Customer getCustomer() {
        return customer;
    }
}
