package pillars;

class Notification {
    void sendNotification(String message) {
        System.out.println("Sending Notification: " + message);
    }
}
class EmailNotification extends Notification {
    @Override
    void sendNotification(String message) {
        System.out.println("Sending Email: " + message);
    }
}

class SMSNotification extends Notification {
    @Override
    void sendNotification(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class PushNotification extends Notification {
    @Override
    void sendNotification(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}

class NotificationSystem {
    public static void main(String[] args) {
        Notification email = new EmailNotification();  // Method overriding in action
        Notification sms = new SMSNotification();
        Notification push = new PushNotification();

        email.sendNotification("Your order has been shipped.");
        sms.sendNotification("Your OTP is 123456.");
        push.sendNotification("New promotional offer available!");
    }
}
