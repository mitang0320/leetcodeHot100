package com.cannedmitang.hot100;

import java.util.ArrayList;
import java.util.List;

public class _0046_Permute {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        process(nums,0, res);
        return res;
    }

    void process(int[] nums, int index, List<List<Integer>> res) {
        if (index == nums.length) {
            save(nums, res);
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            process(nums, index + 1, res);
            swap(nums, index, i);
        }
    }

    void swap(int[] nums, int a, int b) {
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }

    void save(int[] nums, List<List<Integer>> res) {
        List<Integer> line = new ArrayList<>(nums.length * 2);
        for(int n : nums){
            line.add(n);
        }
        res.add(line);
    }

}
