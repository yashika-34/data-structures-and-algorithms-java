package Arrays;

/**
 * LeetCode 3876: Construct Uniform Parity Array II
 * URL: https://leetcode.com/problems/construct-uniform-parity-array-ii/
 * Difficulty: Medium
 * 
 * Approach: Optimized Parity Analysis with Prefix Properties
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class ConstructUniformParityArrayII {

    public boolean canConstruct(int[] nums) {
        if (nums == null || nums.length <= 1) return true;

        int oddCount = 0;
        int minOdd = Integer.MAX_VALUE;

        for (int x : nums) {
            if (x % 2 != 0) {
                oddCount++;
                minOdd = Math.min(minOdd, x);
            }
        }

        if (oddCount == 0 || oddCount == nums.length) {
            return true;
        }

        for (int x : nums) {
            if (x % 2 == 0 && x <= minOdd) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ConstructUniformParityArrayII solver = new ConstructUniformParityArrayII();
        int[] nums = {7, 10, 13};
        System.out.println("Can construct (Expected: true): " + solver.canConstruct(nums));
    }
}
