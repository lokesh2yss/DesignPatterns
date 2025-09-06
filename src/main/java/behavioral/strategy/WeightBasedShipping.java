package behavioral.strategy;

import behavioral.strategy.interfaces.ShippingStrategy;

public class WeightBasedShipping implements ShippingStrategy {
    private double ratePerKg;
    public WeightBasedShipping(double ratePerKg) {
        this.ratePerKg = ratePerKg;
    }
    @Override
    public double calculateCost(Order order) {
        System.out.println("Calculating with Weight-Based strategy ($" + ratePerKg + "/kg)");
        return order.getTotalWeight()*ratePerKg;
    }
}
