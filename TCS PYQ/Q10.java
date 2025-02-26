/* TCS NQT Coding Question – 10
Problem Statement-Particulate matters are the biggest contributors to Delhi pollution. The main reason behind the increase in the concentration of PMs includes vehicle emission by applying Odd Even concepts for all types of vehicles. The vehicles with the odd last digit in the registration number will be allowed on roads on odd dates and those with even last digit will on even dates. Given an integer array a[], contains the last digit of the registration number of N vehicles traveling on date D(a positive integer). The task is to calculate the total fine collected by the traffic police department from the vehicles violating the rules.
Note : For violating the rule, vehicles would be fined as X Rs.
Example 1: Input : 4 -> Value of N
{5,2,3,7} -> a[], Elements a[0] to a[N-1], during input each element is separated by a new line
12 -> Value of D, i.e. date
200 -> Value of x i.e. fine
Output : 600 -> total fine collected
Explanation: Date D=12 means , only an even number of vehicles are allowed. Find will be collected from 5,3 and 7 with an amount of 200 each. Hence, the output = 600.
Example 2: Input : 5 -> Value of N
{2,5,1,6,8} -> a[], elements a[0] to a[N-1], during input each element is separated by new line
3 -> Value of D i.e. date
300 -> Value of X i.e. fine
Output : 900 -> total fine collected
Explanation: Date D=3 means only odd number vehicles with are allowed. Find will be collected from 2,6 and 8 with an amount of 300 each. Hence, the output = 900
Constraints: 0<N<=100 1<=a[i]<=9 1<=D <=30 100<=x<=5000
First input – Accept for N(Positive integer) values (a[]), where each value is separated by a new line.
Third input – Accept value for D(Positive integer)
Fourth input – Accept value for X(Positive integer ) */

import java.util.Scanner;

/* Time Complexity: O(n) */

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for (int i=0;i<N;i++) {
            arr[i] = sc.nextInt();
        }

        int D = sc.nextInt();
        int X = sc.nextInt();
        int count = 0;

        if ((D % 2) == 0) {
            for (int j = 0; j < N; j++) {
                if ((arr[j] % 2) != 0)
                    count++;
            }

        } else {
            for (int j = 0; j < N; j++) {
                if ((arr[j] % 2) == 0)
                    count++;
            }
        }
        System.out.println(count*X);
    }
}
