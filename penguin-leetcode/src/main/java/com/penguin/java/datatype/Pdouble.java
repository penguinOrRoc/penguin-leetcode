package com.penguin.java.datatype;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Pdouble {
    public static void main(String[] args){
        Double d1 = 3.2;
        Double d2 = 1.1;
        /**
         * double直接相加或相减，会造成精度丢失
         */
        System.out.println("<double精度丢失演示>");
        System.out.println(d1+"+"+d2+"="+normalAdd(d1,d2));
        System.out.println(d1+"-"+d2+"="+normalSub(d1,d2));
        System.out.println("<double精度丢失处理>");
        BigDecimal b1 = BigDecimal.valueOf(d1);
        BigDecimal b2 = BigDecimal.valueOf(d2);
        System.out.println(d1+"+"+d2+"="+b1.add(b2).doubleValue());
        System.out.println(d1+"-"+d2+"="+b1.subtract(b2).doubleValue());
        System.out.println(d1+"*"+d2+"="+b1.multiply(b2).doubleValue());
        System.out.println("<double‘java.lang.ArithmeticException’处理>");
        System.out.println(d1+"/"+d2+"="+b1.divide(b2,2, RoundingMode.HALF_UP).doubleValue());
        System.out.println("<double‘java.lang.ArithmeticException’演示>");
        System.out.println(d1+"/"+d2+"="+b1.divide(b2).doubleValue());

    }

    /**
     * double直接加减
     * @param d1
     * @param d2
     * @return
     */

    private static double normalAdd(Double d1, Double d2) {
        return d1 + d2;
    }
    private static double normalSub(Double d1, Double d2) {
        return d1 - d2;
    }
}
