package com.example.code.stringg;

public class e942 {
    public int[] diStringMatch(String s) {
        int len = s.length();
        int[] res = new int[len+1];
        int idx = 0;
        int num = 0;
        for (int i = 0; i < len; i++) {
            if(s.charAt(i) == 'I'){
                res[idx] = num;
                idx++;
                num++;
                res[idx] = num;
            }else {

            }
        }




        return res;
    }
}
