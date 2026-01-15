package Theory_lessons.Car_rental_hw;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {

    private final String fileName;

    public ReceiptWriter(String fileName) {
        this.fileName = fileName;
    }

    public void appendReceipt(String receiptText) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String ts = LocalDateTime.now().format(fmt);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write("===== RECEIPT (" + ts + ") =====");
            writer.newLine();
            writer.write(receiptText);
            writer.newLine();
            writer.write("================================");
            writer.newLine();
            writer.newLine();
        } catch (IOException e) {
            System.out.println("File write error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

