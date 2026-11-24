# 📦 Arrays DSA in Java

This folder contains my solutions and practice problems on **Arrays and Matrix Manipulations** using Java (and C++).

---

## 📌 Core Algorithmic Patterns

1. **Two Pointers & Sliding Window:**
   - Traversal from both ends towards the center (e.g., `TwoSum.java`, `ReverseArray.java`).
   - Maintaining dynamic windows for subarray constraints (e.g., `SubarraySumEqualsK.java`).
2. **Kadane's Algorithm:**
   - Optimal $O(N)$ dynamic approach to find maximum sum of contiguous subarrays (`MaximumSubarray.java`, `MaximumSubarraySum.java`).
3. **Prefix Sums & Range Queries:**
   - Precomputing running totals for $O(1)$ query time (`RunningSum.java`, `RangeSumQuery.java`, `SubarraySumEqualsK.java`).
4. **Boyer-Moore Voting Algorithm:**
   - Finding majority elements in linear time $O(N)$ and $O(1)$ space (`MajorityElement.java`).
5. **Binary Search on Arrays:**
   - Finding search insertion points and integer square roots in $O(\log N)$ time (`SearchInsertPosition.java`, `Sqrt.java`).
6. **In-place Matrix Manipulations:**
   - 2D grid rotations and transformations (`RotateImage.java`).

---

## 📂 Problem Index (50 Solutions)

