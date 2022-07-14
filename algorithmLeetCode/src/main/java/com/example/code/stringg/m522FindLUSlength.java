package com.example.code.stringg;

import java.util.Arrays;
import java.util.Comparator;

public class m522FindLUSlength {
    public int findLUSlength(String[] strs) {
        Arrays.sort(strs, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return s2.length() - s1.length();
            }
        });

        boolean find = false;
        int len = strs[0].length();
        for(int i = 0; i<strs.length; i++){
            len = strs[i].length();
            boolean special = true;
            for(int j = 0; j<strs.length; j++){
                if(i == j){
                    continue;
                }
                if(strs[j].length() < len){
                    break;
                }
                if(judge(strs[i], strs[j])){
                    special = false;
                    break;
                }
            }
            if(special){
                find = true;
                break;
            }
        }

        return find? len : -1;
    }

    private boolean judge(String s1, String s2){
        if(s1.length() == s2.length()){
            return s1.equals(s2);
        }
        int i = 0, j = 0;
        while(i < s1.length() && j < s2.length()){
            if(s1.charAt(i) == s2.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s1.length();
    }
}
