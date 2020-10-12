package com.zoo.algorithm_exercise;

import com.zoo.algorithm_exercise.util.Sout;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * 两个数组的交集
 * 给定两个数组，编写一个函数来计算它们的交集。
 */
public class Solution_350 {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 1};
        int[] b = {2, 2};
        int[] c = solution(a, b);
        Sout.toJson(c);
        int[] d = {4, 5, 9};
        int[] e = {9, 4, 9, 8, 4};
        int[] f = solution(d, e);
        Sout.toJson(f);

        int[] g = {4, 5, 9};
        int[] h = {9, 4, 9, 8, 4};
        int[] i = solutionV2(g, h);
        Sout.toJson(i);

    }

    /**
     * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
     * 我们可以不考虑输出结果的顺序
     *
     * @param a
     * @param b
     * @return
     */
    public static int[] solution(int[] a, int[] b) {
        //空检查
        if (Objects.isNull(a)
                || a.length == 0
                || Objects.isNull(b)
                || b.length == 0) {
            return new int[0];
        }

        //考虑是时间优先级高还是空间优先级高
        //此处为减少空间复杂度
        if (a.length > b.length) {
            return solution(b, a);
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : a) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int k = 0;
        for (int n : b) {
            int cnt = map.getOrDefault(n, 0);
            if (cnt > 0) {
                a[k++] = n;
                map.put(n, cnt - 1);
            }
        }
        return Arrays.copyOfRange(a, 0, k);
    }

    /**
     * 如果给定的数组已经排好序呢？将如何优化你的算法呢？
     */
    public static int[] solutionV2(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);


        int[] c = new int[a.length > b.length ? b.length : a.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                c[k++] = a[i];
                i++;
                j++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                i++;
            }
        }
        return Arrays.copyOfRange(c, 0, k);
    }
}