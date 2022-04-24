package com.example.code.stringg;

import org.junit.Test;

public class stringTest {

    public static void main(String[] args) {
        //
//        String s = "PAYPALISHIRING";
//        int numRows = 3;
//        String res = new m6().convert(s, numRows);
//        System.out.println(res);

//        String s = "1*2-3/4+5*6-7*8+9/10";
//        int res = new m227().calculate(s);
//        System.out.println(res);


//        String s = "100";
//        String res = new h564().nearestPalindromic(s);
//        System.out.println(res);


//        String s = "abc";
//        boolean b = new e680().validPalindrome(s);
//        System.out.println(b);


        String s = "2[abc]3[cd]ef";
        String s1 = new m394().decodeString(s);
        System.out.println(s1);


    }




    @Test
    public void e6070Test(){
        String s = new e6070().digitSum("1234",2);
        System.out.println(s);
    }
}
