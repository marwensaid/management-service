package io.github.systemmanagement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class OrderTest {

    @Spy
    Order order = new Order();

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

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