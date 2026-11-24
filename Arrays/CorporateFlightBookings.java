package Arrays;

import java.util.Arrays;

/**
 * LeetCode 1109: Corporate Flight Bookings
 * URL: https://leetcode.com/problems/corporate-flight-bookings/
 * Difficulty: Medium
 * 
 * Approach: Difference Array with Running Sum
 * Time Complexity: O(n + m)
 * Space Complexity: O(1) auxiliary
 */
public class CorporateFlightBookings {

    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] result = new int[n];

        for (int[] booking : bookings) {
            int first = booking[0] - 1;
            int last = booking[1] - 1;
            int seats = booking[2];

            result[first] += seats;
            if (last + 1 < n) {
                result[last + 1] -= seats;
            }
        }

        for (int i = 1; i < n; i++) {
            result[i] += result[i - 1];
        }

        return result;
    }

    public static void main(String[] args) {
        CorporateFlightBookings solver = new CorporateFlightBookings();
        int[][] bookings = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        System.out.println("Bookings (Expected [10, 55, 45, 25, 25]): " + Arrays.toString(solver.corpFlightBookings(bookings, 5)));
    }
}
