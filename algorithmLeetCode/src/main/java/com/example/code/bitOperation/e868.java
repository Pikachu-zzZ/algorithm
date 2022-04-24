package com.example.code.bitOperation;

import java.net.Inet4Address;

public class e868 {
    public int binaryGap(int n) {
        int bitCount = Integer.bitCount(n);
        if(bitCount==1){
            return 0;
        }
        String s = Integer.toBinaryString(n);
//        System.out.println(s);
        int len = s.length();
        int[] dp = new int[len];
        dp[0] = s.charAt(0) - '0' == 0 ? 1:0;
        int max = 0;
        for (int i = 1; i < len; i++) {
            char temp = s.charAt(i);
            int now = temp - '0';
            if(now == 1){
                dp[i] = 0;
            }else {
                dp[i] = dp[i-1] +1;
            }


        }


        for (int i = 0; i < len; i++) {
            if(dp[i] >max && i+1 <len && dp[i+1] == 0){
                max = dp[i];
            }
        }


        return max + 1;

    }
}
