
// =======================
// File: Warehouse.java
// =======================
package Theory_lessons_14;

import java.util.ArrayList;
import java.util.List;

public class Warehouse<T extends Product> {

    private final List<T> products = new ArrayList<>();

    public void addProduct(T product) {
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }
        products.add(product);
    }

    public boolean removeProduct(T product) {
        if (product == null) return false;
        return products.remove(product);
    }

    public double calculateTotalValue() {
        double total = 0.0;
        for (T product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void printAllProducts() {
        if (products.isEmpty()) {
            System.out.println("(Warehouse is empty)");
            return;
        }
        for (T product : products) {
            System.out.println("- " + product.getName() + " : " + product.getPrice());
        }
    }

    public int size() {
        return products.size();
    }
}
