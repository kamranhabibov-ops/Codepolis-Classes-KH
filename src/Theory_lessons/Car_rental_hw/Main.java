package Theory_lessons.Car_rental_hw;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CarPark park = buildCarPark();

        DiscountPolicy discountPolicy = new DiscountPolicy();
        RentalCalculator calculator = new RentalCalculator(discountPolicy);
        ReceiptPrinter printer = new ReceiptPrinter();
        ReceiptWriter writer = new ReceiptWriter("receipt.txt");
        Menu menu = new Menu();

        try (Scanner sc = new Scanner(System.in)) {

            while (true) {
                int choice = menu.showMainMenu(sc);

                if (choice == 0) {
                    System.out.println("Bye!");
                    break;
                }

                if (choice != 1) {
                    System.out.println("Wrong menu choice.");
                    continue;
                }

                boolean repeat;
                do {
                    // 1) показать категории и цены
                    menu.printCategoriesAndPrices();

                    // 2) пользователь выбирает категорию
                    CategoryType category = menu.chooseCategory(sc);

                    // 3) показать машины этой категории
                    List<Car> carsInCategory = park.getByCategory(category);
                    menu.printCars(carsInCategory, "CARS IN CATEGORY " + category.displayName());

                    if (carsInCategory.isEmpty()) {
                        System.out.println("No cars available in this category.");
                        repeat = menu.askRepeat(sc);
                        continue;
                    }

                    // 4) выбрать конкретную машину по ID
                    int carId = menu.chooseCarId(sc);
                    Car chosen = park.findById(carId);

                    // защита: чтобы не выбрали ID из другой категории
                    if (chosen == null || chosen.getCategory() != category) {
                        System.out.println("Wrong ID. Please choose a car ID from this category list.");
                        repeat = menu.askRepeat(sc);
                        continue;
                    }

                    // 5) ввести дни
                    int days = menu.askDays(sc);

                    // 6) посчитать цену + скидку
                    PriceResult result = calculator.calculate(chosen, days);

                    // 7) печать чека
                    printer.printToConsole(chosen, result);

                    // опционально: экспорт в файл
                    if (menu.askExportToFile(sc)) {
                        String text = printer.buildReceiptText(chosen, result);
                        writer.appendReceipt(text);
                        System.out.println("Saved to receipt.txt (appended).");
                    }

                    repeat = menu.askRepeat(sc);

                } while (repeat);
            }
        }
    }

    private static CarPark buildCarPark() {
        CarPark park = new CarPark();

        // Category A
        park.addCar("Mercedes A160", CategoryType.A);
        park.addCar("Hyundai i20", CategoryType.A);
        park.addCar("Fiat 500", CategoryType.A);

        // Category B
        park.addCar("Kia Rio", CategoryType.B);
        park.addCar("Renault Logan", CategoryType.B);
        park.addCar("Volkswagen Polo", CategoryType.B);

        // Category Business
        park.addCar("Lexus ES", CategoryType.BUSINESS);
        park.addCar("Skoda Superb", CategoryType.BUSINESS);
        park.addCar("BMW 5 series", CategoryType.BUSINESS);

        // Category V
        park.addCar("Mercedes Viano", CategoryType.V);
        park.addCar("Toyota Alphard", CategoryType.V);
        park.addCar("Hyundai Staria", CategoryType.V);

        // Category E
        park.addCar("Tesla Model Y", CategoryType.E);
        park.addCar("Audi Etron SUV", CategoryType.E);
        park.addCar("Changan Qiyuan Q7", CategoryType.E);

        return park;
    }
}
