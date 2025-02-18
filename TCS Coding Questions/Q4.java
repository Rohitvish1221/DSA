/* Q4: Reverse a given array */
/* Time Complexity --> O(n) */

public class Q4 {

    static void reverseArray(int[] arr, int n) {
        int i = 0;
        while (n > 0) {
            System.out.println("Index[" + i + "] :" + arr[--n]);
            i++;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 22, 4, 6, 11, 15 };
        int len = arr.length;
        reverseArray(arr, len);
    }
}

/* Another Method --> Collections.reverse(Arrays.asList(arr)) */
/*
 * Another login is to Devide array in 2 parts and flip the each right element
 * to left element
 */