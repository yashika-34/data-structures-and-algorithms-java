package Trees;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 589: N-ary Tree Preorder Traversal
 * URL: https://leetcode.com/problems/n-ary-tree-preorder-traversal/
 * Difficulty: Easy
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n) recursion stack
 */
public class NaryTreePreorder {

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

    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    private void traverse(Node node, List<Integer> result) {
        if (node == null) return;
        result.add(node.val);
        if (node.children != null) {
            for (Node child : node.children) {
                traverse(child, result);
            }
        }
    }

    public static void main(String[] args) {
        NaryTreePreorder solver = new NaryTreePreorder();
        Node root = new Node(1);
        root.children.add(new Node(3));
        root.children.add(new Node(2));
        root.children.add(new Node(4));
        System.out.println("Preorder (Expected: [1, 3, 2, 4]): " + solver.preorder(root));
    }
}
