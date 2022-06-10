package com.example.code.arrayss;

public class m905 {
    public int[] sortArrayByParity(int[] nums) {
        int i =0;
        int j = nums.length-1;
        while(i<j){
            while(i < j && nums[i] % 2 == 0) i++;
            while(i < j && nums[j] % 2 == 1) j--;

            if(i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

            }
        }

        return nums;
    }



    public int[] sortArrayByParity1(int[] nums) {
        int i =0;
        int j = nums.length-1;
        while(i<j){
            if(i< j &&nums[i] % 2 == 1 && nums[j] % 2 == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }else if(nums[i] % 2 ==0){
                i++;
            }else if(nums[j] % 2 ==1){
                j--;
            }


        }

        return nums;
    }
}
