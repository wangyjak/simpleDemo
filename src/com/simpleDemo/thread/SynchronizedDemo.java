package com.simpleDemo.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : majh
 * createDate : 2019/5/14 10:09
 * descripe :synchronized的样例
 */

public class SynchronizedDemo implements Runnable{

    @Override
    public void run(){
        String threadName = Thread.currentThread().getName();
        if (threadName.startsWith("A")){
            async();
        }else if (threadName.startsWith("B")){
            synchronizedBlock();
        }else if(threadName.startsWith("C")){
            synchronizedMethod();
        }else if(threadName.startsWith("D")){
            synchronizedClassBlock();
        }else if(threadName.startsWith("E")){
            synchronizedClassMethod();
        }
    }

    /*
     * 异步方法
     */
    private void async(){
        try {
            System.out.println(Thread.currentThread().getName() + "_Async_Start:" + new SimpleDateFormat("HH:mm:ss").format(new Date()));
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + "_Async_End:" + new SimpleDateFormat("HH:mm:ss").format(new Date()));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    /*
     * 同步代码块，对象锁
     */
    private void synchronizedBlock(){
        System.out.println(Thread.currentThread().getName()+"_synchronizedBlock:"+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
        synchronized (this){
            System.out.println(Thread.currentThread().getName()+"_synchronizedBlock_Start:"+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"_synchronizedBlock_End:"+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
        }
    }

    /*
     * 同步代码块，类锁
     */
    private void synchronizedClassBlock(){
        System.out.println(Thread.currentThread().getName()+"_synchronizedClassBlock:"+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
        synchronized (SynchronizedDemo.class){
            System.out.println(Thread.currentThread().getName()+"_synchronizedClassBlock_Start:"+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"_synchronizedClassBlock_End:"+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
        }
    }

    /*
     * 同步方法，对象锁
     */
    private synchronized void synchronizedMethod(){
        System.out.println(Thread.currentThread().getName()+"_synchronizedMethod:"+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
        System.out.println(Thread.currentThread().getName()+"_synchronizedMethod_Start:"+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"_synchronizedMethod_End:"+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
    }

    /*
     * 同步方法，类锁
     */
    private synchronized static void synchronizedClassMethod(){
        System.out.println(Thread.currentThread().getName()+"_synchronizedClassMethod:"+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
        System.out.println(Thread.currentThread().getName()+"_synchronizedClassMethod_Start:"+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"_synchronizedClassMethod_End:"+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
    }
}
