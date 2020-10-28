package com.zoo.algorithm_exercise;

import com.zoo.algorithm_exercise.util.Sout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_15 {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int[] nums1 = {0, 0, 0};
        int[] nums2 = {-2, 0, 3, -1, 4, 0, 3, 4, 1, 1, 1, -3, -5, 4, 0};
        List<List<Integer>> solution = solution(nums);
        List<List<Integer>> solution1 = solution(nums1);
        List<List<Integer>> solution2 = solution(nums2);
        Sout.toJson(solution);
        Sout.toJson(solution1);
        Sout.toJson(solution2);
    }

    public static List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    j++;
                    k--;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return result;
    }
}
