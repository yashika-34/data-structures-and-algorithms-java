package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode 3069: Distribute Elements Into Two Arrays I
 * URL: https://leetcode.com/problems/distribute-elements-into-two-arrays-i/
 * Difficulty: Easy
 * 
 * Approach: Direct simulation comparing last elements
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class DistributeElements {

    public int[] resultArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for (int i = 2; i < nums.length; i++) {
            if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
                arr1.add(nums[i]);
            } else {
                arr2.add(nums[i]);
            }
        }

        int[] result = new int[nums.length];
        int idx = 0;
        for (int x : arr1) result[idx++] = x;
        for (int x : arr2) result[idx++] = x;

        return result;
    }

    public static void main(String[] args) {
        DistributeElements solver = new DistributeElements();
        int[] nums = {2, 1, 3};
        System.out.println("Result (Expected [2, 3, 1]): " + Arrays.toString(solver.resultArray(nums)));
    }
}
