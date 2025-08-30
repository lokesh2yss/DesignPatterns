package creational.factoryMethod;

public class EmailNotificationCreator extends NotificationCreator{
    @Override
    Notification createNotification() {
        return new EmailNotification();
    }
}
