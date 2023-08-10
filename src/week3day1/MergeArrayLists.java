package week3day1;
import java.util.ArrayList;

public class MergeArrayLists {
    public static void main(String[] args) {
        // Create two ArrayLists of integers
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(12);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(8);
        list2.add(9);
        list2.add(6);

        // Merge the two ArrayLists
        ArrayList<Integer> mergedList = mergeArrayLists(list1, list2);

        // Print the merged ArrayList
        System.out.println("Merged ArrayList: " + mergedList);
    }

    // Function to merge two ArrayLists of integers
    public static ArrayList<Integer> mergeArrayLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(list1); // Add all elements of list1 to mergedList
        mergedList.addAll(list2); // Add all elements of list2 to mergedList
        return mergedList;
    }
}