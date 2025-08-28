class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
      //yeh pointers bane hai for interation:
      int i=0;
      int j=0;
      while(i<g.length && j<s.length){
        if(g[i]<=s[j]){
            i++;
        }
        j++;
      }
      return i;
    }
}