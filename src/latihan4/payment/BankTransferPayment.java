package latihan4.payment;

import java.util.UUID;

public class BankTransferPayment implements Payment {
    private String accountNumber;
    private final String transactionId;

    public BankTransferPayment(String accountNumber) {
        this.accountNumber = accountNumber;
        this.transactionId = UUID.randomUUID().toString();
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing Bank Transfer payment: Rp " + amount);
        System.out.println("Payment successful via Bank Transfer");
        return true;
    }

    @Override
    public String getPaymentMethod() {
        return "Bank Transfer";
    }

    @Override
    public String getTransactionId() {
        return transactionId;
    }
}
