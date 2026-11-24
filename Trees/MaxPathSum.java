package Trees;

/**
 * LeetCode 124: Binary Tree Maximum Path Sum
 * URL: https://leetcode.com/problems/binary-tree-maximum-path-sum/
 * Difficulty: Hard
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(h) recursion stack
 */
public class MaxPathSum {

    private int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        gainFromSubtree(root);
        return maxSum;
    }

    private int gainFromSubtree(TreeNode node) {
        if (node == null) return 0;

        int leftGain = Math.max(0, gainFromSubtree(node.left));
        int rightGain = Math.max(0, gainFromSubtree(node.right));

        int priceNewPath = node.val + leftGain + rightGain;
        maxSum = Math.max(maxSum, priceNewPath);

        return node.val + Math.max(leftGain, rightGain);
    }

    public static void main(String[] args) {
        MaxPathSum solver = new MaxPathSum();
        TreeNode root = new TreeNode(-10, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println("Max Path Sum (Expected: 42): " + solver.maxPathSum(root));
    }
}
