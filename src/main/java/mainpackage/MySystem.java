package mainpackage;

import mainpackage.service.*;

public class MySystem {

    private final CustomerService customerService;
    private final StockService stockService;
    private final KitchenService kitchenService;
    private final BillService billService;
    private final StorehouseService storehouseService;

    public MySystem() {
   
        this.customerService = new CustomerService();
		this.stockService = new StockService(new StockManager());
		this.kitchenService = new KitchenService(new SupplierManager(), new StockManager()); 
		this.billService = new BillService();
		this.storehouseService = new StorehouseService();
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

	public BillService getBillService() {
		return billService;
	}

	/**
	 * @return the storehouse
	 */
	public StorehouseService getStorehouseService() {
		return storehouseService;
	}
}
