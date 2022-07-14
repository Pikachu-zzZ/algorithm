package com.example.code.others;

public class m6100CountHousePlacements {
    int MOD = (int) 1e9 + 7;

    public int countHousePlacements(int n) {
        long[][] dp = new long[n][2];
        dp[0][0] = 1; // 0代表不放房子
        dp[0][1] = 1; // 1代表放房子
        for (int i = 1; i < n; i++) {
            dp[i][0] = (dp[i-1][0] + dp[i-1][1])%MOD;
            dp[i][1] = (dp[i-1][0]) % MOD;
        }

        long count = (dp[n-1][0] + dp[n-1][1])%MOD;
        long res = (count * count) %MOD; // count * count 超出int范围了，所以需要long型先接受，然后再转
        return (int) res;
    }




}
