package Arrays;

/**
 * LeetCode 493: Reverse Pairs
 * URL: https://leetcode.com/problems/reverse-pairs/
 * Difficulty: Hard
 * 
 * Approach: Modified Merge Sort
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */
public class ReversePairs {

    public int reversePairs(int[] nums) {
        if (nums == null || nums.length <= 1) return 0;
        return mergeSort(nums, 0, nums.length - 1);
    }

    private int mergeSort(int[] nums, int left, int right) {
        if (left >= right) return 0;

        int mid = left + (right - left) / 2;
        int count = mergeSort(nums, left, mid) + mergeSort(nums, mid + 1, right);

        // Count reverse pairs: nums[i] > 2 * nums[j]
        int j = mid + 1;
        for (int i = left; i <= mid; i++) {
            while (j <= right && (long) nums[i] > 2L * nums[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }

        // Merge two sorted halves
        merge(nums, left, mid, right);
        return count;
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            temp[k++] = (nums[i] <= nums[j]) ? nums[i++] : nums[j++];
        }
        while (i <= mid) temp[k++] = nums[i++];
        while (j <= right) temp[k++] = nums[j++];

        System.arraycopy(temp, 0, nums, left, temp.length);
    }

    public static void main(String[] args) {
        ReversePairs solver = new ReversePairs();
        int[] nums = {1, 3, 2, 3, 1};
        System.out.println("Reverse pairs (Expected: 2): " + solver.reversePairs(nums));
    }
}
