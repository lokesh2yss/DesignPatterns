package creational.singleton;

public class Example {
    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        singleton.printMsg();
        singleton.incrementCount();
        singleton.printMsg();
    }
}
