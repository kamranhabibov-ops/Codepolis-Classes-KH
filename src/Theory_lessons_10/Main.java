package Theory_lessons_10;

public class Main {

    public static void updatePrice(Product product, int value) {

        product.price = 200; // меняем объект (Heap)
        value = 999;         // меняем копию примитива (Stack)

        System.out.println(
                "Inside updatePrice -> product.price = "
                        + product.price + ", value = " + value
        );
    }

    public static void main(String[] args) {

        Product p = new Product(100);
        int x = 50;

        System.out.println(
                "Before updatePrice -> p.price = "
                        + p.price + ", x = " + x
        );

        updatePrice(p, x);

        System.out.println(
                "After updatePrice -> p.price = "
                        + p.price + ", x = " + x
        );
    }
}

