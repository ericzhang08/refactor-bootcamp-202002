package cc.xpbootcamp.warmup.cashier;

/**
 * OrderReceipt prints the details of order including customer name, address, description, quantity,
 * price and amount. It also calculates the sales tax @ 10% and prints as part
 * of order. It computes the total order amount (amount of individual lineItems +
 * total sales tax) and prints it.
 *
 */
public class OrderReceipt {
    private Order order;

    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String printReceipt() {
        StringBuilder output = new StringBuilder();

        output.append(printHeader());

        output.append(order.description());

        output.append(printsLineItems());

        output.append(printTotalSalesTax());

        output.append(printTotalAmount());
        return output.toString();
    }

    private String printTotalAmount() {
        return new StringBuilder().append("Total Amount").append('\t').append(totalAmount()).toString();
    }

    private String printTotalSalesTax() {
        StringBuilder output = new StringBuilder();
        return output.append("Sales Tax").append('\t').append(totalSalesTax()).toString();
    }

    private String  printsLineItems() {
        StringBuilder output = new StringBuilder();
        for (LineItem lineItem : order.getLineItems()) {
            output.append(lineItem.getDescription());
            output.append('\t');
            output.append(lineItem.getPrice());
            output.append('\t');
            output.append(lineItem.getQuantity());
            output.append('\t');
            output.append(lineItem.totalAmount());
            output.append('\n');
        }
        return output.toString();
    }

    private String printHeader() {
        return "======Printing Orders======\n";
    }

    private double totalSalesTax() {
        double result = 0;
        for (LineItem lineItem : order.getLineItems()) {
                result += lineItem.salesTax();
            }
        return result;
        }
    private double totalAmount() {
        double result = 0;
        for (LineItem lineItem : order.getLineItems()) {
            result += lineItem.totalAmount() + lineItem.salesTax();
        }
        return result;
    }

}