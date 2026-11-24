package Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 525: Contiguous Array
 * URL: https://leetcode.com/problems/contiguous-array/
 * Difficulty: Medium
 * 
 * Approach: Transform 0 to -1 and find longest subarray with sum = 0.
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class ContiguousArray {

    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> prefixIndex = new HashMap<>();
        prefixIndex.put(0, -1); // sum 0 occurred before array starts

        int maxLength = 0;
        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            // Treat 0 as -1, and 1 as +1
            prefixSum += (nums[i] == 0) ? -1 : 1;

            if (prefixIndex.containsKey(prefixSum)) {
                maxLength = Math.max(maxLength, i - prefixIndex.get(prefixSum));
            } else {
                prefixIndex.put(prefixSum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        ContiguousArray solver = new ContiguousArray();
        int[] nums1 = {0, 1};
        System.out.println("Max Length (Expected: 2): " + solver.findMaxLength(nums1));

        int[] nums2 = {0, 1, 0};
        System.out.println("Max Length (Expected: 2): " + solver.findMaxLength(nums2));
    }
}
