package com.example.code.stringg;

import java.util.Stack;

public class m394 {

    // 存在 [a2[ac]] 嵌套的情况存在，需要重新判断
    public String decodeString(String s) {
        int len = s.length();
        int i = 0;

        int num = 0;
//        StringBuilder sb = new StringBuilder();
        StringBuilder res = new StringBuilder();
        Stack<Integer> integers = new Stack<>();
        Stack<String> strings = new Stack<>();
        while(i<len){
            
            if(Character.isDigit(s.charAt(i))){
                num = num *10 + (s.charAt(i) - '0');
            // 遇到[，入栈的为 （次数，前面的字符串（可以为空））
            }else if(s.charAt(i)=='['){
                integers.push(num);
                num = 0;
                strings.push(res.toString());
                res = new StringBuilder();
            }else if(s.charAt(i) == ']'){
                String pop = strings.pop();
                StringBuilder builder = new StringBuilder(pop);
                int count = integers.pop();
                for (int j = 0; j < count; j++) {
                    builder.append(res);
                }


                res = builder;

            }else {

                res.append(s.charAt(i));
            }

            i++;
        }




        return res.toString();
    }
}
