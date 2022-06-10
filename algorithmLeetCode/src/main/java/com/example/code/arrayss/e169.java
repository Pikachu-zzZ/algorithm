package com.example.code.arrayss;

import java.util.ArrayList;
import java.util.Arrays;

public class e169 {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);
        return nums[nums.length /2 ];
    }
    // 投票法
    public int majorityElement1(int[] nums) {
        int ret = 0;
        int counter = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (counter == 0) {
                ret = nums[i];
                counter = 1;
            } else if (nums[i] == ret) {
                counter++;
            } else {
                counter--;
            }
        }
        return ret;
    }
}
