package Arrays;

import java.util.Arrays;

/**
 * LeetCode 2149: Rearrange Array Elements by Sign
 * URL: https://leetcode.com/problems/rearrange-array-elements-by-sign/
 * Difficulty: Medium
 * 
 * Approach: Two pointers placing positive at even indices and negative at odd indices
 * Time Complexity: O(n)
 * Space Complexity: O(n) for result array
 */
public class RearrangeArrayElementsBySign {

    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int posIndex = 0;
        int negIndex = 1;

        for (int num : nums) {
            if (num > 0) {
                result[posIndex] = num;
                posIndex += 2;
            } else {
                result[negIndex] = num;
                negIndex += 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        RearrangeArrayElementsBySign solver = new RearrangeArrayElementsBySign();
        int[] nums = {3, 1, -2, -5, 2, -4};
        System.out.println("Rearranged (Expected [3, -2, 1, -5, 2, -4]): " + Arrays.toString(solver.rearrangeArray(nums)));
    }
}
