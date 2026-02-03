package az.edu.ada.modules.module01.lecture03.model;

import java.util.List;

public class Order {

    private final String id;
    private final List<Item> items;
    private final String customerType;
    private final String customerEmail;

    public Order(String id,
                 List<Item> items,
                 String customerType,
                 String customerEmail) {
        this.id = id;
        this.items = items;
        this.customerType = customerType;
        this.customerEmail = customerEmail;
    }

    public String getId() { return id; }

    public List<Item> getItems() { return items; }

    public String getCustomerType() { return customerType; }

    public String getCustomerEmail() { return customerEmail; }
}
