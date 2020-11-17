package com.southgis.base;

/**
 * @className: StringSwitch
 * @package: com.southgis.base
 * @author: 王军
 * @date: 2020/9/17 17:29
 */
// control/StringSwitch.java

public class StringSwitch {
    public static void main(String[] args) {
        String color = "red";
        // 新的方法: 字符串搭配 switch
        switch(color) {
            case "red":
                System.out.println("RED");
                break;
            case "green":
                System.out.println("GREEN");
                break;
            case "blue":
                System.out.println("BLUE");
                break;
            case "yellow":
                System.out.println("YELLOW");
                break;
            default:
                System.out.println("Unknown");
        }
    }
}
