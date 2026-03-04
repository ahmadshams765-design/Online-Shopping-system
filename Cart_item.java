
public class Cart_item {

    private Product product;
    private int quantity;

    public Cart_item(Product product, int quantity) {
        if (product == null) {
            throw new IllegalArgumentException("product shouldn't be null");
        }

        if (quantity <= 0) {
            throw new IllegalArgumentException("Enter a positive value");
        }

        this.product = product;
        this.quantity = quantity;
    }

    public Product get_product() {
        return product;
    }

    public int get_quantity() {
        return quantity;
    }

    public void set_quantity(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Enter a positive value");
        }

        quantity = amount;
    }

    public double get_subTotal() {
        return quantity * product.get_price();
    }

    @Override
    public String toString() {
        return "name: " + product.get_name() + "\n" + "quantity: " + this.get_quantity()
                + "\n" + "Total: " + this.get_subTotal() + "\n\n";
    }

}
