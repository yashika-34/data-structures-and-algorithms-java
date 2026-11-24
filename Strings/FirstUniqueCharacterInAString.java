package Strings;

/**
 * LeetCode 387: First Unique Character in a String
 * URL: https://leetcode.com/problems/first-unique-character-in-a-string/
 * Difficulty: Easy
 * 
 * Approach: Frequency count then first character with count == 1
 * Time Complexity: O(n)
 * Space Complexity: O(1) (26 English lowercase letters)
 */
public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {
        if (s == null || s.isEmpty()) {
            return -1;
        }

        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacterInAString solver = new FirstUniqueCharacterInAString();
        System.out.println("Index (Expected: 0): " + solver.firstUniqChar("leetcode"));
        System.out.println("Index (Expected: 2): " + solver.firstUniqChar("loveleetcode"));
        System.out.println("Index (Expected: -1): " + solver.firstUniqChar("aabb"));
    }
}
