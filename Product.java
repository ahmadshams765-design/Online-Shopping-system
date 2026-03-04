
public class Product {

    private final String name;
    private final int id;
    private double price;
    private int quantity;

    public Product(String name, int id, double price, int quantity) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    public String get_name() {
        return name;
    }

    public int get_id() {
        return id;
    }

    public double get_price() {
        return price;
    }

    public int get_quantity() {
        return quantity;
    }

    public void set_price(double price) {
        this.price = price;
    }

    public void set_quantity(int amount) {
        quantity += amount;
    }

}

