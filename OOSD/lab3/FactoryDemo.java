package OOSD.lab3;

interface Notification {
    void notifyUser();    
}

class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending SMS to user");
    }
}

class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending Email to user");
    }
}

class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending push notification to user");
    }
}

class NotificationFactory {
    public Notification createNotification(String channel) {
        if(channel == null || channel.isEmpty())
            return null;

        switch (channel) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                return (Notification) new IllegalArgumentException("Unknown channel"+channel);
        }
    }
}

public class FactoryDemo {
    
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        Notification notification = factory.createNotification("SMS");
        Notification pushNotification = factory.createNotification("PUSH");
        
        notification.notifyUser();
        pushNotification.notifyUser();
    }
}