package com.example.code;

import java.util.Arrays;

public class test {



        String str = new String("good");
        char[] ch = new char[]{ 't', 'e', 's', 't' };

        public void change(String str, char[] ch) {
            str = "test ok";
            ch = new char[]{'a', 'b'};
//            ch[0] = 'b';
        }
        public static void main(String[] args) {
            test ex = new test();//地址str->good  char数组
            ex.change(ex.str, ex.ch);
            System.out.print(ex.str + " and ");//goodand
            System.out.println(ex.ch); //best
        }



}
