package Theory_lessons.Car_rental_hw;


public class ReceiptPrinter {

    public void printToConsole(Car car, PriceResult r) {
        System.out.println("\n================= RECEIPT =================");
        System.out.println("Car: " + car.getModel());
        System.out.println("Car ID: #" + car.getId());
        System.out.println("Category: " + car.getCategory().displayName());
        System.out.println("Capacity: " + car.getCategory().getPassengers() + " pax, " +
                car.getCategory().getSuitcases() + " suitcases");
        System.out.println("-------------------------------------------");
        System.out.println("Days: " + r.getDays());
        System.out.println("Price per day: " + r.getPricePerDay() + " AZN");
        System.out.printf("Base: %.2f AZN%n", r.getBase());

        if (r.getDiscountRate() > 0) {
            System.out.printf("Discount: %.0f%%%n", r.getDiscountRate() * 100);
            System.out.printf("Discount amount: -%.2f AZN%n", r.getDiscountAmount());
        } else {
            System.out.println("Discount: 0%");
        }

        System.out.println("-------------------------------------------");
        System.out.printf("TOTAL: %.2f AZN%n", r.getTotal());
        System.out.println("===========================================\n");
    }

    public String buildReceiptText(Car car, PriceResult r) {
        StringBuilder sb = new StringBuilder();
        sb.append("Car: ").append(car.getModel()).append("\n");
        sb.append("Car ID: #").append(car.getId()).append("\n");
        sb.append("Category: ").append(car.getCategory().displayName()).append("\n");
        sb.append("Capacity: ").append(car.getCategory().getPassengers())
                .append(" pax, ").append(car.getCategory().getSuitcases()).append(" suitcases\n");
        sb.append("Days: ").append(r.getDays()).append("\n");
        sb.append("Price per day: ").append(r.getPricePerDay()).append(" AZN\n");
        sb.append(String.format("Base: %.2f AZN%n", r.getBase()));

        if (r.getDiscountRate() > 0) {
            sb.append(String.format("Discount: %.0f%%%n", r.getDiscountRate() * 100));
            sb.append(String.format("Discount amount: -%.2f AZN%n", r.getDiscountAmount()));
        } else {
            sb.append("Discount: 0%\n");
        }

        sb.append(String.format("TOTAL: %.2f AZN%n", r.getTotal()));
        return sb.toString();
    }
}
