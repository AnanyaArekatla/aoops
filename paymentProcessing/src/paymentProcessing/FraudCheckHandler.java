package paymentProcessing;

public class FraudCheckHandler extends PaymentHandler {
    @Override
    protected void handlePayment(Payment payment) {
        // Simulate fraud check
        if (payment.getAmount() > 10000) {
            payment.setFraudulent(true);
            System.out.println("Payment flagged as fraudulent.");
        } else {
            System.out.println("Payment passed fraud check.");
        }
    }
}