package com.cannedmitang.hot100;

import java.util.HashMap;
import java.util.PriorityQueue;

public class _0347_TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> o1[0] - o2[0]);
        for (int key : map.keySet()) {
            int[] t = new int[]{map.get(key), key};
            queue.add(t);
            if (queue.size() > k) {
                queue.poll();
            }
        }
            int[] res = new int[k];
            int count = 0;
            while (!queue.isEmpty()) {
                res[count++]  = queue.poll()[1];
            }
            return  res;
    }

}
