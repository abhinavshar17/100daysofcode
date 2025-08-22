class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()==t.length()){
            char[] stochararray=s.toCharArray();
            char[] ttochararray=t.toCharArray();
            Arrays.sort(stochararray);
            Arrays.sort(ttochararray);
            boolean result=Arrays.equals(stochararray,ttochararray);
           if(result){
            return true;
           }
        }
        return false;
    }
}