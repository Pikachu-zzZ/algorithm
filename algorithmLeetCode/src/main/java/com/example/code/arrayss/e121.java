package com.example.code.arrayss;

public class e121 {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;

        for(int i = 1;i<prices.length;i++){
            int temp = prices[i] - min;
            max = Math.max(temp,max);
            min = Math.min(min,prices[i]);
        }


        return max;
    }
}
