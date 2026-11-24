# 🚀 Data Structures & Algorithms in Java

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/Problems%20Solved-127-brightgreen?style=for-the-badge" alt="Problems Solved" />
  <img src="https://img.shields.io/badge/LeetCode%20Solved-90-FFA116?style=for-the-badge&logo=leetcode&logoColor=white" alt="LeetCode Solved" />
  <img src="https://img.shields.io/badge/Topics-9-blue?style=for-the-badge" alt="Topics" />
  <img src="https://img.shields.io/badge/Architecture-Modular%20Guides-purple?style=for-the-badge" alt="Modular Architecture" />
  <img src="https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge" alt="License" />
  <img src="https://img.shields.io/badge/Status-Actively%20Practicing-orange?style=for-the-badge" alt="Status" />
</p>

A structured, well-organized repository of **Data Structures and Algorithms (DSA) solutions implemented in Java** (covering all 90 LeetCode problems solved on [@yashikagarg448](https://leetcode.com/u/yashikagarg448/)). Built to develop strong problem-solving fundamentals, master core computer science concepts, and prepare for technical interviews.

---

## 📊 Topics & Progress

Every topic folder contains its own dedicated technical study guide and problem breakdown:

| Topic | Directory | Problems Solved | Documentation | Key Highlights |
|:---|:---:|:---:|:---:|:---|
| 📦 **Arrays** | [`Arrays/`](./Arrays) | 50 | [📖 View Documentation](./Arrays/README.md) | Two Pointers, Sliding Window, Prefix Sums, Kadane's |
| 🔗 **Linked Lists** | [`LinkedList/`](./LinkedList) | 15 | [📖 View Documentation](./LinkedList/README.md) | Floyd's Cycle, k-Group Reversal, Merging & Two Pointers |
| 🌳 **Trees & Graphs** | [`Trees/`](./Trees) | 15 | [📖 View Documentation](./Trees/README.md) | DFS/BFS Traversals, LCA, BST Operations, Number of Islands |
| 🔤 **Strings** | [`Strings/`](./Strings) | 12 | [📖 View Documentation](./Strings/README.md) | Anagrams, String Parsing, Sliding Window, Palindromes |
| 📚 **Stack** | [`Stack/`](./Stack) | 10 | [📖 View Documentation](./Stack/README.md) | Monotonic Stack, Infix/Postfix, Bracket Matching, Stock Span |
| 🚶‍♂️ **Queue** | [`Queue/`](./Queue) | 9 | [📖 View Documentation](./Queue/README.md) | FIFO Operations, Circular Arrays, Sliding Window, Stream Processing |
| ⛰️ **Heaps** | [`heaps/`](./heaps) | 8 | [📖 View Documentation](./heaps/README.md) | Min/Max Heap, Heap Sort, Heapify, K Largest Elements |
| 🔄 **Recursion** | [`recursion/`](./recursion) | 6 | [📖 View Documentation](./recursion/README.md) | Backtracking, N-Queens, Sudoku Solver, Subsets, Permutations |
| 🗄️ **Database** | [`Database/`](./Database) | 1 | [📖 View Query](./Database/DuplicateEmails.sql) | SQL Aggregation & Grouping |
| **Total** | | **127** | **8 Comprehensive Guides** | **100% LeetCode Coverage (90/90)** |

---

## 📖 Topic Documentation & Revision Guides

Each topic folder includes a standalone technical guide containing theory, core operations, complexity tables, and implementation details:

- [**📦 Arrays Documentation**](./Arrays/README.md): Two pointers, sliding window technique, Kadane's algorithm, prefix sums, and Boyer-Moore voting.
- [**🔗 Linked Lists Documentation**](./LinkedList/README.md): Singly linked list architecture, Floyd's cycle detection, in-place 3-pointer reversal, and k-group reversal.
- [**📚 Stack Documentation**](./Stack/README.md): Array & Linked List stack implementations, monotonic stacks for Next Greater Element & Stock Span.
- [**🚶‍♂️ Queue Documentation**](./Queue/README.md): Array & Linked List queues, sliding window first negative, and stream processing.
- [**🔤 Strings Documentation**](./Strings/README.md): Character frequency arrays, `atoi` parsing, two-pointer palindromes, and sliding window.
- [**🌳 Binary Trees Documentation**](./Trees/README.md): `TreeNode` structure, recursive DFS/BFS traversals, LCA, and BST operations.
- [**⛰️ Heaps Documentation**](./heaps/README.md): Complete binary tree array indexing, Min/Max Heap from scratch, and Heap Sort.
- [**🔄 Recursion Documentation**](./recursion/README.md): State-space decision trees and standard backtracking templates (N-Queens, Sudoku).

---

## 📂 Repository Structure

```text
data-structures-and-algorithms-java/
├── Arrays/          # 50 problems + README.md (Two Pointers, Prefix Sums, Kadane's)
├── LinkedList/      # 15 problems + README.md (Cycle Detection, Reversals, Rotations)
├── Trees/           # 15 problems + README.md (DFS/BFS Traversals, LCA, BST, Grid DFS)
├── Strings/         # 12 problems + README.md (Anagrams, Palindromes, Sliding Window)
├── Stack/           # 10 problems + README.md (Monotonic Stack, Infix/Postfix, Stock Span)
├── Queue/           # 9 problems  + README.md (FIFO, Sliding Window, Queue via Stacks)
├── heaps/           # 8 problems  + README.md (Min/Max Heap, Heap Sort)
├── recursion/       # 6 problems  + README.md (N-Queens, Sudoku, Subsets, Permutations)
├── Database/        # 1 SQL query (LeetCode 182)
└── README.md        # Main showcase & centralized problem index
```

---

## 📑 Problem Index

<details open>
<summary><b>📦 Arrays (50 Solutions) — <a href="Arrays/README.md">View Topic Guide</a></b></summary>
<br>

| Problem / File | Concept / LeetCode Equivalent |
|---|---|
| [`TwoSum.java`](Arrays/TwoSum.java) | LeetCode 1: Two Sum (Hash Map / Two Pointers) |
| [`MaximumSubarray.java`](Arrays/MaximumSubarray.java) | LeetCode 53: Maximum Subarray (Kadane's Algorithm) |
| [`MaximumSubarraySum.java`](Arrays/MaximumSubarraySum.java) | Kadane's Algorithm for Maximum Subarray Sum |
| [`MaxProduct.java`](Arrays/MaxProduct.java) | LeetCode 152: Maximum Product Subarray |
| [`BestTimeToBuyAndSell.java`](Arrays/BestTimeToBuyAndSell.java) | LeetCode 121: Best Time to Buy and Sell Stock |
| [`MajorityElement.java`](Arrays/MajorityElement.java) | LeetCode 169: Majority Element (Boyer-Moore Voting) |
| [`LongestConsecutiveSequence.java`](Arrays/LongestConsecutiveSequence.java) | LeetCode 128: Longest Consecutive Sequence |
| [`SubarraySumEqualsK.java`](Arrays/SubarraySumEqualsK.java) | LeetCode 560: Subarray Sum Equals K (Prefix Sum) |
| [`SubarraySumsDivisibleByK.java`](Arrays/SubarraySumsDivisibleByK.java) | LeetCode 974: Subarray Sums Divisible by K |
| [`ContinuousSubarraySum.java`](Arrays/ContinuousSubarraySum.java) | LeetCode 523: Continuous Subarray Sum |
| [`ContiguousArray.java`](Arrays/ContiguousArray.java) | LeetCode 525: Contiguous Array (Prefix Sum) |
| [`ProductOfArrayExceptSelf.java`](Arrays/ProductOfArrayExceptSelf.java) | LeetCode 238: Product of Array Except Self |
| [`SetMatrixZeroes.java`](Arrays/SetMatrixZeroes.java) | LeetCode 73: Set Matrix Zeroes |
| [`FindPeakElement.java`](Arrays/FindPeakElement.java) | LeetCode 162: Find Peak Element (Binary Search) |
| [`RotateArray.java`](Arrays/RotateArray.java) | LeetCode 189: Rotate Array (Reversal Algorithm) |
| [`ReversePairs.java`](Arrays/ReversePairs.java) | LeetCode 493: Reverse Pairs (Merge Sort) |
| [`FindPivotIndex.java`](Arrays/FindPivotIndex.java) | LeetCode 724: Find Pivot Index |
| [`CarPooling.java`](Arrays/CarPooling.java) | LeetCode 1094: Car Pooling (Difference Array) |
| [`CorporateFlightBookings.java`](Arrays/CorporateFlightBookings.java) | LeetCode 1109: Corporate Flight Bookings (Difference Array) |
| [`RearrangeArrayElementsBySign.java`](Arrays/RearrangeArrayElementsBySign.java) | LeetCode 2149: Rearrange Array Elements by Sign |
| [`DistributeElements.java`](Arrays/DistributeElements.java) | LeetCode 3069: Distribute Elements Into Two Arrays I |
| [`MinMovesCleanClassroom.java`](Arrays/MinMovesCleanClassroom.java) | LeetCode 3568: Minimum Moves to Clean the Classroom (BFS + Bitmask) |
| [`EarliestTimeFinishTask.java`](Arrays/EarliestTimeFinishTask.java) | LeetCode 3683: Earliest Time to Finish One Task |
| [`CountCommas.java`](Arrays/CountCommas.java) | LeetCode 3870: Count Commas in Range |
| [`ConstructUniformParityArrayI.java`](Arrays/ConstructUniformParityArrayI.java) | LeetCode 3875: Construct Uniform Parity Array I |
| [`ConstructUniformParityArrayII.java`](Arrays/ConstructUniformParityArrayII.java) | LeetCode 3876: Construct Uniform Parity Array II |
| [`TargetSum1477.java`](Arrays/TargetSum1477.java) | LeetCode 1477: Non-overlapping Subarrays with Target Sum |
| [`RunningSum.java`](Arrays/RunningSum.java) | LeetCode 1480: Running Sum of 1D Array |
| [`RangeSumQuery.java`](Arrays/RangeSumQuery.java) | LeetCode 303: Range Sum Query - Immutable |
| [`SearchInsertPosition.java`](Arrays/SearchInsertPosition.java) | LeetCode 35: Search Insert Position (Binary Search) |
| [`Sqrt.java`](Arrays/Sqrt.java) | LeetCode 69: Sqrt(x) via Binary Search |
| [`RotateImage.java`](Arrays/RotateImage.java) | LeetCode 48: Rotate Image / 90° Matrix Rotation |
| [`MoveZeroes.java`](Arrays/MoveZeroes.java) | LeetCode 283: Move Zeroes (In-place) |
| [`RemoveDuplicates.java`](Arrays/RemoveDuplicates.java) | LeetCode 26: Remove Duplicates from Sorted Array |
| [`MissingNumber.java`](Arrays/MissingNumber.java) | LeetCode 268: Missing Number (XOR / Sum Formula) |
| [`SingleNumber.java`](Arrays/SingleNumber.java) | LeetCode 136: Single Number (Bit Manipulation) |
| [`MaxConsecutiveOnes.java`](Arrays/MaxConsecutiveOnes.java) | LeetCode 485: Max Consecutive Ones |
| [`PalindromeNumber.java`](Arrays/PalindromeNumber.java) | LeetCode 9: Palindrome Number |
| [`PlusOne.java`](Arrays/PlusOne.java) | LeetCode 66: Plus One |
| [`PlusOneVariant.java`](Arrays/PlusOneVariant.java) | Array Plus One Variant |
| [`Largest.java`](Arrays/Largest.java) | Find Largest Element in Array |
| [`SecondLargest.java`](Arrays/SecondLargest.java) | Find Second Largest Element in Array |
| [`ReverseArray.java`](Arrays/ReverseArray.java) | Reverse an Array (Two Pointer Technique) |
| [`CheckSubarray.java`](Arrays/CheckSubarray.java) | Check Subarray Existence |
| [`CheckArraySortedAndRotated.java`](Arrays/CheckArraySortedAndRotated.java) | LeetCode 1752: Check if Array is Sorted and Rotated |
| [`SubsetsKOverlapping.java`](Arrays/SubsetsKOverlapping.java) | LeetCode 1621: Number of Sets of K Non-Overlapping Line Segments |
| [`Question3903.java`](Arrays/Question3903.java) | LeetCode 3903: Smallest Stable Index I |
| [`Question3904.java`](Arrays/Question3904.java) | LeetCode 3904: Smallest Stable Index II |
| [`NextGreaterElement.java`](Arrays/NextGreaterElement.java) | LeetCode 496: Next Greater Element I (Monotonic Stack) |

</details>

<details open>
<summary><b>🔗 Linked Lists (15 Solutions) — <a href="LinkedList/README.md">View Topic Guide</a></b></summary>
<br>

| Problem / File | Concept / LeetCode Equivalent |
|---|---|
| [`ReverseLinkedList.java`](LinkedList/ReverseLinkedList.java) | LeetCode 206: Reverse Linked List (Iterative) |
| [`ReverseByK.java`](LinkedList/ReverseByK.java) | LeetCode 25: Reverse Nodes in k-Group |
| [`RotateList.java`](LinkedList/RotateList.java) | LeetCode 61: Rotate List |
| [`DetectLoop.java`](LinkedList/DetectLoop.java) | LeetCode 141: Linked List Cycle (Floyd's Tortoise & Hare) |
| [`DetectLoopII.java`](LinkedList/DetectLoopII.java) | LeetCode 142: Linked List Cycle II (Find Entry Point) |
| [`PalindromeLinkedList.java`](LinkedList/PalindromeLinkedList.java) | LeetCode 234: Palindrome Linked List |
| [`MergeLinkedList.java`](LinkedList/MergeLinkedList.java) | LeetCode 21: Merge Two Sorted Lists |
| [`AddTwoNumbers.java`](LinkedList/AddTwoNumbers.java) | LeetCode 2: Add Two Numbers |
| [`RemoveNthFromEnd.java`](LinkedList/RemoveNthFromEnd.java) | LeetCode 19: Remove Nth Node From End of List |
| [`RemoveElements.java`](LinkedList/RemoveElements.java) | LeetCode 203: Remove Linked List Elements |
| [`DeleteNodeLinkedList.java`](LinkedList/DeleteNodeLinkedList.java) | LeetCode 237: Delete Node in a Linked List |
| [`OddEvenLinkedList.java`](LinkedList/OddEvenLinkedList.java) | LeetCode 328: Odd Even Linked List |
| [`MiddleNode.java`](LinkedList/MiddleNode.java) | LeetCode 876: Middle of the Linked List |
| [`SortColors.java`](LinkedList/SortColors.java) | LeetCode 75: Sort Colors / Three-Way Partitioning |

</details>

<details open>
<summary><b>🌳 Binary Trees & Graphs (15 Solutions) — <a href="Trees/README.md">View Topic Guide</a></b></summary>
<br>

| Problem / File | Concept / LeetCode Equivalent |
|---|---|
| [`TreeNode.java`](Trees/TreeNode.java) | Binary Tree Node class definition |
| [`Main.java`](Trees/Main.java) | Tree construction & Traversal Drivers |
| [`InorderTraversal.java`](Trees/InorderTraversal.java) | LeetCode 94: Binary Tree Inorder Traversal |
| [`PostorderTraversal.java`](Trees/PostorderTraversal.java) | LeetCode 145: Binary Tree Postorder Traversal |
| [`MaximumDepthOfTree.java`](Trees/MaximumDepthOfTree.java) | LeetCode 104: Maximum Depth of Binary Tree |
| [`MaxPathSum.java`](Trees/MaxPathSum.java) | LeetCode 124: Binary Tree Maximum Path Sum |
| [`LowestCommonAncestor.java`](Trees/LowestCommonAncestor.java) | LeetCode 236: Lowest Common Ancestor (LCA) |
| [`KthSmallestBST.java`](Trees/KthSmallestBST.java) | LeetCode 230: Kth Smallest Element in a BST |
| [`DeleteNodeBST.java`](Trees/DeleteNodeBST.java) | LeetCode 450: Delete Node in a BST |
| [`SearchBST.java`](Trees/SearchBST.java) | LeetCode 700: Search in a Binary Search Tree |
| [`NaryTreePreorder.java`](Trees/NaryTreePreorder.java) | LeetCode 589: N-ary Tree Preorder Traversal |
| [`NaryTreeLevelOrder.java`](Trees/NaryTreeLevelOrder.java) | LeetCode 429: N-ary Tree Level Order Traversal |
| [`NumberOfIslands.java`](Trees/NumberOfIslands.java) | LeetCode 200: Number of Islands (Grid DFS) |
| [`NumberOfProvinces.java`](Trees/NumberOfProvinces.java) | LeetCode 547: Number of Provinces (Graph DFS) |
| [`NumWaysSameBST.java`](Trees/NumWaysSameBST.java) | LeetCode 1569: Number of Ways to Reorder Array to Get Same BST |

</details>

<details open>
<summary><b>🔤 Strings (12 Solutions) — <a href="Strings/README.md">View Topic Guide</a></b></summary>
<br>

| Problem / File | Concept / LeetCode Equivalent |
|---|---|
| [`ValidAnagrams.java`](Strings/ValidAnagrams.java) | LeetCode 242: Valid Anagram (Frequency Array) |
| [`ValidPalindrome.java`](Strings/ValidPalindrome.java) | LeetCode 125: Valid Palindrome (Two Pointers) |
| [`ReverseString.java`](Strings/ReverseString.java) | LeetCode 344: Reverse String (In-place) |
| [`ReverseWords.java`](Strings/ReverseWords.java) | LeetCode 151: Reverse Words in a String |
| [`ReverseInteger.java`](Strings/ReverseInteger.java) | LeetCode 7: Reverse Integer (Overflow checking) |
| [`FirstUniqueCharacterInAString.java`](Strings/FirstUniqueCharacterInAString.java) | LeetCode 387: First Unique Character in a String |
| [`LongestSubstringWithoutRepeatingCharacters.java`](Strings/LongestSubstringWithoutRepeatingCharacters.java) | LeetCode 3: Longest Substring Without Repeating Characters |
| [`SortCharactersByFrequency.java`](Strings/SortCharactersByFrequency.java) | LeetCode 451: Sort Characters By Frequency |
| [`ShiftingLetters.java`](Strings/ShiftingLetters.java) | LeetCode 848: Shifting Letters (Suffix Sum) |
| [`StringToAtoi.java`](Strings/StringToAtoi.java) | LeetCode 8: String to Integer (atoi) |
| [`FindIndex.java`](Strings/FindIndex.java) | LeetCode 28: Find the Index of the First Occurrence in a String |
| [`MaxPalindromes.java`](Strings/MaxPalindromes.java) | LeetCode 2472: Maximum Number of Non-overlapping Palindrome Substrings |

</details>

<details open>
<summary><b>📚 Stack (10 Solutions) — <a href="Stack/README.md">View Topic Guide</a></b></summary>
<br>

| Problem / File | Concept / Description |
|---|---|
| [`StackArray.java`](Stack/StackArray.java) | Stack implementation from scratch using dynamic arrays |
| [`StackLinkedList.java`](StackLinkedList.java) | Stack implementation from scratch using Linked List nodes |
| [`ValidParentheses.java`](Stack/ValidParentheses.java) | LeetCode 20: Valid Parentheses / Bracket Matching |
| [`NextGreater.java`](Stack/NextGreater.java) | LeetCode 496: Next Greater Element using Monotonic Stack |
| [`MinStack.java`](Stack/MinStack.java) | LeetCode 155: Min Stack (O(1) minimum retrieval) |
| [`InfixtoPostfix.java`](Stack/InfixtoPostfix.java) | Operator precedence and Infix to Postfix conversion |
| [`EvaluatePostfix.java`](Stack/EvaluatePostfix.java) | Postfix arithmetic expression evaluation |
| [`EvaluatePrefix.java`](Stack/EvaluatePrefix.java) | Prefix expression evaluation |
| [`MinReversal.java`](Stack/MinReversal.java) | Minimum bracket reversals to balance an expression |
| [`OnlineStockSpan.java`](Stack/OnlineStockSpan.java) | LeetCode 901: Online Stock Span (Monotonic Stack) |

</details>

<details open>
<summary><b>🚶‍♂️ Queue (9 Solutions) — <a href="Queue/README.md">View Topic Guide</a></b></summary>
<br>

| Problem / File | Concept / Description |
|---|---|
| [`QueueArray.java`](Queue/QueueArray.java) | Queue implementation from scratch using dynamic arrays |
| [`QueueLinkedList.java`](Queue/QueueLinkedList.java) | Queue implementation from scratch using Linked List nodes |
| [`ReverseQueue.java`](Queue/ReverseQueue.java) | Queue reversal using an auxiliary Stack |
| [`ReverseFirstKElements.java`](Queue/ReverseFirstKElements.java) | Reverse first $K$ elements of Queue using Stack |
| [`QueueUsingStacks.java`](Queue/QueueUsingStacks.java) | LeetCode 232: Implement Queue using Stacks |
| [`StackUsingQueues.java`](Queue/StackUsingQueues.java) | LeetCode 225: Implement Stack using Queues |
| [`FirstNegativeWindow.java`](Queue/FirstNegativeWindow.java) | First negative integer in every window of size $K$ |
| [`FirstNonRepeating.java`](Queue/FirstNonRepeating.java) | First non-repeating character in a stream of characters |
| [`GenerateBinaryNumbers.java`](Queue/GenerateBinaryNumbers.java) | Generate binary numbers from 1 to $N$ using Queue BFS |

</details>

<details open>
<summary><b>⛰️ Heaps & Priority Queues (8 Solutions) — <a href="heaps/README.md">View Topic Guide</a></b></summary>
<br>

| Problem / File | Description | Time Complexity |
|---|---|---|
| [`MinHeap.java`](heaps/MinHeap.java) | Complete Min Heap implementation (`insert`, `deleteRoot`, `peek`) | Insert: $O(\log N)$, Delete: $O(\log N)$, Peek: $O(1)$ |
| [`HeapInsert.java`](heaps/HeapInsert.java) | Max Heap insertion with upward heapify | $O(\log N)$ |
| [`HeapDelete.java`](heaps/HeapDelete.java) | Max Heap root deletion and downward heapify | $O(\log N)$ |
| [`HeapPeek.java`](heaps/HeapPeek.java) | Peek maximum element at root | $O(1)$ |
| [`Heapify.java`](heaps/Heapify.java) | Downward heapify to maintain the heap property | $O(\log N)$ |
| [`BuildHeap.java`](heaps/BuildHeap.java) | Constructing a Max Heap from an unsorted array | $O(N)$ |
| [`HeapSort.java`](heaps/HeapSort.java) | In-place sorting of an array in ascending order | $O(N \log N)$ |
| [`KLargestElements.java`](heaps/KLargestElements.java) | LeetCode 215: Finding top $K$ largest elements via Min Heap | $O(N \log K)$ |

</details>

<details open>
<summary><b>🔄 Recursion & Backtracking (6 Solutions) — <a href="recursion/README.md">View Topic Guide</a></b></summary>
<br>

| Problem / File | Concept / LeetCode Equivalent |
|---|---|
| [`FibonacciNumber.java`](recursion/FibonacciNumber.java) | LeetCode 509: Fibonacci Number |
| [`NQueens.java`](recursion/NQueens.java) | LeetCode 51: N-Queens Problem (Backtracking & Board Validation) |
| [`SudokuSolver.java`](recursion/SudokuSolver.java) | LeetCode 37: Sudoku Solver (Backtracking) |
| [`Subsets.java`](recursion/Subsets.java) | LeetCode 78: Subsets / Power Set Generation |
| [`SubsetsWithDup.java`](recursion/SubsetsWithDup.java) | LeetCode 90: Subsets II (Handling Duplicate Elements) |
| [`Permutations.java`](recursion/Permutations.java) | LeetCode 46: Permutations of an Array |

</details>

<details open>
<summary><b>🗄️ Database (1 Solution)</b></summary>
<br>

| Problem / File | Concept / LeetCode Equivalent |
|---|---|
| [`DuplicateEmails.sql`](Database/DuplicateEmails.sql) | LeetCode 182: Duplicate Emails (SQL `GROUP BY` & `HAVING`) |

</details>

---

## 🛠️ Tech Stack & Tools

- **Programming Language:** Java (JDK 8+) & SQL
- **IDE:** Visual Studio Code
- **Build & Run:** OpenJDK CLI tools (`javac`, `java`)
- **Version Control:** Git & GitHub

---

## ▶️ How to Run the Solutions

### 1. Standalone Programs (e.g., Arrays, LinkedList, Stack, Queue, Strings, Recursion)
```bash
# Compile
javac Arrays/TwoSum.java

# Run
java Arrays.TwoSum
```

### 2. Packaged Programs (e.g., Heaps, Queue, Stack)
Files inside directories with package declarations should be compiled and executed from the repository root:
```bash
# Compile
javac heaps/MinHeap.java
javac Queue/QueueArray.java

# Run
java heaps.MinHeap
java Queue.QueueArray
```

---

## 🎯 Learning Roadmap & Key Takeaways

- [x] Master Arrays & Two-Pointer techniques
- [x] Singly Linked List operations, reversals, rotations, and cycle detection
- [x] Stack applications (LIFO, monotonic patterns, stock span)
- [x] Queue applications (FIFO, sliding window, stream processing, two-stack design)
- [x] Binary Trees and common traversals (DFS, BFS, LCA, BST)
- [x] Binary Heaps from scratch, Heapify, and Heap Sort
- [x] Classic Backtracking (N-Queens, Sudoku, Subsets, Permutations)
- [x] Graph Algorithms (Number of Islands, Number of Provinces, Alien Dictionary)

---

## 👩‍💻 Author

**Yashika Garg**  
- GitHub: [@yashika-34](https://github.com/yashika-34)  
- LeetCode: [@yashikagarg448](https://leetcode.com/u/yashikagarg448/)

*Consistency beats intensity. One problem at a time.* 🚀
