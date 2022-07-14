package com.example.code.binarySearch;

public class m34SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int leftIdx = searchLeft(nums,target);
        int rightIdx = searchRight(nums,target);
        if (leftIdx <= rightIdx && rightIdx < nums.length && nums[leftIdx] == target && nums[rightIdx] == target) {
            return new int[]{leftIdx, rightIdx};
        }
        return new int[]{-1, -1};

    }

    public int searchLeft(int[] nums, int target){
        int l = 0;
        int r = nums.length - 1;

        while (l < r){
            int mid = l + (r-l) /2;
            if(nums[mid] == target){

                r = mid;
            }else if(nums[mid] > target){
                r = mid -1;
            }else if(nums[mid] < target){
                l = mid +1;
            }
        }

        return l;
    }

    public int searchRight(int[] nums, int target){
        int l = 0;
        int r = nums.length - 1;
        while (l < r){
            int mid = l + (r-l+1) /2;
            if(nums[mid] == target){
                l = mid;
            }else if(nums[mid] > target){
                r = mid -1;
            }else if(nums[mid] < target){
                l = mid +1;
            }
        }

        return l;
    }


}
