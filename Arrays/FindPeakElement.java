package Arrays;

/**
 * LeetCode 162: Find Peak Element
 * URL: https://leetcode.com/problems/find-peak-element/
 * Difficulty: Medium
 * 
 * Approach: Binary Search on Peak Slope
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class FindPeakElement {

    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                // Peak is on the left side (including mid)
                right = mid;
            } else {
                // Peak is on the right side
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        FindPeakElement solver = new FindPeakElement();
        int[] nums = {1, 2, 3, 1};
        System.out.println("Peak index (Expected: 2): " + solver.findPeakElement(nums));
    }
}
