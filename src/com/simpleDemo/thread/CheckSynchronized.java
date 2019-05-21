package com.simpleDemo.thread;

/**
 * @author : majh
 * createDate : 2019/5/14 10:11
 * descripe :main
 */

public class CheckSynchronized {

    public static void main(String[] args) {
        SynchronizedDemo synchronizedDemo = new SynchronizedDemo();
        Thread threadA1 = new Thread(synchronizedDemo,"A_thread1");
        Thread threadA2 = new Thread(synchronizedDemo,"A_thread2");
        Thread threadB1 = new Thread(synchronizedDemo,"B_thread1");
        Thread threadB2 = new Thread(synchronizedDemo,"B_thread2");
        Thread threadC1 = new Thread(synchronizedDemo,"C_thread1");
        Thread threadC2 = new Thread(synchronizedDemo,"C_thread2");
        Thread threadD1 = new Thread(new SynchronizedDemo(),"D_thread1");
        Thread threadD2 = new Thread(new SynchronizedDemo(),"D_thread2");
        Thread threadD3 = new Thread(new SynchronizedDemo(),"E_thread1");
        Thread threadD4 = new Thread(new SynchronizedDemo(),"E_thread2");


        threadA1.start();
        threadA2.start();
        threadB1.start();
        threadB2.start();
        threadC1.start();
        threadC2.start();
    }

}
