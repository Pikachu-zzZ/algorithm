package com.example.code.stringg;

public class e6070 {
    public String digitSum(String s,int k) {



        int len = s.length();
        while (len>k){
            int idx = 0;
            int round = len / k;
            if(len % k !=0){
                round++;
            }

            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < round; i++) {
                int sum = 0;
                for (int j = idx; j < idx+k && j< len; j++) {
                    sum += s.charAt(j)-'0';
                }

                idx = idx+k;
                temp.append(sum);

            }

            s = temp.toString();
            System.out.println(s);
            len = s.length();
        }


        return s;
    }
}
