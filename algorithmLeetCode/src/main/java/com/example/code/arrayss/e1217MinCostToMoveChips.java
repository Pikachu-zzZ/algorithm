package com.example.code.arrayss;

import java.util.HashMap;
import java.util.Set;

public class e1217MinCostToMoveChips {
    public int minCostToMoveChips(int[] position) {
        int len = position.length;

        int odd = 0;
        int even = 0;

        for (int i = 0; i < len; i++) {
            if (position[i] %2 ==0){
                even += 1;
            }else {
                odd += 1;
            }
        }

        return Math.min(odd,even);
    }
}
