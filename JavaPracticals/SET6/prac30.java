import java.io.*;

public class prac30 {
    public static void main(String[] args) {
        // Specify the source and destination file paths
        String sourceFilePath = "source.txt";
        String destinationFilePath = "destination.txt";

        // Use try-with-resources to ensure resources are closed automatically
        try (
            FileInputStream fis = new FileInputStream(sourceFilePath);
            FileOutputStream fos = new FileOutputStream(destinationFilePath)
        ) {
            int byteContent;
            // Read from source and write to destination file byte by byte
            while ((byteContent = fis.read()) != -1) {
                fos.write(byteContent);
            }
            System.out.println("File copied successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error occurred while copying the file: " + e.getMessage());
        }
    }
}


