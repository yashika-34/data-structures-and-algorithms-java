package Arrays;

/**
 * LeetCode 3875: Construct Uniform Parity Array I
 * URL: https://leetcode.com/problems/construct-uniform-parity-array-i/
 * Difficulty: Easy
 * 
 * Approach: Check parity properties of elements
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class ConstructUniformParityArrayI {

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

        // If already all even or all odd, trivial true
        if (oddCount == 0 || oddCount == nums.length) {
            return true;
        }

        // Can we make all odd? Every even number needs an odd smaller than it
        for (int x : nums) {
            if (x % 2 == 0 && x <= minOdd) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ConstructUniformParityArrayI solver = new ConstructUniformParityArrayI();
        int[] nums = {4, 2, 5};
        System.out.println("Can construct (Expected: false): " + solver.canConstruct(nums));
    }
}
