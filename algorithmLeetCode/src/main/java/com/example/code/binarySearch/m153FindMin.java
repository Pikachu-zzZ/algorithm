package com.example.code.binarySearch;

public class m153FindMin {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = nums.length-1;
        while (l<r){
            int mid = (r-l) /2 +l;
            // 因为最小值肯定小于或者等于最后一位，所以我们和最后一位进行比较
            if(nums[mid] <= nums[n-1]){
                r = mid;
            }else {
                l = mid +1;
            }
        }

        return l;
    }
}
