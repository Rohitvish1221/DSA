/* TCS NQT Coding Question – 8
Problem Statement – An international round table conference will be held in india. Presidents from all over the world representing their respective countries will be attending the conference. The task is to find the possible number of ways(P) to make the N members sit around the circular table such that. The president and prime minister of India will always sit next to each other.
Example 1: Input : 4 -> Value of N(No. of members)
Output : 12 -> Possible ways of seating the members
Explanation: 2 members should always be next to each other. So, 2 members can be in 2! ways
Rest of the members can be arranged in (4-1)! ways.(1 is subtracted because the previously selected two members will be considered as single members now). So total possible ways 4 members can be seated around the circular table 2*6= 12. Hence, output is 12.
Example 2: Input: 10 -> Value of N(No. of members)
Output : 725760 -> Possible ways of seating the members
Explanation: 2 members should always be next to each other. So, 2 members can be in 2! ways
Rest of the members can be arranged in (10-1)! Ways. (1 is subtracted because the previously selected two members will be considered as a single member now). So, total possible ways 10 members can be seated around a round table is 2*362880 = 725760 ways. Hence, output is 725760.
Constraints : 2<=N<=50 */

import java.util.Scanner;

/* Time Complexity: O(n) */

public class Q8 {

    private static long factorial(int num) {
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of members : ");
        int input = scanner.nextInt();
        scanner.close();

        System.out.println("Possible ways: " + 2*factorial(input-1));
    }
}