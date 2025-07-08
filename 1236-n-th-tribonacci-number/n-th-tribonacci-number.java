class Solution {
    public int tribonacci(int n) {
        
        if(n==0) return 0;
       else if(n==1 || n==2) return 1;
       else{
        int f=0;
        int s=1;
        int t=1;
        for(int i=1;i<=n;i++){
            int fo=f+s+t;
            f=s;
            s=t;
            t=fo;
        }
         return f;
       }
      
    }
}