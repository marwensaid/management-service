package io.github.systemmanagement;

import io.github.systemmanagement.order.Order;
import org.junit.jupiter.api.Test;
import org.mockito.Spy;

class OrderTest {

    @Spy
    private Order order = new Order();

    @Test
    void testAddProductAndCalculateTotal() {
    }
}