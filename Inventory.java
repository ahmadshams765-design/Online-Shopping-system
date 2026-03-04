import java.util.ArrayList;

public class Inventory {

    private ArrayList<Product> array;

    // constructor initializes an empty inventory of five spaces by default
    public Inventory() {
        array = new ArrayList<>(5);
    }

// search
    public boolean search(Product product) {
        boolean found = false;
        Product stored;
        for (int i = 0; i < array.size(); i++) {
            stored = array.get(i);
            if (product.get_name() == stored.get_name()) {
                System.out.print("found at index " + i);
                return !found;
            }
        }
        return found;
    }

    // add product via passing a constructor
    public void add_product(Product product, int amount) {

        if (search(product) == true) {
            product.set_quantity(amount);
        } else {
            array.add(product);
        }

    }

    // remove product
    public void remove_product(Product product) {

        if (search(product) == true) {
            array.remove(product);
        } else {
            System.out.print("doesn't exist to remove\n");
        }
    }

    // Display
    public void display_all() {
        Product element;
        for (int i = 0; i < array.size(); i++) {
            element = array.get(i);
            System.out.printf("(%d) %s\n", i + 1, element.get_name());
        }
    }

}
