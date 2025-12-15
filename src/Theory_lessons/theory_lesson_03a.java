package Theory_lessons;

import java.util.Scanner;

public class theory_lesson_03a {
    public static void main(String args[]) {
        //     Scanner scanner=new Scanner(System.in);
        //     System.out.println("Dərəcəni daxil edin");
        //     int temperature = scanner.nextInt();

        //     if (temperature > 25) {
        //         System.out.println("hava istidir");
        //     } else {
        //                         System.out.println("hava sərindir");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Şəhəri daxil edin (Bakı, Sumqayıt, Xırdalan): ");
        String city = scanner.nextLine();

        double deliveryPrice = 0;
        boolean serviceAvailable = true;


        switch (city) {
            case "Bakı":
                deliveryPrice = 5;
                System.out.println("Çatdırılma: 5 AZN");
                break;
            case "Sumqayıt":
                deliveryPrice = 7;
                System.out.println("Çatdırılma: 7 AZN");
                break;
            case "Xırdalan":
                deliveryPrice = 6;
                System.out.println("Çatdırılma: 6 AZN");
                break;
            default:
                System.out.println("Xidmət mövcud deyil");

        }

        if (serviceAvailable) {
            System.out.println("Sifariş məbləğini daxil edin:");
            double orderAmount = scanner.nextDouble();
            if (orderAmount > 50) {
                deliveryPrice = 0;
                 }
            double totalPrice = orderAmount + deliveryPrice;
            System.out.println("Yekun qiymət çatdırılma daxil: " + (totalPrice) + " AZN");

        }
        scanner.close();

    }

}