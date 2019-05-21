package com.simpleDemo.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author : majh
 * createDate : 2019/5/13 18:03
 * descripe :线程池
 */

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        Future<String> future = newCachedThreadPool.submit(new CallableDemo());
        if(!future.isDone()){
            System.out.println("Task is not finished,please wait");
        }
        try {
            System.out.println("result is "+future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }finally {
            newCachedThreadPool.shutdown();
        }
    }
}
