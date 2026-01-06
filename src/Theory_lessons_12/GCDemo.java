
public class GCDemo {

    // 1. Класс Order
    static class Order {
        int id;
        byte[] data;

        public Order(int id) {
            this.id = id;
            this.data = new byte[1024 * 1024]; // 1 MB
        }
    }

    public static void main(String[] args) {

        // Runtime — доступ к информации о памяти JVM
        Runtime runtime = Runtime.getRuntime();

        // 2. Цикл (не бесконечный, но большой, чтобы GC был заметен)
        for (int i = 1; i <= 10_000; i++) {

            // 3. Создаём объект, но НЕ сохраняем ссылку
            new Order(i); // объект сразу становится "мусором"

            // 4. Каждые 100 объектов выводим информацию о памяти
            if (i % 100 == 0) {
                long totalMemory = runtime.totalMemory() / (1024 * 1024);
                long freeMemory = runtime.freeMemory() / (1024 * 1024);
                long usedMemory = totalMemory - freeMemory;

                System.out.println(
                        "Order: " + i +
                                " | Ümumi: " + totalMemory + " MB" +
                                " | İstifadə olunan: " + usedMemory + " MB" +
                                " | Sərbəst: " + freeMemory + " MB"
                );
            }

            // Небольшая пауза, чтобы GC было видно
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Proqram başa çatdı.");
    }
}

