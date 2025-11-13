package latihan4.payment;

import java.util.UUID;

public class EWalletPayment implements Payment {
    private String phoneNumber;
    private final String transactionId;

    public EWalletPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.transactionId = UUID.randomUUID().toString();
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing E-Wallet payment: Rp " + amount);
        System.out.println("Payment successful via E-Wallet");
        return true;
    }

    @Override
    public String getPaymentMethod() {
        return "E-Wallet";
    }

    @Override
    public String getTransactionId() {
        return transactionId;
    }
}
