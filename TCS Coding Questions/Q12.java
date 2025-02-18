/* Q12: Remove duplicates from a sorted array */
/* Time Complexity --> O(n^2) */

import java.util.Scanner;

public class Q12 {

    static int removeDuplicates(int[] arr, int n) {

        int count = 0;

        int mark[] = new int[n];
        for (int i = 0; i < n; i++) {
            mark[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            if (mark[i] == 1) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] == arr[i]) {
                        mark[j] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (mark[i] == 1) {
                System.out.print(arr[i] + " ");
                count++;
            }
        }

        System.out.println();
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Total Number of Unique Elements : " + removeDuplicates(arr, size));

    }
}

/*
 * Time Complexity --> O(n) [By using HashTable]
 * 
 * import java.util.*;
 * 
 * public class Main {
 * 
 * static void duplicate(int arr[], int n) {
 * HashMap<Integer, Integer> mp = new HashMap<>();
 * 
 * for (int i = 0; i < n; i++) {
 * if (!mp.containsKey(arr[i])) {
 * System.out.print(arr[i] + " ");
 * mp.put(arr[i], 1);
 * }
 * }
 * }
 * 
 * public static void main(String[] args) {
 * int n = 9;
 * int arr[] = { 4, 3, 9, 2, 4, 1, 10, 89, 34 };
 * 
 * duplicate(arr, n);
 * }
 * }
 */