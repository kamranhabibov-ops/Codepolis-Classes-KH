package Theory_lessons_07;


public class SmsService implements NotificationService {

    @Override
    public void sendMessage(String message) {
        System.out.println("SMS göndərildi: " + message);
    }
}

