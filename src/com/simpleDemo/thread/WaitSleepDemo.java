package com.simpleDemo.thread;

/**
 * @author : majh
 * createDate : 2019/5/13 18:37
 * descripe :wait和sleep区别
 */

public class WaitSleepDemo {
    public static void main(String[] args) {
        final Object lock = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread A is waiting to get lock");
                synchronized (lock){
                    try {
                        System.out.println("Thread A get lock");
                        Thread.sleep(20);
                        System.out.println("Thread A do wait method");
                        lock.wait();
                        lock.notify();
                        System.out.println("Thread A is done");
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        try {
            Thread.sleep(10);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread B is waiting to get lock");
                synchronized (lock){
                    try {
                        System.out.println("Thread B get lock");
                        System.out.println("Thread B is sleeping");
                        Thread.sleep(20);
                        System.out.println("Thread B is done");
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
