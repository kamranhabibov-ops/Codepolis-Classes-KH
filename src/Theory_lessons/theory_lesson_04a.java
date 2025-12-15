package Theory_lessons;

import java.util.Scanner;


public class theory_lesson_04a {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int correctKod = 1212;
        boolean success = false;

        for (int i = 1; i <= 2; i++) {
            System.out.println("Kodu daxil et:");
            int enteredKod = input.nextInt();

            if (enteredKod == correctKod) {
                System.out.println("Daxil olundu");
                success = true;
                break;
            } else {
                System.out.println("Kod yanlışdır, bir daha cəhd edin");
            }
        }

        if (success == false) {
            System.out.println("Giriş bloklandı. Adminə yaxınlaşın");
        }

        input.close();
    }
}
