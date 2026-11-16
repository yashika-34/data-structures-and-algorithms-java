
import java.util.*;

class Solution {
    public String findOrder(String[] words) {

        int n = words.length;

        // Step 1: Create adjacency list
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            adj.add(new ArrayList<>());
        }

        int[] indegree = new int[26];
        boolean[] present = new boolean[26];

        // Step 2: Mark characters present in words
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                present[ch - 'a'] = true;
            }
        }

        // Step 3: Find ordering between adjacent words
        for (int i = 0; i < n - 1; i++) {

            String s1 = words[i];
            String s2 = words[i + 1];

            int len = Math.min(s1.length(), s2.length());

            boolean found = false;

            for (int j = 0; j < len; j++) {

                if (s1.charAt(j) != s2.charAt(j)) {

                    int u = s1.charAt(j) - 'a';
                    int v = s2.charAt(j) - 'a';

                    adj.get(u).add(v);
                    indegree[v]++;

                    found = true;
                    break;
                }
            }

            // Invalid prefix case
            if (!found && s1.length() > s2.length()) {
                return "";
            }
        }

        // Step 4: Add all zero-indegree characters to queue
        Queue<Integer> q = new LinkedList<>();

        int totalChars = 0;

        for (int i = 0; i < 26; i++) {
            if (present[i]) {
                totalChars++;

                if (indegree[i] == 0) {
                    q.add(i);
                }
            }
        }

        // Step 5: Perform Kahn's Algorithm
        StringBuilder ans = new StringBuilder();

        while (!q.isEmpty()) {

            int node = q.poll();

            ans.append((char) (node + 'a'));

            for (int neighbour : adj.get(node)) {

                indegree[neighbour]--;

                if (indegree[neighbour] == 0) {
                    q.add(neighbour);
                }
            }
        }

        // Step 6: Detect cycle
        if (ans.length() != totalChars) {
            return "";
        }

        return ans.toString();
    }
}
