package Theory_lessons_13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ErrorLogger {

    public static void main(String[] args) {

        String inputFile = "logs.txt";
        String outputFile = "critical_errors.txt";

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        int errorCount = 0;

        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, false))
        ) {

            String line;

            while ((line = reader.readLine()) != null) {

                if (line.startsWith("[ERROR]")) {

                    errorCount++;

                    String timestamp = LocalDateTime.now().format(formatter);


                    writer.write(errorCount + ") " + line + " | " + timestamp);
                    writer.newLine();
                }
            }


            writer.newLine();
            writer.write(errorCount + " sayda səhv tapıldı");
            writer.newLine();

            System.out.println(
                    "Hazırdır! " + errorCount + " sayda səhv critical_errors.txt faylına yazıldı.");
        // Exception vs IOException
        } catch (IOException e) {
            System.out.println("Fayllarla işdə səhv: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
