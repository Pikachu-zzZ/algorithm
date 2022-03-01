package com.example.code.arrayss;

import java.util.Arrays;

public class e27 {


    // 双指针，找到前一个等于val的下标，后一个不等于val的下标，进行交换
    public int removeElement1(int[] nums, int val) {
        int len = nums.length;
        int first = 0;
        int second = len;
        while (first < second) {
            while (first < second && nums[second - 1] == val) second--;
            while (first < second && nums[first] != val) first++;
            if (first < second) {
                nums[first] = nums[second - 1];
                nums[second-1] = val;
                first++;
                second--;
            }

        }

        return first;
    }


    // 双指针，只找到前一个等于val的下标，交换后移动后一个下标，直到该位置不等于val
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            if (nums[left] == val) {
                nums[left] = nums[right - 1];
                right--;
            } else {
                left++;
            }
        }
        return left;
    }


}
