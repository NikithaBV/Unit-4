package paymentgatewaysystem;
/**
 *
 * @author Nikitha B V
 */
import java.util.Date;

public class PaymentGateway {
    public static void processPayment(UserBean user, PaymentBean payment) {
        System.out.println("Processing payment for user: " + user.getUserName());
        System.out.println("Payment Method: " + payment.getPaymentMethod());
        System.out.println("Amount: " + payment.getAmount() + " " + payment.getCurrency());

        // Simulate transaction
        TransactionBean transaction = new TransactionBean(
            "TXN" + System.currentTimeMillis(),
            user.getUserId(),
            payment.getAmount(),
            "SUCCESS",
            new Date()
        );

        System.out.println("Transaction Successful!");
        System.out.println("Transaction ID: " + transaction.getTransactionId());
        System.out.println("Transaction Date: " + transaction.getTransactionDate());

        // Notify user
        NotificationBean notification = new NotificationBean(
            "NOTIF" + System.currentTimeMillis(),
            user.getUserId(),
            "Your payment of " + payment.getAmount() + " " + payment.getCurrency() + " was successful."
        );

        System.out.println("Notification Sent: " + notification.getMessage());
    }

    public static void main(String[] args) {
        // Example usage
        UserBean user = new UserBean("U123", "Nikitha BV", "nikithabv@example.com", "8618182381");
        PaymentBean payment = new PaymentBean("Credit Card", 1000.0, "INR");

        processPayment(user, payment);
    }
}
