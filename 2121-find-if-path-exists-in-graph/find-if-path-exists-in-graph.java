class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean visited[]=new boolean[n];
        return dfs(graph,source,destination,visited);
    }
     public boolean dfs(ArrayList<ArrayList<Integer>> graph,int source,int destination,boolean visited[]){
        if(source==destination)return true;
        visited[source]=true;
        for(int neighbour: graph.get(source)){
            if(!visited[neighbour]){
                    boolean abc=dfs(graph,neighbour,destination,visited);
                        if(abc==true) return true;
                    
            }
        }
        return false;
     }
}