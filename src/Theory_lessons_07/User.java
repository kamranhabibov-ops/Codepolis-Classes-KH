package Theory_lessons_07;

public class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public void sendNotification(NotificationService service, String message) {
        System.out.println("İstifadəçi: " + name);
        service.sendMessage(message);
    }
}
