package com.example.code.doublePointer;

import java.util.Stack;

public class e884 {
    // 一次遍历，比用栈解决更好
    public boolean backspaceCompare(String s, String t) {
        int lenS = s.length();
        int lenT = t.length();
        int i = lenS-1;
        int j = lenT-1;
        int countS = 0;
        int countT = 0;

        while(i>=0 || j>=0){
            while(i>=0){
                if(s.charAt(i) == '#'){
                    countS++;
                    i--;
                }else {
                    if(countS>0){
                        countS--;
                        i--;
                    }else {
                        //找到不能被删除的元素
                        break;
                    }
                }
            }

            while(j>=0){
                if(t.charAt(j) == '#'){
                    countT++;
                    j--;
                }else {
                    if(countT>0){
                        countT--;
                        j--;
                    }else {
                        //找到不能被删除的元素
                        break;
                    }
                }
            }

            if (i >= 0 && j >= 0) {
                if (s.charAt(i) != t.charAt(j)) {
                    return false;
                }
            } else {
                if (i >= 0 || j >= 0) {
                    return false;
                }
            }
            i--;
            j--;
        }


        return true;
    }
}
