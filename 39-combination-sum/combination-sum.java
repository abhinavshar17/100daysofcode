import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

void backtrack(int[] nums, int target, int start, List<Integer> temp, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (nums[i] <= target) {
                temp.add(nums[i]);
                backtrack(nums, target - nums[i], i, temp, ans); // can reuse same element
                temp.remove(temp.size() - 1); // backtrack
            }
        }
    }
}
