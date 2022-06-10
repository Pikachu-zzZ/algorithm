package com.example.code.arrayss;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class m78 {

    List<List<Integer>> res = new ArrayList<>();        // 存储返回结果
    ArrayList<Integer> track = new ArrayList<>();     // 存储单次遍历的结果

    public List<List<Integer>> subsets(int[] nums) {
        int len = nums.length;
        for(int i = 0;i<=len ;i++){
            dfs(nums, 0,i);
        }
        return res;
    }

    // 递归函数,len是限制条件，因为我们要不同长度的排列
    public void dfs(int[] nums, int start,int len ) {
        // base case 其实不需要加
        if (start > nums.length) {
            return;
        }
        if(start == len){
            res.add(new ArrayList<>(track));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            // 做选择
            track.add(nums[i]);
            // 递归
            dfs(nums, i + 1,len);
            // 撤销选择
            track.remove(track.size()-1);
        }
    }


    public static void main(String[] args) {
        List<List<Integer>> subsets = new m78().subsets(new int[]{1, 2, 3});
        System.out.println(subsets);
    }

}
