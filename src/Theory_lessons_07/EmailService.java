
package Theory_lessons_07;

public class EmailService implements NotificationService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Email göndərildi: " + message);
    }
}
