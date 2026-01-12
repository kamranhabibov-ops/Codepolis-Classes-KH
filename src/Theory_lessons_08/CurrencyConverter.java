package Theory_lessons_08;

public class CurrencyConverter {

    private static double commissionRate = 0.01;

    public static void setCommissionRate(double newRate) {
        if (newRate < 0 || newRate > 0.20) {
            System.out.println("Xəta: Komissiya 0 ilə 0.20 arasında olmalıdır!");
            return;
        }
        commissionRate = newRate;
    }

    public static double getCommissionRate() {
        return commissionRate;
    }

    public static double applyCommission(double amount) {
        return round(amount - (amount * commissionRate));
    }

    // ✅ Универсальный метод округления
    public static double round(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
