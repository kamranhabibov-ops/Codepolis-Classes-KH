package Theory_lessons_09;

public class Product {

    private String name;
    private int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public void sifarisVer(int say) throws OutOfStockException {

        if (say <= 0) {
            throw new IllegalArgumentException("Sifariş sayı 1-dən böyük olmalıdır!");
        }

        if (say > stock) {
            throw new OutOfStockException("Anbarda məhsul bitib. Mövcud stok: " + stock);
        }

        stock = stock - say;
        System.out.println("Sifariş qəbul edildi. Məhsul: " + name + ", Say: " + say + ", Qalan stok: " + stock);
    }
}

