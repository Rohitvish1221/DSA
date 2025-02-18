/* TCS NQT Coding Question – 4
Problem Statement – Airport security officials have confiscated several item of the passengers at the security 
check point. All the items have been dumped into a huge box (array). Each item possesses a certain amount 
of risk[0,1,2]. Here, the risk severity of the items represent an array[] of N number of integer values. The task 
here is to sort the items based on their levels of risk in the array. The risk values range from 0 to 2.
Example : Input : 7 -> Value of N [1,0,2,0,1,0,2]-> Element of arr[0] to arr[N-1], while input each element is 
separated by new line.
Output : 0 0 0 1 1 2 2 -> Element after sorting based on risk severity
Example 2:
input : 10 -> Value of N [2,1,0,2,1,0,0,1,2,0] -> Element of arr[0] to arr[N-1], while input each element is 
separated by a new line.
Output : 0 0 0 0 1 1 1 2 2 2 ->Elements after sorting based on risk severity.
Explanation: In the above example, the input is an array of size N consisting of only 0’s, 1’s and 2s. The 
output is a sorted array from 0 to 2 based on risk severity.
Problem Statement – You are given an array consisting of only three distinct integers: 0, 1, and 2. Your task 
is to sort the array in a single pass, such that all 0's come first, followed by all 1's, and then all 2's.
Implement a function to achieve this and demonstrate its usage with an example.
Input- The first line contains an integer (1 ≤ n ≤ 100), the number of elements in the array.
 The second line contains n integers, each of which can be either 0, 1, or 2.
Output- Print the sorted array in a single line.
Example Input 5   ->  2 0 1 2 0
Output 0 0 1 2 2 */

import java.util.Scanner;

/* Dutch National Flag Algorithm (or three-way partitioning) */
/* Time Complexity : O(n) */

public class Q4 {

    static void swapNumbers(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int[] sortItems(int[] arr, int size){

        int left = 0, mid = 0, right = arr.length - 1;

        while (mid <= right) {
            if (arr[mid] == 0) { 
                swapNumbers(arr, mid, left);
                mid++;
                left++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swapNumbers(arr, mid, right);
                right--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        sortItems(arr, size);

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
