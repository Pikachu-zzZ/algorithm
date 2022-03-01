package com.example.code.stringg;

import java.util.HashMap;
import java.util.Stack;

public class m227 {

    // 注意：在num没有确定之前，不能压入stack，因此只有遍历到运算符时，考虑压入stack
    // 我的错误就是遇到数字直接压入，会导致 俩位数或更多计算错误
    public int calculate(String s) {
        // 去除首尾空格
        s = s.trim();
        // 去除所有空格
        s = s.replaceAll(" ","");
        int res = 0;



        return res;
    }
}
