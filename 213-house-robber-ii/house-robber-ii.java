class Solution {

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];

        int[] skipFirst = new int[n - 1];
        int[] skipLast  = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            skipFirst[i] = nums[i + 1]; // skip first
            skipLast[i]  = nums[i];     // skip last
        }

        int lookFirst = robLinear(skipFirst);
        int lookLast  = robLinear(skipLast);

        return Math.max(lookFirst, lookLast);
    }

    public int robLinear(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }
}
