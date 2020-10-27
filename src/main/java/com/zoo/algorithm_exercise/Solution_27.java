package com.zoo.algorithm_exercise;

import com.zoo.algorithm_exercise.util.Sout;

import java.util.Objects;

/**
 * 原地删除
 */
public class Solution_27 {

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 2, 2};
        Sout.toJson(solution(a, 1));

        int[] b = {1, 1, 1, 2, 2};
        Sout.toJson(solution(b, 2));

    }

    /**
     * 双指针
     *
     * @param nums
     * @param val
     * @return
     */
    public static int solution(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            }
            nums[k] = nums[i];
            k++;
        }
        return k;
    }
}
