class Solution {

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // Build graph
        ArrayList<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }

        boolean[] visited = new boolean[n];
        return dfs(source, destination, graph, visited);
    }

    private boolean dfs(int src, int dest, ArrayList<Integer>[] graph, boolean[] visited) {
        if (src == dest) return true;

        visited[src] = true;

        for (int nei : graph[src]) {
            if (!visited[nei]) {
                if (dfs(nei, dest, graph, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}
