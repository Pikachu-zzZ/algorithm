package com.example.code.stringg;

public class e168 {
    public String convertToTitle(int columnNumber) {
        // 十进制本质是0-9
        // 这题是26进制的转变，A-Z 对应 1-26， 方法转到 0-25
        //因为现在的映射关系是从1开始的，因此我们进行一个重映射，
        // 将当前映射关系修改为从0开始，那么利用新的映射关系算出来的num就会比之前的小1，因此要对现在的num-1；
        //减1之后再开始计算相对应的数值
        StringBuilder sb = new StringBuilder();
        while(columnNumber >0){
            columnNumber--;
            //System.out.println((char) ((columnNumber % 26) + 'A'));
            sb.append((char) ((columnNumber % 26) + 'A') );
            columnNumber /= 26;
        }


        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        int num = 27;
        String s = new e168().convertToTitle(num);
        System.out.println(s);
    }
}
