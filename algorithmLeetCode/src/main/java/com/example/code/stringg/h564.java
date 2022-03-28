package com.example.code.stringg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class h564 {
    public String nearestPalindromic(String n) {
        // 一些例子
        // 12932 12921
        // 99888 99799 （!99899）
        // 11011 11111 (! 10901)
        // 10 9 (!11)
        // 99 101 (!88)
        /*
        对于任意一个数，如12345，其最近的回文数只会从以下五种中得到：

        将前一半填入后一半：12321
        将前一半加一填入后一半：12421
        将前一半减一填入后一半：12221
        下边界：9999
        上边界：100001
        从这五个数里面选取不等于原数的，且与原数差距最小的最小的数即为答案。


        123455
        1. 123321
        2. 124421
        3. 122221
        4. 99999
        5. 100001

         */

        int len = n.length();
        // int 类型不够，需要使用Long类型
        long num = Long.parseLong(n);
        if(len == 1){
            return String.valueOf(num - 1);
        }

        List<Long> list = new ArrayList<>();
        list.add((long) Math.pow(10, len) + 1);
        list.add((long) Math.pow(10, len-1) - 1);

        StringBuilder sb = new StringBuilder(n);
        //5+1 /2 = 3
        // 6+1 / 2 = 3
        String halfString = n.substring(0,(len +1 )/2);
        long halfStringLong = Long.parseLong(halfString);
        for(Long i = halfStringLong-1;i<halfStringLong +2;i++){
            if((len&1) == 0){
                String newString = String.valueOf(i)+ new StringBuilder(String.valueOf(i)).reverse().toString();
                if(!newString.equals(n)){
                    list.add(Long.parseLong(newString));
                }
            }else {
                String temp = String.valueOf(i).substring(0,halfString.length()-1);
                String newString = String.valueOf(i)+ new StringBuilder(temp).reverse().toString();
                if(!newString.equals(n)){
                    list.add(Long.parseLong(newString));
                }
            }
        }




        Collections.sort(list,(a,b)->{
            long diff1 = Math.abs(num -a);
            long diff2 = Math.abs(num -b);
            return Long.compare(diff1,diff2)==0?Long.compare(a,b):Long.compare(diff1,diff2);
        });

        //Collections.sort(list);
//        System.out.println(list.toString());
        return (String.valueOf(list.get(0)));



    }
}
