/* Q9: Rotate array by K elements - Block Swap Algorithm */
/* Time Complexity --> O(n) */

public class Q9 {

    static void rotateArray(int[] arr, int n, int k) {
        int[] ans = new int[n];
        System.out.println("After Rotating the array: ");
        for (int i = 0; i < n; i++) {

            /* Blockswap Algorithm */
            
            ans[i] = arr[(i + k) % n];
            System.out.println(ans[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 22, 4, 6, 11, 15 };
        int len = arr.length;
        int k = 2;
        rotateArray(arr, len, k);
    }
}
