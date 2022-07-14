package com.example.code.stringg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class m890FindAndReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int pLen = pattern.length();
        ArrayList<String> list = new ArrayList<>();
        for (String s: words
             ) {
            HashMap<Character, Character> map = new HashMap<>();
            int len = s.length();
            if(len != pLen){
                continue;
            }

            for (int i = 0; i < len; i++) {
                char c1 = s.charAt(i);
                char c2 = pattern.charAt(i);
                if(!map.containsKey(c1) && !map.containsValue(c2)){
                    map.put(c1,c2);
                }else if(map.containsKey(c1) && map.containsValue(c2)){
                    char c3 = map.get(c1);
                    if(c2!=c3){
                        break;
                    }
                }else {
                    break;
                }

                if(i == len-1){
                    list.add(s);
                }
            }


        }




        return list;
    }


    public static void main(String[] args) {
        String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";
        List<String> list = new m890FindAndReplacePattern().findAndReplacePattern(words, pattern);
        System.out.println(list);
    }
}
