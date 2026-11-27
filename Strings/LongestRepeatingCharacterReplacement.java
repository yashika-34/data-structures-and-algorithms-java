package Strings;

/**
 * LeetCode 424: Longest Repeating Character Replacement
 * URL: https://leetcode.com/problems/longest-repeating-character-replacement/
 * Difficulty: Medium
 * 
 * Approach: Sliding Window tracking max frequency character
 * Time Complexity: O(n)
 * Space Complexity: O(1) (26 uppercase English letters)
 */
public class LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {
        if (s == null || s.isEmpty()) return 0;

        int[] counts = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            counts[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, counts[s.charAt(right) - 'A']);

            // If remaining characters in window exceed k, shrink window from left
            while ((right - left + 1) - maxFreq > k) {
                counts[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement solver = new LongestRepeatingCharacterReplacement();
        System.out.println("Max Length (Expected: 4): " + solver.characterReplacement("ABAB", 2));
        System.out.println("Max Length (Expected: 4): " + solver.characterReplacement("AABABBA", 1));
    }
}
