package latihan4.customer;

public class RegularCustomer extends Customer {
    public RegularCustomer(String id, String nama, String email) {
        super(id, nama, email);
    }

    @Override
    public double getDiscountPercentage() {
        return 0;
    }
}
