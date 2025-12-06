package Theory_lessons;

public class theory_lesson_02 {
    static void main(String[] args) {

        // ətirə endirim
        double parfumPrice = 120;
        double discount = 0.15;
        double discountAmount = parfumPrice * discount;
        double finalPrice = parfumPrice - discountAmount;

        System.out.println("Ətirin qiyməti " + parfumPrice + "AZN");
        System.out.println("Endirim faizi 15%");
        System.out.println("Endirim " + discountAmount + "AZN");
        System.out.println("Endirimli qiymət " + finalPrice + "AZN");

// bank depoziti
        double bankDeposit = 5000;
        double interestRate = 0.12;
        double interestAmount = bankDeposit * interestRate;
        double totalAmount = bankDeposit + interestAmount;

        System.out.println("Bank depoziti " + bankDeposit + "AZN");
        System.out.println("Depozit daizi 12%");
        System.out.println("Depozit faizi " + interestAmount + "AZN");
        System.out.println("Toplam ilin axırında " + totalAmount + "AZN");

        // ƏDV hesablanması

        double priceGoods = 1200;
        double vatRate = 0.18;
        double vatAmount = priceGoods * vatRate;
        double finalPriceGoods = priceGoods + vatAmount;

        System.out.println("Malın qiyməti " + priceGoods + "AZN");
        System.out.println("ƏDV 18%");
        System.out.println("ƏDV 18% " + vatAmount + "AZN");
        System.out.println("Malın yekun qiyməti " + finalPriceGoods + "AZN");

        // artımın faiz hesablanması

        double thisYearResult = 45000;
        double lastYearResult = 30000;
        double difference = thisYearResult - lastYearResult;
        double increaseRate = difference * 100 / lastYearResult;

        System.out.println("Keçən ilin gəliri " + lastYearResult + "AZN");
        System.out.println("Bu ilin gəiri " + thisYearResult + "AZN");
        System.out.println("Artım məbləği " + difference + "AZN");
        System.out.println("Artım məbləği faizlə " + increaseRate + "%");



    }
}
