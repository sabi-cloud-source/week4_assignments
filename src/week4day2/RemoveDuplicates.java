package week4day2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a list of integers (comma-separated: ");
        String input = scanner.nextLine();
        scanner.close();

        // Split the input string into individual integers
        String[] numbers = input.split(",");

        // Create a set to store unique integers
        Set<Integer> uniqueNumbers = new HashSet<>();

        // Add integers to the set (removing duplicates)
        for (String numStr : numbers) {
            try {
                int num = Integer.parseInt(numStr.trim());
                uniqueNumbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + numStr);
            }
        }

        // Print the unique integers
        System.out.print("Unique integers: ");
        for (int num : uniqueNumbers) {
            System.out.print(num + " ");
        }
    }
}



