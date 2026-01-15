package Theory_lessons.Car_rental_hw;

public enum CategoryType {
    A(50, 3, 2, false),
    B(60, 4, 3, false),
    BUSINESS(80, 4, 4, false),
    V(150, 6, 6, false),
    E(80, 4, 4, true); // Electric

    private final int pricePerDayAZN;
    private final int passengers;
    private final int suitcases;
    private final boolean electric;

    CategoryType(int pricePerDayAZN, int passengers, int suitcases, boolean electric) {
        this.pricePerDayAZN = pricePerDayAZN;
        this.passengers = passengers;
        this.suitcases = suitcases;
        this.electric = electric;
    }

    public int getPricePerDayAZN() {
        return pricePerDayAZN;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getSuitcases() {
        return suitcases;
    }

    public boolean isElectric() {
        return electric;
    }

    public String displayName() {
        return electric ? (name() + " (Electric)") : name();
    }
}
