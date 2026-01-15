package Theory_lessons.Car_rental_hw;

public class RentalCalculator {
    private final DiscountPolicy discountPolicy;

    public RentalCalculator(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public PriceResult calculate(Car car, int days) {
        int pricePerDay = car.getCategory().getPricePerDayAZN();
        double base = pricePerDay * (double) days;

        double discountRate = discountPolicy.getDiscountRate(days);
        double discountAmount = base * discountRate;

        double total = base - discountAmount;

        return new PriceResult(pricePerDay, days, base, discountRate, discountAmount, total);
    }
}

