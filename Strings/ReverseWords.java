package Strings;

/**
 * LeetCode 151: Reverse Words in a String
 * URL: https://leetcode.com/problems/reverse-words-in-a-string/
 * Difficulty: Medium
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class ReverseWords {

    public String reverseWords(String s) {
        if (s == null) return null;

        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        ReverseWords solver = new ReverseWords();
        System.out.println("Result: '" + solver.reverseWords("the sky is blue") + "' (Expected: 'blue is sky the')");
        System.out.println("Result: '" + solver.reverseWords("  hello world  ") + "' (Expected: 'world hello')");
        System.out.println("Result: '" + solver.reverseWords("a good   example") + "' (Expected: 'example good a')");
    }
}
