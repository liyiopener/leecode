package com.zoo.algorithm_exercise;

import com.zoo.algorithm_exercise.util.Sout;

import java.util.Objects;

/**
 * 旋转数组
 */
public class Solution_189 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] b = {-1, -100, 3, 99};
        Sout.toJson(solution1(a, 2));
        Sout.toJson(solution1(b, 3));

        System.out.println("***************");

        Sout.toJson(solution2(a, 2));
        Sout.toJson(solution2(b, 3));
    }

    /**
     * 每次移动一步
     *
     * @param intArr
     * @param k
     * @return
     */
    public static int[] solution1(int[] intArr, int k) {
        if (Objects.isNull(intArr) || intArr.length == 0 || k == 0) {
            return intArr;
        }
        for (int j = 0; j < k; j++) {
            int tmp = intArr[intArr.length - 1];
            for (int i = intArr.length - 1; i > 0; i--) {
                intArr[i] = intArr[i - 1];
            }
            intArr[0] = tmp;
        }
        return intArr;
    }

    /**
     * 使用反转
     * @param intArr
     * @param k
     * @return
     */
    public static int[] solution2(int[] intArr, int k) {
        reverseArr(intArr, 0, intArr.length-1);
        reverseArr(intArr, 0, k-1);
        reverseArr(intArr, k, intArr.length-1);
        return intArr;
    }

    private static void reverseArr(int[] intArr, int startIndex, int endIndex) {
        for (int i = startIndex; i <= (endIndex - startIndex) / 2; i++) {
            int tmp = intArr[i];
            intArr[i] = intArr[endIndex - i + startIndex];
            intArr[endIndex - i + startIndex] = tmp;
        }
    }

    //todo:find third solution
    public static int[] solution3(int[] intArr, int k){
        return null;
    }
}
