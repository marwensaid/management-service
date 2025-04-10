package io.github.systemmanagement;

import io.github.systemmanagement.order.DiscountService;
import io.github.systemmanagement.order.InvoiceGenerator;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Spy;

class InvoiceGeneratorTest {

    @Mock
    private DiscountService discountService;

    @Spy
    private InvoiceGenerator invoiceGenerator = new InvoiceGenerator(discountService);

    @Test
    void testGenerateInvoice() {
    }
}