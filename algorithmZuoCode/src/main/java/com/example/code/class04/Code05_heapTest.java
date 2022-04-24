package com.example.code.class04;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Code05_heapTest {

    public static void main(String[] args) {

        // 底层是堆，底层是小根堆
        PriorityQueue<Integer> integers = new PriorityQueue<>();

        Integer[] ints = new Integer[]{1,3,2};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
        //实际应用中我们往往使用 基本数据类型 数组，这时候若使用sort() 就需要将基本数据类型转化为引用数据类型，否则便会报错
        Arrays.sort(ints,(a,b)->{
            return b - a;
        });

        System.out.println(Arrays.toString(ints));


    }
}
