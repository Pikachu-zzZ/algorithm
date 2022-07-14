package com.example.code.stackk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class m735AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        // 根据题目，可以推断出来，三种情况
        // 1. 都是负数
        // 2. 都是正数
        // 3. 负数都在左边，正数都在右边
        // 因此，我们可以找到每一个负数，然后将这个负数与前面的正数比较，消除正数或者该负数
        // 利用标记数组来标记该位置是否删除，1代表删除，0代表保留

        int len = asteroids.length;
        int[] flag = new int[len];

        int idx = 0;
        while (idx<len){
            if(asteroids[idx] > 0){
                idx++;
                continue;
            }
            // 找到了负数
            // 与前面的正数去比较
            for (int i = idx-1; i >=0; i--) {

                if(asteroids[i] > 0 && flag[i] == 0){
                    int positive = asteroids[i];
                    int negative = asteroids[idx];
                    if(Math.abs(negative) == positive){
                        flag[i] = 1;
                        flag[idx] = 1;

                        break;
                    }else if (Math.abs(negative) > positive){
                        flag[i] = 1;
                    }else {
                        flag[idx] = 1;

                        break;
                    }
                }
            }

            idx++;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if(flag[i] == 0){
                list.add(asteroids[i]);
            }
        }

        int length = list.size();
        int[] ints = new int[length];
        for (int i = 0; i < length; i++) {
            ints[i] = list.get(i);
        }

        return ints;
    }

    // 栈模拟
    // 由于碰撞抵消总是从相邻行星之间发生，我们可以使用「栈」来模拟该过程
    // 从前往后处理所有的行星，使用栈存储当前未被抵消的行星
    // 规则如下：
    // 栈顶为 负，加入行星 正，负都可以
    // 栈顶为 正，加入行星，正可以，负不可以，因此只需要判断这种情况
    public int[] asteroidCollision_stack(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int a: asteroids
             ) {
            // 标记，表示该行星应该被保留
            Boolean flag = true;
            // 因为要与栈中前面的元素多次比较，因此要用while循环
            // 设置条件，1. stack非空，2.标记位为true，3. stack栈顶为正，4.行星为负
            while(!stack.isEmpty() && flag && stack.peek() > 0 && a < 0){
                // 根据题目意思来判断
                int peek = stack.peek();
                int num = -a;
                if(num > peek){
                    stack.pop();
                }else if(num==peek){
                    stack.pop();
                    flag = false;
                }else {
                    flag = false;
                }


            }

            if(flag) stack.push(a);
        }

        int len = stack.size();
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[len-1-i] = stack.pop();
        }

        return res;

    }




    public static void main(String[] args) {
        int[] ints = {-2,2,-1,-2};
        int[] res = new m735AsteroidCollision().asteroidCollision_stack(ints);
        System.out.println(Arrays.toString(res));
    }
}
