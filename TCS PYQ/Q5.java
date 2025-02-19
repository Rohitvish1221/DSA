/* TCS NQT Coding Question – 5
Problem Statement – Given an integer array Arr of size N the task is to find the count of elements whose value is greater than all of its prior elements. Note : 1st element of the array should be considered in the count of the result.
For example, Arr[]={7,4,8,2,9}
As 7 is the first element, it will consider in the result. 8 and 9 are also the elements that are greater than all of its previous elements. Since total of 3 elements is present in the array that meets the condition.
Hence the output = 3.
Example 1:
Input
5 -> Value of N, represents size of Arr
7-> Value of Arr[0]
4 -> Value of Arr[1]
8-> Value of Arr[2]
2-> Value of Arr[3]
9-> Value of Arr[4]
Output : 3
Example 2:
5 -> Value of N, represents size of Arr
3 -> Value of Arr[0]
4 -> Value of Arr[1]
5 -> Value of Arr[2]
8 -> Value of Arr[3]
9 -> Value of Arr[4]
Output : 5
Constraints
1<=N<=20
1<=Arr[i]<=10000
Problem Statement – In a mystical land, a wise sage collects gemstones. Each time he collects a new gemstone, he wonders how many of them are more radiant than any he has collected before. Can you help the sage count these radiant gems?
Input - The number of gemstones n.
 The radiance values of the gemstones.
Output - The count of gemstones that are more radiant than all previously collected ones.
Example- Input: 5 1 3 2 4 5
Output: 4
Same solution */

import java.util.Scanner;

/* Time Complexity: O(n) */

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int max = Integer.MIN_VALUE;
        int ans = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < size; i++) {
            max = Integer.max( max, arr[i-1]);
            if( max < arr[i] ){
                max = arr[i];
                ans++;
            }
        }
        System.out.println(ans+1);
    }
}
