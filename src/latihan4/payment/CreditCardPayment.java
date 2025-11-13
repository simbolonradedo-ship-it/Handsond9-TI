package latihan4.payment;

import java.util.UUID;

public class CreditCardPayment implements Payment {
    private String cardNumber;
    private final String transactionId;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
        this.transactionId = UUID.randomUUID().toString();
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing Credit Card payment: Rp " + amount);
        System.out.println("Payment successful via Credit Card");
        return true;
    }

    @Override
    public String getPaymentMethod() {
        return "Credit Card";
    }

    @Override
    public String getTransactionId() {
        return transactionId;
    }
}
