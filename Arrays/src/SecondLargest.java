import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargest {

    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(1,2,4,7,7,5);

        System.out.println(print2largest(arr));
    }

    static int print2largest(List<Integer> arr) {
        if (arr == null || arr.size() < 2) {
            return -1; // Handle edge cases where the list is null or has fewer than 2 elements
        }

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.size(); i++) {
            int current = arr.get(i);
            if (current > largest) {
                secondlargest = largest;
                largest = current;
            } else if (current > secondlargest && current < largest) {
                secondlargest = current;
            }
        }

        if (secondlargest == Integer.MIN_VALUE) {
            return -1; // Return -1 if there is no second largest element
        }

        return secondlargest;
    }
}