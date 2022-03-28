package com.example.code.bitOperation;

public class e231 {
    public boolean isPowerOfTwo1(int n) {
        int count = Integer.bitCount(n);
        return n>0 && count==1;
    }



    // n = 100000
    //n-1 =011111
    public boolean isPowerOfTwo2(int n) {
        return n>0 && (n & (n-1))==0;
    }


    //负数是按照补码规则在计算机中存储的，-n的二进制表示为 n 的二进制表示的每一位取反再加上 1
    // n = 10000
    //-n = 01111+1 = 10000

    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & -n) == n;
    }


}
