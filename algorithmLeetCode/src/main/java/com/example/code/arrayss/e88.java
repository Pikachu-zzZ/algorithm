package com.example.code.arrayss;

import java.util.Arrays;

public class e88 {

    // 从前往后遍历
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(n == 0){
            return;
        }
        // 新建一个数组
        int[] nums = new int[nums1.length];
        // 从头遍历两个数组，比较小的那个存入,i++,j++受条件制约
        System.out.println(nums1.length);
        int i = 0;
        int j = 0;
        int idx = 0;

        while (i< m && j < n) {
            if (nums1[i] <= nums2[j]) {
                if (i < m) {
                    nums[idx] = nums1[i];
                    i++;
                    idx++;
                } else {
                    nums[idx] = nums2[j];
                    j++;
                    idx++;
                }
            } else {
                nums[idx] = nums2[j];
                j++;
                idx++;
            }
        }

        if(i == m){
            for(int x = idx;x<m+n;x++){
                nums[x] = nums2[j];
                j++;
            }
        }else{
            for(int x = idx;x<m+n;x++){
                nums[x] = nums1[i];
                i++;
            }
        }



        // nums数组转换成nums1数组
        for (int k = 0; k < nums1.length; k++) {
            nums1[k] = nums[k];
        }

        System.out.println(Arrays.toString(nums1));
    }
}
