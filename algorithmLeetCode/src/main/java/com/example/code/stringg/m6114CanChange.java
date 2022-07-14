package com.example.code.stringg;

public class m6114CanChange {
    public boolean canChange(String start, String target) {
        int len = start.length();
        if(!start.replace("_","").equals(target.replace("_",""))) return false;

        for (int i = 0, j =0; i < len ; i++) {
            if (start.charAt(i) == '_') continue;
            // start的 i 下标肯定是一个L或者R，我们找到target的第一个字母位置
            while (target.charAt(j) == '_') j++;
            // 判断
            // 1. 如果当前字符为 L 且 i<j，那么这个 L 由于无法向右移动，返回 false；
            // 因为L只能向左移动，那么target的L只能在start之前，也就是必须满足j<i
            if(start.charAt(i) == 'L' && i<j) return false;

            // 2. 如果当前字符为 R 且 i>j，那么这个 R 由于无法向左移动，返回 false
            // 因为R只能向右移动，那么target的R只能在start之后，也就是必须满足j>i
            if(start.charAt(i) == 'R' && i>j) return false;

            // 该位置能够正常匹配
            ++j;

        }


        return true;
    }
}
