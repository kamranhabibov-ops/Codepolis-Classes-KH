package Theory_lessons;

import java.util.Scanner;

public class theory_lesson_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int correctPIN = 1234;
        boolean success = false;

        for  (int i = 1; i <= 3; i++) {
            System.out.println("PIN daxil et ");
            int enteredPIN = input.nextInt();
            if(enteredPIN == correctPIN) {
                System.out.println("Siz sistemə dxail oldunuz!");
                success = true;
                break;
            } else {
                System.out.println("Yanlış PIN, yenidən daxil et ");

            }

        }
        if(success == false) {
            System.out.println("Kartınız bloklandı");

        }
        input.close();



        }
    }

