package Theory_lessons;

public class theory_lesson_02 {
    static void main(String[] args) {

        double parfumPrice = 120;
        double discount = 0.15;
        double discountAmount = parfumPrice * discount;
        double finalPrice = parfumPrice - discountAmount;

        System.out.println("Ətirin qiyməti " + parfumPrice + "AZN");
        System.out.println("Endirim faizi 15%");
        System.out.println("Endirim " + discountAmount + "AZN");
        System.out.println("Endirimli qiymət " + finalPrice + "AZN");



    }
}
