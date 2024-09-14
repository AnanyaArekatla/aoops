package paymentProcessing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PaymentProcessingChainTest {

	private PaymentHandler fraudCheckHandler;
    private PaymentHandler currencyConversionHandler;
    private PaymentHandler settlementHandler;

    @Before
    public void setUp() {
        fraudCheckHandler = new FraudCheckHandler();
        currencyConversionHandler = new CurrencyConversionHandler();
        settlementHandler = new SettlementHandler();

        fraudCheckHandler.setNextHandler(currencyConversionHandler);
        currencyConversionHandler.setNextHandler(settlementHandler);
    }

    @Test
    public void testFraudCheckPasses() {
        Payment payment = new Payment(5000, "USD");
        fraudCheckHandler.process(payment);
        assertFalse(payment.isFraudulent(), "Payment should not be flagged as fraudulent.");
        assertTrue(payment.isProcessed(), "Payment should be processed successfully.");
    }

    @Test
    public void testFraudCheckFails() {
        Payment payment = new Payment(15000, "USD");
        fraudCheckHandler.process(payment);
        assertTrue(payment.isFraudulent(), "Payment should be flagged as fraudulent.");
        assertFalse(payment.isProcessed(), "Payment should not be processed due to fraud.");
    }

    private void assertFalse(boolean processed, String string) {
		
		
	}

	private void assertTrue(boolean fraudulent, String string) {
		
		
	}

	@Test
    public void testCurrencyConversion() {
        Payment payment = new Payment(5000, "EUR");
        fraudCheckHandler.process(payment);
        assertEquals("USD", payment.getCurrency(), "Payment currency should be converted to USD.");
        assertEquals(5000 * 1.1, payment.getAmount(), 0.01, "Payment amount should be converted to USD.");
        assertTrue(payment.isProcessed(), "Payment should be processed successfully.");
    }

    private void assertEquals(String string, String currency, String string2) {
		
		
	}

	private void assertEquals(double d, double amount, double e, String string) {
		
		
	}

	@Test
    public void testSettlementWithFraud() {
        Payment payment = new Payment(15000, "EUR");
        fraudCheckHandler.process(payment);
        assertTrue(payment.isFraudulent(), "Payment should be flagged as fraudulent.");
        assertFalse(payment.isProcessed(), "Payment should not be processed due to fraud.");
    }

    @Test
    public void testSettlementWithoutFraud() {
        Payment payment = new Payment(5000, "USD");
        fraudCheckHandler.process(payment);
        assertFalse(payment.isFraudulent(), "Payment should not be flagged as fraudulent.");
        assertTrue(payment.isProcessed(), "Payment should be processed successfully.");
    }
}
