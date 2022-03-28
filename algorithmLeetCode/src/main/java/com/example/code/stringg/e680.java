package com.example.code.stringg;

public class e680 {

    public boolean validPalindrome(String s) {
        int count = 1;
        boolean res = judge(s, count);


        return res;
    }



    public boolean judge(String s, int count){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else {
                if(count>0){
                    count--;
                    //System.out.println(s.substring(i,j));
                    //System.out.println(s.substring(i+1,j+1));
                    return judge(s.substring(i+1,j+1),count) || judge(s.substring(i,j),count);

                }else {
                    return false;
                }
            }
        }

        return true;
    }
}
