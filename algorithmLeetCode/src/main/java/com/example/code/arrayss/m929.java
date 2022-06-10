package com.example.code.arrayss;

import java.util.HashSet;

public class m929 {
    public int numUniqueEmails(String[] emails) {
        int len = emails.length;
        HashSet<String> set = new HashSet<>();
        for (String s: emails
             ) {
            String[] split = s.split("@");
            String local = split[0];
            String replace = local.replace(".", "");
            String split1 = replace.split("\\+")[0];
            String res = split1 + '@' + split[1];
            set.add(res);
        }


        return set.size();
    }
}
