package com.zoo.algorithm_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Z字变换
 */
public class Solution_6 {
    public static void main(String[] args) {
        String a = "AB";
        System.out.println(solution(a, 1));
    }

    public static String solution(String s, int numRows) {
        if (Objects.isNull(s) || s.length() == 0 || numRows == 1) {
            return s;
        }
        List<String> strList = new ArrayList<>();
        for (int k = 0; k < numRows; k++) {
            strList.add("");
        }
        int index = 0;
        int cycle = 2 * numRows - 2;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i % cycle < numRows) {
                index = i % cycle;
            } else {
                index--;
            }
            strList.set(index, strList.get(index) + c);
        }
        String result = "";
        for (String str : strList) {
            result += str;
        }
        return result;
    }
}
