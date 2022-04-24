package com.example.code.arrayss;

import java.util.HashMap;
import java.util.Set;

public class m6071 {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x: tasks){
            if(map.containsKey(x)){
                int count = map.get(x);
                map.put(x,++count);
            }else{
                map.put(x,1);
            }
        }

        Set<Integer> keys = map.keySet();
        int res = 0;
        for (int x: keys
             ) {
            int count = map.get(x);

            if(count == 1){
                return -1;
            }

            int num3 = count / 3;
            if(count %3 !=0){
                num3++;
            }
            res +=num3;
        }

        return res;
    }
}
