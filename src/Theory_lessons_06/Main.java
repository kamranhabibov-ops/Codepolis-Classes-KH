
package Theory_lessons_06;

public class Main {

    public static void main(String[] args) {

        // Создаём электронный кошелёк
        EWallet wallet = new EWallet();

        System.out.println("Начальный баланс: " + wallet.getBalance());
        System.out.println();

        // Пополнение баланса
        wallet.deposit(500);
        wallet.deposit(200);

        System.out.println();

        // Корректное снятие
        wallet.withdraw(300);

        System.out.println();

        // Попытка снять больше, чем есть
        wallet.withdraw(1000);

        System.out.println();

        // Попытка некорректных операций
        wallet.deposit(-50);
        wallet.withdraw(-20);

        System.out.println();
        System.out.println("Итоговый баланс: " + wallet.getBalance());
    }
}
