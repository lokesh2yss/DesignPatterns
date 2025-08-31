package creational.prototype;

public class Game {
    public static void main(String[] args) {
        EnemyRegistry registry = new EnemyRegistry();
        registry.register("flying", new Enemy("FlyingEnemy", 100, 10.5, true, "bullet"));
        registry.register("armored", new Enemy("ArmoredEnemy", 100, 10.5, true, "missile"));

        Enemy e1 = registry.get("flying");
        Enemy e2 = registry.get("flying");
        e2.setHealth(80); // maybe this one was spawned with less HP

        Enemy e3 = registry.get("armored");

        // Print stats to verify
        e1.printStats();
        e2.printStats();
        e3.printStats();

    }


}

