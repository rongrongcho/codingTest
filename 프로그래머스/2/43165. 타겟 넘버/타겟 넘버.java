class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }

    private int dfs(int[] nums, int target, int dep, int sum) {
        if (dep == nums.length) {
            if (sum == target) {
                return 1; 
            } else {
                return 0; 
            }
        }

        return dfs(nums, target, dep + 1, sum + nums[dep])
                + dfs(nums, target, dep + 1, sum - nums[dep]);
    }
}
