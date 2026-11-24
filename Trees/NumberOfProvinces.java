package Trees;

/**
 * LeetCode 547: Number of Provinces
 * URL: https://leetcode.com/problems/number-of-provinces/
 * Difficulty: Medium
 * 
 * Approach: DFS on Adjacency Matrix
 * Time Complexity: O(n^2)
 * Space Complexity: O(n) for visited array
 */
public class NumberOfProvinces {

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                provinces++;
                dfs(isConnected, visited, i);
            }
        }

        return provinces;
    }

    private void dfs(int[][] isConnected, boolean[] visited, int city) {
        visited[city] = true;
        for (int nextCity = 0; nextCity < isConnected.length; nextCity++) {
            if (isConnected[city][nextCity] == 1 && !visited[nextCity]) {
                dfs(isConnected, visited, nextCity);
            }
        }
    }

    public static void main(String[] args) {
        NumberOfProvinces solver = new NumberOfProvinces();
        int[][] isConnected = {
            {1, 1, 0},
            {1, 1, 0},
            {0, 0, 1}
        };
        System.out.println("Number of Provinces (Expected: 2): " + solver.findCircleNum(isConnected));
    }
}
