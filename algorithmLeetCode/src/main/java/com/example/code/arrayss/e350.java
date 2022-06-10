package com.example.code.arrayss;

import java.util.ArrayList;
import java.util.Arrays;

public class e350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        while(i<len1 && j<len2){
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }else if (nums1[i] > nums2[j]){
                j++;
            }else {
                i++;
            }
        }

        int len = list.size();
        int[] res = new int[len];
        int idx = 0;
        for (int x: list
             ) {
            res[idx++] = x;
        }


        return res;
    }
}
