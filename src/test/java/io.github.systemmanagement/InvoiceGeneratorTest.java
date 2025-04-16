package io.github.systemmanagement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

class InvoiceGeneratorTest {

    @Mock
    DiscountService discountService = new DiscountService();

    @Spy
    private InvoiceGenerator invoiceGenerator = new InvoiceGenerator(discountService);

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGenerateInvoice() {
        Order order = new Order();
        order.addProduct(new Product("Laptop", 120, 1));

        when(discountService.applyDiscount(order)).thenReturn(108.0);

        String invoice = invoiceGenerator.generateInvoice(order);

        verify(invoiceGenerator, times(1)).generateInvoice(order);
        verify(discountService, times(1)).applyDiscount(order);

        assertTrue(invoice.contains("Laptop"));
        assertTrue(invoice.contains("Total (after discount): $108.0"));
    }
}