package com.cannedmitang.hot100;

import java.util.*;

public class _0207_CanFinish {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] courses = new int[numCourses];
        Arrays.fill(courses, 0);
        HashMap<Integer, List<Integer>> needUnlock = new HashMap<>();
        for(int[] pair : prerequisites) {
            int target = pair[0];
            int need = pair[1];
            final List<Integer> orDefault = needUnlock.getOrDefault(need, new ArrayList<>());
            orDefault.add(target);
            needUnlock.put(need,orDefault);
            courses[target]++;
        }
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (courses[i] == 0) {
                deque.addLast(i);
            }
        }
        while(!deque.isEmpty()) {
            final Integer c = deque.pollFirst();
            if ( needUnlock.containsKey(c)) {
                final List<Integer> integers = needUnlock.get(c);
                for (int i : integers) {
                    if (courses[i] > 0) {
                        courses[i] --;
                    }
                    if (courses[i] == 0) {
                        deque.addLast(i);
                    }
                }
            }
            needUnlock.remove(c);
        }
        for (int c : courses) {
            if (c > 0) {
                return false;
            }
        }
        return true;
    }

}
