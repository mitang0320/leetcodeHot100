package com.cannedmitang.hot100;

public class _0283_MoveZeroes {

    public void moveZeroes(int[] nums) {
        int index = 0;
        int count = nums.length;

        for (int i = 0; i < count; i++) {
            if (nums[i] == 0){
                continue;
            }
            if (index < i) {
                nums[index] = nums[i];
            }
            index++;
        }
        for (int i = index; i < count; i++) {
            nums[i] = 0;
        }
    }

}
