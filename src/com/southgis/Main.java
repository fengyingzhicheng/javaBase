package com.southgis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        sumFigures();
    }

    public static void swapVariable() {
        int a=100;
        int b=200;
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("交换后的值：a="+a+"b="+b);
    }

    public static void sumFigures() {
        Scanner scanner=new Scanner(System.in);//获取控制台输入
        int i=scanner.nextInt();
        int x1=i/1000;
        int x2 = i / 100 % 10;
        int x3 = i / 10 % 10;
        int x4 = i % 10;
        System.out.println(x1 + x2 + x3 + x4);
    }

}
