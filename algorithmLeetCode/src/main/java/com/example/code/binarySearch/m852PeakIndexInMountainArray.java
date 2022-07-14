package com.example.code.binarySearch;

public class m852PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int len = arr.length;
        int l = 0;
        int r = len-1;
        while (l<r){
            // 在偶数数组的情况下，正常的mid只会取到左边的那个，而有时我们需要右边的那个mid，就可以加1。
            int mid = l + (r-l + 1) /2;
            // 在偶数数组的情况下，最好是俩个中间数进行对比，所以如果mid是左边那个，就和mid+1比，mid是右边那个，就和mid-1比
            if(arr[mid] > arr[mid-1]){
                l = mid;
            }else {
                r = mid-1;
            }
        }

        return l;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{3,5,3,2,0};
        int i = new m852PeakIndexInMountainArray().peakIndexInMountainArray(arr);
        System.out.println(i);
    }
}
