package com.example.code.arrayss;

public class e136 {
    // 双重for 循环遍历
    public int singleNumber1(int[] nums) {
        int len = nums.length;
        int result = 0;
        if(len == 1){
            result = nums[0];
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if(i == j){
                    continue;
                }else if(i == len -1){
                    result = nums[i];
                    i = len;
                    break;
                }
                else if(nums[i] == nums[j]){
                    j = len;
                    continue;
                }else if(nums[i] != nums[j] && j == len-1){
                    result = nums[i];
                    i = len;
                    break;
                }
            }
        }
        return result;
    }


    //位运算


}
