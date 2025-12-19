package ArrayQuestion;

import java.util.*;

class Solution {

    /*
This program reads multiple test cases. For each test case, it takes three integers: a, b, and n.
It then prints a series of n terms where each term adds (2^j * b) to the previous value starting from a.
In short: Generate and print a mathematical series using powers of 2 multiplied by b and added to a.
Example:
Input: 1 5 3 5
Output: 8 14 26 50 98
     */
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();          // number of test cases

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();      // first number
            int b = in.nextInt();      // second number
            int n = in.nextInt();      // number of terms

            int result = a; // 34 
            for (int j = 0; j < n; j++) { // 1 
                result += (int) (Math.pow(2, j) * b); // 34 + 2 = 68*
                System.out.print(result + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
