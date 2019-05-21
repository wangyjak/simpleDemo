package com.simpleDemo.basic;

/**
 * @author : majh
 * createDate : 2019/5/14 20:18
 * descripe :i++与++i的区别
 */

public class PlusDemo {

    public static void main(String[] args) {
        //i++和++i都是i=i+1的简写区别在于赋值的时候是先赋值还是先+1
        int a=1,b=0;
        b = a++;
        System.out.println("a="+a+"----b="+b);
        a=1;
        b=0;
        b=++a;
        System.out.println("a="+a+"----b="+b);

        a=0;
        b=0;
        b = a++;
        System.out.println("a="+a+"----b="+b);
        a=0;
        b=0;
        b = ++a;
        System.out.println("a="+a+"----b="+b);
    }
}
