package com.simpleDemo.thread;

/**
 * @author : majh
 * createDate : 2019/5/13 20:40
 * descripe :yield函数样例
 */

public class YieldDemo {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<=10;i++){
                    System.out.println("current thread is "+Thread.currentThread().getName()+" ,current count is "+i);
                    if(i==5){
                        Thread.yield();
                    }
                }
            }
        };
        Thread thread1 = new Thread(runnable,"thread1");
        Thread thread2 = new Thread(runnable,"thread2");
        thread1.start();;
        thread2.start();
    }
}
