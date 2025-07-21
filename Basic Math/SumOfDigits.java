public class SumOfDigits {
    // Function to calculate the sum of digits of a number
    public static int sumOfDigits(int n) {
        // Use absolute value to handle negative numbers
        // n = Math.abs(n);
        
        // Initialize sum to store the result
        int sum = 0;
        
        // Loop until the number becomes 0
        while (n > 0) {
            // Extract the last digit using modulo
            int digit = n % 10; 
            // Add the digit to the sum
            sum += digit;
            // Remove the last digit by integer division
            n = n / 10;
        }
        
        // Return the final sum
        return sum;
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Test cases
        int number1 = 123;  // Expected: 1 + 2 + 3 = 6
        int number2 = 509;  // Expected: 5 + 0 + 9 = 14
        int number3 = -123; // Expected: 1 + 2 + 3 = 6
        int number4 = 0;    // Expected: 0

        // Print results
        System.out.println("Sum of digits of " + number1 + " is: " + sumOfDigits(number1));
        System.out.println("Sum of digits of " + number2 + " is: " + sumOfDigits(number2));
        System.out.println("Sum of digits of " + number3 + " is: " + sumOfDigits(number3));
        System.out.println("Sum of digits of " + number4 + " is: " + sumOfDigits(number4));
    }
}