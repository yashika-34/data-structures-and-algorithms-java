package Strings;

/**
 * LeetCode 7: Reverse Integer
 * URL: https://leetcode.com/problems/reverse-integer/
 * Difficulty: Medium
 * 
 * Time Complexity: O(log10(x))
 * Space Complexity: O(1)
 */
public class ReverseInteger {

    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;

            // Overflow checks before multiplying
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;

            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        ReverseInteger solver = new ReverseInteger();
        System.out.println("Reverse 123 (Expected: 321): " + solver.reverse(123));
        System.out.println("Reverse -123 (Expected: -321): " + solver.reverse(-123));
        System.out.println("Reverse 120 (Expected: 21): " + solver.reverse(120));
        System.out.println("Reverse 1534236469 (Expected: 0 on overflow): " + solver.reverse(1534236469));
    }
}
