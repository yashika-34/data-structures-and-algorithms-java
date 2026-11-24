package Strings;

/**
 * LeetCode 125: Valid Palindrome
 * URL: https://leetcode.com/problems/valid-palindrome/
 * Difficulty: Easy
 * 
 * Approach: Two Pointers with Alphanumeric check
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome solver = new ValidPalindrome();
        System.out.println("isPalindrome('A man, a plan, a canal: Panama') (Expected: true): " 
                + solver.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println("isPalindrome('race a car') (Expected: false): " 
                + solver.isPalindrome("race a car"));
        System.out.println("isPalindrome(' ') (Expected: true): " 
                + solver.isPalindrome(" "));
    }
}
