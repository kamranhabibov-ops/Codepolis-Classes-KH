package Theory_lessons;

import java.util.Scanner;

public class theory_lesson_03a {
    static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dərəcəni daxil edin");
        int temperature = scanner.nextInt();

        if (temperature > 25) {
            System.out.println("hava istidir");
        } else {
                            System.out.println("hava sərindir");
            }
        }
    }

