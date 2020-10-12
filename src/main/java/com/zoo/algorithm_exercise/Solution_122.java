package com.zoo.algorithm_exercise;

import java.util.Objects;

/**
 * 当前只是计算最大利润
 */
public class Solution_122 {

    public static void main(String[] args) {
        int[] a = {7, 1, 5, 3, 6, 4};
        System.out.println(solution(a));

        int[] b = {1,2,3,4,5};
        System.out.println(solution(b));

        int[] c = {7,5,3,2,1};
        System.out.println(solution(c));
    }

    public static int solution(int[] arr) {
        int maxProfit = 0;
        if (Objects.isNull(arr) || arr.length < 2) {
            return maxProfit;
        }

        for (int i = 1; i < arr.length; i++) {
            int dailyProfit = arr[i] - arr[i - 1];
            maxProfit += dailyProfit > 0 ? dailyProfit : 0;
        }
        return maxProfit;
    }
}
