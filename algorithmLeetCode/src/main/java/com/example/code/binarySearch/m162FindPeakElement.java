package com.example.code.binarySearch;

public class m162FindPeakElement {
    // 这题存在多个峰值，只需要返回其中的一个就可以了，
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        while(l < r){
            int mid = l + (r - l) / 2;
            if(nums[mid] > nums[mid+1]){
                r = mid;
            }else {
                l = mid +1;
            }
        }

        return l;
    }
}
