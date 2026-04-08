import java.io.*;

public class ReplaceWord {
    public static void main(String[] args) {
        String inputFile = "./file1.txt";
        String outputFile = "./file2.txt";

        String word1 = "hello";   
        String word2 = "hi";      

        int replaceCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;

            while ((line = reader.readLine()) != null) {

                
                int index = 0;
                while ((index = line.indexOf(word1, index)) != -1) {
                    replaceCount++;
                    index += word1.length();
                }

                line = line.replace(word1, word2);

                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("Replacement completed.");
            System.out.println("Total replacements: " + replaceCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found!");
        } catch (IOException e) {
            System.out.println("Error while reading or writing the file.");
        }
    }
}