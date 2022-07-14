package com.example.code.binarySearch;

public class e704Search {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        // 如果l==r，那说明这个版本就是最后一个版本，就是我们想要的那个答案,直接使用<就可以
        // 二分查找最重要的就是写清楚<= 还是 <
        while(l<=r){
            int mid = l + (r-l) / 2;
            System.out.println(mid);
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        int search = new e704Search().search(new int[]{1, 2, 3, 4, 5}, 4);
    }
}
