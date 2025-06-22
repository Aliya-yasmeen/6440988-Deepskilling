
public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        PaymentStrategy creditCard = new CreditCardPayment("Aliya Yasmeen", "1234-5678-9012-3456");
        context.setPaymentStrategy(creditCard);
        context.makePayment(1500.00);

        System.out.println("-------------------");

        // Pay using PayPal
        PaymentStrategy paypal = new PayPalPayment("aliya.yasmeen@example.com");
        context.setPaymentStrategy(paypal);
        context.makePayment(2000.00);
    }
}
