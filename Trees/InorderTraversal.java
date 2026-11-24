package Trees;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 94: Binary Tree Inorder Traversal
 * URL: https://leetcode.com/problems/binary-tree-inorder-traversal/
 * Difficulty: Easy
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n) recursion stack
 */
public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private void inorder(TreeNode node, List<Integer> result) {
        if (node == null) return;
        inorder(node.left, result);
        result.add(node.val);
        inorder(node.right, result);
    }

    public static void main(String[] args) {
        InorderTraversal solver = new InorderTraversal();
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        System.out.println("Inorder (Expected: [1, 3, 2]): " + solver.inorderTraversal(root));
    }
}
