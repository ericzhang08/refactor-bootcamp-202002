package cc.xpbootcamp.warmup.cashier;

import java.time.DayOfWeek;
import java.util.List;

public class Order {
    String customerName;
    String addr;
    List<LineItem> lineItemList;
    private DayOfWeek dayOfWeek;

    public Order(String customerName, String addr, List<LineItem> lineItemList, DayOfWeek dayOfWeek) {
        this.customerName = customerName;
        this.addr = addr;
        this.lineItemList = lineItemList;
        this.dayOfWeek = dayOfWeek;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return addr;
    }

    public List<LineItem> getLineItems() {
        return lineItemList;
    }

    String description() {
        return getCustomerName() + getCustomerAddress();
    }

    double totalAmount() {
        double result = 0;
        for (LineItem lineItem : getLineItems()) {
            result += lineItem.totalAmount() + lineItem.salesTax();
        }
        return result;
    }

    double totalAmountAfterDiscount() {
        if(isWednesday()){
            return totalAmount() - disCount();
        }
        return totalAmount();
    }

    double disCount() {
        return totalAmount() * 0.02;
    }

     double totalSalesTax() {
        double result = 0;
        for (LineItem lineItem : getLineItems()) {
            result += lineItem.salesTax();
        }
        return result;
    }

    public boolean isWednesday() {
        return dayOfWeek.equals(DayOfWeek.WEDNESDAY);
    }
}
