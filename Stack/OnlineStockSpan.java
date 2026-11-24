package Stack;

import java.util.Stack;

/**
 * LeetCode 901: Online Stock Span
 * URL: https://leetcode.com/problems/online-stock-span/
 * Difficulty: Medium
 * 
 * Approach: Monotonic Decreasing Stack storing [price, span]
 * Time Complexity: O(1) amortized per call
 * Space Complexity: O(n)
 */
public class OnlineStockSpan {

    private Stack<int[]> stack;

    public OnlineStockSpan() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }
        stack.push(new int[]{price, span});
        return span;
    }

    public static void main(String[] args) {
        OnlineStockSpan stockSpanner = new OnlineStockSpan();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        System.out.print("Spans (Expected [1, 1, 1, 2, 1, 4, 6]): ");
        for (int p : prices) {
            System.out.print(stockSpanner.next(p) + " ");
        }
        System.out.println();
    }
}
