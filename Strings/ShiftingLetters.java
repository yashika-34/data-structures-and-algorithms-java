package Strings;

/**
 * LeetCode 848: Shifting Letters
 * URL: https://leetcode.com/problems/shifting-letters/
 * Difficulty: Medium
 * 
 * Approach: Suffix Sum of shifts to compute cumulative shifts in O(n)
 * Time Complexity: O(n)
 * Space Complexity: O(n) for result
 */
public class ShiftingLetters {

    public String shiftingLetters(String s, int[] shifts) {
        char[] chars = s.toCharArray();
        long totalShift = 0;

        for (int i = shifts.length - 1; i >= 0; i--) {
            totalShift = (totalShift + shifts[i]) % 26;
            chars[i] = (char) ('a' + (chars[i] - 'a' + totalShift) % 26);
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        ShiftingLetters solver = new ShiftingLetters();
        String s = "abc";
        int[] shifts = {3, 5, 9};
        System.out.println("Shifted string (Expected: 'rpl'): " + solver.shiftingLetters(s, shifts));
    }
}
