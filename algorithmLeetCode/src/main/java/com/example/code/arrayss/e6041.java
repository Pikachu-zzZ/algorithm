package com.example.code.arrayss;

import java.util.*;

public class e6041 {
    public List<Integer> intersection(int[][] nums) {

        List<Integer> res = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int[] temp = nums[i];
//            int tempLen = nums[i].length;
            for (int x: temp
                 ) {
                if(map.containsKey(x)){
                    int count = map.get(x);
                    map.put(x,++count);
                }else {
                    map.put(x,1);
                }
            }
        }

        Set<Integer> set = map.keySet();
        for (int x:set
             ) {
            if(map.get(x) == len){
                res.add(x);
            }
        }
        Collections.sort(res);
        return res;

    }
}
