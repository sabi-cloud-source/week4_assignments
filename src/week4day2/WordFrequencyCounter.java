package week4day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Create a map to store word frequencies
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        // Count word frequencies
        for (String word : words) {
            // Remove punctuation and convert to lowercase for consistency
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            // Skip empty strings
            if (word.isEmpty()) {
                continue;
            }

            // Update word frequency in the map
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }

        // Print word frequencies
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    }

