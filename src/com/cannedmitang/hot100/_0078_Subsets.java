package com.cannedmitang.hot100;

import java.util.ArrayList;
import java.util.List;

public class _0078_Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        process(nums, 0, res, new ArrayList<>());
        return res;
    }

    public void process(int[] nums, int index, List<List<Integer>> res , List<Integer> line) {
        if (index == nums.length) {
            res.add(new ArrayList<>(line));
            return;
        }
        process(nums,index + 1, res, line);
        line.add(nums[index]);
        process(nums, index + 1, res, line);
        line.remove(line.size() -1);
    }

}
