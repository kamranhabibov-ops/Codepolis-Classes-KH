
package Theory_lessons_06;

public class EWallet {

    // Баланс нельзя менять напрямую
    private double balance;

    // Конструктор (баланс по умолчанию = 0)
    public EWallet() {
        this.balance = 0.0;
    }

    // Только чтение баланса
    public double getBalance() {
        return balance;
    }

    // Пополнение баланса
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Ошибка: сумма пополнения должна быть положительной.");
            return;
        }

        balance += amount;
        System.out.println("Баланс пополнен на " + amount + ". Текущий баланс: " + balance);
    }

    // Снятие средств
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Ошибка: сумма снятия должна быть положительной.");
            return;
        }

        if (amount > balance) {
            System.out.println("Ошибка: недостаточно средств. Текущий баланс: " + balance);
            return;
        }

        balance -= amount;
        System.out.println("Снято " + amount + ". Текущий баланс: " + balance);
    }
}
