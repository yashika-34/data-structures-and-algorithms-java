package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * LeetCode 429: N-ary Tree Level Order Traversal
 * URL: https://leetcode.com/problems/n-ary-tree-level-order-traversal/
 * Difficulty: Medium
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class NaryTreeLevelOrder {

    public static class Node {
        public int val;
        public List<Node> children;

        public Node() {
            children = new ArrayList<>();
        }

        public Node(int _val) {
            val = _val;
            children = new ArrayList<>();
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Node node = queue.poll();
                currentLevel.add(node.val);

                if (node.children != null) {
                    for (Node child : node.children) {
                        if (child != null) queue.add(child);
                    }
                }
            }
            result.add(currentLevel);
        }

        return result;
    }

    public static void main(String[] args) {
        NaryTreeLevelOrder solver = new NaryTreeLevelOrder();
        Node root = new Node(1);
        root.children.add(new Node(3));
        root.children.add(new Node(2));
        root.children.add(new Node(4));
        System.out.println("Level Order: " + solver.levelOrder(root));
    }
}
