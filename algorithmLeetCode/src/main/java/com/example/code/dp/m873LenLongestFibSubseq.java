package com.example.code.dp;

import java.util.HashMap;

public class m873LenLongestFibSubseq {
    /**
     * 一种比较新奇的dp题，i，j下标的意思和以前不太一样
     * @param arr
     * @return
     */
    public int lenLongestFibSubseq(int[] arr) {
        // hashmap用来存取下标，方便查找
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            map.put(arr[i],i);
        }
        // dp数组，i，j分别代表斐波那契数列的最后一个和倒数第二个
        int[][] dp = new int[n][n];
        int max = 0;
        // i 从小到大，j从大到小
        for (int i = 0; i < n; i++) {
            for (int j = i-1; j >=0 ; j--) {
                // 斐波那契数列满足单调性，可以终止
                if(arr[i] - arr[j] >= arr[j]) break;
                // 差值就是第三个数
                int gap = arr[i] - arr[j];
                // 找到第三个数的下标位置
                int idx = map.getOrDefault(gap, -1);
                // 不存在，coutinue
                if(idx ==-1) continue;
                // 存在，动态转移方程，dp[i][j] 就是 3或者 以j为最后一位，idx为倒数第二位的dp大小加一
                dp[i][j] = Math.max(3,dp[j][idx]+1);
                // 更新答案
                max = Math.max(dp[i][j],max);
            }
        }

        return max;
    }
}
