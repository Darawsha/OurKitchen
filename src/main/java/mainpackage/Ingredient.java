package mainpackage;

public class Ingredient {
	
	private String name;
    private int stock;
    private int threshold;
    private int stockLevel;

    public Ingredient(String name, int stock, int threshold) {
        this.name = name;
        this.stock = stock;
        this.threshold = threshold;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getThreshold() {
        return threshold;
    }

	public int getStockLevel() {
		return stockLevel;
	}

	public void setStockLevel(int stockLevel) {
		this.stockLevel = stockLevel;
	}
}
