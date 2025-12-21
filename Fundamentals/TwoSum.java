package Fundamentals;

public class TwoSum {

    // Program for sum of n natural numbers


    public static void FindTwoSum(int[] number, int target) {

        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {

                if (number[i] + number[j] == target) {
                    System.out.println("Pair: " + number[i] + " + " + number[j]
                            + " = " + target + " (indexes " + i + ", " + j + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int number[] = {34, 32, 42, 23, 45, 22, 2, 5, 2};
        int target = 24;

        FindTwoSum(number, target);
    }

}
