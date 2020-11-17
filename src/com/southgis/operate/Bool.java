package com.southgis.operate;

/**
 * @className: Bool
 * @package: com.southgis.operate
 * @author: 王军
 * @date: 2020/9/17 9:41
 */
// operators/Bool.java
// 关系运算符和逻辑运算符

import java.util.*;

public class Bool {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("i > j is " + (i > j));
        System.out.println("i < j is " + (i < j));
        System.out.println("i >= j is " + (i >= j));
        System.out.println("i <= j is " + (i <= j));
        System.out.println("i == j is " + (i == j));
        System.out.println("i != j is " + (i != j));
        // 将 int 作为布尔处理不是合法的 Java 写法
        //System.out.println("i && j is " + (i && j));
        //System.out.println("i || j is " + (i || j));
        //System.out.println("!i is " + !i);
        System.out.println("(i < 10) && (j < 10) is "
                + ((i < 10) && (j < 10)));
        System.out.println("(i < 10) || (j < 10) is "
                + ((i < 10) || (j < 10)));
    }
}
