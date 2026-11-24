package Trees;

/**
 * LeetCode 700: Search in a Binary Search Tree
 * URL: https://leetcode.com/problems/search-in-a-binary-search-tree/
 * Difficulty: Easy
 * 
 * Time Complexity: O(h)
 * Space Complexity: O(1) iterative
 */
public class SearchBST {

    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null && root.val != val) {
            root = (val < root.val) ? root.left : root.right;
        }
        return root;
    }

    public static void main(String[] args) {
        SearchBST solver = new SearchBST();
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));
        TreeNode found = solver.searchBST(root, 2);
        System.out.println("Found node (Expected: 2): " + (found != null ? found.val : "null"));
    }
}
