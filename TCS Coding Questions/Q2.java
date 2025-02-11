
/* Q1: Find the Largest element in an array. */
/* Time Complexity --> O(n*logn) */
import java.util.Arrays;

public class Q2 {
    static int largestNumber(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        int arr[] = { 22, 4, 6, 11, 15 };
        System.out.println("Smallest Number : " + largestNumber(arr));
    }
}
