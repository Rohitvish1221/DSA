/* Q6: Rearrange array in increasing-decreasing order */
/* Time Complexity --> O(nlogn) */

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {

    static void changeOrder(int[] arr, int n) {
        Arrays.sort(arr);
        int temp = n;
        System.out.println("After Arrangement :");
        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                System.out.println(arr[i]);
            } else {
                System.out.println(arr[temp - 1]);
                temp--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        changeOrder(arr, size);
    }
}