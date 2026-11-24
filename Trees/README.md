# 🌳 Binary Trees DSA in Java

This folder contains my implementations and problem solutions on **Binary Trees** using Java.

---

## 📌 Core Concepts

A **Binary Tree** is a hierarchical data structure where each node has at most two children, referred to as the `left` child and the `right` child.

### Node Structure
```java
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
```

---

## 📚 Topics Covered

- **Tree Traversals (Depth-First Search):**
  - **Inorder (Left $\rightarrow$ Root $\rightarrow$ Right):** Produces sorted order for Binary Search Trees.
  - **Preorder (Root $\rightarrow$ Left $\rightarrow$ Right):** Useful for cloning or serializing trees.
  - **Postorder (Left $\rightarrow$ Right $\rightarrow$ Root):** Useful for bottom-up deletion and subtree evaluations.
- **Tree Metrics:** Finding the maximum depth / height of a binary tree recursively.
- **Ancestor Queries:** Finding the **Lowest Common Ancestor (LCA)** of two nodes in $O(N)$ time.

---

## 📂 Files & Problem Solutions (15 Solutions)

| File | Problem / Concept | LeetCode | Time Complexity | Space Complexity |
|---|---|:---:|:---:|:---:|
| [`TreeNode.java`](TreeNode.java) | Binary Tree Node definition | Core DSA | - | - |
| [`Main.java`](Main.java) | Tree construction & Traversal driver | Core DSA | $O(N)$ | $O(H)$ |
| [`InorderTraversal.java`](InorderTraversal.java) | Binary Tree Inorder Traversal | LeetCode 94 | $O(N)$ | $O(H)$ |
| [`PostorderTraversal.java`](PostorderTraversal.java) | Binary Tree Postorder Traversal | LeetCode 145 | $O(N)$ | $O(H)$ |
| [`MaximumDepthOfTree.java`](MaximumDepthOfTree.java) | Maximum Depth of Binary Tree | LeetCode 104 | $O(N)$ | $O(H)$ |
| [`MaxPathSum.java`](MaxPathSum.java) | Binary Tree Maximum Path Sum | LeetCode 124 | $O(N)$ | $O(H)$ |
| [`LowestCommonAncestor.java`](LowestCommonAncestor.java) | Lowest Common Ancestor (LCA) | LeetCode 236 | $O(N)$ | $O(H)$ |
| [`KthSmallestBST.java`](KthSmallestBST.java) | Kth Smallest Element in a BST | LeetCode 230 | $O(H + K)$ | $O(H)$ |
| [`DeleteNodeBST.java`](DeleteNodeBST.java) | Delete Node in a BST | LeetCode 450 | $O(H)$ | $O(H)$ |
| [`SearchBST.java`](SearchBST.java) | Search in a Binary Search Tree | LeetCode 700 | $O(H)$ | $O(1)$ |
| [`NaryTreePreorder.java`](NaryTreePreorder.java) | N-ary Tree Preorder Traversal | LeetCode 589 | $O(N)$ | $O(N)$ |
| [`NaryTreeLevelOrder.java`](NaryTreeLevelOrder.java) | N-ary Tree Level Order Traversal | LeetCode 429 | $O(N)$ | $O(N)$ |
| [`NumberOfIslands.java`](NumberOfIslands.java) | Number of Islands (Grid DFS / BFS) | LeetCode 200 | $O(M \cdot N)$ | $O(M \cdot N)$ |
| [`NumberOfProvinces.java`](NumberOfProvinces.java) | Number of Provinces (Graph DFS / Disjoint Set) | LeetCode 547 | $O(N^2)$ | $O(N)$ |
| [`NumWaysSameBST.java`](NumWaysSameBST.java) | Number of Ways to Reorder Array to Get Same BST | LeetCode 1569 | $O(N^2)$ | $O(N^2)$ |

*(Where $N$ is the number of nodes and $H$ is the tree height: $O(\log N)$ for balanced trees, $O(N)$ for skewed trees).*

---

## ⏱️ Key Complexity Insights

| Algorithm | Best / Average Time | Worst Case Time | Auxiliary Space |
|---|:---:|:---:|:---:|
| **Tree Traversals (DFS)** | $O(N)$ | $O(N)$ | $O(H)$ call stack |
| **Height / Max Depth** | $O(N)$ | $O(N)$ | $O(H)$ call stack |
| **Lowest Common Ancestor** | $O(N)$ | $O(N)$ | $O(H)$ call stack |

---

## ▶️ How to Run

Compile and run the driver class from the repository root:

```bash
# Compile
javac Trees/Main.java

# Run
java Trees.Main
```

---

**Author:** Yashika Garg
