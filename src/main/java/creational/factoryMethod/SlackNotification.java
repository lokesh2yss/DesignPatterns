package creational.factoryMethod;

class SlackNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SLACK: " + message);
    }
}
