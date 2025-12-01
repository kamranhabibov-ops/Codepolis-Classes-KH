package Practice_lessons;

import java.sql.SQLOutput;
import java.util.Scanner;

public class practice_lesson01 {
    public static void main(String[] args) {

        // type variable = value;

        int fistVariable = 100;
        int secondVariable = 50;

        System.out.println(fistVariable);
        System.out.println(fistVariable + secondVariable);
        System.out.println(fistVariable + "   " + secondVariable);

//        byte byteValue = 127;
//        short shortValue = 32000;
//        int intValue = 127;
//        long longValue = 127999L;
//        float floatValue = 127999F;
//        double doubleValue = 1279.99;
//        char charValue = 'a';
//        String stringValue = "abc";
//        boolean booleanValue = true;
//
//        System.out.println(byteValue);
//        System.out.println(shortValue);
//        System.out.println(intValue);
//        System.out.println(longValue);
//        System.out.println(floatValue);
//        System.out.println(doubleValue);
//        System.out.println(charValue);
//        System.out.println(stringValue);
//        System.out.println(booleanValue);

/*  mh;jksacjhbqdcwa
*/

        // Arithmetic Operators

//        int a, b, c, d, e;
//
//        a = 10;
//        b = 20;
//        c = 30;
//        d = 40;
//        e  = 50;


//        int a =10;
//        int b =20;
//
//        int plus = a + b;
//        System.out.println(plus);
//

//        int a = 10;
//        int b = 6;
//
//        boolean c = a > b;
//
//        System.out.println(a < b);
//        System.out.println(c);
//        System.out.println(a != b);
//        System.out.println(a == b);

        int a = 10;
        double d = a;
        System.out.println(d);

        double d1 = 10.568;
        int a1 = (int) d1;

        System.out.println(a1);

        Scanner sc = new Scanner(System.in);

        System.out.println("Please your name");
        String s = sc.nextLine();
        System.out.println("Your name is " + s);

    }
}
