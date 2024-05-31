package com.cannedmitang.hot100;

import java.util.List;
import java.util.Set;

/**
 * @author : loso
 * @version : v1.0
 * @date : Created in 2024/5/18 23:14
 * @description :
 * @modified By : loso
 */

@SuppressWarnings("all")
public class DFS {

    private void dfs(int n, Set<Integer> visited, List<Integer> path) {
        if (path.size() == n) {
            //do something
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!visited.contains(i)) {
                path.add(i);
                visited.add(i);
                dfs(n, visited, path);
                path.remove(path.size() - 1);
                visited.remove(i);
            }
        }
    }

}
