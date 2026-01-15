package Theory_lessons.Car_rental_hw;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public int showMainMenu(Scanner sc) {
        System.out.println("=== CAR RENTAL ===");
        System.out.println("1) Show car categories and prices");
        System.out.println("0) Exit");
        System.out.print("Choose: ");
        return readInt(sc);
    }

    public void printCategoriesAndPrices() {
        System.out.println("\n--- CATEGORIES & PRICES ---");
        for (CategoryType c : CategoryType.values()) {
            System.out.println(
                    c.displayName() +
                            " | " + c.getPricePerDayAZN() + " AZN/day" +
                            " | " + c.getPassengers() + " pax" +
                            " | " + c.getSuitcases() + " suitcases"
            );
        }
        System.out.println("---------------------------");
    }

    public CategoryType chooseCategory(Scanner sc) {
        while (true) {
            System.out.println("\nChoose category:");
            System.out.println("1) A - 50 AZN/day");
            System.out.println("2) B - 60 AZN/day");
            System.out.println("3) BUSINESS - 80 AZN/day");
            System.out.println("4) V - 150 AZN/day");
            System.out.println("5) E (Electric) - 80 AZN/day");
            System.out.print("Enter 1-5: ");

            int choice = readInt(sc);
            switch (choice) {
                case 1: return CategoryType.A;
                case 2: return CategoryType.B;
                case 3: return CategoryType.BUSINESS;
                case 4: return CategoryType.V;
                case 5: return CategoryType.E;
                default:
                    System.out.println("Wrong choice. Try again.");
            }
        }
    }

    public void printCars(List<Car> cars, String title) {
        System.out.println("\n--- " + title + " ---");
        if (cars.isEmpty()) {
            System.out.println("(no cars)");
            return;
        }
        for (Car car : cars) {
            System.out.println(car.shortInfo());
        }
    }

    public int chooseCarId(Scanner sc) {
        while (true) {
            System.out.print("\nEnter car ID from the list: ");
            int id = readInt(sc);
            if (id > 0) return id;
            System.out.println("ID must be > 0.");
        }
    }

    public int askDays(Scanner sc) {
        while (true) {
            System.out.print("Enter rental days (>=1): ");
            int days = readInt(sc);
            if (days >= 1) return days;
            System.out.println("Days must be >= 1.");
        }
    }

    public boolean askExportToFile(Scanner sc) {
        System.out.print("Export receipt to receipt.txt? (y/n): ");
        String s = sc.next().trim().toLowerCase();
        sc.nextLine();
        return s.equals("y") || s.equals("yes");
    }

    public boolean askRepeat(Scanner sc) {
        System.out.print("\nRent another car? (y/n): ");
        String s = sc.next().trim().toLowerCase();
        sc.nextLine();
        return s.equals("y") || s.equals("yes");
    }

    private int readInt(Scanner sc) {
        while (true) {
            try {
                int val = sc.nextInt();
                sc.nextLine(); // consume endline
                return val;
            } catch (InputMismatchException e) {
                sc.nextLine(); // clear wrong input
                System.out.print("Please enter a number: ");
            }
        }
    }
}
