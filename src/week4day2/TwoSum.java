package week4day2;

import java.util.*;

    public class TwoSum {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of elements in the list: ");
            int n = scanner.nextInt();
            int[] nums = new int[n];

            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            System.out.print("Enter the target sum: ");
            int target = scanner.nextInt();

            scanner.close();

            Map<Integer, Integer> numIndexMap = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int complement = target - nums[i];
                if (numIndexMap.containsKey(complement)) {
                    int complementIndex = numIndexMap.get(complement);
                    System.out.println("Indices " + complementIndex + " and " + i + " add up to the target sum.");
                    return;
                }
                numIndexMap.put(nums[i], i);
            }

            System.out.println("No two numbers add up to the target sum.");
        }
    }

