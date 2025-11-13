package latihan4.customer;

public class VIPCustomer extends Customer {
    public VIPCustomer(String id, String nama, String email) {
        super(id, nama, email);
    }

    @Override
    public double getDiscountPercentage() {
        return 20;
    }
}
