package Theory_lessons;

public class theory_lesson_05 {
    public static void main(String[] args) {

// Ev Tapşırığı: "Hava Analizatoru"

        double[] temperatures = {20.5, 22.1, 19.0, 18.5, 19.2, 16.0, 17.8};
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        double sum = 0.0;

        System.out.println("Temperatures by day: ");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println(weekDays[i] + " : " + temperatures[i] + "°C");
        }
        for (int i = 0; i < temperatures.length; i++) {
            sum = sum + temperatures[i];
        }
        double average = sum / temperatures.length;
        System.out.println();
        System.out.println("Average temperature: " + String.format("%.2f", average) + "°C");

        double max = temperatures[0];
        int maxIndex = 0;

        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > max) {
                max = temperatures[i];
                maxIndex = i;
            }

        }
        System.out.println();
        System.out.println("Highest Temperature:"  + max + " °C (" + weekDays[maxIndex] + ")");
    }
        }


