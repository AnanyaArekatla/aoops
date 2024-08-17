package paymentProcessing;

public class Payment {
    private double amount;
    private String currency;
    private boolean isFraudulent;
    private boolean isProcessed;

    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
        this.isFraudulent = false;
        this.isProcessed = false;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public boolean isFraudulent() {
        return isFraudulent;
    }

    public void setFraudulent(boolean fraudulent) {
        isFraudulent = fraudulent;
    }

    public boolean isProcessed() {
        return isProcessed;
    }

    public void setProcessed(boolean processed) {
        isProcessed = processed;
    }
}