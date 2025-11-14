class Solution {
    public int rob(int[] nums) {
        int prev = 0, curr = 0;
        
        for (int n : nums) {
            int temp = curr;
            curr = Math.max(curr,prev+n);
            prev = temp;
        }
        
        return curr;
    }
}
