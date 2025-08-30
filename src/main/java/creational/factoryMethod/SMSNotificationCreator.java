package creational.factoryMethod;

public class SMSNotificationCreator extends NotificationCreator{
    @Override
    Notification createNotification() {
        return new SMSNotification();
    }
}
