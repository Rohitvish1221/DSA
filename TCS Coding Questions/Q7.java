/* Q7: Average of all elements in an array */
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
        double ans = temp / size;

        System.out.println("Average : " + ans);
    }
}
