package com.example.code.arrayss;

public class e1089DuplicateZeros {

    public void duplicateZeros(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len-1; i++) {
            if(arr[i] == 0){
                for (int j = len-1; j >i ; j--) {
                    arr[j] = arr[j-1];
                }
                i++;
            }
        }
    }
}
