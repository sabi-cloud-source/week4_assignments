package week3day1;

import java.util.ArrayList;

public class MaxElementInArrayList {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(12);
        numbers.add(3);
        numbers.add(8);
        numbers.add(9);

        // Find the maximum element
        int maxElement = findMaxElement(numbers);

        // Print the maximum element
        System.out.println("Maximum element: " + maxElement);
    }

    // Function to find the maximum element in an ArrayList of integers
    public static int findMaxElement(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty.");
        }

        int max = list.get(0); // Initialize max with the first element

        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
}