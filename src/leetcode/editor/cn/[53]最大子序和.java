//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。 
//
// 示例: 
//
// 输入: [-2,1,-3,4,-1,2,1,-5,4],
//输出: 6
//解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
// 
//
// 进阶: 
//
// 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。 
// Related Topics 数组 分治算法 动态规划



//leetcode submit region begin(Prohibit modification and deletion)
class Solution53 {
    public int maxSubArray(int[] nums) {
        /**
         * 贪心算法
        if (nums == null) return 0;
        int curSum = nums[0], maxSum = nums[0];
        for (int idx = 1; idx < nums.length; idx++ ) {
            //因为是连续子序和，若前面的值对当前值有副作用，则砍掉

            curSum = Math.max(curSum + nums[idx], curSum);
            curSum = Math.max(curSum , maxSum);
        }
        return maxSum;
         */

        /**
         * 动态规划
         */
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i- 1] + nums[i], nums[i]);
            if (max < dp[i]) {
                max = dp[i];
            }
        }
        return max;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
