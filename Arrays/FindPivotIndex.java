package Arrays;

/**
 * LeetCode 724: Find Pivot Index
 * URL: https://leetcode.com/problems/find-pivot-index/
 * Difficulty: Easy
 * 
 * Approach: Total Sum - Left Sum
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class FindPivotIndex {

    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        FindPivotIndex solver = new FindPivotIndex();
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println("Pivot index (Expected: 3): " + solver.pivotIndex(nums));
    }
}
