package com.example.code.arrayss;

import java.util.Arrays;

public class m473 {
    public boolean makesquare(int[] matchsticks) {
        int sum = 0;
        for (int x:matchsticks
             ) {
            sum+=x;
        }

        if(sum %4!=0){
            return false;
        }

        int sideLen = sum /4;

        Arrays.sort(matchsticks);
        if(matchsticks[matchsticks.length-1] > sideLen){
            return false;
        }


        int[] flag = new int[matchsticks.length];

        int len = matchsticks.length;
        len--;



        return true;

    }
}
