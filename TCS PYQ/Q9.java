/* TCS NQT Coding Question – 9
Problem Statement-An intelligence agency has received reports about some threats. The reports consist of numbers in a mysterious method. There is a number 'N' and another number 'R'. Those numbers are studied thoroughly and it is concluded that all digits of the number ‘N’ are summed up and this action is performed ‘R’ number of times. The resultant is also a single digit that is yet to be deciphered. The task here is to find the single-digit sum of the given number ‘N’ by repeating the action ‘R’ number of times.
If the value of ‘R’ is 0, print the output as ‘0’
Example 1: Input : 99 -> Value of N
3 -> Value of R
Output : 9 -> Possible ways to fill the cistern
Explanation: Here, the number N=99
Sum of the digits N: 9+9 = 18
Repeat step 2 ‘R’ times i.e. 3 tims (9+9)+(9+9)+(9+9) = 18+18+18 =54
Add digits of 54 as we need a single digit 5+4 Hence , the output is 9.
Example 2: Input : 1234 -> Value of N
2 -> Value of R
Output : 2 -> Possible ways to fill the cistern
Explanation: Here, the number N=1234
Sum of the digits of N: 1+2+3+4 =10
Repeat step 2 ‘R’ times i.e. 2 times (1+2+3+4)+(1+2+3+4)= 10+10=20
Add digits of 20 as we need a single digit. 2+0=2
Hence, the output is 2.
Constraints: 0<N<=1000 0<=R<=50
The Input format for testing
First input- Accept value for N (positive integer number)
Second input: Accept value for R(Positive integer number) */

import java.util.Scanner;

/* Time Complexity: O(logn) */

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();
        int temp , sum=0;

        while (N>0) {
            temp = N%10;
            N /= 10;
            sum+=temp;
        }
        N = sum*R;
        sum = 0;
        while (N>0) {
            temp = N%10;
            N /= 10;
            sum+=temp;
        }
        System.out.println(sum);
    }
}
