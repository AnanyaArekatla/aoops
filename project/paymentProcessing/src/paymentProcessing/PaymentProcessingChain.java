package paymentProcessing;

public class PaymentProcessingChain {
    public static void main(String[] args) {
        Payment payment = new Payment(5000, "EUR");

        PaymentHandler fraudCheckHandler = new FraudCheckHandler();
        PaymentHandler currencyConversionHandler = new CurrencyConversionHandler();
        PaymentHandler settlementHandler = new SettlementHandler();

        fraudCheckHandler.setNextHandler(currencyConversionHandler);
        currencyConversionHandler.setNextHandler(settlementHandler);

        fraudCheckHandler.process(payment);

        if (payment.isProcessed()) {
            System.out.println("Payment processed successfully.");
        } else {
            System.out.println("Payment failed to process.");
        }
    }
}
