package com.example.code.arrayss;

import javax.swing.*;
import java.util.Arrays;

public class m376WiggleMaxLength {
    // 求子序列的最长摆动，不要被题目里的差值数组麻痹了

    /**
     * up[i] 表示以前 i 个元素中的某一个为结尾的最长的「上升摆动序列」的长度。
     * down[i] 表示以前 i 个元素中的某一个为结尾的最长的「下降摆动序列」的长度。
     * @param nums
     * @return
     */
    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return n;
        }
        int[] up = new int[n];
        int[] down = new int[n];
        up[0] = down[0] = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                up[i] = Math.max(up[i - 1], down[i - 1] + 1);
                down[i] = down[i - 1];
            } else if (nums[i] < nums[i - 1]) {
                up[i] = up[i - 1];
                down[i] = Math.max(up[i - 1] + 1, down[i - 1]);
            } else {
                up[i] = up[i - 1];
                down[i] = down[i - 1];
            }
        }
        return Math.max(up[n - 1], down[n - 1]);

    }


    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,2,1,1,1,3,3,3,2,2,2};
        int res = new m376WiggleMaxLength().wiggleMaxLength(nums);
        System.out.println(res);
    }
}
