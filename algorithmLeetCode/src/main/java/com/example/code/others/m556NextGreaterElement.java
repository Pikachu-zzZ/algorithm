package com.example.code.others;

import java.util.ArrayList;
import java.util.List;

public class m556NextGreaterElement {
    public int nextGreaterElement(int x) {
        List<Integer> nums = new ArrayList<>();
        while (x != 0) {
            nums.add(x % 10);
            x /= 10;
        }
        int n = nums.size(), idx = -1;
        // 找到第一个应该被交换的位置
        for (int i = 0; i < n - 1 && idx == -1; i++) {
            if (nums.get(i + 1) < nums.get(i)) idx = i + 1;
        }
        if (idx == -1) return -1;
        // 找到比应该交换的位置的大的最小数，与其交换，其实就是找到第一个比他大的数，因为在idx之前，前面的数不可能比后面的数小
        for (int i = 0; i < idx; i++) {
            if (nums.get(i) > nums.get(idx)) {
                swap(nums, i, idx);
                break;
            }
        }
        // 将idx之前的数字进行排序，以确保数字序最小
        for (int l = 0, r = idx - 1; l < r; l++, r--) swap(nums, l, r);
        long ans = 0;
        // 拼回，因为会超出int范围，所以需要long
        for (int i = n - 1; i >= 0; i--) ans = ans * 10 + nums.get(i);
        return ans > Integer.MAX_VALUE ? -1 : (int)ans;
    }
    void swap(List<Integer> nums, int a, int b) {
        int c = nums.get(a);
        nums.set(a, nums.get(b));
        nums.set(b, c);
    }
}
