package com.example.code.arrayss;

public class e26 {

    // 自己的写法，暴力
    public int myRemoveDuplicates(int[] nums) {
        int len = nums.length;
        int i = 0;
        while (i < len - 1) {
            if (nums[i + 1] == nums[i]) {
                for (int j = i + 1; j < len - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                len--;

            } else {
                i++;
            }

        }

        return len;
    }

    // 双指针，交换数组上的元素，最终的数组仅留下最前面的单一的数字，实现原地上的删除
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int slow = 1;
        int fast = 1;
        while (fast < n) {
            if (nums[slow - 1] == nums[fast]) {
                fast++;
            } else {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }


    public static void main(String[] args) {

        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int res = new e26().removeDuplicates(nums);
        System.out.println(res);


    }

}
