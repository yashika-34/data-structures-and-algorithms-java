# 🔤 Strings DSA in Java

This folder contains my solutions and practice problems on **String Manipulations, Parsing, and Matching** using Java.

---

## 📌 Core Concepts & Techniques

1. **Character Frequency Arrays (Hashing):**
   - Using fixed-size 26-element integer arrays (`int[26]`) for efficient $O(1)$ auxiliary space anagram and frequency validation (`ValidAnagrams.java`, `FirstUniqueCharacterInAString.java`).
2. **Two Pointers & Palindrome Verification:**
   - Converging pointers validating alphanumeric characters while skipping punctuation (`ValidPalindrome.java`).
3. **Sliding Window with Hash Maps:**
   - Dynamic window tracking substring characters without duplicates in optimal $O(N)$ time (`LongestSubstringWithoutRepeatingCharacters.java`).
4. **String Parsing & State Machines:**
   - Robust parsing handling leading whitespaces, sign extraction (`+`/`-`), integer overflow checking against `Integer.MAX_VALUE` and `Integer.MIN_VALUE` (`StringToAtoi.java`).
5. **Sub-string Search & Pattern Matching:**
   - Searching for needle occurrences within a haystack string (`FindIndex.java`).

---

## 📂 Problem Index (13 Solutions)

| File | Problem Description | LeetCode | Time Complexity | Space Complexity |
|---|---|:---:|:---:|:---:|
| [`ValidAnagrams.java`](ValidAnagrams.java) | Valid Anagram using 26-char frequency counting | LeetCode 242 | $O(N)$ | $O(1)$ |
| [`ValidPalindrome.java`](ValidPalindrome.java) | Valid Palindrome using two-pointer verification | LeetCode 125 | $O(N)$ | $O(1)$ |
| [`ReverseString.java`](ReverseString.java) | Reverse String (Two Pointers in-place) | LeetCode 344 | $O(N)$ | $O(1)$ |
| [`ReverseWords.java`](ReverseWords.java) | Reverse Words in a String | LeetCode 151 | $O(N)$ | $O(N)$ |
| [`ReverseInteger.java`](ReverseInteger.java) | Reverse Integer with overflow handling | LeetCode 7 | $O(\log_{10} X)$ | $O(1)$ |
| [`FirstUniqueCharacterInAString.java`](FirstUniqueCharacterInAString.java) | First Unique Character in a String via frequency array | LeetCode 387 | $O(N)$ | $O(1)$ |
| [`LongestSubstringWithoutRepeatingCharacters.java`](LongestSubstringWithoutRepeatingCharacters.java) | Longest Substring Without Repeating Characters (Sliding Window) | LeetCode 3 | $O(N)$ | $O(\min(N, M))$ |
| [`LongestRepeatingCharacterReplacement.java`](LongestRepeatingCharacterReplacement.java) | Longest Repeating Character Replacement (Sliding Window) | LeetCode 424 | $O(N)$ | $O(1)$ |
| [`SortCharactersByFrequency.java`](SortCharactersByFrequency.java) | Sort Characters By Frequency (Max Heap / Bucket) | LeetCode 451 | $O(N \log K)$ | $O(N)$ |
| [`ShiftingLetters.java`](ShiftingLetters.java) | Shifting Letters via Suffix Sum | LeetCode 848 | $O(N)$ | $O(N)$ |
| [`StringToAtoi.java`](StringToAtoi.java) | String to Integer (`atoi`) with overflow clamping | LeetCode 8 | $O(N)$ | $O(1)$ |
| [`FindIndex.java`](FindIndex.java) | Find the Index of the First Occurrence in a String (`strStr`) | LeetCode 28 | $O(N \cdot M)$ | $O(1)$ |
| [`MaxPalindromes.java`](MaxPalindromes.java) | Maximum Number of Non-overlapping Palindrome Substrings | LeetCode 2472 | $O(N \cdot K)$ | $O(1)$ |

---

## ▶️ How to Run

Compile and run any string solution from the repository root:

```bash
# Compile
javac Strings/ValidAnagrams.java

# Run
java Strings.ValidAnagrams
```

---

**Author:** Yashika Garg
