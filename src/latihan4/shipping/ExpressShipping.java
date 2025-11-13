package latihan4.shipping;

public class ExpressShipping extends ShippingMethod {
    @Override
    public double calculateShippingCost(double weightKg) {
        return 20000.0 * weightKg;
    }

    @Override
    public String getEstimatedDelivery() {
        return "1-2 days";
    }
}
