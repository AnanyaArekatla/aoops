package paymentProcessing;

public class CurrencyConversionHandler extends PaymentHandler {
    @Override
    protected void handlePayment(Payment payment) {
        if (!"USD".equals(payment.getCurrency())) {
            
            payment.setAmount(payment.getAmount() * 1.1); 
            payment.setCurrency("USD");
            System.out.println("Payment converted to USD.");
        } else {
            System.out.println("Payment is already in USD.");
        }
    }
}
