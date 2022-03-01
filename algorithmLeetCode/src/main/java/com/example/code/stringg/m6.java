package com.example.code.stringg;

public class m6 {

    // 用字符串拼接导致运行速度慢，思路没有问题
    public String convert1(String s, int numRows) {
        if(numRows == 1){
            return s;
        }

        String res = "";
        int gap =  2 * (numRows-1);
        int idx = 0;
        for(int i = 0;i<numRows;i++){
            idx = i;
            if(i == 0 || i == numRows-1){
                while(idx<s.length()){
                    res = res + s.charAt(idx);
                    idx += gap;
                }
            }else {
                int cha = gap - 2 * i;
                while(idx<s.length() ){
                    res = res + s.charAt(idx);
                    if((idx + cha)<s.length()){
                        res = res + s.charAt(idx + cha);
                    }

                    idx += gap;
                }
            }



        }


        return res;
    }

    // 利用StringBuilder 提高字符串的处理速度
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }

        StringBuilder sb = new StringBuilder();

        int gap =  2 * (numRows-1);
        int idx = 0;
        for(int i = 0;i<numRows;i++){
            idx = i;
            if(i == 0 || i == numRows-1){
                while(idx<s.length()){
                    sb.append(s.charAt(idx));

                    idx += gap;
                }
            }else {
                int cha = gap - 2 * i;
                while(idx<s.length() ){
                    sb.append(s.charAt(idx));
                    if((idx + cha)<s.length()){
                        sb.append(s.charAt(idx + cha));

                    }

                    idx += gap;
                }
            }



        }


        return sb.toString();
    }
}
