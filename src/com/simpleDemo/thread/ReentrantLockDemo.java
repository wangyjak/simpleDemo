package com.simpleDemo.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author : majh
 * createDate : 2019/5/14 15:07
 * descripe :reentrantLock
 */

public class ReentrantLockDemo implements Runnable{
    private static ReentrantLock lock  = new ReentrantLock(true);

    @Override
    public void run(){
        while (true){
            try {
                lock.lock();
                System.out.println(Thread.currentThread().getName()+" get lock");
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }
}
