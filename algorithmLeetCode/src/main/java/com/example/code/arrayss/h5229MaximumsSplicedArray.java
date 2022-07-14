package com.example.code.arrayss;

import java.util.Arrays;

public class h5229MaximumsSplicedArray {


    // 贪心的固定俩个中较大的数组是错误的，有可能俩个数组接近，导致小数组加上插值变大的情况，因此要俩边各自计算
    // 转换成最大子段和
    public int maximumsSplicedArray(int[] nums1, int[] nums2) {
        return Math.max(count(nums1,nums2),count(nums2,nums1));

    }

    public int count(int[] nums1, int[] nums2){
        int sum1 = 0;
        int sum2 = 0;
        int n = nums1.length;
        for (int i = 0; i < n; i++) {
            sum1 += nums1[i];
            sum2 += nums2[i];
        }
        // 固定一个数组，球俩个数组之间的差值，求差值数组最大能够提供的值，在计算最终能够获得的大小
        int[] diff = new int[n];
        for (int i = 0; i < n; i++) {
            diff[i] = nums2[i] - nums1[i];
        }
        int gap = maxSubArray(diff);

        return Math.max(sum1 + gap,sum1);
    }


    // 最大子数组和
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





    public static void main(String[] args) {
        int[] nums1 = {28,34,38,14,30,31,23,7,28,3};
        int[] nums2 = {42,35,7,6,24,30,14,21,20,34};
        int res =  new h5229MaximumsSplicedArray().maximumsSplicedArray(nums1, nums2);
        System.out.println(res);
    }
}
