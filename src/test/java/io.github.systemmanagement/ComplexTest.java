package io.github.systemmanagement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class ComplexTest {

    @Spy
    private Order order = new Order();

    @Spy
    private DiscountService discountService = new DiscountService();

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testComplexScenario() {
        order.addProduct(new Product("Laptop", 100, 2)); // $200
        order.addProduct(new Product("Mouse", 50, 2));   // $100

        double discountedTotal = discountService.applyDiscount(order);

        verify(order, times(1)).calculateTotal();
        verify(discountService, times(1)).applyDiscount(order);

        assertEquals(270, discountedTotal); // 10% discount on $300
    }
}