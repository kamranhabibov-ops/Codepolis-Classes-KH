package Theory_lessons.Car_rental_hw;

public class Car {
    private final int id;              // уникальный ID в парке
    private final String model;
    private final CategoryType category;

    public Car(int id, String model, CategoryType category) {
        this.id = id;
        this.model = model;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public CategoryType getCategory() {
        return category;
    }

    public String shortInfo() {
        return String.format(
                "#%d | %s | Cat: %s | %d pax | %d suitcases | %d AZN/day",
                id,
                model,
                category.displayName(),
                category.getPassengers(),
                category.getSuitcases(),
                category.getPricePerDayAZN()
        );
    }
}
