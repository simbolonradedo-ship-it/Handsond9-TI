package latihan4.shipping;

public class SameDayShipping extends ShippingMethod {
    @Override
    public double calculateShippingCost(double weightKg) {
        return 35000.0 * weightKg;
    }

    @Override
    public String getEstimatedDelivery() {
        return "Same Day";
    }
}
