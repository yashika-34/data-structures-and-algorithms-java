package Arrays;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

/**
 * LeetCode 3568: Minimum Moves to Clean the Classroom
 * URL: https://leetcode.com/problems/minimum-moves-to-clean-the-classroom/
 * Difficulty: Medium
 * 
 * Approach: Multi-state BFS tracking (row, col, litterMask, energy)
 * Time Complexity: O(R * C * 2^L * E)
 * Space Complexity: O(R * C * 2^L * E)
 */
public class MinMovesCleanClassroom {

    public int minMoves(char[][] grid, int initialEnergy) {
        int m = grid.length;
        int n = grid[0].length;
        int startR = -1, startC = -1;

        List<int[]> litters = new ArrayList<>();
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == 'S') {
                    startR = r;
                    startC = c;
                } else if (grid[r][c] == 'L') {
                    litters.add(new int[]{r, c});
                }
            }
        }

        int numLitter = litters.size();
        int targetMask = (1 << numLitter) - 1;

        int[][][][] dist = new int[m][n][1 << numLitter][initialEnergy + 1];
        for (int[][][] d1 : dist) {
            for (int[][] d2 : d1) {
                for (int[] d3 : d2) {
                    Arrays.fill(d3, -1);
                }
            }
        }

        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{startR, startC, 0, initialEnergy});
        dist[startR][startC][0][initialEnergy] = 0;

        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0], c = curr[1], mask = curr[2], energy = curr[3];
            int d = dist[r][c][mask][energy];

            if (mask == targetMask) {
                return d;
            }

            if (energy == 0) continue;

            for (int[] dir : dirs) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                if (nr < 0 || nr >= m || nc < 0 || nc >= n || grid[nr][nc] == 'X') {
                    continue;
                }

                int nMask = mask;
                for (int i = 0; i < numLitter; i++) {
                    if (litters.get(i)[0] == nr && litters.get(i)[1] == nc) {
                        nMask |= (1 << i);
                    }
                }

                int nEnergy = (grid[nr][nc] == 'R') ? initialEnergy : energy - 1;

                if (dist[nr][nc][nMask][nEnergy] == -1) {
                    dist[nr][nc][nMask][nEnergy] = d + 1;
                    queue.add(new int[]{nr, nc, nMask, nEnergy});
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        MinMovesCleanClassroom solver = new MinMovesCleanClassroom();
        char[][] grid = {
            {'S', '.', 'L'},
            {'.', 'X', '.'},
            {'R', '.', '.'}
        };
        System.out.println("Min moves to clean: " + solver.minMoves(grid, 5));
    }
}
