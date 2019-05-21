package com.simpleDemo.reflect;

/**
 * @author : majh
 * createDate : 2019/5/20 20:57
 * descripe :j反射对象
 */

public class Robot {
    private String name;

    public void sayHello(String helloSentence){
        System.out.println(helloSentence+" "+this.name);
    }

    private String throwHello(String tag){
        return "hello "+tag;
    }
}
