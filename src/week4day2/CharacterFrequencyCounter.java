package week4day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Count the frequency of string:");
        String input = scanner.nextLine();
        scanner.close();

        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            // Skip spaces and other non-alphabetic characters
            if (!Character.isLetter(c)) {
                continue;
            }

            c = Character.toLowerCase(c); // Convert to lowercase for case-insensitive counting

            // Update character frequency in the map
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet());
    }}
