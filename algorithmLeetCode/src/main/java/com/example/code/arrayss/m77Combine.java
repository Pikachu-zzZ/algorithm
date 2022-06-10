package com.example.code.arrayss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class m77Combine {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    HashMap<Integer, Boolean> visitedMap = new HashMap<>();
    public List<List<Integer>> combine(int n, int k) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i+1;
            visitedMap.put(nums[i], false);
        }

        dfs(nums,0,k);
//        System.out.println(res);
        return res;

    }
    public void dfs(int[] nums, int i,int len ){
        if(i==len){
            res.add(new ArrayList(list));
            return;
        }

        // 都可以做初始元素，并表示访问过了
        for(int x = 0;x<nums.length;x++){
            if(!visitedMap.get(nums[x])){
                if (list.size() ==0){
                    visitedMap.put(nums[x], true);
                    list.add(nums[x]);
                    dfs(nums,i+1,len);
                    list.remove(list.size()-1);
                    visitedMap.put(nums[x], false);
                }else if( nums[x] > list.get(list.size()-1)){
                    visitedMap.put(nums[x], true);
                    list.add(nums[x]);
                    dfs(nums,i+1,len);
                    list.remove(list.size()-1);
                    visitedMap.put(nums[x], false);
                }

            }

        }
    }

    public static void main(String[] args) {
        int n = 1, k = 1;
        List<List<Integer>> combine = new m77Combine().combine(n, k);
        System.out.println(combine);
    }
}
