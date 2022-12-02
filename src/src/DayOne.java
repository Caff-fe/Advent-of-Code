import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DayOne {
    public static void main(String[] args) {

//        List<Integer> numbers = new ArrayList<>();
//        Integer sum = 0;
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1000);
        numbers.add(2000);
        numbers.add(3000);
        numbers.add(4000);
        numbers.add(5000);
        numbers.add(6000);
        numbers.add(7000);
        numbers.add(8000);

        System.out.println(numbers);

        try (Stream<String> lines = Files.lines(Path.of("D:/Advent of Code/DayOne/inputOne.txt"), StandardCharsets.UTF_8)){

            List<Integer> calories = Arrays.stream(lines.collect(Collectors.joining(",")).split(",,"))
                    .map(line -> Arrays.stream(line.split(","))
                            .mapToInt(Integer::parseInt).sum()
                    ).sorted(Comparator.reverseOrder()).toList();
            for (Integer calory : calories) {
                System.out.println(calory);
            }
            System.out.println("Answers:");
            System.out.println(" Part 1: " + calories.get(0));
            System.out.println(" Part 2: " + calories.get(0) + calories.get(1) + calories.get(2));
//            File input = new File("D:/Advent of Code/DayOne/inputOne.txt");
//            Scanner reader = new Scanner(input);
//            while (reader.hasNextLine()) {
//                String data = reader.nextLine();
//
//            }
//            reader.close();
        } catch (IOException e) {
            System.out.println("An error");
            e.printStackTrace();
        }
//        for (Integer number : numbers) {
//            System.out.println(number);
//        }

    }



}


//        System.out.println("Answers:");
//        System.out.println(" Part 1: " + calories.get(0));
//        System.out.println(" Part 2: " + calories.get(0) + calories.get(1) + calories.get(2));
//    } catch (IOException exception) {
//        exception.printStackTrace();