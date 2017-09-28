package com.java.lessons.lambda.basic.utils;

import java.util.Comparator;

/**
 * Created by diego.joya on 9/28/2017.
 */
public class Utils {

    public static int compare(String a, String b) {

        if(a.contains("e") && !b.contains("e")) {
            return -1;
        } else {
            return 0;
        }
    }
}
