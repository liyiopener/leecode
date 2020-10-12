package com.zoo.algorithm_exercise.util;

import com.google.gson.Gson;

public class Sout {

    public static void toJson(Object obj) {
        System.out.println(new Gson().toJson(obj));
    }
}
