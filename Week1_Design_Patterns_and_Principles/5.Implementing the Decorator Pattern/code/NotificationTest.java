
public class NotificationTest {
    public static void main(String[] args) {
        // Base Email Notifier
        Notifier notifier = new EmailNotifier();

        // Add SMS capability
        notifier = new SMSNotifierDecorator(notifier);

        // Add Slack capability
        notifier = new SlackNotifierDecorator(notifier);

        // Send notification through all channels
        notifier.send("Your order has been shipped!");
    }
}
