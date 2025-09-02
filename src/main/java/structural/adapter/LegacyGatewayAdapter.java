package structural.adapter;

import creational.singleton.LazySingleton;
import structural.adapter.interfaces.PaymentProcessor;

public class LegacyGatewayAdapter implements PaymentProcessor {
    private final LegacyGateway legacyGateway;
    private boolean isTransactionSuccessful;
    private String transactionId;
    public LegacyGatewayAdapter(LegacyGateway legacyGateway) {
        this.legacyGateway = legacyGateway;
    }
    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Adapter: Translating processPayment() for " + amount + " " + currency);
        legacyGateway.executeTransaction(amount, currency);
        transactionId = "Legacy_"+"TXN_"+legacyGateway.getReferenceNumber();
        isTransactionSuccessful = legacyGateway.checkStatus(legacyGateway.getReferenceNumber());
    }

    @Override
    public boolean isPaymentSuccessful() {
        return isTransactionSuccessful;
    }

    @Override
    public String getTransactionId() {
        return transactionId;
    }
}
