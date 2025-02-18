/* Q7: Calculate sum of the elements of the array */
/* Time Complexity --> O(n) */

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int size = sc.nextInt();
        int temp = 0;
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            temp += arr[i];
        }
        System.out.println("Sum : " + temp);
    }
}
