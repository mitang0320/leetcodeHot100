package com.cannedmitang.hot100;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;

/**
 * @author : loso
 * @version : v1.0
 * @date : Created in 2024/5/18 22:15
 * @description :
 * @modified By : loso
 */
public class BFS {

    private void bfs(Node node) {
        Queue<Node> queue = new ArrayDeque<>();
        HashMap<Node, Integer> distance = new HashMap<>();
        // step 1: 初始化
        // 把初始化节点放入，有多个就都放入
        // 标记初始距离为0，记录在distance中
        // distance的作用：1. 作为记录是否访问；2. 记录到起点的距离
        queue.offer(node);
        distance.put(node, 0);

        // step 2: 循环访问队列
        // while 循环每次pop 队列中的一个点出来
        while (!queue.isEmpty()) {
            node = queue.poll();
            // step 3: 拓展相邻节点
            // pop出的节点的相邻节点，加入队列并在distance中存储距离
            for (Node neighbor : node.getNeighbors()) {
                if (distance.containsKey(neighbor)) {
                    continue;
                }
                distance.put(neighbor, distance.get(node) + 1);
                queue.offer(neighbor);
            }
        }
    }

}
