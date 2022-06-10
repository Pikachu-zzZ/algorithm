package com.example.code.arrayss;

import java.util.HashMap;

public class h1681 {
    public int minimumIncompatibility(int[] nums, int k) {
        int len = nums.length;
        int capacity = len / k;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if(map.containsKey(nums[i])){
                int count = map.get(nums[i]);
                if(count+1 > k){
                    return -1;
                }
                map.put(nums[i],count+1);
            }else {
                map.put(nums[i],1);
            }
        }


        return 0;

    }
}
