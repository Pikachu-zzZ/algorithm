package com.example.code.arrayss;

public class m2275 {

    public int largestCombination(int[] candidates) {
        int[] cnt = new int[32];
        for (int candidate : candidates) {
            for (int i = 0; i < 32; i++) {
                if (((candidate >> i) & 1) == 1) {
                    cnt[i]++;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < 32; i++) ans = Math.max(ans, cnt[i]);
        return ans;
    }

}
