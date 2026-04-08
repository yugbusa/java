import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileCount {
    public static void main(String[] args) {
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            
            File file = new File("input.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                lineCount++;

                charCount += line.length();
                
                String words[] = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            sc.close();

            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters: " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        }
    }
}