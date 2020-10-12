package com.zoo.algorithm_exercise;

import com.zoo.algorithm_exercise.util.Sout;

import java.util.Objects;

public class Solution_14 {

    public static void main(String[] args) {
        String[] a = {"fl", "flower", "flow"};
        Sout.toJson(solution(a));

        String[] b = {"dog", "racecar", "car"};
        Sout.toJson(solution(b));

        String[] c = {"flower","flow","flight"};
        Sout.toJson(solution(c));

    }

    public static String solution(String[] strArr) {
        String preFix = "";
        if (Objects.isNull(strArr) || strArr.length == 0) {
            return preFix;
        }
        int i = 1;
        preFix = strArr[0];
        while (i < strArr.length && preFix.length() > 0) {
            String currentStr = strArr[i];
            int indexOf = currentStr.indexOf(preFix);
            if (indexOf == 0) {
                i++;
                continue;
            } else {
                preFix = preFix.substring(0, preFix.length() - 1);
            }
        }
        return preFix;
    }
}
