package Fundamentals;

public class ClosestNumber {

    public static void FindClosest(int n, int m) {

        int remainder = n % m;

        // candidate lower divisible number
        int lower = n - remainder;

        // candidate upper divisible number
        int upper;

        if (remainder == 0) {
            // n is already divisible
            System.out.println(n);
            return;
        }

        // adjust upper based on sign of n
        if (n > 0) {
            upper = lower + m;
        } else {
            upper = lower - m;
        }

        // distances
        int distLower = Math.abs(n - lower);
        int distUpper = Math.abs(n - upper);

        int result;

        if (distLower < distUpper) {
            result = lower;
        } else if (distUpper < distLower) {
            result = upper;
        } else {
            // equal distance
            result = (Math.abs(lower) > Math.abs(upper)) ? lower : upper;
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        FindClosest(13, 4);   // 12
        FindClosest(-15, 6);  // -18
    }
}
