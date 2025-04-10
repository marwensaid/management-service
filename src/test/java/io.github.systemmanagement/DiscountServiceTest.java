package io.github.systemmanagement;

import io.github.systemmanagement.order.DiscountService;
import io.github.systemmanagement.order.Order;
import io.github.systemmanagement.order.Product;
import org.junit.jupiter.api.Test;
import org.mockito.Spy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class DiscountServiceTest {

    @Spy
    private DiscountService discountService;

    @Test
    void testApplyDiscount() {
        Order order = new Order();
        order.addProduct(new Product("Laptop", 120, 1));

        double discountedTotal = discountService.applyDiscount(order);

        verify(discountService, times(1)).applyDiscount(order);
        assertEquals(108, discountedTotal); // 10% discount
    }
}