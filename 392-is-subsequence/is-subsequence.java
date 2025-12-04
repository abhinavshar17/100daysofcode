class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=s.length()-1;
        int j=t.length()-1;
        return rect(s,t,i,j);
    }
    public boolean rect(String s,String t,int i,int j){
        if(i<0) return true;
        if(j<0) return false;
        if(s.charAt(i)==t.charAt(j))
        return rect(s,t,i-1,j-1);
        return rect(s,t,i,j-1);
    }
}