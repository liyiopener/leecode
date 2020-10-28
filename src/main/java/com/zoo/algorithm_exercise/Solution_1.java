package com.zoo.algorithm_exercise;

import com.zoo.algorithm_exercise.util.Sout;

import java.util.HashMap;
import java.util.Map;

/**
 * 删除排序数组中的重复项
 */
public class Solution_1 {

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        Sout.toJson(solution(nums, target));
    }


    public static int[] solution(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> numMap = new HashMap();
        for (int i = 0; i < nums.length; i++){
            numMap.put(nums[i], i);
        }
        for (int j = 0; j < nums.length; j++){
            Integer key = target - nums[j];
            if (numMap.containsKey(key) && numMap.get(key) != j){
                result[0] = j;
                result[1] = numMap.get(key);
                break;
            }
        }
        return result;
    }

    /**
     * old record
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return result;
    }
}
