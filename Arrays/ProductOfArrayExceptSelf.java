package Arrays;

import java.util.Arrays;

/**
 * LeetCode 238: Product of Array Except Self
 * URL: https://leetcode.com/problems/product-of-array-except-self/
 * Difficulty: Medium
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1) auxiliary space (output array does not count as extra space)
 */
public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // answer[i] contains the product of all elements to the left of i
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // R contains the product of all elements to the right of i
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * right;
            right *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        ProductOfArrayExceptSelf solver = new ProductOfArrayExceptSelf();
        int[] nums1 = {1, 2, 3, 4};
        System.out.println("Result (Expected: [24, 12, 8, 6]): " + Arrays.toString(solver.productExceptSelf(nums1)));

        int[] nums2 = {-1, 1, 0, -3, 3};
        System.out.println("Result (Expected: [0, 0, 9, 0, 0]): " + Arrays.toString(solver.productExceptSelf(nums2)));
    }
}
