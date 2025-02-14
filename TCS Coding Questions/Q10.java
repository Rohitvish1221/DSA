/* Q10: Find Median of the given Array */
/* Time Complexity --> O(n*logn) */

import java.util.Arrays;
import java.util.Scanner;

public class Q10 {

    static void findMedian(int[] arr, int n){
        Arrays.sort(arr);
        double ans;
        if(n%2==0){
            ans = (double)(arr[n/2 - 1] + arr[n/2]) / 2;
        }
        else{
            ans = arr[n/2];
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        findMedian(arr,size);
    }
}
