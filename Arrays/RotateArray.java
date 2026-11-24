package Arrays;

import java.util.Arrays;

/**
 * LeetCode 189: Rotate Array
 * URL: https://leetcode.com/problems/rotate-array/
 * Difficulty: Medium
 * 
 * Approach: 3-step Array Reversal
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        if (k == 0) return;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        RotateArray solver = new RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        solver.rotate(nums, 3);
        System.out.println("Rotated (Expected [5, 6, 7, 1, 2, 3, 4]): " + Arrays.toString(nums));
    }
}
