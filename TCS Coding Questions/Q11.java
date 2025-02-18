/* Q11: Remove duplicates from a sorted array */
/* Time Complexity --> O(n) */

import java.util.Scanner;

public class Q11 {

    static int removeDuplicates(int[] arr, int n) {
        int i = 0, j = 1;
        for (i = 0; i < n; i++) {
            if (arr[i] != arr[j]) {
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = removeDuplicates(arr, size);
        for (int i = 0; i < ans; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}