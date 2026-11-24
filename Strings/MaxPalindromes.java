package Strings;

/**
 * LeetCode 2472: Maximum Number of Non-overlapping Palindrome Substrings
 * URL: https://leetcode.com/problems/maximum-number-of-non-overlapping-palindrome-substrings/
 * Difficulty: Hard
 * 
 * Approach: Greedy center expansion finding minimal palindrome >= k
 * Time Complexity: O(n * k)
 * Space Complexity: O(1)
 */
public class MaxPalindromes {

    public int maxPalindromes(String s, int k) {
        int n = s.length();
        int count = 0;
        int lastEnd = -1;

        // Check each possible center
        for (int center = 0; center < 2 * n - 1; center++) {
            int left = center / 2;
            int right = left + center % 2;

            while (left > lastEnd && right < n && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 >= k) {
                    count++;
                    lastEnd = right;
                    break;
                }
                left--;
                right++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        MaxPalindromes solver = new MaxPalindromes();
        System.out.println("Count (Expected: 2): " + solver.maxPalindromes("abaccdbbd", 3));
        System.out.println("Count (Expected: 0): " + solver.maxPalindromes("adbcda", 2));
    }
}
