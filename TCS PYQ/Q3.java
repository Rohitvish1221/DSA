/* TCS NQT Coding Question – 3
Problem Statement – Jack is always excited about Sunday. It is favorite day, when he gets to play all day. And goes to cycling with his friends. So every time when the months starts he counts the number of sundays he will get to enjoy. Considering the month can start with any day, be it Sunday, Monday…. Or so on. Count the number of Sunday jack will get within n number of days.
Example 1: Input mon-> input String denoting the start of the month.
13 -> input integer denoting the number of days from the start of the month.
Output : 2 -> number of days within 13 days.
Explanation: The month start with mon(Monday). So the upcoming sunday will arrive in next 6 days. And then next Sunday in next 7 days and so on. Now total number of days are 13. It means 6 days to first sunday and then remaining 7 days will end up in another sunday. Total 2 sundays may fall within 13 days. */

import java.util.Map;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        int days = sc.nextInt();

        Map<String, Integer> hash = Map.of(
                "mon", 6, "tue", 5, "wed", 4, "thu", 3, "fri", 2, "sat", 1, "sun", 0);

                int startDay = hash.get(str);
                
                if(startDay > days)
                System.out.println(0);

                else
                System.out.println(1+(days-startDay)/7);

    }
}
