package com.example.code.arrayss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class m46 {

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    HashMap<Integer, Boolean> visitedMap = new HashMap<>();
    public List<List<Integer>> permute(int[] nums) {

        for (int num : nums) {
            visitedMap.put(num, false);

        }
        int len = nums.length;
        // i 代表个数，len就是全部
        dfs(nums,0,len);
        return res;
    }

    public void dfs(int[] nums, int i,int len ){
        if(i==len){
            res.add(new ArrayList(list));
            return;
        }

        // 每一个都可以做初始元素，并表示访问过了
        for(int x = 0;x<len;x++){
            if(!visitedMap.get(nums[x])){
                visitedMap.put(nums[x], true);
                list.add(nums[x]);
                dfs(nums,i+1,len);
                list.remove(list.size()-1);
                visitedMap.put(nums[x], false);
            }

        }
    }
}
