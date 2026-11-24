package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * LeetCode 451: Sort Characters By Frequency
 * URL: https://leetcode.com/problems/sort-characters-by-frequency/
 * Difficulty: Medium
 * 
 * Approach: Frequency Map + Max Heap / Priority Queue
 * Time Complexity: O(n log k) where k is distinct chars
 * Space Complexity: O(n)
 */
public class SortCharactersByFrequency {

    public String frequencySort(String s) {
        if (s == null || s.length() <= 2) return s;

        Map<Character, Integer> counts = new HashMap<>();
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> counts.get(b) - counts.get(a));
        maxHeap.addAll(counts.keySet());

        StringBuilder sb = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char c = maxHeap.poll();
            int freq = counts.get(c);
            for (int i = 0; i < freq; i++) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        SortCharactersByFrequency solver = new SortCharactersByFrequency();
        System.out.println("Result (Expected: 'eert' or 'eetr'): " + solver.frequencySort("tree"));
        System.out.println("Result (Expected: 'cccaaa'): " + solver.frequencySort("cccaaa"));
    }
}
