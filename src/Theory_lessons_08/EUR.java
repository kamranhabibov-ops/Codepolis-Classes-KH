package Theory_lessons_08;

public class EUR implements Currency {

    private static final double RATE = 1.8;

    @Override
    public double convertToAZN(double amount) {
        double afterCommission = CurrencyConverter.applyCommission(amount);
        double azn = afterCommission * RATE;
        return CurrencyConverter.round(azn);
    }
}
