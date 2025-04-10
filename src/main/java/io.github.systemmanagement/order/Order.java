package io.github.systemmanagement.order;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public double calculateTotal() {
        return products.stream().mapToDouble(Product::getTotalPrice).sum();
    }
}