package latihan4.utils;

import latihan4.customer.Customer;
import latihan4.payment.Payment;
import latihan4.shipping.ShippingMethod;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Order {
    private String orderId;
    private Customer customer;
    private ShoppingCart cart;
    private Payment payment;
    private ShippingMethod shipping;
    private double shippingWeightKg;
    private Date orderDate;

    public Order(String orderId, Customer customer, ShoppingCart cart, Payment payment, ShippingMethod shipping, double shippingWeightKg) {
        this.orderId = orderId;
        this.customer = customer;
        this.cart = cart;
        this.payment = payment;
        this.shipping = shipping;
        this.shippingWeightKg = shippingWeightKg;
        this.orderDate = new Date();
    }

    public void displayOrderSummary() {
        System.out.println("==== ORDER SUMMARY ====");
        System.out.println("Order ID: " + orderId);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Date: " + sdf.format(orderDate));
        customer.displayInfo();
        System.out.println();

        cart.displayCart();

        double subtotal = cart.calculateSubtotal();
        double totalAfterDiscount = cart.calculateTotalAfterDiscount();
        double shippingCost = shipping.calculateShippingCost(shippingWeightKg);
        double grandTotal = totalAfterDiscount + shippingCost;

        System.out.println("Payment method: " + payment.getPaymentMethod());
        System.out.println("Transaction ID: " + payment.getTransactionId());
        System.out.println("Shipping method: " + shipping.getClass().getSimpleName());
        System.out.println("Shipping weight: " + shippingWeightKg + " kg");
        System.out.println("Shipping cost: Rp " + shippingCost);
        System.out.println("Grand Total: Rp " + grandTotal);
        System.out.println("======================\n");
    }
}
