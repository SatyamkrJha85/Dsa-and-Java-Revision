package TimeAndSpaceComplexity;

public class chp1 {
    /*
     * Time Complexity
     * 
     * Definition: Time complexity measures how the runtime of an algorithm grows as the
     * input size (n) increases. It’s a way to estimate how efficient your code is by
     * analyzing the number of operations it performs relative to the input size. We
     * express it using Big-O notation (e.g., O(n), O(n²)), which describes the
     * worst-case scenario.
     * 
     * Why It Matters: In interviews, you’re often asked to analyze or optimize code for
     * performance. Understanding time complexity helps you choose efficient algorithms
     * and explain your reasoning.
     * 
     * Common Time Complexities (with Java Examples)
     */

    // O(1) - Constant Time: The runtime doesn’t depend on input size. It’s the fastest.
    int getFirstElement(int[] arr) {
        return arr[0]; // Always takes the same time, regardless of array size
    }
    // Example: Accessing an array element by index or returning a fixed value.

    // O(n) - Linear Time: The runtime grows linearly with input size.
    int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) { // Loops through all n elements
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    // Example: Searching for an element in an unsorted array (linear search).

    // O(n²) - Quadratic Time: The runtime grows quadratically, common in nested loops.
    void printPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) { // Nested loop: n * n = n²
                System.out.println(arr[i] + ", " + arr[j]);
            }
        }
    }
    // Example: Bubble sort or printing all pairs of elements in an array.

    // O(log n) - Logarithmic Time: The runtime grows slowly, often in divide-and-conquer.
    int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2; // Divides search space in half
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    // Example: Binary search on a sorted array.

    // O(n log n): Common in efficient sorting algorithms.
    void sortArray(int[] arr) {
        java.util.Arrays.sort(arr); // Java’s Arrays.sort uses Dual-Pivot Quicksort, typically O(n log n)
    }
    // Example: Merge sort, quicksort, or Java’s Arrays.sort.

    /*
     * Key Interview Tips for Time Complexity
     * - Identify Loops: Single loop → O(n). Nested loops → O(n²). No loops → often O(1).
     * - Divide and Conquer: If the algorithm halves the problem (e.g., binary search), it’s likely O(log n).
     * - Explain Your Analysis: Walk through your code and count operations. E.g., “This loop runs n times,
     *   and inside it, we do a constant-time operation, so it’s O(n).”
     * - Compare Algorithms: Suggest better approaches (e.g., “Instead of O(n²) bubble sort, we can use
     *   O(n log n) quicksort”).
     */

    /*
     * Space Complexity
     * 
     * Definition: Space complexity measures the amount of memory an algorithm uses
     * relative to the input size. It includes:
     * - Auxiliary Space: Extra or temporary memory (e.g., arrays, variables).
     * - Input Space: Memory used to store the input (sometimes excluded in analysis).
     * 
     * Why It Matters: Optimizing space is critical for large datasets or
     * memory-constrained environments. Interviewers may ask you to reduce memory usage.
     * 
     * Common Space Complexities (with Java Examples)
     */

    // O(1) - Constant Space: Uses a fixed amount of memory, regardless of input size.
    int sumArray(int[] arr) {
        int sum = 0; // Only one variable
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    // Example: Algorithms that only use a few variables (e.g., sum, temp).

    // O(n) - Linear Space: Uses memory proportional to input size.
    int[] copyArray(int[] arr) {
        int[] copy = new int[arr.length]; // New array of size n
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }
    // Example: Creating a new array or list to store results.

    // O(n²) - Quadratic Space: Rare, but occurs when using 2D arrays or matrices.
    int[][] createMatrix(int n) {
        int[][] matrix = new int[n][n]; // n * n = n² space
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = i + j;
            }
        }
        return matrix;
    }
    // Example: Storing a multiplication table.

    // O(log n) - Logarithmic Space: Common in recursive algorithms with logarithmic calls.
    int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left > right) return -1;
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] < target)
            return binarySearchRecursive(arr, target, mid + 1, right);
        return binarySearchRecursive(arr, target, left, mid - 1);
    }
    // Example: Recursive binary search uses O(log n) stack space due to recursive calls.

    /*
     * Key Interview Tips for Space Complexity
     * - Count Variables and Data Structures: Look at arrays, lists, or recursive call stacks.
     * - In-Place Algorithms: Modifying the input array (e.g., swapping elements) is often O(1) auxiliary space.
     * - Recursive Calls: Each call adds to the call stack, contributing to space complexity (e.g., O(log n) for binary search).
     * - Trade-offs: Discuss time vs. space trade-offs. E.g., “Using a hash map gives O(1) lookup time but costs O(n) space.”
     */

    /*
     * Example Problem: Two Sum
     * Problem: Given an array of integers and a target sum, find two indices whose
     * elements add up to the target.
     */

    // Naive Solution: O(n²) time, O(1) space
    int[] twoSumNaive(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    // Optimized Solution: O(n) time, O(n) space
    int[] twoSumOptimized(int[] nums, int target) {
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>(); // O(n) space
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
    // Explanation: Naive checks every pair (n * n = n² time), uses minimal space.
    // Optimized uses HashMap for O(1) lookups, reducing time to O(n) but costing O(n) space.

}