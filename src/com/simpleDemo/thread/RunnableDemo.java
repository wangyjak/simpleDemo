package com.simpleDemo.thread;

/**
 * @author : majh
 * createDate : 2019/5/13 11:36
 * descripe :通过Runnable接口实现多线程
 */

public class RunnableDemo implements Runnable {

    public String name;

    public RunnableDemo(String name){
        this.name = name;
    }

    public void run(){
        for(int i=0;i<30;i++){
            System.out.println("this thread name:"+this.name+", count:"+i);
            this.name=i+"";
        }
        System.out.println(this.name + " finished");
    }
}
