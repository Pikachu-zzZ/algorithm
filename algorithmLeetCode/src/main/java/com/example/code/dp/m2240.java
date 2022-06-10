package com.example.code.dp;

public class m2240 {
    public long waysToBuyPensPencilsForce(int total, int cost1, int cost2) {
        long res = 0;

        // 因为根据题意，可以买0个
        while (total >=0){
            res += total/cost2;
            total-=cost1;
        }
        return res;
    }

    public long waysToBuyPensPencilsDP(int total, int cost1, int cost2) {
        long[] dp = new long[total+1];
        dp[0] = 1;

        for (int i = cost1; i <= total; i++) {
            dp[i] += dp[i-cost1];
        }

        for (int i = cost2; i <=total ; i++) {
            dp[i] += dp[i-cost2];
        }
        long res = 0;
        for (long x: dp
             ) {
            res += x;
        }

        return res;
    }

}
