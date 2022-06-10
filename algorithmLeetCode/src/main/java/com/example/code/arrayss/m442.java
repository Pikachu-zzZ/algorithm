package com.example.code.arrayss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class m442 {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x: nums
             ) {
            Integer temp = map.getOrDefault(x, 0);
            temp++;
            map.put(x,temp);
        }


        Set<Integer> set = map.keySet();
        for (int x: set
             ) {
            if(map.get(x) == 2){
                list.add(x);
            }
        }


        return list;
    }


    //从起始位置进行遍历，每次将下标为 nums[i] - 1nums[i]−1 的数字取反；
    //当遍历到值 nums[i]nums[i] 为负数，需要忽略其负号。
    //若发现下标为 nums[i] - 1nums[i]−1 的数字已经是负数，说明之前出现过同样的数字 nums[i]nums[i]，即找到了重复数字；

}
