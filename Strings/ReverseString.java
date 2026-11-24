package Strings;

/**
 * LeetCode 344: Reverse String
 * URL: https://leetcode.com/problems/reverse-string/
 * Difficulty: Easy
 * 
 * Approach: In-place Two Pointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class ReverseString {

    public void reverseString(char[] s) {
        if (s == null || s.length <= 1) return;

        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ReverseString solver = new ReverseString();
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        solver.reverseString(s1);
        System.out.println("Reversed: " + new String(s1) + " (Expected: 'olleh')");
    }
}
