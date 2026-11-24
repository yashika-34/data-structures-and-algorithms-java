package Arrays;

/**
 * LeetCode 1094: Car Pooling
 * URL: https://leetcode.com/problems/car-pooling/
 * Difficulty: Medium
 * 
 * Approach: Difference Array / Bucket Array
 * Time Complexity: O(n + max_stop)
 * Space Complexity: O(max_stop)
 */
public class CarPooling {

    public boolean carPooling(int[][] trips, int capacity) {
        int[] stops = new int[1001];

        for (int[] trip : trips) {
            int numPassengers = trip[0];
            int from = trip[1];
            int to = trip[2];

            stops[from] += numPassengers;
            stops[to] -= numPassengers;
        }

        int currentPassengers = 0;
        for (int p : stops) {
            currentPassengers += p;
            if (currentPassengers > capacity) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        CarPooling solver = new CarPooling();
        int[][] trips = {{2, 1, 5}, {3, 3, 7}};
        System.out.println("Can pool (capacity 4, Expected: false): " + solver.carPooling(trips, 4));
        System.out.println("Can pool (capacity 5, Expected: true): " + solver.carPooling(trips, 5));
    }
}
