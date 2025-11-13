package latihan4.shipping;

public abstract class ShippingMethod {
    public abstract double calculateShippingCost(double weightKg);
    public abstract String getEstimatedDelivery();

    public void displayInfo() {
        System.out.println("Shipping method: " + this.getClass().getSimpleName());
        System.out.println("Estimated delivery: " + getEstimatedDelivery());
    }
}
