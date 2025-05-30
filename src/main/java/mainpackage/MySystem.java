package mainpackage;

import mainpackage.service.*;

public class MySystem {

    private final CustomerService customerService;
    private final StockService stockService;
    private final KitchenService kitchenService;

    public MySystem(StockService stockService, KitchenService kitchenService) {
        if (stockService == null || kitchenService == null) {
            throw new IllegalArgumentException("StockService and KitchenService cannot be null.");
        }
        this.customerService = new CustomerService();
        this.stockService = stockService;
        this.kitchenService = kitchenService;
    }

    public CustomerService getCustomerService() {
        return customerService;
    }

    public StockService getStockService() {
        return stockService;
    }

    public KitchenService getKitchenService() {
        return kitchenService;
    }
}
