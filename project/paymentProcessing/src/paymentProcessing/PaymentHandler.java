package paymentProcessing;

public abstract class PaymentHandler {
    protected PaymentHandler nextHandler;

    public void setNextHandler(PaymentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void process(Payment payment) {
        handlePayment(payment);
        if (nextHandler != null) {
            nextHandler.process(payment);
        }
    }

    protected abstract void handlePayment(Payment payment);
}