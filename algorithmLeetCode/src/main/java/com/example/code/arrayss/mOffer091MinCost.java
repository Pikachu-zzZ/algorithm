package com.example.code.arrayss;

import java.util.Arrays;

public class mOffer091MinCost {
    // dp,自己的思路，二维数组更容易理解
    public int minCost(int[][] costs) {
        int n = costs.length;
        int[][] dp = new int[n][3];
        dp[0][0] = costs[0][0];
        dp[0][1] = costs[0][1];
        dp[0][2] = costs[0][2];

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                // 重点是这一步，如何将三个状态转移公式合并成同一个
                dp[i][j] =Math.min(dp[i-1][(j+1)%3],dp[i-1][(j+2)%3]) + costs[i][j];
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            min = Math.min(min,dp[n-1][i]);
        }

        return min;
    }


    //当 i ≥1 时，由于dp[i] 的计算只和 dp[i−1] 有关，因此可以使用滚动数组优化空间，将空间复杂度降低到 O(1)。
    //
    public int minCost1(int[][] costs) {
        int n = costs.length;
        int[] dp = new int[3];
        for (int j = 0; j < 3; j++) {
            dp[j] = costs[0][j];
        }
        for (int i = 1; i < n; i++) {
            int[] dpNew = new int[3];
            for (int j = 0; j < 3; j++) {
                dpNew[j] = Math.min(dp[(j + 1) % 3], dp[(j + 2) % 3]) + costs[i][j];
            }
            dp = dpNew;
        }
        return Arrays.stream(dp).min().getAsInt();
    }


}
