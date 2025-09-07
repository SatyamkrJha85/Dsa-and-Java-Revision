package ArrayQuestion;

import java.util.*;

class Solution {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();          // number of test cases

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();      // first number
            int b = in.nextInt();      // second number
            int n = in.nextInt();      // number of terms

            int result = a; // 34 
            for (int j = 0; j < n; j++) { // 1 
                result += (int)(Math.pow(2, j) * b); // 34 + 2 = 68*
                System.out.print(result + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
