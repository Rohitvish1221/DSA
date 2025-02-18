/* Q3: Second Smallest and Second Largest element in an array */
/* Time Complexity --> O(n) */

public class Q3 {

    static int[] secondLargestAndSmallest(int arr[], int n) {
        if (n <= 1) {
            return new int[] { -1, -1 };
        }

        int large = Integer.MIN_VALUE;
        int scndLarge = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        int scndSmall = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > large) {
                scndLarge = large;
                large = arr[i];
            }

            if (arr[i] > scndLarge && arr[i] != large) {
                scndLarge = arr[i];
            }

            if (arr[i] < small) {
                scndSmall = small;
                small = arr[i];
            }

            if (arr[i] < scndSmall && arr[i] != small) {
                scndSmall = arr[i];
            }
        }
        return new int[] { scndSmall, scndLarge };
    }

    public static void main(String[] args) {
        int arr[] = { 22, 4, 6, 11, 15 };
        int len = arr.length;
        int[] ans = secondLargestAndSmallest(arr, len);

        System.out.println("Second Smallest : " + ans[0]);
        System.out.println("Second Largest : " + ans[1]);
    }
}
