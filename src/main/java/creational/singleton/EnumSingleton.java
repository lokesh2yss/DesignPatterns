package creational.singleton;

public enum EnumSingleton {
    INSTANCE;
    private int count = 0;
    public void printMsg() {
        System.out.println("The count value is "+count);
    }
    public void incrementCount() {
        count++;
    }
}
