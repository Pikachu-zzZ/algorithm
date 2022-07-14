package com.example.code.binarySearch;

public class m33Search {
    public int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) {
            return -1;
        }
        if (n == 1) {
            return nums[0] == target ? 0 : -1;
        }

        // 这题要确定二分查找的位置，左半边还是右半边, 就是要确定有序的数组位置
        // 根据 nums[0] 与 mid 的关系判断左边有序还是右边有序
        int l = 0;
        int r = nums.length-1;
        int res = -1;
        while(l<=r){
            int mid = l + (r-l) / 2;
            // 终止条件是 mid下标==target，但是其他情况不能用mid下标和target比较，
            // 比如target是最小值，mid下标一定会比target大，就不能确定在哪一边， nums[mid] > target就是错的
            // 因此要先判断有序范围的所属位置，如果mid下标比nums[0] 大，那就在前半段是有序的，比nums[0] 小，那就在后半段
            // 确定好，前半段，再去确定l，r应该如何移动
            if(nums[mid] == target){
                res = mid;
                return res;
            }else if(nums[mid] >= nums[0]){
                // 前半段有序
                if(nums[mid] >= target && target >= nums[0]){
                    r = mid - 1;
                }else {
                    l = mid + 1;
                }
                // 后半段有序
            }else {
                if(nums[mid] <= target && target <= nums[n-1]){
                    l = mid + 1;
                }else{
                    r = mid - 1;
                }
            }
        }

        return res;

    }
}
