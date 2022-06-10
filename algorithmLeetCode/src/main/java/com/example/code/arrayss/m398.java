package com.example.code.arrayss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class m398 {

    HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();


    public m398(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int x = nums[i];
            ArrayList<Integer> list;
            if(!map.containsKey(x)){
                list = new ArrayList<>();
            }else {
                list = map.get(x);
            }
            list.add(i);
            map.put(x,list);
        }
    }

    public int pick(int target) {
        ArrayList<Integer> list = map.get(target);
        int len = list.size();
        Random random = new Random();
        int i = random.nextInt(len);
        return list.get(i);

    }
}
