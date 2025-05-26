public class Solution {
    public int largestPathValue(String colors, int[][] edges) {
        int n = colors.length();
        List<List<Integer>> graph = new ArrayList<>();
        int[] inDegree = new int[n];
        
        // Initialize the graph
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Build the graph and calculate in-degrees
        for (int[] edge : edges) {
            int from = edge[0], to = edge[1];
            graph.get(from).add(to);
            inDegree[to]++;
        }

        // Queue for BFS (Topological Sort)
        Queue<Integer> queue = new LinkedList<>();
        // 26 possible colors (a-z), dp[i][c] = max count of color c to reach node i
        int[][] dp = new int[n][26];

        // Add all nodes with in-degree 0
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        int processed = 0;
        int maxColorValue = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            processed++;
            int colorIndex = colors.charAt(node) - 'a';
            dp[node][colorIndex]++;
            maxColorValue = Math.max(maxColorValue, dp[node][colorIndex]);

            for (int neighbor : graph.get(node)) {
                // Update the dp table for the neighbor
                for (int c = 0; c < 26; c++) {
                    dp[neighbor][c] = Math.max(dp[neighbor][c], dp[node][c]);
                }

                // Decrease in-degree and add to queue if it becomes 0
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        
        return processed == n ? maxColorValue : -1;
    }
 
    }