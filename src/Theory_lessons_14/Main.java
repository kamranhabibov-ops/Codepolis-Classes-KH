package Theory_lessons_14;

// =======================
// File: Main.java
// =======================


public class Main {
    public static void main(String[] args) {

        // Electronics warehouse
        Warehouse<Electronics> electronicsWarehouse = new Warehouse<>();
        electronicsWarehouse.addProduct(new Electronics("TV", 1200.00));
        electronicsWarehouse.addProduct(new Electronics("Laptop", 2500.00));

        System.out.println("=== Electronics Warehouse ===");
        electronicsWarehouse.printAllProducts();
        System.out.println("Total value: " + electronicsWarehouse.calculateTotalValue());
        System.out.println();

        // Clothing warehouse
        Warehouse<Clothing> clothingWarehouse = new Warehouse<>();
        clothingWarehouse.addProduct(new Clothing("T-Shirt", 35.50));
        clothingWarehouse.addProduct(new Clothing("Jacket", 120.00));

        System.out.println("=== Clothing Warehouse ===");
        clothingWarehouse.printAllProducts();
        System.out.println("Total value: " + clothingWarehouse.calculateTotalValue());
        System.out.println();

        // Type-safety demo (uncomment to see compile error)
        // clothingWarehouse.addProduct(new Electronics("Phone", 900.00));
        // ^ Compile-time error: required Clothing, provided Electronics
    }
}
