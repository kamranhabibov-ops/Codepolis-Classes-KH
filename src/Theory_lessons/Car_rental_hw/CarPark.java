package Theory_lessons.Car_rental_hw;

import java.util.ArrayList;
import java.util.List;

public class CarPark {
    private final List<Car> cars = new ArrayList<>();
    private int nextId = 1;

    public void addCar(String model, CategoryType category) {
        cars.add(new Car(nextId++, model, category));
    }

    public List<Car> getAll() {
        return new ArrayList<>(cars);
    }

    public List<Car> getByCategory(CategoryType category) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getCategory() == category) {
                result.add(car);
            }
        }
        return result;
    }

    public Car findById(int id) {
        for (Car car : cars) {
            if (car.getId() == id) return car;
        }
        return null;
    }
}

