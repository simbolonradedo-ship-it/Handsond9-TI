package latihan4.shipping;

public class RegularShipping extends ShippingMethod {
    @Override
    public double calculateShippingCost(double weightKg) {
        return 10000.0 * weightKg;
    }

    @Override
    public String getEstimatedDelivery() {
        return "3-5 days";
    }
}
