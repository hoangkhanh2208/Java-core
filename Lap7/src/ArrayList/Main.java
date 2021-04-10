package ArrayList;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        // File myFile = new File("MyFile.txt");
        // myFile.createNewFile();

        // FileWriter fileWriter = new FileWriter(myFile);
        // fileWriter.write("Hello");
        // fileWriter.write("Java");
        // fileWriter.write("Python");
        // fileWriter.write("C++");

        // fileWriter.close();

        // Scanner fileRead = new Scanner(myFile);
        // System.out.println(fileRead.nextLine());

        File file = new File("File.txt");
        Scanner fileRead = new Scanner(file);
        while (fileRead.hasNextLine()) {
            System.out.println(fileRead.nextLine());
        }
    }
}
