package Trees;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 1569: Number of Ways to Reorder Array to Get Same BST
 * URL: https://leetcode.com/problems/number-of-ways-to-reorder-array-to-get-same-bst/
 * Difficulty: Hard
 * 
 * Approach: Combinatorics (Pascal's Triangle for nCr) + Recursive Subtrees
 * Time Complexity: O(n^2)
 * Space Complexity: O(n^2)
 */
public class NumWaysSameBST {

    private static final long MOD = 1_000_000_007L;
    private long[][] table;

    public int numOfWays(int[] nums) {
        int n = nums.length;
        // Precompute combinations using Pascal's Triangle
        table = new long[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            table[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                table[i][j] = (table[i - 1][j - 1] + table[i - 1][j]) % MOD;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }

        return (int) ((dfs(list) - 1 + MOD) % MOD);
    }

    private long dfs(List<Integer> list) {
        if (list.size() <= 2) return 1;

        int root = list.get(0);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 1; i < list.size(); i++) {
            int val = list.get(i);
            if (val < root) {
                left.add(val);
            } else {
                right.add(val);
            }
        }

        long leftWays = dfs(left);
        long rightWays = dfs(right);
        long comb = table[left.size() + right.size()][left.size()];

        return (((comb * leftWays) % MOD) * rightWays) % MOD;
    }

    public static void main(String[] args) {
        NumWaysSameBST solver = new NumWaysSameBST();
        int[] nums = {2, 1, 3};
        System.out.println("Ways (Expected: 1): " + solver.numOfWays(nums));

        int[] nums2 = {3, 4, 5, 1, 2};
        System.out.println("Ways (Expected: 5): " + solver.numOfWays(nums2));
    }
}
