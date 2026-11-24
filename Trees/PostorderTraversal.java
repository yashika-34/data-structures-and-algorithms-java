package Trees;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 145: Binary Tree Postorder Traversal
 * URL: https://leetcode.com/problems/binary-tree-postorder-traversal/
 * Difficulty: Easy
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n) recursion stack
 */
public class PostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }

    private void postorder(TreeNode node, List<Integer> result) {
        if (node == null) return;
        postorder(node.left, result);
        postorder(node.right, result);
        result.add(node.val);
    }

    public static void main(String[] args) {
        PostorderTraversal solver = new PostorderTraversal();
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        System.out.println("Postorder (Expected: [3, 2, 1]): " + solver.postorderTraversal(root));
    }
}
