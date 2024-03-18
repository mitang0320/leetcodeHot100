package com.cannedmitang.hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0039_CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        int[] choose = new int[candidates.length];
        res = new ArrayList<>();
        process(candidates, target, candidates.length - 1, choose);
        return res;
    }

    List<List<Integer>> res;

    private void process(int[] candidates, int target, int index, int[] choose) {
        if(target == 0) {
            res.add(getRes(candidates, choose));
            return;
        }
        if (index < 0) {
            return;
        }
        for(int i = 0; i * candidates[index] <= target ; i++) {
            choose[index] = i;
            process(candidates, target - candidates[index] * i, index - 1, choose);
        }
        choose[index] = 0;
    }

    private List<Integer> getRes(int[] candidates, int[] choose) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < candidates.length; i++) {
            if(choose[i] > 0) {
                for (int j = 0; j < choose[i]; j++) {
                    res.add(candidates[i]);
                }
            }
        }
        return res;
    }

}
