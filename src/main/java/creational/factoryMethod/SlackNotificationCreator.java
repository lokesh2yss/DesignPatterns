package creational.factoryMethod;

public class SlackNotificationCreator extends NotificationCreator{
    @Override
    public Notification createNotification() {
        return new SlackNotification();
    }
}
