package Arrays;

/**
 * LeetCode 3683: Earliest Time to Finish One Task
 * URL: https://leetcode.com/problems/earliest-time-to-finish-one-task/
 * Difficulty: Medium
 * 
 * Approach: Single pass minimum of start_time + duration
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class EarliestTimeFinishTask {

    public int earliestTime(int[][] tasks) {
        int minEndTime = Integer.MAX_VALUE;
        for (int[] task : tasks) {
            int start = task[0];
            int duration = task[1];
            minEndTime = Math.min(minEndTime, start + duration);
        }
        return minEndTime;
    }

    public static void main(String[] args) {
        EarliestTimeFinishTask solver = new EarliestTimeFinishTask();
        int[][] tasks = {{1, 4}, {2, 2}, {3, 5}};
        System.out.println("Earliest completion time (Expected: 4): " + solver.earliestTime(tasks));
    }
}
