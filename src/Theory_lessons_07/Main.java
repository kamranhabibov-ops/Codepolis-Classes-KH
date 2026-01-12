package Theory_lessons_07;

public class Main {
    public static void main(String[] args) {

        User user = new User("Kamran");

        NotificationService sms = new SmsService();
        NotificationService email = new EmailService();

        user.sendNotification(sms, "Salam! Bu SMS bildirişidir.");
        user.sendNotification(email, "Salam! Bu Email bildirişidir.");
    }
}
