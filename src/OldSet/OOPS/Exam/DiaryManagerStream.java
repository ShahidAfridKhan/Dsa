package OldSet.OOPS.Exam;

import java.io.FileOutputStream;
import java.io.IOException;

public class DiaryManagerStream {

    public static void writeWithStream(String fileName, String message) {
        try (FileOutputStream fos = new FileOutputStream(fileName, true)) {
            byte[] bytes = message.getBytes();
            fos.write(bytes);
            fos.write(System.lineSeparator().getBytes());
            System.out.println("Message written successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        writeWithStream("diary.txt", "Today I completed my Java file writing program!");
    }
}
