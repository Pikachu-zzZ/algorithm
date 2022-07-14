package com.example.code.arrayss;

import java.util.Arrays;

public class m324WiggleSort {
    public void wiggleSort(int[] nums) {
        int[] clone = nums.clone();
        Arrays.sort(clone);
        //两个指针
        // 核心在于指针为什么要这样设置，希望俩个数字尽可能的错开，这样避免差不多大小的数字在同一边
        int left = (nums.length - 1) / 2, right = nums.length - 1;
        //依次放置
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = clone[left];
                left--;
            } else {
                nums[i] = clone[right];
                right--;
            }
        }

    }
}
