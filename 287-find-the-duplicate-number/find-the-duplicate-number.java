class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] flag = new boolean[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            int e = nums[i];
            if (flag[e]) {
                return e;
            } else {
                flag[e] = true; 
            }
        }

        return -1;
    }
}
