package mainpackage;

import java.util.*;

public class Order {
    private String customerName;
    private ArrayList<String> items;
    private boolean isCompleted;

    
    public Order(String customerName) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
        this.isCompleted = false;
    }

    public void addItem(String item , int quantity) {
        items.add(item);
        
    }

    public List<String> getItems() {
        return items;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void completeOrder() {
        isCompleted = true;
    }

    public boolean isCompleted() {
        return isCompleted;
    }


}
