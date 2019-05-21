package com.simpleDemo.thread;

/**
 * @author : majh
 * createDate : 2019/5/13 11:41
 * descripe :测试多线程
 */

public class CheckThread {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("current thread "+Thread.currentThread().getName());
//        ThreadDemo threadDemo1 = new ThreadDemo("1");
//        ThreadDemo threadDemo2 = new ThreadDemo("2");
//        ThreadDemo threadDemo3 = new ThreadDemo("3");
//        threadDemo1.start();
//        threadDemo2.start();
//        threadDemo3.start();
        RunnableDemo runnableDemo1 = new RunnableDemo("1");
        RunnableDemo runnableDemo2 = new RunnableDemo("2");
        RunnableDemo runnableDemo3 = new RunnableDemo("3");
        Thread t1 = new Thread(runnableDemo1);

        Thread t2 = new Thread(runnableDemo2);
        Thread t3 = new Thread(runnableDemo3);
        t1.start();
        t1.join();//等待线程执行完毕
        t2.start();
        t3.start();
        System.out.println(" main finished name :"+runnableDemo1.name);
    }
}
