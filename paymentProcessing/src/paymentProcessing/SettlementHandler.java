package paymentProcessing;

public class SettlementHandler extends PaymentHandler {
    @Override
    protected void handlePayment(Payment payment) {
        if (!payment.isFraudulent()) {
            payment.setProcessed(true);
            System.out.println("Payment settled successfully.");
        } else {
            System.out.println("Payment could not be settled due to fraud.");
        }
    }
}