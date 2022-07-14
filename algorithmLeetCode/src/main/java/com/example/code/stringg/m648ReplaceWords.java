package com.example.code.stringg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class m648ReplaceWords {
    public String replaceWords(List<String> dictionary, String sentence) {
        dictionary.sort((a, b) -> {
            return a.length() - b.length();
        });

        String[] s = sentence.split(" ");
        for (int i = 0; i < s.length; i++) {
            for (String start:dictionary
                 ) {
                if(s[i].startsWith(start)){
                    s[i] = start;
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        int len = s.length;
        for (int i = 0; i < len; i++) {
            if(i == len-1){
                sb.append(s[i]);
            }else {
                sb.append(s[i]);
                sb.append(" ");
            }
        }
        return sb.toString();

    }
}
