package com.zoo.algorithm_exercise;

import com.zoo.algorithm_exercise.util.Sout;

/**
 * 删除排序数组中的重复项
 */
public class Solution_26 {

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 2, 2};
        Sout.toJson(solution(a));

        int[] b = {1, 2, 2, 3};
        Sout.toJson(solution(b));

    }

    /**
     * 双指针
     *
     * @param nums
     * @return
     */
    public static int solution(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[k] != nums[i]) {
                k++;
                nums[k] = nums[i];
            }
        }
        return ++k;
    }
}