| Problem / File | Concept | LeetCode / Source | Time Complexity | Space Complexity |
|---|---|:---:|:---:|:---:|
| [`TwoSum.java`](TwoSum.java) | Hash Map complement search | LeetCode 1 | $O(N)$ | $O(N)$ |
| [`MaximumSubarray.java`](MaximumSubarray.java) | Kadane's Algorithm (Max Subarray) | LeetCode 53 | $O(N)$ | $O(1)$ |
| [`MaximumSubarraySum.java`](MaximumSubarraySum.java) | Subarray sum evaluation | Core DSA | $O(N^2)$ brute | $O(1)$ |
| [`MaxProduct.java`](MaxProduct.java) | Maximum product subarray | LeetCode 152 | $O(N)$ | $O(N)$ |
| [`BestTimeToBuyAndSell.java`](BestTimeToBuyAndSell.java) | Single-pass min-price tracking | LeetCode 121 | $O(N)$ | $O(1)$ |
| [`MajorityElement.java`](MajorityElement.java) | Boyer-Moore Voting Algorithm | LeetCode 169 | $O(N)$ | $O(1)$ |
| [`LongestConsecutiveSequence.java`](LongestConsecutiveSequence.java) | Sorting / Set-based sequence | LeetCode 128 | $O(N)$ | $O(N)$ |
| [`SubarraySumEqualsK.java`](SubarraySumEqualsK.java) | Prefix sum hash lookup | LeetCode 560 | $O(N)$ | $O(N)$ |
| [`SubarraySumsDivisibleByK.java`](SubarraySumsDivisibleByK.java) | Prefix sum with modulo arithmetic | LeetCode 974 | $O(N)$ | $O(\min(N, K))$ |
| [`ContinuousSubarraySum.java`](ContinuousSubarraySum.java) | Prefix sum remainder (subarray length >= 2) | LeetCode 523 | $O(N)$ | $O(\min(N, K))$ |
| [`ContiguousArray.java`](ContiguousArray.java) | 0 to -1 mapping + Prefix sum | LeetCode 525 | $O(N)$ | $O(N)$ |
| [`ProductOfArrayExceptSelf.java`](ProductOfArrayExceptSelf.java) | Prefix & Suffix products | LeetCode 238 | $O(N)$ | $O(1)$ aux |
| [`SetMatrixZeroes.java`](SetMatrixZeroes.java) | First row/column in-place marker | LeetCode 73 | $O(M \cdot N)$ | $O(1)$ |
| [`FindPeakElement.java`](FindPeakElement.java) | Binary Search on peak slope | LeetCode 162 | $O(\log N)$ | $O(1)$ |
| [`RotateArray.java`](RotateArray.java) | 3-step Array Reversal | LeetCode 189 | $O(N)$ | $O(1)$ |
| [`ReversePairs.java`](ReversePairs.java) | Modified Merge Sort inversion counting | LeetCode 493 | $O(N \log N)$ | $O(N)$ |
| [`FindPivotIndex.java`](FindPivotIndex.java) | Total Sum vs Left Sum comparison | LeetCode 724 | $O(N)$ | $O(1)$ |
| [`CarPooling.java`](CarPooling.java) | Difference Array / Timeline buckets | LeetCode 1094 | $O(N)$ | $O(1)$ |
| [`CorporateFlightBookings.java`](CorporateFlightBookings.java) | Difference Array + Running Prefix Sum | LeetCode 1109 | $O(N + M)$ | $O(1)$ aux |
| [`RearrangeArrayElementsBySign.java`](RearrangeArrayElementsBySign.java) | Two Pointers (Even/Odd index placement) | LeetCode 2149 | $O(N)$ | $O(N)$ |
| [`DistributeElements.java`](DistributeElements.java) | Two Arrays distribution simulation | LeetCode 3069 | $O(N)$ | $O(N)$ |
| [`MinMovesCleanClassroom.java`](MinMovesCleanClassroom.java) | Multi-state BFS + Bitmask energy tracking | LeetCode 3568 | $O(R \cdot C \cdot 2^L \cdot E)$ | $O(R \cdot C \cdot 2^L \cdot E)$ |
| [`EarliestTimeFinishTask.java`](EarliestTimeFinishTask.java) | Minimum task completion time | LeetCode 3683 | $O(N)$ | $O(1)$ |
| [`CountCommas.java`](CountCommas.java) | Comma separator calculation in range | LeetCode 3870 | $O(1)$ | $O(1)$ |
| [`ConstructUniformParityArrayI.java`](ConstructUniformParityArrayI.java) | Parity property verification | LeetCode 3875 | $O(N)$ | $O(1)$ |
| [`ConstructUniformParityArrayII.java`](ConstructUniformParityArrayII.java) | Parity transformation analysis | LeetCode 3876 | $O(N)$ | $O(1)$ |
| [`TargetSum1477.java`](TargetSum1477.java) | Non-overlapping subarrays target sum | LeetCode 1477 | $O(N)$ | $O(N)$ |
| [`RunningSum.java`](RunningSum.java) | 1D Prefix running sum | LeetCode 1480 | $O(N)$ | $O(1)$ |
| [`RangeSumQuery.java`](RangeSumQuery.java) | Prefix sum immutable query | LeetCode 303 | Query: $O(1)$ | $O(N)$ |
| [`SearchInsertPosition.java`](SearchInsertPosition.java) | Binary Search lower bound | LeetCode 35 | $O(\log N)$ | $O(1)$ |
| [`Sqrt.java`](Sqrt.java) | Binary search square root | LeetCode 69 | $O(\log X)$ | $O(1)$ |
| [`RotateImage.java`](RotateImage.java) | Transpose + reverse 90° rotation | LeetCode 48 | $O(N^2)$ | $O(1)$ |
| [`MoveZeroes.java`](MoveZeroes.java) | Two pointers in-place compaction | LeetCode 283 | $O(N)$ | $O(1)$ |
| [`RemoveDuplicates.java`](RemoveDuplicates.java) | In-place unique array compaction | LeetCode 26 | $O(N)$ | $O(1)$ |
| [`MissingNumber.java`](MissingNumber.java) | XOR / Arithmetic summation | LeetCode 268 | $O(N)$ | $O(1)$ |
| [`SingleNumber.java`](SingleNumber.java) | XOR bit manipulation | LeetCode 136 | $O(N)$ | $O(1)$ |
| [`MaxConsecutiveOnes.java`](MaxConsecutiveOnes.java) | Linear counter scan | LeetCode 485 | $O(N)$ | $O(1)$ |
| [`PalindromeNumber.java`](PalindromeNumber.java) | Integer reversal check | LeetCode 9 | $O(\log_{10} N)$ | $O(1)$ |
| [`PlusOne.java`](PlusOne.java) | Large integer increment | LeetCode 66 | $O(N)$ | $O(1)$ |
| [`PlusOneVariant.java`](PlusOneVariant.java) | Plus one implementation variant | Practice | $O(N)$ | $O(1)$ |
| [`Largest.java`](Largest.java) | Finding maximum element | Core DSA | $O(N)$ | $O(1)$ |
| [`SecondLargest.java`](SecondLargest.java) | Two-variable single-pass scan | Core DSA | $O(N)$ | $O(1)$ |
| [`ReverseArray.java`](ReverseArray.java) | Two-pointer array reversal | Core DSA | $O(N)$ | $O(1)$ |
| [`CheckSubarray.java`](CheckSubarray.java) | Subarray membership verification | Core DSA | $O(N)$ | $O(1)$ |
| [`CheckArraySortedAndRotated.java`](CheckArraySortedAndRotated.java) | Inversion count rotation check | LeetCode 1752 | $O(N)$ | $O(1)$ |
| [`SubsetsKOverlapping.java`](SubsetsKOverlapping.java) | Non-overlapping segment subsets | LeetCode 1621 | $O(N \cdot K)$ | $O(N \cdot K)$ |
| [`Question3903.java`](Question3903.java) | Smallest Stable Index I | LeetCode 3903 | $O(N)$ | $O(N)$ |
| [`Question3904.java`](Question3904.java) | Smallest Stable Index II | LeetCode 3904 | $O(N)$ | $O(N)$ |
| [`NextGreaterElement.java`](NextGreaterElement.java) | Next Greater Element I (Monotonic Stack) | LeetCode 496 | $O(N)$ | $O(N)$ |

---

## ▶️ How to Run

Compile and run any standalone array problem from the repository root:

```bash
# Compile
javac Arrays/TwoSum.java

# Run
java Arrays.TwoSum
```

---

**Author:** Yashika Garg
