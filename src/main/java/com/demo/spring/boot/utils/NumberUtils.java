package com.demo.spring.boot.utils;

import java.text.DecimalFormat;

/**
 * Created by bqhuy on 11/3/2016.
 */
public class NumberUtils {
    public static Double round(Double input) {
        DecimalFormat df = new DecimalFormat(".##");
        return new Double(df.format(input));
    }
}
