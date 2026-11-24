package recursion;

/**
 * LeetCode 509: Fibonacci Number
 * URL: https://leetcode.com/problems/fibonacci-number/
 * Difficulty: Easy
 * 
 * Approach: Recursive with Iterative/Memoized option
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class FibonacciNumber {

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int prev2 = 0;
        int prev1 = 1;

        for (int i = 2; i <= n; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    public static void main(String[] args) {
        FibonacciNumber solver = new FibonacciNumber();
        System.out.println("Fib(2) (Expected: 1): " + solver.fib(2));
        System.out.println("Fib(3) (Expected: 2): " + solver.fib(3));
        System.out.println("Fib(4) (Expected: 3): " + solver.fib(4));
    }
}
