package latihan4.payment;

public interface Payment {
    boolean processPayment(double amount);
    String getPaymentMethod();
    String getTransactionId();
}
