package paymentProcessing;

public class CurrencyConversionHandler extends PaymentHandler {
    @Override
    protected void handlePayment(Payment payment) {
        if (!"USD".equals(payment.getCurrency())) {
            // Simulate currency conversion to USD
            payment.setAmount(payment.getAmount() * 1.1); // Assume 1.1 is the conversion rate
            payment.setCurrency("USD");
            System.out.println("Payment converted to USD.");
        } else {
            System.out.println("Payment is already in USD.");
        }
    }
}