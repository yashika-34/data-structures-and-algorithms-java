package Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 974: Subarray Sums Divisible by K
 * URL: https://leetcode.com/problems/subarray-sums-divisible-by-k/
 * Difficulty: Medium
 * 
 * Approach: Prefix Sum with Modulo Arithmetic
 * Time Complexity: O(n)
 * Space Complexity: O(min(n, k))
 */
public class SubarraySumsDivisibleByK {

    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int prefixSum = 0;
        Map<Integer, Integer> remainderFreq = new HashMap<>();
        remainderFreq.put(0, 1);

        for (int num : nums) {
            prefixSum += num;
            int remainder = prefixSum % k;
            
            // Adjust negative remainders in Java
            if (remainder < 0) {
                remainder += k;
            }

            if (remainderFreq.containsKey(remainder)) {
                count += remainderFreq.get(remainder);
            }

            remainderFreq.put(remainder, remainderFreq.getOrDefault(remainder, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        SubarraySumsDivisibleByK solver = new SubarraySumsDivisibleByK();
        int[] nums1 = {4, 5, 0, -2, -3, 1};
        System.out.println("Count (Expected: 7): " + solver.subarraysDivByK(nums1, 5));

        int[] nums2 = {5};
        System.out.println("Count (Expected: 1): " + solver.subarraysDivByK(nums2, 9));
    }
}
