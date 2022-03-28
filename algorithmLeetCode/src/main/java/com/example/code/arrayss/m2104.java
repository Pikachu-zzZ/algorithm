package com.example.code.arrayss;

public class m2104 {

    public long subArrayRanges(int[] nums) {
        int len = nums.length;


        long ans = 0;

        for (int i = 0; i < len; i++) {
            int max = nums[i];
            int min = nums[i];
            for (int j = i; j < len; j++) {
                if(j == i){
                    continue;
                }else {
                    min = Math.min(min,nums[j]);
                    max = Math.max(max,nums[j]);
                }

                ans += (max - min);
            }
        }

        return ans;
    }
}
