package vendingmachine;

public class Product {
    private String name;
    private int price;
    private int count;

    Product (String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getCount() {
        return this.count;
    }
}
