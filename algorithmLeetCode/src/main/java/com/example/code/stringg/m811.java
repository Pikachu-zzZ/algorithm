package com.example.code.stringg;

import java.util.*;

public class m811 {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap<>();
        int len = cpdomains.length;
        for (String s:cpdomains
             ) {
            String[] s1 = s.split(" ");
            int count = Integer.parseInt(s1[0]);
            String[] split = s1[1].split("\\.");
            if(split.length == 3){
                String temp1 = split[0]+'.'+split[1]+'.'+split[2];
                String temp2 = split[1]+'.'+split[2];
                String temp3 = split[2];

                Integer count1 = map.getOrDefault(temp1, 0);
                Integer count2 = map.getOrDefault(temp2, 0);
                Integer count3 = map.getOrDefault(temp3, 0);

                count1 = count1 + count;
                count2 = count2 + count;
                count3 = count3 + count;

                map.put(temp1,count1);
                map.put(temp2,count2);
                map.put(temp3,count3);
            }else {
                String temp1 = split[0]+'.'+split[1];
                String temp2 = split[1];

                Integer count1 = map.getOrDefault(temp1, 0);
                Integer count2 = map.getOrDefault(temp2, 0);

                count1 = count1 + count;
                count2 = count2 + count;

                map.put(temp1,count1);
                map.put(temp2,count2);

            }
        }

        ArrayList<String> list = new ArrayList<>();
        Set<String> keySet = map.keySet();
        for (String k:keySet
             ) {
            Integer integer = map.get(k);
            String res = integer + " "+ k;
            list.add(res);


        }

        return list;

    }
}
