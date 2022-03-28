package com.example.code.bitOperation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class m137 {
    // n & n = n, n & 0 = 0
    // n ^ n = 0, n ^ 0 = n
    // 不对，做不出来
    public int singleNumber1(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if((i & 1) == 0){
                res = res ^ nums[i];
            }else {
                res = res & nums[i];
            }
        }

        return res;
    }


    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (int x : map.keySet()) {
            if (map.get(x) == 1) return x;
        }
        return -1;
    }


}
