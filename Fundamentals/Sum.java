package Fundamentals;

public class Sum {

    /* Input: n = 3
Output: 6
Explanation: 1 + 2 + 3 = 6

Input: n = 5
Output: 15 
Explanation:  1 + 2 + 3 + 4 + 5 = 15

     */
    public static void FindSum(int number) {

        int sum = 0;

        for (int i = 0; i <= number; i++) {

            sum = sum + i;
        }
        System.out.println("Sum of " + number + " Is " + sum);
    }

    public static void main(String[] args) {
        int number = 5;

        FindSum(number);
    }

}
