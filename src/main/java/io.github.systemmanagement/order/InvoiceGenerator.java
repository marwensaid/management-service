package io.github.systemmanagement.order;

public class InvoiceGenerator {
    private DiscountService discountService;

    public InvoiceGenerator(DiscountService discountService) {
        this.discountService = discountService;
    }

    public String generateInvoice(Order order) {
        double discountedTotal = discountService.applyDiscount(order);
        StringBuilder invoice = new StringBuilder();
        invoice.append("Invoice:\n");
        for (Product product : order.getProducts()) {
            invoice.append(product.getName())
                    .append(" - $")
                    .append(product.getPrice())
                    .append(" x ")
                    .append(product.getQuantity())
                    .append(" = $")
                    .append(product.getTotalPrice())
                    .append("\n");
        }
        invoice.append("Total (after discount): $").append(discountedTotal);
        return invoice.toString();
    }
}