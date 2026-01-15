package Theory_lessons.Car_rental_hw;

public class PriceResult {
    private final int pricePerDay;
    private final int days;
    private final double base;
    private final double discountRate;
    private final double discountAmount;
    private final double total;

    public PriceResult(int pricePerDay, int days, double base, double discountRate, double discountAmount, double total) {
        this.pricePerDay = pricePerDay;
        this.days = days;
        this.base = base;
        this.discountRate = discountRate;
        this.discountAmount = discountAmount;
        this.total = total;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public int getDays() {
        return days;
    }

    public double getBase() {
        return base;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public double getTotal() {
        return total;
    }
}
