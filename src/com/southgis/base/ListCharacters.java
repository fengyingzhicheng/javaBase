package com.southgis.base;

/**
 * @className: ListCharacters
 * @package: com.southgis.base
 * @author: 王军
 * @date: 2020/9/17 16:46
 */
// control/ListCharacters.java

public class ListCharacters {
    public static void main(String[] args) {
        for(char c = 0; c < 128; c++)
            if(Character.isLowerCase(c))
                System.out.println("value: " + (int)c +
                        " character: " + c);
    }
}
