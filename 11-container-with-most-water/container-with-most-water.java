class Solution {
    public int maxArea(int[] height) {
        int answer = 0;
       int lp=0;
       int rp=height.length-1;
       while(lp<rp){
                int width = rp-lp;
                int h = Math.min(height[lp], height[rp]);
                int current = width * h;
                answer = Math.max(answer, current);

                if(height[lp]<height[rp]){
                    lp++;
                }
                else{
                    rp--;
                }
            
        }
        return answer;
    }
}
