import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayOne {
    public static void main(String[] args) {

        try {
            File input = new File("D:/Advent of Code/DayOne/inputOne.txt");
            Scanner reader = new Scanner(input);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error");
            e.printStackTrace();
        }
    }
}
