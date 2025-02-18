/* Q5: Count frequency of each element in an array */
/* Time Complexity --> O(n^2) */

public class Q5 {

    static void countFrequency(int[] arr, int n) {

        boolean[] mark = new boolean[n];
        for (int index = 0; index < n; index++) {
            int count = 0;
            if (mark[index] == false) {
                for (int j = index; j < n; j++) {
                    if (arr[index] == arr[j]) {
                        count++;
                        mark[j] = true;
                    }
                }
                System.out.println("Count of Element " + arr[index] + ": " + count);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 11, 5, 1, 9, 2, 5, 11, 8, 9 };
        int len = arr.length;
        countFrequency(arr, len);
    }
}
