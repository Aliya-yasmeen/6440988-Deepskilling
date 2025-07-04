
public class PaymentTest {
    public static void main(String[] args) {
        // Use PayPal via Adapter
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPalGateway());
        paypalProcessor.processPayment(500.0);

        System.out.println("--------------------");

        // Use Stripe via Adapter
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());
        stripeProcessor.processPayment(750.5);
    }
}
