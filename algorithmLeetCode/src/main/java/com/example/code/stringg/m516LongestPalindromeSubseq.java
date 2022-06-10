package com.example.code.stringg;

public class m516LongestPalindromeSubseq {
    public int longestPalindromeSubseq(String s) {

        int n = s.length();
        int[][] dp = new int[n][n];
        // 最重要的就是 dp 顺序，因为最长子序列一定在 0 - n-1之间，所以返回的就是dp[0][n - 1]
        // dp顺序的确定, dp[i + 1][j], dp[i][j - 1] 是通过下边和左边确定的，dp[i + 1][j - 1] 通过左下确定的，
        // 因此，我们的 i从 n-1开始变小，j 从i+1 开始变大，确保需要的都存在


        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1;
            char c1 = s.charAt(i);
            for (int j = i + 1; j < n; j++) {
                char c2 = s.charAt(j);
                if (c1 == c2) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][n - 1];

    }
}
