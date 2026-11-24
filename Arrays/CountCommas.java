package Arrays;

/**
 * LeetCode 3870: Count Commas in Range
 * URL: https://leetcode.com/problems/count-commas-in-range/
 * Difficulty: Easy
 * 
 * Approach: Count numbers >= 1000 up to n
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public class CountCommas {

    public int countCommas(int n) {
        if (n < 1000) {
            return 0;
        }
        return n - 999;
    }

    public static void main(String[] args) {
        CountCommas solver = new CountCommas();
        System.out.println("Commas up to 1002 (Expected: 3): " + solver.countCommas(1002));
        System.out.println("Commas up to 999 (Expected: 0): " + solver.countCommas(999));
    }
}
