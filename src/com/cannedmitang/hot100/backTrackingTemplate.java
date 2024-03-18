package com.cannedmitang.hot100;

/**
 * @author : loso
 * @version : v1.0
 * @date : Created in 2024/3/12 10:14
 * @description :
 * @modified By : loso
 */
@SuppressWarnings("all")
public class backTrackingTemplate {

    boolean 终止条件 = true;

    void 添加结果() {
    }

    class 解空间 {
    }

    void 处理节点() {
    }

    void 回溯() {
    }

    Object[] 解空间 = new Object[0];

    void process(Object 路径, Object 选择列表) {
        if (终止条件) {
            添加结果();
            return;
        }
        for ( Object 解 : 解空间 ) {
            处理节点();
            process(路径, 选择列表);
            回溯();//撤销处理结果
        }
    }

}
