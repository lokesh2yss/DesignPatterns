package behavioral.strategy.interfaces;

import behavioral.strategy.Order;

public interface ShippingStrategy {
    double calculateCost(Order order);
}
