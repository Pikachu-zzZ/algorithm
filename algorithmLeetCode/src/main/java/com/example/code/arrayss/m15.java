package com.example.code.arrayss;

import java.util.*;

public class m15 {

    // 暴力，超出时间限制
    public List<List<Integer>> threeSum1(int[] nums) {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        int len = nums.length;
        if(len <3){
            return lists;
        }


        for (int i = 0; i < len-2; i++) {
            for (int j = i+1; j < len-1; j++) {
                for (int k = j+1; k < len; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0){
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                }
            }
        }

        lists.addAll(set);


        return lists;
    }



    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> lists = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        int len = nums.length;
        if(len <3){
            return lists;
        }

        // 固定第一个数
        for (int i = 0; i < len-2; i++) {

            // 若第一个数已经选取，则跳过
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            //双指针

            int left = i+1;
            int right = len-1;

            while(left < right){
                 if(nums[left] + nums[right] + nums[i]> 0){
                     right--;
                 }else if (nums[left] + nums[right] + nums[i] < 0){
                     left++;
                 }else {
                     ArrayList<Integer> list = new ArrayList<>();
                     list.add(nums[i]);
                     list.add(nums[left]);
                     list.add(nums[right]);
                     lists.add(list);
                     left++;
                     right--;
                     // 去重：第二个数和第三个数也不重复选取
                     // 例如：[-4,1,1,1,2,3,3,3], i=0, left=1, right=5
                     while (left < right && nums[left] == nums[left-1])  left++;
                     while (left < right && nums[right] == nums[right+1])    right--;
                 }
            }

        }
        return lists;
    }
}
