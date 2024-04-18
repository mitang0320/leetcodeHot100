package com.cannedmitang.hot100;

import java.util.PriorityQueue;

public class _0295_FindMedianFromDataStream {

    public class MedianFinder {
        PriorityQueue<Integer> big;
        PriorityQueue<Integer> small;

        int size;

        public MedianFinder() {
            big = new PriorityQueue<>((o1, o2) -> o2 - o1);
            small = new PriorityQueue<>();
            size = 0;
        }

        public void addNum(int num) {
            size++;
            small.add(num);
            big.add(small.poll());
            if (big.size()> small.size() + 1) {
                small.add(big.poll());
            }
        }

        public double findMedian() {
            if (size % 2 == 0) {
                return (small.peek() + big.peek()) / 2.0d;
            } else {
                return big.peek();
            }
        }
    }

}
