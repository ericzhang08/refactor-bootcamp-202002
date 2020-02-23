package cc.xpbootcamp.warmup.cashier;

import java.time.DayOfWeek;
import java.time.LocalDate;

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

        output.append(printDiscount());

        output.append(printTotalAmountAfterDiscount());
        return output.toString();
    }

    private String printTotalAmountAfterDiscount() {
        return new StringBuilder().append("Total Amount").append('\t').append(order.totalAmountAfterDiscount()).toString();
    }

    private String printDiscount() {
        if(order.isWednesday()){
            return new StringBuilder().append("Discount").append('\t').append(order.disCount()).toString();
        }
        return "";
    }


    private String printTotalSalesTax() {
        StringBuilder output = new StringBuilder();
        return output.append("Sales Tax").append('\t').append(order.totalSalesTax()).append('\n').toString();
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






}