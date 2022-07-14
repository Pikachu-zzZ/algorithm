package com.example.code.slidingWindow;

public class m209MinSubArrayLen {
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int l = 0;
        int r = 0;
        int res = Integer.MAX_VALUE;
        int sum = 0;
        while (r<len){
            sum += nums[r];

            while(sum >=target){
                res = Math.min(res, r - l + 1);
                sum -= nums[l];
                l++;
            }

            r++;
        }

        return res== Integer.MAX_VALUE?0:res;
    }


    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        int res = new m209MinSubArrayLen().minSubArrayLen(target, nums);
        System.out.println(res);
    }
}
