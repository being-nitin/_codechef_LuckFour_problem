package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* Input
       The first line of input consists of a single integer T, denoting the number of integers in Kostya's list.
       Then, there are T lines, each of them contain a single integer from the list.

       Output
       Output T lines. Each of these lines should contain the number of occurences of
       the digit 4 in the respective integer from Kostya's list.

       Constraints
       1 ≤ T ≤ 105
       (Subtask 1): 0 ≤ Numbers from the list ≤ 9 - 33 points.
       (Subtask 2): 0 ≤ Numbers from the list ≤ 109 - 67 points.

       Sample Input 1
       5
       447474
       228
       6664
       40
       81

       Sample Output 1
       4
       0
       1
       1
       0
	 */
        Scanner sc = new Scanner(System.in);
        int t,number;
        t = sc.nextInt();
        while (t-- > 0) {
            number = sc.nextInt();
            int count = 0;
            String str = Integer.toString(number);
            for (int i = 0; i <str.length(); i++) {
                if (str.charAt(i) == '4') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}