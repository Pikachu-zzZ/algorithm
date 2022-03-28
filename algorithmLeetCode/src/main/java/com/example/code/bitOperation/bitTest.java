package com.example.code.bitOperation;

import org.junit.Test;

public class bitTest {

    @Test
    public void testM137(){
        int[] nums = new int[]{2,2,3,2};
        int res = new m137().singleNumber(nums);
        System.out.println(res);
    }

    @Test //注解
    public void testE231(){
        boolean b = new e231().isPowerOfTwo(2);
        System.out.println(b);


    }

}
