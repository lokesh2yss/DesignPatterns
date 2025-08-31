package creational.prototype;

import javax.naming.OperationNotSupportedException;
import java.util.HashMap;
import java.util.Map;

public class EnemyRegistry {
    private Map<String, Enemy> prototypes = new HashMap<>();

    public void register(String key, Enemy enemy) {
        prototypes.put(key, enemy);
    }

    public Enemy get(String key)  {
        Enemy prototype = prototypes.get(key);
        if(prototype == null) {
            throw new IllegalArgumentException("Prototype not found");
        }
        return prototype;
    }
}
