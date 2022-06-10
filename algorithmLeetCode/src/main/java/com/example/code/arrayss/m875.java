package com.example.code.arrayss;

import java.util.Arrays;

public class m875 {

    /**
     * 搜索空间： k最大值一定是piles[i]的最大值，因为k > piles[i]的话，最少也需要一个小时吃完这堆，这个小时内剩下时间没有香蕉可以吃。
     * 很容易理解，我们可以假定k的最小值是1； 所以k的搜索空间是[1, max(piles[i])]。
     * 求k下最小需要的时间needHours： 对于每一个pile[i], 我们计算k速度时需要多少时间，累加每个i堆香蕉所需要花费的时间就是needHours；
     * 在搜索空间中利用二分法搜索每个k需要的needHours。将needHours与守卫回来的时间h对比。
     * a. 如果needHours > h那么我们就吃得太慢，需要增加速度k，收缩左边界；
     * b. 如果needHours < h那么我们就吃得太快，需要减少速度k，收缩右边界；
     * c. 如果needHours == h，那么我们也可以尝试收缩右边界，使用一个更小的k来尝试是否也符合h的要求；
     * 二分时间复杂度O(logn)，但由于定义最大搜索空间时遍历了一遍max(pile(i)), 所以最终复杂度还是O(n) 空间复杂度O(1)
     * @param piles
     * @param h
     * @return
     */

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        int k = high;
        while (low < high) {
            int speed = (high - low) / 2 + low;
            long time = getTime(piles, speed);
            if (time < h) {
                high = speed;
                k = speed;
            } else if (time >h){
                low = speed + 1;
            }else {
                high = speed;
                k = speed;

            }
        }
        return k;
    }

    public long getTime(int[] piles, int speed) {
        long time = 0;
        for (int pile : piles) {
            int curTime = (pile + speed - 1) / speed;
            time += curTime;
        }
        return time;
    }


}
