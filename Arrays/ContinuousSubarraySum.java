package Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 523: Continuous Subarray Sum
 * URL: https://leetcode.com/problems/continuous-subarray-sum/
 * Difficulty: Medium
 * 
 * Approach: Prefix Sum Remainder with Hash Map (checking index distance >= 2)
 * Time Complexity: O(n)
 * Space Complexity: O(min(n, k))
 */
public class ContinuousSubarraySum {

    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> remainderIndex = new HashMap<>();
        remainderIndex.put(0, -1); // Base case: remainder 0 before starting array

        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int remainder = prefixSum % k;

            if (remainderIndex.containsKey(remainder)) {
                if (i - remainderIndex.get(remainder) >= 2) {
                    return true;
                }
            } else {
                remainderIndex.put(remainder, i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ContinuousSubarraySum solver = new ContinuousSubarraySum();
        int[] nums1 = {23, 2, 4, 6, 7};
        System.out.println("Result (Expected: true): " + solver.checkSubarraySum(nums1, 6));

        int[] nums2 = {23, 2, 6, 4, 7};
        System.out.println("Result (Expected: false): " + solver.checkSubarraySum(nums2, 13));
    }
}
