package latihan4.customer;

public abstract class Customer {
    protected String id;
    protected String nama;
    protected String email;

    public Customer(String id, String nama, String email) {
        this.id = id;
        this.nama = nama;
        this.email = email;
    }

    // returns percentage (misal 10 berarti 10%)
    public abstract double getDiscountPercentage();

    public void displayInfo() {
        System.out.println("Customer: " + nama + " (ID: " + id + ") - " + email);
        System.out.println("Discount: " + getDiscountPercentage() + "%");
    }

    public String getName() {
        return nama;
    }

    public String getId() {
        return id;
    }
}
