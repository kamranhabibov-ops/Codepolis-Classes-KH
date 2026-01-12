package Theory_lessons_09;

public class Main {
    public static void main(String[] args) {

        Product product = new Product("Laptop", 5);

        try {
            product.sifarisVer(3);
            product.sifarisVer(10);
        } catch (OutOfStockException e) {
            System.out.println("Xəta: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Xəta: Sifariş sayı düzgün deyil! " + e.getMessage());
        }

        System.out.println("Proqram davam edir...");
    }
}
