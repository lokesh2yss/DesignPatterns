package creational.prototype;

import creational.prototype.interfaces.EnemyPrototype;

public class Enemy implements EnemyPrototype {
    private String type;
    private int health;
    private double speed;
    private boolean armored;
    private String weapon;

    public Enemy(String type, int health, double speed, boolean armored, String weapon) {
        this.type = type;
        this.health = health;
        this.speed = speed;
        this.armored = armored;
        this.weapon = weapon;
    }
    /*

    A Quick Note on Cloning:
        Shallow Copy: This implementation performs a shallow copy. It’s fine if all fields are
        primitives or immutable (like String). But if Enemy had a field like a List, both the
        original and cloned enemies would share the same list object, which can cause subtle bugs.
        Deep Copy: If your object contains mutable reference types, you should create a deep copy
        in the copy constructor. For example:
        this.inventory = new ArrayList<>();
        for (Item item : source.inventory) {
        this.inventory.add(item.clone()); // Assuming Item also implements clone()
}
     */
    @Override
    public Enemy clone() {
        return new Enemy(type, health, speed, armored, weapon);
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public void printStats() {
        System.out.println(type + " [Health: " + health +
                ", Speed: " + speed +
                ", Armored: " + armored +
                ", Weapon: " + weapon + "]");
    }
}
