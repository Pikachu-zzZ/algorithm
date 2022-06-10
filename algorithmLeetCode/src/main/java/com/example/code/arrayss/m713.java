package com.example.code.arrayss;

import java.util.ArrayList;
import java.util.HashSet;

public class m713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if (k == 0){
            return 0;
        }
        ArrayList<ArrayList<Integer>> set = new ArrayList<>();
        // 滑动窗口：寻找以每个 right 指针为右边界的有效连续子树组的个数，（j-i）+1
        // 5,22,6 以6为结尾的子数组为6，226，5226，三种
        int len = nums.length;
        int left = 0;
        int right = 0;
        int sum = 1;
        int res = 0;
        while (right <len){
            sum = sum * nums[right++];
            // 必须用while判断，用if的话只会删除一个，但删除这一个后还可能比k大，所以就会有错误
            while (sum >= k && left<right){
                sum = sum / nums[left++];
            }
            // 这边没有加1 是因为上面的right++ 已经加了1；
            res += (right - left);
        }


        return res;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{10,5,2,6};
        int k = 100;
        int i = new m713().numSubarrayProductLessThanK(nums, k);
        System.out.println(i);
    }
}
