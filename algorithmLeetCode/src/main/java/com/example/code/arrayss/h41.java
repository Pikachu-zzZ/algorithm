package com.example.code.arrayss;

public class h41 {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        for(int i =0;i<len;i++){
            if(nums[i] <=0){
                nums[i] = Integer.MAX_VALUE;
            }
        }

        for(int i:nums){
            int n=Math.abs(i);
            if(n<=len&&nums[n-1]>0) nums[n-1]*=-1;
        }


        for (int i = 0; i < len; i++) {
            if(nums[i] >=0){
                return i+1;
            }
        }


        return len+1;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,0};
        int i = new h41().firstMissingPositive(nums);
        System.out.println(i);
    }
}
