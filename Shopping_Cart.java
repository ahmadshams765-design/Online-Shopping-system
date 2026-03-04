
import java.util.ArrayList;

public class Shopping_Cart {

    private ArrayList<Cart_item> array;

    public Shopping_Cart() {
        array = new ArrayList<>(5);
    }

    public int search(Product product) {
        for (int i = 0; i < array.size(); i++) {
            Cart_item stored = array.get(i);
            if (stored.get_product().get_name().equals(product.get_name())) {
                return i;
            }
        }
        return -1;
    }

    public void add_item(Product product, int quantity) {
        if (product == null) {
            throw new IllegalArgumentException("product can't be null");
        }

        if (quantity <= 0) {
            throw new IllegalArgumentException("enter a positive value");
        }

        Cart_item item = new Cart_item(product, quantity);

        if (search(item.get_product()) == -1) {
            array.add(item);

        } else {
            Cart_item stored = array.get(search(product));
            stored.set_quantity(stored.get_quantity() + quantity);
        }
    }


    
    public void remove_item(Product product, int quantity) {
        if (product == null) {
            throw new IllegalArgumentException("product can't be null");
        }

        if (quantity <= 0) {
            throw new IllegalArgumentException("enter a positive value");
        }

    }
}
