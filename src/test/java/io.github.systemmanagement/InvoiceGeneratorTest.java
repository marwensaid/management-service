package io.github.systemmanagement;

import io.github.systemmanagement.order.DiscountService;
import io.github.systemmanagement.order.InvoiceGenerator;
import io.github.systemmanagement.order.Order;
import io.github.systemmanagement.order.Product;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Spy;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

class InvoiceGeneratorTest {

    @Mock
    private DiscountService discountService;

    @Spy
    private InvoiceGenerator invoiceGenerator = new InvoiceGenerator(discountService);

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