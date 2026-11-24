package Trees;

/**
 * LeetCode 450: Delete Node in a BST
 * URL: https://leetcode.com/problems/delete-node-in-a-bst/
 * Difficulty: Medium
 * 
 * Time Complexity: O(h)
 * Space Complexity: O(h) recursion stack
 */
public class DeleteNodeBST {

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            // Case 1 & 2: 0 or 1 child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Case 3: 2 children - replace with inorder successor (min in right subtree)
            TreeNode minNode = findMin(root.right);
            root.val = minNode.val;
            root.right = deleteNode(root.right, minNode.val);
        }

        return root;
    }

    private TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public static void main(String[] args) {
        DeleteNodeBST solver = new DeleteNodeBST();
        TreeNode root = new TreeNode(5, new TreeNode(3, new TreeNode(2), new TreeNode(4)), new TreeNode(6, null, new TreeNode(7)));
        TreeNode res = solver.deleteNode(root, 3);
        System.out.println("Root after deleting 3: " + res.val);
    }
}
