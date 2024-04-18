package com.cannedmitang.hot100;

/**
 * @author : loso
 * @version : v1.0
 * @date : Created in 2024/3/20 18:30
 * @description :
 * @modified By : loso
 */
@SuppressWarnings("all")
public class binarySearchTemplate {

    public static int findNum(int[] arr, int num) {
        int l = 0;
        int r = arr.length - 1;
        int m = 0;
        int res = -1;
        while (l <= r) {
            m = l + ((r - l) >> 1);
            if (arr[m] == num) {
                //⭐️ 处理相等
            } else if (arr[m] > num) {
                //⭐️ 处理大于
                r = m - 1;
            } else if (arr[m] < num) {
                //⭐️ 处理大于
                l = m + 1;
            }
        }
        return res;
    }


    /**
     * 寻找指定数据
     * @param arr
     * @param num
     * @return
     */
    public static int find(int[] arr, int num) {
        int l = 0;
        int r = arr.length - 1;
        int m = 0;
        int res = -1;
        while (l <= r) {
            m = l + ((r - l) >> 1);
            if (arr[m] == num) {
                return m ;
            } else if (arr[m] > num) {
                r = m - 1;
            } else if (arr[m] < num) {
                l = m + 1;
            }
        }
        return res;
    }

    /**
     * 寻找指定数据中>num最左位置
     * @param arr
     * @param num
     * @return
     */
    public static int findLeft(int[] arr, int num) {
        int l = 0;
        int r = arr.length - 1;
        int m = 0;
        int res = -1;
        while (l <= r) {
            m = l + ((r - l) >> 1);
            if (arr[m] == num) {
                l = m + 1;
            } else if (arr[m] > num) {
                res = m;
                r = m - 1;
            } else if (arr[m] < num) {
                l = m + 1;
            }
        }
        return res;
    }

    /**
     * 寻找指定数据中>=num最左位置
     * @param arr
     * @param num
     * @return
     */
    public static int findLeftEq(int[] arr, int num) {
        int l = 0;
        int r = arr.length - 1;
        int m = 0;
        int res = -1;
        while (l <= r) {
            m = l + ((r - l) >> 1);
            if (arr[m] == num) {
                res = m;
                r = m - 1;
            } else if (arr[m] > num) {
                res = m;
                r = m - 1;
            } else if (arr[m] < num) {
                l = m + 1;
            }
        }
        return res;
    }

    /**
     * 寻找指定数据中<num最右位置
     * @param arr
     * @param num
     * @return
     */
    public static int findRight(int[] arr, int num) {
        int l = 0;
        int r = arr.length - 1;
        int m = 0;
        int res = -1;
        while (l <= r) {
            m = l + ((r - l) >> 1);
            if (arr[m] == num) {
                r = m - 1;
            } else if (arr[m] > num){
                r = m - 1;
            } else if (arr[m] < num) {
                res = m;
                l = m + 1;
            }
        }
        return res;
    }

    /**
     * 寻找指定数据中<=num最右位置
     * @param arr
     * @param num
     * @return
     */
    public static int findRightEq(int[] arr, int num) {
        int l = 0;
        int r = arr.length - 1;
        int m = 0;
        int res = -1;
        while (l <= r) {
            m = l + ((r - l) >> 1);
            if (arr[m] == num) {
                res = m;
                l = m + 1;
            } else if (arr[m] > num){
                r = m - 1;
            } else if (arr[m] < num) {
                res = m;
                l = m + 1;
            }
        }
        return res;
    }

}
