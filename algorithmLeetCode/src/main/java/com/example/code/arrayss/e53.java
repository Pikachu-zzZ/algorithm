package com.example.code.arrayss;

public class e53 {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int res = nums[0];
        int[] dp = new int[len];
        dp[0] = nums[0];
        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(nums[i],nums[i] + dp[i-1]);
            res = Math.max(dp[i],res);
        }

        return res;
    }
}
