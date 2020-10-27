package com.zoo.algorithm_exercise;

import com.zoo.algorithm_exercise.util.Sout;

/**
 * 删除排序数组中的重复项
 */
public class Solution_66 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        Sout.toJson(solution(a, 8));

        int[] b = {9};
        Sout.toJson(solution(b, 3));

    }


    public static int[] solution(int[] nums, int addNum) {
        for (int i = nums.length - 1; i >= 0; i--) {
            int tmp = nums[i] + addNum;
            if (tmp < 10) {
                nums[i] = tmp;
                addNum = 0;
                break;
            }
            nums[i] = tmp % 10;
            addNum = 1;
        }

        if (addNum != 0) {
            int[] result = new int[nums.length + 1];
            for (int i = 0; i < nums.length; i++) {
                result[i + 1] = nums[i];
            }
            result[0] = 1;
            nums = result;
        }
        return nums;
    }
}
