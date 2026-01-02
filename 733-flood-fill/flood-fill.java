class Solution {
    int rows; //total rows
    int cols; //total colums;

    void dfs(int row,int col,int color,int currColor,boolean visited[][],
    int[][] image){

        //out of bound: ya toh 0 ne kam ho jae rows ya fer total number of rows ya colums se jyada ho jae
        if(row<0 || row>=rows || col<0 || col>=cols){
            return;
        }
        if(image[row][col]!=currColor){
            return;
        }
        if(visited[row][col]){
            return;
        }
        image[row][col]=color;
        visited[row][col]=true;

        //neighbours
        int adjList[][]={{row,col-1},{row,col+1},{row+1,col},{row-1,col}};
        for(int neighbour[]:adjList){
            dfs(neighbour[0],neighbour[1],color,currColor,visited,image);
        }
        

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        rows=image.length;
        cols=image[0].length; 
        boolean [][]visited=new boolean[rows][cols];
         dfs(sr,sc,color,image[sr][sc],visited,image);
         return image;
           }
}