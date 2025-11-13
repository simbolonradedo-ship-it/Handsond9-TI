package latihan4.customer;

public class PremiumCustomer extends Customer {
    public PremiumCustomer(String id, String nama, String email) {
        super(id, nama, email);
    }

    @Override
    public double getDiscountPercentage() {
        return 10;
    }
}
