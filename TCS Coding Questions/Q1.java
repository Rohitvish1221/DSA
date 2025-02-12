/* Q1: Find the Smallest element in an array. */
/* Time Complexity --> O(n) */

public class Q1 {

    static int smallestNumber(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                ans = arr[i + 1];
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 22, 4, 6, 11, 15 };
        System.out.println("Smallest Number : " + smallestNumber(arr));
    }
}
