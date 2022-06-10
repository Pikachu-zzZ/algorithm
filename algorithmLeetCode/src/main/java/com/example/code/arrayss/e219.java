package com.example.code.arrayss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class e219 {
    // hashmap 实现
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            ArrayList<Integer> list = map.getOrDefault(nums[i], new ArrayList<>());
            list.add(i);
            map.put(nums[i],list);
        }


        Set<Integer> set = map.keySet();
        for (int x: set
             ) {
            ArrayList<Integer> list = map.get(x);
            if(list.size() >1){
                for (int i = 0; i < list.size() -1; i++) {
                    for (int j = i+1; j < list.size(); j++) {
                        if(Math.abs(list.get(i) - list.get(j)) <=k){
                            return true;
                        }
                    }
                }
            }

        }


        return false;

    }
}
