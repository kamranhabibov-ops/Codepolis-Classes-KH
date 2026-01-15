package Theory_lessons.Car_rental_hw;

public class DiscountPolicy {

    // Возвращает скидку как коэффициент: 0.05 = 5%
    public double getDiscountRate(int days) {
        if (days > 30) return 0.15;
        if (days > 10) return 0.10;
        if (days > 5)  return 0.05;
        return 0.0;
    }
}
