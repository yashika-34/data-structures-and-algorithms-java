package Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 904: Fruit Into Baskets
 * URL: https://leetcode.com/problems/fruit-into-baskets/
 * Difficulty: Medium
 * 
 * Approach: Sliding Window with at most 2 distinct elements
 * Time Complexity: O(n)
 * Space Complexity: O(1) (at most 3 keys in HashMap)
 */
public class FruitIntoBaskets {

    public int totalFruit(int[] fruits) {
        if (fruits == null || fruits.length == 0) return 0;

        Map<Integer, Integer> basket = new HashMap<>();
        int left = 0;
        int maxFruits = 0;

        for (int right = 0; right < fruits.length; right++) {
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);

            while (basket.size() > 2) {
                basket.put(fruits[left], basket.get(fruits[left]) - 1);
                if (basket.get(fruits[left]) == 0) {
                    basket.remove(fruits[left]);
                }
                left++;
            }

            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }

    public static void main(String[] args) {
        FruitIntoBaskets solver = new FruitIntoBaskets();
        int[] fruits1 = {1, 2, 1};
        System.out.println("Max Fruits (Expected: 3): " + solver.totalFruit(fruits1));

        int[] fruits2 = {0, 1, 2, 2};
        System.out.println("Max Fruits (Expected: 3): " + solver.totalFruit(fruits2));

        int[] fruits3 = {1, 2, 3, 2, 2};
        System.out.println("Max Fruits (Expected: 4): " + solver.totalFruit(fruits3));
    }
}
