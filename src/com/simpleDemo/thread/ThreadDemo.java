package com.simpleDemo.thread;

/**
 * @author : majh
 * createDate : 2019/5/13 11:29
 * descripe :通过继承Thread类实现多线程
 */

public class ThreadDemo extends Thread{

    private String name;

    public ThreadDemo(String name){
        this.name = name;
    }

    @Override
    public void run(){
        for (int i=0;i<20;i++){
            System.out.println("this thread name:"+this.name+", count:"+i);

        }
        System.out.println(this.name + " finished");
    }
}
