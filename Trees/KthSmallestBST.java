package Trees;

/**
 * LeetCode 230: Kth Smallest Element in a BST
 * URL: https://leetcode.com/problems/kth-smallest-element-in-a-bst/
 * Difficulty: Medium
 * 
 * Approach: Inorder Traversal (BST inorder is sorted)
 * Time Complexity: O(h + k)
 * Space Complexity: O(h) recursion stack
 */
public class KthSmallestBST {

    private int count = 0;
    private int result = -1;

    public int kthSmallest(TreeNode root, int k) {
        count = k;
        inorder(root);
        return result;
    }

    private void inorder(TreeNode node) {
        if (node == null) return;

        inorder(node.left);

        count--;
        if (count == 0) {
            result = node.val;
            return;
        }

        inorder(node.right);
    }

    public static void main(String[] args) {
        KthSmallestBST solver = new KthSmallestBST();
        TreeNode root = new TreeNode(3, new TreeNode(1, null, new TreeNode(2)), new TreeNode(4));
        System.out.println("1st smallest (Expected: 1): " + solver.kthSmallest(root, 1));
    }
}
