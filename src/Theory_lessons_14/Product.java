
// =======================
// File: Product.java
// =======================
package Theory_lessons_14;

public abstract class Product {
    private final String name;
    private final double price;

    public Product(String name, double price) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Product price cannot be negative");
        }
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " (" + price + ")";
    }
}
