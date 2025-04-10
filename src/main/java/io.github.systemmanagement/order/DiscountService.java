package io.github.systemmanagement.order;

public class DiscountService {
    public double applyDiscount(Order order) {
        double total = order.calculateTotal();
        if (total > 100) {
            return total * 0.9; // 10% discount for orders above $100
        }
        return total;
    }
}