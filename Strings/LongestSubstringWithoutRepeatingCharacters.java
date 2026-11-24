package Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 3: Longest Substring Without Repeating Characters
 * URL: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Difficulty: Medium
 * 
 * Approach: Sliding Window with Last Seen Index Map
 * Time Complexity: O(n)
 * Space Complexity: O(min(m, n)) where m is charset size
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int maxLength = 0;
        int left = 0;
        Map<Character, Integer> lastSeen = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (lastSeen.containsKey(c)) {
                // Move left pointer past the previous occurrence of c
                left = Math.max(left, lastSeen.get(c) + 1);
            }

            lastSeen.put(c, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters solver = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println("Max Length (Expected: 3): " + solver.lengthOfLongestSubstring("abcabcbb"));
        System.out.println("Max Length (Expected: 1): " + solver.lengthOfLongestSubstring("bbbbb"));
        System.out.println("Max Length (Expected: 3): " + solver.lengthOfLongestSubstring("pwwkew"));
    }
}
