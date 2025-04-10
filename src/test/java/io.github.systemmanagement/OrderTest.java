package io.github.systemmanagement;

import io.github.systemmanagement.order.Order;
import io.github.systemmanagement.order.Product;
import org.junit.jupiter.api.Test;
import org.mockito.Spy;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class OrderTest {

    @Spy
    private Order order = new Order();

    @Test
    void testAddProductAndCalculateTotal() {
        Product product1 = new Product("Laptop", 1000, 1);
        Product product2 = new Product("Mouse", 50, 2);

        order.addProduct(product1);
        order.addProduct(product2);

        verify(order, times(2)).addProduct(any(Product.class));
        assertEquals(1100, order.calculateTotal());
    }
}